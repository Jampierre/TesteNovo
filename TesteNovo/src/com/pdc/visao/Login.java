package com.pdc.visao;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.pdc.ws.dao.Pessoa;
import com.pdc.ws.dao.PessoaDAO;
import com.pdc.ws.dao.PessoaDAOProxy;
import com.pdc.ws.dao.TipoPessoa;

public class Login extends BaseView {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private static PessoaDAO service = (PessoaDAO) new PessoaDAOProxy(); 
	private JPasswordField passwordField;

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
	@SuppressWarnings("deprecation")
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 372, 214);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(197, 104, 75, 28);
		contentPane.add(btnEntrar);
		btnEntrar.addActionListener(e -> {
			try {
				Pessoa p = service.autenticarPessoa(textField.getText(), passwordField.getText());
				if(p == null){
					JOptionPane.showInternalMessageDialog(contentPane, "Login ou senha inv�lidos");
				}else{
					BaseView.setUsuarioLogado(p);
					if (p.getTipo() == TipoPessoa.ADM) {
						// TODO IMPLEMENTAR
					}
					if (p.getTipo() == TipoPessoa.OPERADOR) {
						new ViewOperador().setVisible(true);
					}
					if (p.getTipo() == TipoPessoa.CLIENTE) {
						new CrudFilial().setVisible(true);
					}
					setVisible(false);
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(81, 43, 61, 16);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(81, 71, 61, 16);
		contentPane.add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(138, 37, 134, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(138, 69, 134, 22);
		contentPane.add(passwordField);
	}
}
