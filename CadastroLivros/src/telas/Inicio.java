package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

public class Inicio extends JFrame {

	private JPanel contentPane;
	private JTextField usuario;
	private JButton btnCriar;
	private JButton btnEntrar;
	private JButton btnCriarConta_1;
	private String txt;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Inicio() {
		setTitle("Login");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Inicio.class.getResource("/imagens/download.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Inicio.class.getResource("/imagens/sales-img-first@2x-7d4f961c331d85d0b4d0d26bd9b9c3abdcbc9267b130006dcb60421e23061496.png")));
		lblNewLabel.setBounds(0, 0, 496, 332);
		contentPane.add(lblNewLabel);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Tekton Pro", Font.PLAIN, 18));
		lblLogin.setBounds(388, 39, 73, 28);
		contentPane.add(lblLogin);
		
		usuario = new JTextField();
		usuario.setBounds(360, 103, 136, 28);
		contentPane.add(usuario);
		usuario.setColumns(10);
		

		btnCriar = new JButton("Criar conta");
		btnCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//criar conta
				criar();
				
				
			}
		});
		btnCriar.setEnabled(false);
		btnCriar.setBounds(378, 188, 108, 23);
		contentPane.add(btnCriar);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//entrar
		String	 txt2 = usuario.getText();
				File arquivo = new File(txt2+".txt");
				if(arquivo.exists()) {
					
					
					Principal p = new Principal();
					p.setVisible(true);
					p.setLocationRelativeTo(null);
					p.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					btnCriar.setEnabled(false);
					btnEntrar.setEnabled(false);
					
					
				}
				if(!arquivo.exists()) {
					
				JOptionPane.showMessageDialog(null,"Esse arquivo não existe! \n Crie um novo!", "OPS...", JOptionPane.CANCEL_OPTION);
				btnCriar.setEnabled(true);
				}
				
				
				
			}
		});
		btnEntrar.setBounds(388, 154, 89, 23);
		contentPane.add(btnEntrar);
		
		btnCriarConta_1 = new JButton("Criar");
		btnCriarConta_1.setVisible(false);
		btnCriarConta_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//botão final
				
				try {
					 txt = usuario.getText();
					 File arquivo = new File(txt+".txt");
					if(!arquivo.exists()) {
					
					arquivo.createNewFile();
					
						Principal pr = new Principal();
						pr.setVisible(true);
						pr.setLocationRelativeTo(null);
						btnEntrar.setEnabled(false);
					}
					else JOptionPane.showMessageDialog(null, "Esse arquivo ja existe!", "OPS...", JOptionPane.WARNING_MESSAGE);
			} catch (IOException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
			}
				
			}
		});
		btnCriarConta_1.setBounds(388, 154, 89, 23);
		contentPane.add(btnCriarConta_1);
		
	}
	
	private void criar() {
		
		
		btnEntrar.setVisible(false);
		btnCriar.setVisible(false);
		btnCriarConta_1.setVisible(true);
		usuario.setText(null);
	}
}
