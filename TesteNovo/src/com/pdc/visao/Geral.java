package com.pdc.visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class Geral extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Geral frame = new Geral();
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
	public Geral() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCliente = new JMenu("Cliente");
		menuBar.add(mnCliente);
		
		JMenuItem mntmCadastrar = new JMenuItem("Cadastrar");
		mntmCadastrar.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
				System.out.println("Entrou");
				JLabel lblNome = new JLabel("Nome:");
				lblNome.setBounds(17, 39, 61, 16);
				contentPane.add(lblNome);
				
				textField = new JTextField();
				textField.setBounds(71, 33, 134, 28);
				contentPane.add(textField);
				textField.setColumns(10);
			}
		});
		
		mnCliente.add(mntmCadastrar);
		
		JMenu mnProduto = new JMenu("Produto");
		menuBar.add(mnProduto);
		
		JMenuItem mntmCadastrar_1 = new JMenuItem("Cadastrar");
		mnProduto.add(mntmCadastrar_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
	}

}
