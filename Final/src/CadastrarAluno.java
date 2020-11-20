import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CadastrarAluno extends JFrame implements ActionListener, ListSelectionListener, ItemListener {

	JButton bIncluir, bLimpar, bSair;
	JTextField tMatricula, tNome, tDataNascimento, tNomeCurso, tNotaNP1, tNotaNP2, tMedia, tFaltas;
	JLabel lTitulo, lMatricula, lNomeCurso, lNome, lTipoCurso, lDataNascimento, lNotaNP1, lNotaNP2, lMedia, lFaltas;
	DefaultListModel codigoLista, nomesLista;
	ButtonGroup bButtonGroup;
	JPanel panel,  panel_1;
	JList list;
	JScrollPane scrollPane;

	public CadastrarAluno() {
		setTitle("Inclusão dos Dados do Aluno");
		setSize(656, 574);
		setLocation(80, 50);
		lTitulo = new JLabel("Cadastro do Aluno");
		lTitulo.setLocation(30, 20);
		lTitulo.setSize(490, 20);
		lTitulo.setFont(new Font("Serif", Font.BOLD, 22));

		nomesLista = new DefaultListModel<String>();
		nomesLista.addElement("001 Programação Orientada a Objetos");
		nomesLista.addElement("002 Banco de Dados");
		nomesLista.addElement("003 Matemática Discreta");
		nomesLista.addElement("004 Redes e Computadores");
		nomesLista.addElement("005 Segurança de Redes");
		nomesLista.addElement("006 Programação Estruturada");
		nomesLista.addElement("007 Ciencias Sociais");

		scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 295, 298, 113);
		getContentPane().add(scrollPane);

		JList list_2 = new JList(nomesLista);
		scrollPane.setViewportView(list_2);
		list_2.setSelectionBackground(SystemColor.menu);
		list_2.setRequestFocusEnabled(false);
		list_2.setFocusTraversalKeysEnabled(false);
		list_2.setBackground(SystemColor.inactiveCaptionBorder);

		JLabel lblCdigoDaDisciplina = new JLabel("Cod. disciplina");
		lblCdigoDaDisciplina.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		lblCdigoDaDisciplina.setBounds(30, 264, 120, 20);
		getContentPane().add(lblCdigoDaDisciplina);

		JLabel lblNomeDaDisciplina = new JLabel("Nome da disciplina");
		lblNomeDaDisciplina.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		lblNomeDaDisciplina.setBounds(136, 264, 120, 20);
		getContentPane().add(lblNomeDaDisciplina);

		bIncluir = new JButton("Incluir");
		bIncluir.setSize(100, 40);
		bIncluir.setLocation(113, 430);
		bIncluir.setBackground(new Color(150, 220, 255));
		bIncluir.addActionListener(this);
		bIncluir.setFont(new Font("Serif", Font.BOLD, 18));
		bIncluir.setBackground(new Color(150, 220, 255));

		bLimpar = new JButton("Limpar");
		bLimpar.setSize(100, 40);
		bLimpar.setLocation(253, 430);
		bLimpar.setBackground(new Color(150, 220, 255));
		bLimpar.addActionListener(this);
		bLimpar.setFont(new Font("Serif", Font.BOLD, 18));
		bLimpar.setBackground(new Color(150, 220, 255));

		bSair = new JButton("Sair");
		bSair.setSize(100, 40);
		bSair.setLocation(403, 430);
		bSair.setBackground(new Color(150, 220, 255));
		bSair.addActionListener(this);
		bSair.setFont(new Font("Serif", Font.BOLD, 18));
		bLimpar.setBackground(new Color(150, 220, 255));

		getContentPane().setLayout(null);
		getContentPane().add(lTitulo);

		panel_1 = new JPanel();
		panel_1.setBorder(
				new TitledBorder(null, "Informações do Aluno", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(24, 54, 222, 147);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		tMatricula = new JTextField("");
		tMatricula.setBounds(136, 16, 80, 25);
		panel_1.add(tMatricula);

		lMatricula = new JLabel("Matrícula:");
		lMatricula.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		lMatricula.setBounds(6, 16, 120, 20);
		panel_1.add(lMatricula);

		lNome = new JLabel("Nome:");
		lNome.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		lNome.setBounds(6, 66, 120, 20);
		panel_1.add(lNome);

		tNome = new JTextField("");
		tNome.setBounds(136, 66, 80, 25);
		panel_1.add(tNome);

		lDataNascimento = new JLabel("Data de Nascimento:");
		lDataNascimento.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		lDataNascimento.setBounds(6, 116, 120, 20);
		panel_1.add(lDataNascimento);

		tDataNascimento = new JTextField("");
		tDataNascimento.setBounds(136, 116, 80, 25);
		panel_1.add(tDataNascimento);
		getContentPane().add(bIncluir);
		getContentPane().add(bLimpar);
		getContentPane().add(bSair);

		panel = new JPanel();
		panel.setBorder(
				new TitledBorder(null, "Informações Acadêmicas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(322, 51, 222, 197);
		getContentPane().add(panel);
		panel.setLayout(null);

		lNotaNP1 = new JLabel("Nota NP1:");
		lNotaNP1.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		lNotaNP1.setBounds(6, 16, 120, 20);
		panel.add(lNotaNP1);

		tNotaNP1 = new JTextField("");
		tNotaNP1.setBounds(136, 16, 80, 25);
		panel.add(tNotaNP1);

		tNotaNP2 = new JTextField("");
		tNotaNP2.setBounds(136, 66, 80, 25);
		panel.add(tNotaNP2);

		lNotaNP2 = new JLabel("Nota NP2:");
		lNotaNP2.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		lNotaNP2.setBounds(6, 66, 120, 20);
		panel.add(lNotaNP2);

		lMedia = new JLabel("Media:");
		lMedia.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		lMedia.setBounds(6, 116, 120, 20);
		panel.add(lMedia);

		tMedia = new JTextField("");
		tMedia.setBounds(136, 116, 80, 25);
		panel.add(tMedia);

		lFaltas = new JLabel("Faltas:");
		lFaltas.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		lFaltas.setBounds(6, 166, 120, 20);
		panel.add(lFaltas);

		tFaltas = new JTextField("");
		tFaltas.setBounds(136, 166, 80, 25);
		panel.add(tFaltas);

	}


	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == bSair) {
			dispose();
		}
		if (e.getSource() == bIncluir) {

			JOptionPane.showMessageDialog(null, "Aluno: " + tNome.getText() + "\n Cadastrado com sucesso", "Atenção:",
					JOptionPane.INFORMATION_MESSAGE);

		}
		if (e.getSource() == bLimpar) {
			tDataNascimento.setText("");
			tFaltas.setText("");
			tMatricula.setText("");
			tMedia.setText("");
			tNome.setText("");
			tNotaNP1.setText("");
			tNotaNP2.setText("");
				
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		System.out.println(list.getSelectedValue());

	}

	@Override
	public void itemStateChanged(ItemEvent e) {

	}
}
