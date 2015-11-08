package com.pdc.visao;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 372, 167);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(148, 110, 117, 29);
		contentPane.add(btnEntrar);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(21, 22, 61, 16);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(21, 50, 61, 16);
		contentPane.add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(78, 16, 134, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(78, 44, 134, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JRadioButton rdbtnCliente = new JRadioButton("Cliente");
		rdbtnCliente.setBounds(20, 86, 76, 23);
		contentPane.add(rdbtnCliente);
		
		JRadioButton rdbtnFilial = new JRadioButton("Filial");
		rdbtnFilial.setBounds(105, 86, 76, 23);
		contentPane.add(rdbtnFilial);
		
		JRadioButton rdbtnMatrix = new JRadioButton("Matrix");
		rdbtnMatrix.setBounds(179, 84, 85, 23);
		contentPane.add(rdbtnMatrix);
		
		JLabel labelLogin = new JLabel("");
		labelLogin.setBounds(224, 22, 134, 16);
		contentPane.add(labelLogin);
		
		JLabel labelSenha = new JLabel("");
		labelSenha.setBounds(224, 50, 134, 16);
		contentPane.add(labelSenha);
	}
}
