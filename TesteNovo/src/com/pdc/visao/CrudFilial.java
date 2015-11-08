package com.pdc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.rmi.RemoteException;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import com.pdc.ws.dao.FilialDAO;
import com.pdc.ws.dao.FilialDAOProxy;

public class CrudFilial extends BaseView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPanel;
	private JTable table;
	private FilialDAO service = new FilialDAOProxy();

	/**
	 * Create the dialog.
	 * @throws RemoteException 
	 */
	public CrudFilial() throws RemoteException {
		setTitle("CRUD Filial");
		contentPanel = new JPanel();
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanel);
		//getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(1, 0));
		{
			String[] columnNames = {"Nome Filial",
                    "Version"
                    };
			
			
			
			
			com.pdc.ws.dao.Filial[] test = service.listarFiliais();
			Object[][] data = new Object[test.length][columnNames.length];
			table = new JTable(data, columnNames);
			for (int i = 0; i < data.length; i++) {
				data[i][0] = test[i].getNome();  
				data[i][1] = test[i].getVersion();  
			}
			table.setPreferredScrollableViewportSize(new Dimension(500, 70));
	        table.setFillsViewportHeight(true);

	        contentPanel.add(table, "name_59427435887083");
	        JScrollPane scrollPane = new JScrollPane(table);

	        add(scrollPane);
			
		}
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}