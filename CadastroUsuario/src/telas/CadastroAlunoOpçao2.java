package telas;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.GridBagLayout;
import javax.swing.JTabbedPane;
import java.awt.GridBagConstraints;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import alunos.Aluno;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class CadastroAlunoOpçao2 extends JDialog {
	private JTextField campoMatricula;
	private JTextField campoAluno;
	private JTable table;
	private JScrollPane tabelaAlunos;
	private List<Aluno> alunos = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAlunoOpçao2 dialog = new CadastroAlunoOpçao2();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public CadastroAlunoOpçao2() {
		setTitle("Cadastro de Aluno");
		setBounds(100, 100, 450, 300);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 0;
		gbc_tabbedPane.gridy = 0;
		getContentPane().add(tabbedPane, gbc_tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Cadastro de Aluno", null, panel, null);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblMatricula = new JLabel("Matricula");
		GridBagConstraints gbc_lblMatricula = new GridBagConstraints();
		gbc_lblMatricula.insets = new Insets(0, 0, 5, 5);
		gbc_lblMatricula.anchor = GridBagConstraints.EAST;
		gbc_lblMatricula.gridx = 0;
		gbc_lblMatricula.gridy = 0;
		panel.add(lblMatricula, gbc_lblMatricula);
		
		campoMatricula = new JTextField();
		GridBagConstraints gbc_campoMatricula = new GridBagConstraints();
		gbc_campoMatricula.insets = new Insets(0, 0, 5, 0);
		gbc_campoMatricula.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoMatricula.gridx = 1;
		gbc_campoMatricula.gridy = 0;
		panel.add(campoMatricula, gbc_campoMatricula);
		campoMatricula.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.EAST;
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 1;
		panel.add(lblNome, gbc_lblNome);
		
		campoAluno = new JTextField();
		GridBagConstraints gbc_campoAluno = new GridBagConstraints();
		gbc_campoAluno.insets = new Insets(0, 0, 5, 0);
		gbc_campoAluno.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoAluno.gridx = 1;
		gbc_campoAluno.gridy = 1;
		panel.add(campoAluno, gbc_campoAluno);
		campoAluno.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cadastrarAluno();
				
			}
		});
		GridBagConstraints gbc_btnCadastrar = new GridBagConstraints();
		gbc_btnCadastrar.anchor = GridBagConstraints.WEST;
		gbc_btnCadastrar.gridx = 1;
		gbc_btnCadastrar.gridy = 2;
		panel.add(btnCadastrar, gbc_btnCadastrar);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Listagem de alunos", null, panel_1, null);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		tabelaAlunos = new JScrollPane();
		GridBagConstraints gbc_tabelaAlunos = new GridBagConstraints();
		gbc_tabelaAlunos.fill = GridBagConstraints.BOTH;
		gbc_tabelaAlunos.gridx = 0;
		gbc_tabelaAlunos.gridy = 0;
		panel_1.add(tabelaAlunos, gbc_tabelaAlunos);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Matricula", "Nome"
			}
		));
		tabelaAlunos.setViewportView(table);

	}
	
	private void cadastrarAluno() {
		Aluno a = new Aluno();
		a.setMatricula(campoMatricula.getText());
		a.setNome(campoAluno.getText());
		
		alunos.add(a);
		
		atualizarTabelaAlunos();
	}

	private void atualizarTabelaAlunos() {
		
		DefaultTableModel modelo = new DefaultTableModel(new String[] {"matricula","nome"},0);
		for(int i = 0; i<alunos.size();i++) {
			Aluno a = alunos.get(i);
			modelo.addRow(new String[] {a.getMatricula(), a.getNome()});
		}
		
		table.setModel(modelo);
		
	}
}
