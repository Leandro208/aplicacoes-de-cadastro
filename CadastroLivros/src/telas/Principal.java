package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Menu");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/imagens/download.png")));
		setResizable(false);
		setBackground(SystemColor.menu);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 350);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(SystemColor.desktop);
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 0, 491, 322);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(33, 58, 119, 58);
		panel.add(btnCadastrar);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirTelaCadastro();
				
			}
		});
		btnCadastrar.setForeground(Color.BLACK);
		btnCadastrar.setFont(new Font("MV Boli", Font.PLAIN, 15));
		btnCadastrar.setBackground(SystemColor.inactiveCaptionBorder);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(33, 167, 119, 58);
		panel.add(btnBuscar);
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				abrirTelaBuscar();
			}
		});
		btnBuscar.setFont(new Font("MV Boli", Font.PLAIN, 15));
		btnBuscar.setBackground(SystemColor.inactiveCaptionBorder);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(10, 286, 29, 25);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ImageIcon icon = new ImageIcon("/trabalho4Bimestre/src/imagens/lupa-19371-0.jpg");

				JOptionPane.showMessageDialog(null, "Ao clicar em 'Cadastrar' você deve digitar os dados e em seguida clicar em cadastrar!\n Após isso o programa salvará os dados em um arquivo. \n Clicando em 'buscar' ele pedira o nome do livro ou o nome do autor\n logo em seguida ele mostrará os dados e apos isso você decide o que fazer a respeito, seja remover ou editar", "Ajuda", JOptionPane.QUESTION_MESSAGE,icon);
				
				
				
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton.setIcon(new ImageIcon(Principal.class.getResource("/imagens/lupa.png")));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/imagens/33-sites-livros-digitai-de-gra\u00E7a.png")));
		lblNewLabel.setBounds(0, 0, 491, 322);
		panel.add(lblNewLabel);
	}
	
	
	private void abrirTelaCadastro() {
		
		Cadastrar c = new Cadastrar();
		
		c.setLocationRelativeTo(null);
		
		c.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		c.setModal(true);
		
		c.setVisible(true);
		
	}
	
	private void abrirTelaBuscar() {
		
		Buscar b = new Buscar();
		b.setLocationRelativeTo(null);
		b.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		b.setModal(true);
		b.setVisible(true);
		
	}
}
