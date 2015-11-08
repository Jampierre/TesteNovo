package com.pdc.visao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Geral extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	
	private static JPanel panel1; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		panel1 = new JPanel ();
		
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

	public void panel1(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCliente = new JMenu("Cliente");
		menuBar.add(mnCliente);
		
		JMenuItem mntmCadastrar = new JMenuItem("Cadastrar");
		mntmCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		mntmCadastrar.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
				System.out.println("Entrou");
				panel1.setVisible(true);
			}
		});
		
		mnCliente.add(mntmCadastrar);
		
		JMenu mnProduto = new JMenu("Produto");
		menuBar.add(mnProduto);
		
		JMenuItem mntmCadastrar_1 = new JMenuItem("Cadastrar");
		mnProduto.add(mntmCadastrar_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Sair");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				int resposta;
				resposta = JOptionPane.showConfirmDialog(null,"Deseja realmente sair?","Mensagem do Programa",JOptionPane.YES_NO_OPTION);
				if (resposta == 0)
					System.exit(0);
			}
		});
		menuBar.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(17, 39, 61, 16);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(71, 33, 134, 28);
		contentPane.add(textField);
		textField.setColumns(10);
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
		mntmCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ENtrou");
				panel1();
				panel1.setVisible(true);
			}
		});
		mntmCadastrar.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
				
			}
		});
		
		mnCliente.add(mntmCadastrar);
		
		JMenu mnProduto = new JMenu("Produto");
		menuBar.add(mnProduto);
		
		JMenuItem mntmCadastrar_1 = new JMenuItem("Cadastrar");
		mnProduto.add(mntmCadastrar_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Sair");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				int resposta;
				resposta = JOptionPane.showConfirmDialog(null,"Deseja realmente sair?","Mensagem do Programa",JOptionPane.YES_NO_OPTION);
				if (resposta == 0)
					System.exit(0);
			}
		});
		menuBar.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
	}

	/**
	 * @return the panel1
	 */
	public JPanel getPanel1() {
		return panel1;
	}

	/**
	 * @param panel1 the panel1 to set
	 */
	public void setPanel1(JPanel panel1) {
		this.panel1 = panel1;
	}
}
