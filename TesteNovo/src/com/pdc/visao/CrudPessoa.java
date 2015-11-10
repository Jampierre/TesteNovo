package com.pdc.visao;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class CrudPessoa extends BaseView{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	public CrudPessoa() {
		setTitle("Cliente");
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(10, 11, 46, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 32, 414, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(10, 61, 46, 14);
		panel.add(lblCpf);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 86, 99, 20);
		panel.add(textField_1);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(119, 61, 46, 14);
		panel.add(lblTelefone);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(119, 86, 99, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(228, 86, 99, 20);
		panel.add(textField_3);
		
		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setBounds(228, 61, 46, 14);
		panel.add(lblCelular);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 138, 414, 20);
		panel.add(textField_4);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(10, 117, 46, 14);
		panel.add(lblEndereo);
		
		JButton btnSalvar = new JButton("Cancelar");
		btnSalvar.setBounds(335, 216, 89, 23);
		panel.add(btnSalvar);
		
		JButton button = new JButton("Salvar");
		button.setBounds(236, 216, 89, 23);
		panel.add(button);
	}
}
