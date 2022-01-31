package telas;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import javax.swing.border.TitledBorder;

import alunos.Aluno;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.awt.Color;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class CadastroUsuario extends JDialog {
	private JTextField nome;
	private JTextField matricula;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton opçaoMasculino;
	private JRadioButton opçaoFeminino;
	private JComboBox curso;
	
	
	private List<Aluno> alunos = new ArrayList<>();
	private JPanel panel2;
	private JScrollPane scrollPane;
	private JList jListAlunos;
	private JButton botao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroUsuario dialog = new CadastroUsuario();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
					dialog.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public CadastroUsuario() {
		setTitle("Cadastro Usuario");
		setBounds(100, 100, 634, 300);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{83, 110, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Cadastro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 5;
		gbc_label.gridy = 0;
		panel.add(label, gbc_label);
		
		JLabel lblNewLabel = new JLabel("Nome");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		nome = new JTextField();
		GridBagConstraints gbc_nome = new GridBagConstraints();
		gbc_nome.gridwidth = 4;
		gbc_nome.insets = new Insets(0, 0, 5, 5);
		gbc_nome.fill = GridBagConstraints.HORIZONTAL;
		gbc_nome.gridx = 1;
		gbc_nome.gridy = 1;
		panel.add(nome, gbc_nome);
		nome.setColumns(10);
		
		JLabel lblMatricula = new JLabel("Matricula");
		GridBagConstraints gbc_lblMatricula = new GridBagConstraints();
		gbc_lblMatricula.anchor = GridBagConstraints.EAST;
		gbc_lblMatricula.insets = new Insets(0, 0, 5, 5);
		gbc_lblMatricula.gridx = 0;
		gbc_lblMatricula.gridy = 2;
		panel.add(lblMatricula, gbc_lblMatricula);
		
		matricula = new JTextField();
		GridBagConstraints gbc_matricula = new GridBagConstraints();
		gbc_matricula.gridwidth = 4;
		gbc_matricula.insets = new Insets(0, 0, 5, 5);
		gbc_matricula.fill = GridBagConstraints.HORIZONTAL;
		gbc_matricula.gridx = 1;
		gbc_matricula.gridy = 2;
		panel.add(matricula, gbc_matricula);
		matricula.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo");
		GridBagConstraints gbc_lblSexo = new GridBagConstraints();
		gbc_lblSexo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSexo.gridx = 0;
		gbc_lblSexo.gridy = 3;
		panel.add(lblSexo, gbc_lblSexo);
		
		opçaoMasculino = new JRadioButton("Masculino");
		buttonGroup.add(opçaoMasculino);
		GridBagConstraints gbc_opçaoMasculino = new GridBagConstraints();
		gbc_opçaoMasculino.anchor = GridBagConstraints.WEST;
		gbc_opçaoMasculino.insets = new Insets(0, 0, 5, 5);
		gbc_opçaoMasculino.gridx = 1;
		gbc_opçaoMasculino.gridy = 3;
		panel.add(opçaoMasculino, gbc_opçaoMasculino);
		
		opçaoFeminino = new JRadioButton("Feminino");
		buttonGroup.add(opçaoFeminino);
		GridBagConstraints gbc_opçaoFeminino = new GridBagConstraints();
		gbc_opçaoFeminino.anchor = GridBagConstraints.WEST;
		gbc_opçaoFeminino.insets = new Insets(0, 0, 5, 5);
		gbc_opçaoFeminino.gridx = 1;
		gbc_opçaoFeminino.gridy = 4;
		panel.add(opçaoFeminino, gbc_opçaoFeminino);
		
		JLabel lblCurso = new JLabel("Curso");
		GridBagConstraints gbc_lblCurso = new GridBagConstraints();
		gbc_lblCurso.anchor = GridBagConstraints.EAST;
		gbc_lblCurso.insets = new Insets(0, 0, 5, 5);
		gbc_lblCurso.gridx = 0;
		gbc_lblCurso.gridy = 5;
		panel.add(lblCurso, gbc_lblCurso);
		
		curso = new JComboBox();
		curso.setModel(new DefaultComboBoxModel(new String[] {"-SELECIONE-", "Informatica", "Adminidtra\u00E7\u00E3o", "Eletrotecnica"}));
		GridBagConstraints gbc_curso = new GridBagConstraints();
		gbc_curso.gridwidth = 4;
		gbc_curso.insets = new Insets(0, 0, 5, 5);
		gbc_curso.fill = GridBagConstraints.HORIZONTAL;
		gbc_curso.gridx = 1;
		gbc_curso.gridy = 5;
		panel.add(curso, gbc_curso);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cadastrarUsuario();
				
				
				
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 6;
		panel.add(btnNewButton, gbc_btnNewButton);
		
		panel2 = new JPanel();
		panel2.setBorder(new TitledBorder(null, "Listagem", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel2 = new GridBagConstraints();
		gbc_panel2.fill = GridBagConstraints.BOTH;
		gbc_panel2.gridx = 1;
		gbc_panel2.gridy = 0;
		getContentPane().add(panel2, gbc_panel2);
		GridBagLayout gbl_panel2 = new GridBagLayout();
		gbl_panel2.columnWidths = new int[]{241, 0};
		gbl_panel2.rowHeights = new int[]{0, 0, 0};
		gbl_panel2.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel2.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		panel2.setLayout(gbl_panel2);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		panel2.add(scrollPane, gbc_scrollPane);
		
		jListAlunos = new JList();
		scrollPane.setViewportView(jListAlunos);
		
		botao = new JButton("Visualizar dados");
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				visualizarDadosAluno();
				
				
			}
		});
		GridBagConstraints gbc_botao = new GridBagConstraints();
		gbc_botao.gridx = 0;
		gbc_botao.gridy = 1;
		panel2.add(botao, gbc_botao);
		

	}
	
	
	private void cadastrarUsuario() {
		//se o campo estiver nulo ou vazio
		if(nome.getText() == null || nome.getText().isEmpty()) {
			exibirErro("Erro","Por favor, informe o campo nome.");
			return;
		}
		
		if(matricula.getText() == null || matricula.getText().isEmpty()) {
			exibirErro("Erro","Por favor, informe o campo matricula.");
			return;
		}
		
		if(!opçaoMasculino.isSelected() && !opçaoFeminino.isSelected()) {
			exibirErro("Erro","Por favor, informe o Sexo.");
			return;
		}
		//posiçao
		if(curso.getSelectedIndex() == 0) {
			exibirErro("Erro","Por favor, informe o Curso.");
			return;
		}
		
		
		Aluno a = new Aluno();
		a.setCurso(curso.getSelectedItem().toString());
		a.setMatricula(matricula.getText());
		a.setNome(nome.getText());
		if(opçaoMasculino.isSelected()) {
			a.setSexo("masculino");
		}
		if(opçaoFeminino.isSelected()) {
			a.setSexo("Feminino");
		}
		
		
		alunos.add(a);
		
		atualizarListadeUsuarios();
		
		
		}
	
	private void atualizarListadeUsuarios() {
		DefaultListModel<Aluno> modelo = new DefaultListModel<>();
		
		for(int i = 0; i<alunos.size(); i++) {
			Aluno a = alunos.get(i);
			modelo.addElement(a);
		}
		
		jListAlunos.setModel(modelo);
		
		
	}
	private void exibirErro(String titulo, String msg) {
		JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.ERROR_MESSAGE);
	}
	
	private void visualizarDadosAluno() {
		//para visualizar os dados completos
		Aluno alunoSelecionado = (Aluno) jListAlunos.getSelectedValue();
		
		String msg = "nome: "+ alunoSelecionado.getNome()+
				"\nMatricula: "+ alunoSelecionado.getMatricula()+
				"\nSexo: "+alunoSelecionado.getSexo()+
				"\nCurso: "+alunoSelecionado.getCurso();
		
		JOptionPane.showMessageDialog(null, msg, "Dados do aluno", JOptionPane.INFORMATION_MESSAGE);
		
		
		
		
		
	}

}
