package com.pdc.visao;

import java.awt.BorderLayout;
import java.rmi.RemoteException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableCellEditor;

import com.pdc.ws.dao.Produto;
import com.pdc.ws.dao.ProdutoDAO;
import com.pdc.ws.dao.ProdutoDAOProxy;

@SuppressWarnings("serial")
public class CrudProdutos extends BaseView {
	private ProdutoDAO service = new ProdutoDAOProxy();
	private JPanel contentPane;
	private JTable table;
	private static final String[] columnNames = {"Codigo", "Descrição", "Preço", "Qtd.", "Id", "Version"};
	private Produto[] produtos;
	private JButton btnSalvar;
	private Object[][] data;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CrudProdutos frame = new CrudProdutos();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 * @throws RemoteException 
	 */
	public CrudProdutos() throws RemoteException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		produtos = service.listarProdutos();
		data = new Object[produtos.length][columnNames.length];
		for (int i = 0; i < data.length; i++) {
			data[i][0] = produtos[i].getCodigo();
			data[i][1] = produtos[i].getDescricao();
			data[i][2] = produtos[i].getPreco();
			data[i][3] = produtos[i].getQuantidade();
			data[i][4] = produtos[i].getId();
			data[i][5] = produtos[i].getVersion();
		}
		table = new JTable(data, columnNames);
		scrollPane.setViewportView(table);
		Util.hiddeColumn(table, 4);
		Util.hiddeColumn(table, 5);
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(e ->{
			TableCellEditor editor = table.getCellEditor();
			if (editor != null) {
				editor.stopCellEditing();
			}
			for (Produto p : produtos) {
				try {
					service.alterarProduto(p);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnSalvar, BorderLayout.NORTH);
	}
}