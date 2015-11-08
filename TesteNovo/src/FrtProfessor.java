

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class FrtProfessor extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldLogin;
	private JPasswordField passwordFieldSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrtProfessor frame = new FrtProfessor();
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
	public FrtProfessor() {
		setTitle("Acessor ao Sistema");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(66, 32, 61, 16);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(66, 60, 61, 16);
		contentPane.add(lblSenha);
		
		textFieldLogin = new JTextField();
		textFieldLogin.setBounds(128, 26, 134, 28);
		contentPane.add(textFieldLogin);
		textFieldLogin.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOk.setBounds(274, 27, 117, 29);
		contentPane.add(btnOk);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(274, 55, 117, 29);
		contentPane.add(btnCancelar);
		
		passwordFieldSenha = new JPasswordField();
		passwordFieldSenha.setBounds(128, 54, 134, 28);
		contentPane.add(passwordFieldSenha);
	}
}
