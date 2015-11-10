package com.pdc.visao;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class ViewOperador extends BaseView{
	private JPanel panel;
	
	public ViewOperador() throws Exception {
		setTitle("Operador");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 372, 214);
		panel = new JPanel();
		setContentPane(panel);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.addActionListener(e ->{
			new CrudPessoa().setVisible(true);
			ViewOperador.this.setVisible(false);
		});
		
		btnClientes.setBounds(56, 72, 89, 23);
		panel.add(btnClientes);
		
		JButton btnProdtudos = new JButton("Prodtudos");
		btnProdtudos.addActionListener(e -> {
			try {
				new CrudProdutos().setVisible(true);
				ViewOperador.this.setVisible(false);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		btnProdtudos.setBounds(199, 72, 89, 23);
		panel.add(btnProdtudos);
	}
}
