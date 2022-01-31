package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JDialog;

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
					frame.setLocationRelativeTo(null);
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
	public Principal() {
		setResizable(false);
		setTitle("Aplicativo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 254, 215);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnOpo = new JMenu("Op\u00E7\u00E3o");
		menuBar.add(mnOpo);
		
		JMenuItem mntmCadastrarAluno = new JMenuItem("Cadastrar Aluno");
		mntmCadastrarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				abrirTelaCadastroUsuario();
				
				
				
			}
		});
		mnOpo.add(mntmCadastrarAluno);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mntmSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				JOptionPane.showMessageDialog(null, "Este é um programa de exemplo usando o java Swing", "Sobre", JOptionPane.INFORMATION_MESSAGE);
				
				
				
				
				
				
				
			}
		});
		mnAjuda.add(mntmSobre);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Op\u00E7\u00F5es", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(0, 0, 365, 168);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Cadastrar aluno");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				abrirTelaCadastroUsuario();
				
				
				
			}
		});
		btnNewButton.setBounds(28, 28, 182, 35);
		panel.add(btnNewButton);
		
		JButton btnCadastrarAlunoOpo = new JButton("Cadastrar aluno op\u00E7\u00E3o2");
		btnCadastrarAlunoOpo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				abrieTelaCadastroOpçao2();
				
				
				
				
			}
		});
		btnCadastrarAlunoOpo.setBounds(28, 96, 182, 35);
		panel.add(btnCadastrarAlunoOpo);
	}
	
	
	private void abrirTelaCadastroUsuario() {
		CadastroUsuario telaCadastro = new CadastroUsuario();
		//Centralizando
		telaCadastro.setLocationRelativeTo(null);
		//Ao fechar a tela de cadastro não encerra o programa
		telaCadastro.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		//para que não seja possivel criar outros
		telaCadastro.setModal(true);
		//tornando a tela visivel
		telaCadastro.setVisible(true);
		
	}
	
	private void abrieTelaCadastroOpçao2() {
		CadastroAlunoOpçao2 telaCadastro = new CadastroAlunoOpçao2();
		//Centralizando
		telaCadastro.setLocationRelativeTo(null);
		//Ao fechar a tela de cadastro não encerra o programa
		telaCadastro.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		//para que não seja possivel criar outros
		telaCadastro.setModal(true);
		//tornando a tela visivel
		telaCadastro.setVisible(true);
		
		
	}
}
