package telas;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import javax.swing.border.TitledBorder;


import pessoa.Livros;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;
import javax.swing.JInternalFrame;
import javax.swing.JScrollBar;
import javax.swing.JToggleButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Cadastrar extends JDialog {
	private JTextField titulo;
	private JTextField autores;
	private JTextField ano;
	private List<Livros> livros = new ArrayList<>();
	private JList list;
	private JComboBox editora;
	private JProgressBar progresso;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastrar dialog = new Cadastrar();
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
	public Cadastrar() {
		getContentPane().setBackground(new Color(32, 178, 170));
		setTitle("Cadastrar");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Cadastrar.class.getResource("/imagens/download.png")));
		setBounds(100, 100, 587, 369);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{305, 147, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(32, 178, 170));
		panel.setBorder(new TitledBorder(null, "Cadastro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{38, 245, 0};
		gbl_panel.rowHeights = new int[]{46, 20, 20, 20, 20, 23, 0, 35, 0, 0, 14, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNome = new JLabel("Titulo:");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.EAST;
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 1;
		panel.add(lblNome, gbc_lblNome);
		
		titulo = new JTextField();
		titulo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (titulo.getText() != null && !titulo.getText().isEmpty()) {
					progresso.setValue(progresso.getValue() + 25);
				}
			}
		});
		GridBagConstraints gbc_titulo = new GridBagConstraints();
		gbc_titulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_titulo.insets = new Insets(0, 0, 5, 0);
		gbc_titulo.gridx = 1;
		gbc_titulo.gridy = 1;
		panel.add(titulo, gbc_titulo);
		titulo.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ano:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		ano = new JTextField();
		ano.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(ano.getText()!=null && !ano.getText().isEmpty()) {
					progresso.setValue(progresso.getValue() + 25);
				}
			}
		});
		GridBagConstraints gbc_ano = new GridBagConstraints();
		gbc_ano.insets = new Insets(0, 0, 5, 0);
		gbc_ano.fill = GridBagConstraints.HORIZONTAL;
		gbc_ano.gridx = 1;
		gbc_ano.gridy = 2;
		panel.add(ano, gbc_ano);
		ano.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Editora:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 3;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		editora = new JComboBox();
		editora.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				if(editora.getSelectedIndex()!=0) {
					progresso.setValue(progresso.getValue() + 25);
				}
			}
		});
		editora.setModel(new DefaultComboBoxModel(new String[] {"-SELECIONE -", "Moderna"}));
		GridBagConstraints gbc_editora = new GridBagConstraints();
		gbc_editora.insets = new Insets(0, 0, 5, 0);
		gbc_editora.fill = GridBagConstraints.HORIZONTAL;
		gbc_editora.gridx = 1;
		gbc_editora.gridy = 3;
		panel.add(editora, gbc_editora);
		
		JLabel lblAutores = new JLabel("Autores");
		GridBagConstraints gbc_lblAutores = new GridBagConstraints();
		gbc_lblAutores.anchor = GridBagConstraints.EAST;
		gbc_lblAutores.insets = new Insets(0, 0, 5, 5);
		gbc_lblAutores.gridx = 0;
		gbc_lblAutores.gridy = 4;
		panel.add(lblAutores, gbc_lblAutores);
		
		autores = new JTextField();
		autores.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				if(autores.getText()!=null && !autores.getText().isEmpty()) {
					progresso.setValue(progresso.getValue() + 25);
				}
				
			}
		});
		GridBagConstraints gbc_autores = new GridBagConstraints();
		gbc_autores.fill = GridBagConstraints.HORIZONTAL;
		gbc_autores.insets = new Insets(0, 0, 5, 0);
		gbc_autores.gridx = 1;
		gbc_autores.gridy = 4;
		panel.add(autores, gbc_autores);
		autores.setColumns(10);
		
		JLabel lblProgresso = new JLabel("Progresso:");
		GridBagConstraints gbc_lblProgresso = new GridBagConstraints();
		gbc_lblProgresso.insets = new Insets(0, 0, 5, 0);
		gbc_lblProgresso.gridx = 1;
		gbc_lblProgresso.gridy = 6;
		panel.add(lblProgresso, gbc_lblProgresso);
		
		progresso = new JProgressBar();
		progresso.setForeground(Color.ORANGE);
		
		
		GridBagConstraints gbc_progresso = new GridBagConstraints();
		gbc_progresso.insets = new Insets(0, 0, 5, 0);
		gbc_progresso.fill = GridBagConstraints.BOTH;
		gbc_progresso.gridx = 1;
		gbc_progresso.gridy = 7;
		panel.add(progresso, gbc_progresso);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//cadastrar
				
				
				cadastrar();
			}
		});
		GridBagConstraints gbc_btnCadastrar = new GridBagConstraints();
		gbc_btnCadastrar.insets = new Insets(0, 0, 5, 0);
		gbc_btnCadastrar.gridx = 1;
		gbc_btnCadastrar.gridy = 9;
		panel.add(btnCadastrar, gbc_btnCadastrar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Lista", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(new Color(32, 178, 170));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		getContentPane().add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 6;
		gbc_scrollPane.gridheight = 4;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		panel_1.add(scrollPane, gbc_scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
		
		JButton btnChecar = new JButton("Ver dados");
		btnChecar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				verDados();
			}
		});
		GridBagConstraints gbc_btnChecar = new GridBagConstraints();
		gbc_btnChecar.insets = new Insets(0, 0, 0, 5);
		gbc_btnChecar.gridwidth = 2;
		gbc_btnChecar.gridx = 3;
		gbc_btnChecar.gridy = 4;
		panel_1.add(btnChecar, gbc_btnChecar);

	}
	
	
	private void cadastrar() {
		
		
		if(titulo.getText()==null || titulo.getText().isEmpty()) {
			exibirErro("Erro!","Informe o titulo do livro!");
			return;
		}
		

		for(int i = 0; i<ano.getText().length();i++) {
			if( ano.getText().charAt(i)>='a') {
				JOptionPane.showMessageDialog(null, "Oque você digitou não é um numero!", "Formato invalido", JOptionPane.ERROR_MESSAGE);
				return;
				
			}
		}
		
		if(ano.getText()==null || ano.getText().isEmpty()) {
			exibirErro("Erro!", "Informe o ano");
			return;
		}
		
		if(editora.getSelectedIndex() == 0) {
			exibirErro("Erro","Por favor, informe a editora.");
			return;
		}
		
		if(autores.getText()==null || autores.getText().isEmpty()) {
			exibirErro("Erro", "informe o autor");
			return;
		}
		Livros l = new Livros();
		
		l.setTitulo(titulo.getText());
		l.setAno(ano.getText());
		l.setEditora(editora.getSelectedItem().toString());
		l.setAutores(autores.getText());
		
		livros.add(l);
		
		atualizarLista();
		
		titulo.setText(null);
		ano.setText(null);
		editora.setSelectedIndex(0);
		autores.setText(null);
		
		progresso.setValue(0);
	}
	
	private void atualizarLista() {
DefaultListModel<Livros> modelo = new DefaultListModel<>();
		
		for(int i = 0; i<livros.size(); i++) {
			Livros a = livros.get(i);
			modelo.addElement(a);
		}
		
		list.setModel(modelo);
		
	}
	
	
	private void exibirErro(String titulo, String msg) {
		
		JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.ERROR_MESSAGE);
		
	}
	
	private void verDados() {
		
		Livros livroSelecionado = (Livros) list.getSelectedValue();
		
		String msg = "Titulo: "+ livroSelecionado.getTitulo()+
				"\nAno: "+ livroSelecionado.getAno()+
				"\nAutor(s): "+livroSelecionado.getAutores()+
				"\nEditora: "+livroSelecionado.getEditora();
		
		JOptionPane.showMessageDialog(null, msg, "Dados do Livro", JOptionPane.INFORMATION_MESSAGE);
	}
	
	

}
