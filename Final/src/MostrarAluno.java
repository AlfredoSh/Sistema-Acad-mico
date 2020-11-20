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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MostrarAluno extends JFrame implements ActionListener, ListSelectionListener, ItemListener {

	JButton bBuscar, bLimpar, bSair;
	JTextField tMatricula, tNome, tDataNascimento, tNomeCurso, tNotaNP1, tNotaNP2, tMedia, tFaltas;
	JLabel lTitulo, lMatricula, lNomeCurso, lNome, lTipoCurso, lDataNascimento, lNotaNP1, lNotaNP2, lMedia, lFaltas;
	DefaultListModel  nomesLista;
	ButtonGroup bButtonGroup;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JPanel panel_1;
	JList list_2;

	public MostrarAluno() {
		getContentPane().setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		setTitle("Mostrar Dados do Aluno");
		setSize(656, 574);
		setLocation(80, 50);

		lTitulo = new JLabel("Mostrar dados do Aluno");
		lTitulo.setLocation(30, 20);
		lTitulo.setSize(490, 20);
		lTitulo.setFont(new Font("Serif", Font.BOLD, 22));



		nomesLista = new DefaultListModel();

		scrollPane = new JScrollPane();
		scrollPane.setBounds(292, 103, 271, 121);
		getContentPane().add(scrollPane);

		 list_2 = new JList(nomesLista);
		scrollPane.setViewportView(list_2);
		list_2.setBackground(SystemColor.inactiveCaptionBorder);

		JLabel lblCdigoDaDisciplina = new JLabel("Cod. disciplina");
		lblCdigoDaDisciplina.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		lblCdigoDaDisciplina.setBounds(292, 72, 120, 20);
		getContentPane().add(lblCdigoDaDisciplina);

		JLabel lblNomeDaDisciplina = new JLabel("Nome da disciplina");
		lblNomeDaDisciplina.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		lblNomeDaDisciplina.setBounds(431, 72, 120, 20);
		getContentPane().add(lblNomeDaDisciplina);

		bBuscar = new JButton("Buscar");
		bBuscar.setSize(100, 40);
		bBuscar.setLocation(112, 449);
		bBuscar.setBackground(new Color(150, 220, 255));
		bBuscar.addActionListener(this);
		bBuscar.setFont(new Font("Serif", Font.BOLD, 18));
		bBuscar.setBackground(new Color(150, 220, 255));

		bLimpar = new JButton("Limpar");
		bLimpar.setSize(100, 40);
		bLimpar.setLocation(252, 449);
		bLimpar.setBackground(new Color(150, 220, 255));
		bLimpar.addActionListener(this);
		bLimpar.setFont(new Font("Serif", Font.BOLD, 18));
		bLimpar.setBackground(new Color(150, 220, 255));

		bSair = new JButton("Sair");
		bSair.setSize(100, 40);
		bSair.setLocation(402, 449);
		bSair.setBackground(new Color(150, 220, 255));
		bSair.addActionListener(this);
		bSair.setFont(new Font("Serif", Font.BOLD, 18));
		bLimpar.setBackground(new Color(150, 220, 255));

		getContentPane().setLayout(null);
		getContentPane().add(lTitulo);

		panel_1 = new JPanel();
		panel_1.setBorder(
				new TitledBorder(null, "Informações do Aluno", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(33, 69, 222, 147);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		tMatricula = new JTextField("123");
		tMatricula.setBounds(136, 16, 80, 25);
		panel_1.add(tMatricula);

		lMatricula = new JLabel("Matrícula:");
		lMatricula.setBounds(6, 16, 120, 20);
		panel_1.add(lMatricula);
		lMatricula.setFont(new Font("Book Antiqua", Font.PLAIN, 12));

		lNome = new JLabel("Nome:");
		lNome.setBounds(6, 66, 120, 20);
		panel_1.add(lNome);
		lNome.setFont(new Font("Book Antiqua", Font.PLAIN, 12));

		tNome = new JTextField("");
		tNome.setBounds(136, 66, 80, 25);
		panel_1.add(tNome);
		tNome.setBackground(SystemColor.inactiveCaption);
		tNome.setEditable(false);

		lDataNascimento = new JLabel("Data de Nascimento:");
		lDataNascimento.setBounds(6, 116, 120, 20);
		panel_1.add(lDataNascimento);
		lDataNascimento.setFont(new Font("Book Antiqua", Font.PLAIN, 12));

		tDataNascimento = new JTextField("");
		tDataNascimento.setBounds(136, 116, 80, 25);
		panel_1.add(tDataNascimento);
		tDataNascimento.setBackground(SystemColor.inactiveCaption);
		tDataNascimento.setEditable(false);
		getContentPane().add(bBuscar);
		getContentPane().add(bLimpar);
		getContentPane().add(bSair);

		panel = new JPanel();
		panel.setBorder(
				new TitledBorder(null, "Informações Acadêmicas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(33, 231, 222, 197);
		getContentPane().add(panel);
		panel.setLayout(null);

		lNotaNP1 = new JLabel("Nota NP1:");
		lNotaNP1.setBounds(6, 16, 120, 20);
		panel.add(lNotaNP1);
		lNotaNP1.setFont(new Font("Book Antiqua", Font.PLAIN, 12));

		tNotaNP1 = new JTextField("");
		tNotaNP1.setBounds(136, 16, 80, 25);
		panel.add(tNotaNP1);
		tNotaNP1.setBackground(SystemColor.inactiveCaption);
		tNotaNP1.setEditable(false);

		tNotaNP2 = new JTextField("");
		tNotaNP2.setBounds(136, 66, 80, 25);
		panel.add(tNotaNP2);
		tNotaNP2.setBackground(SystemColor.inactiveCaption);
		tNotaNP2.setEditable(false);

		lNotaNP2 = new JLabel("Nota NP2:");
		lNotaNP2.setBounds(6, 66, 120, 20);
		panel.add(lNotaNP2);
		lNotaNP2.setFont(new Font("Book Antiqua", Font.PLAIN, 12));

		lMedia = new JLabel("Media:");
		lMedia.setBounds(6, 116, 120, 20);
		panel.add(lMedia);
		lMedia.setFont(new Font("Book Antiqua", Font.PLAIN, 12));

		tMedia = new JTextField("");
		tMedia.setBounds(136, 116, 80, 25);
		panel.add(tMedia);
		tMedia.setBackground(SystemColor.inactiveCaption);
		tMedia.setEditable(false);

		lFaltas = new JLabel("Faltas:");
		lFaltas.setBounds(6, 166, 120, 20);
		panel.add(lFaltas);
		lFaltas.setFont(new Font("Book Antiqua", Font.PLAIN, 12));

		tFaltas = new JTextField("");
		tFaltas.setBounds(136, 166, 80, 25);
		panel.add(tFaltas);
		tFaltas.setBackground(SystemColor.inactiveCaption);
		tFaltas.setEditable(false);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == bSair) {
			dispose();
		}
		if (e.getSource() == bBuscar) {
			
			
			
			tNome.setText("Edinaldo");
			tFaltas.setText("2");
			tDataNascimento.setText("22/06/1995");
			tMedia.setText("8");
			tNotaNP1.setText("9");
			tNotaNP2.setText("7");		
	
			nomesLista.addElement("001 Programação Orientada a Objetos");
			nomesLista.addElement("002 Banco de Dados");
			nomesLista.addElement("003 Matemática Discreta");
			nomesLista.addElement("004 Redes e Computadores");
			nomesLista.addElement("005 Segurança de Redes");
			nomesLista.addElement("006 Programação Estruturada");
			nomesLista.addElement("007 Ciencias Sociais");
			list_2.setSelectedIndex(1);


		}
		if (e.getSource() == bLimpar) {
			
			tNome.setText("");
			tFaltas.setText("");
			tDataNascimento.setText("");
			tMedia.setText("");
			tNotaNP1.setText("");
			tNotaNP2.setText("");		
			nomesLista.clear();
			

		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {

	}

	@Override
	public void itemStateChanged(ItemEvent e) {

	}
}
