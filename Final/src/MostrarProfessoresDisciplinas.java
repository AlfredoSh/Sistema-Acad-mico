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
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MostrarProfessoresDisciplinas extends JFrame implements ActionListener, ListSelectionListener, ItemListener {

	JButton bBuscar, bLimpar, bSair;
	JTextField tIdentidade, tNomeCurso;
	JLabel lTitulo, lMatricula, lNomeCurso, lTipoCurso;
	DefaultListModel codigoLista, nomesLista;
	JList list;
	// JRadioButton rBacharel, rGestao, rOutros;
	ButtonGroup bButtonGroup;
	private JLabel lblNomeDoProfessor;
	private JTextField tNomeProfessor;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;


	
	public MostrarProfessoresDisciplinas() {
		getContentPane().setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		setTitle("Mostrar Dados  Disciplinas Professor");
		setSize(656, 574);
		setLocation(80, 50);

		lTitulo = new JLabel("Disciplinas Lecionadas por Professor");
		lTitulo.setLocation(30, 20);
		lTitulo.setSize(490, 37);
		lTitulo.setFont(new Font("Serif", Font.BOLD, 22));

		lMatricula = new JLabel("Identidade Professor:");
		lMatricula.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		lMatricula.setLocation(30, 103);
		lMatricula.setSize(120, 20);

		tIdentidade = new JTextField("123456");
		tIdentidade.setSize(80, 25);
		tIdentidade.setLocation(148, 101);

		codigoLista = new DefaultListModel();
		nomesLista = new DefaultListModel();
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(310, 241, 263, 123);
		getContentPane().add(scrollPane_1);


	    
	    
		JList list_2 = new JList(nomesLista);
		scrollPane_1.setViewportView(list_2);
		list_2.setBackground(SystemColor.inactiveCaptionBorder);


		JLabel lblCdigoDaDisciplina = new JLabel("Cod. Disciplina");
		lblCdigoDaDisciplina.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		lblCdigoDaDisciplina.setBounds(65, 210, 120, 20);
		getContentPane().add(lblCdigoDaDisciplina);

		JLabel lblNomeDaDisciplina = new JLabel("Nome da Disciplina");
		lblNomeDaDisciplina.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		lblNomeDaDisciplina.setBounds(359, 210, 120, 20);
		getContentPane().add(lblNomeDaDisciplina);

		bBuscar = new JButton("Buscar");
		bBuscar.setSize(100, 40);
		bBuscar.setLocation(113, 430);
		bBuscar.setBackground(new Color(150, 220, 255));
		bBuscar.addActionListener(this);
		bBuscar.setFont(new Font("Serif", Font.BOLD, 18));
		bBuscar.setBackground(new Color(150, 220, 255));

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
		getContentPane().add(tIdentidade);
		getContentPane().add(lMatricula);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 241, 188, 123);
		getContentPane().add(scrollPane);
		

		list = new JList(codigoLista);
		scrollPane.setViewportView(list);
		list.setBackground(SystemColor.inactiveCaptionBorder);
		list.addListSelectionListener(this);
		getContentPane().add(bBuscar);
		getContentPane().add(bLimpar);
		getContentPane().add(bSair);
		
		lblNomeDoProfessor = new JLabel("Nome do Professor: ");
		lblNomeDoProfessor.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		lblNomeDoProfessor.setBounds(254, 103, 120, 20);
		getContentPane().add(lblNomeDoProfessor);
		
		tNomeProfessor = new JTextField("");
		tNomeProfessor.setBackground(SystemColor.inactiveCaption);
		tNomeProfessor.setEditable(false);
		tNomeProfessor.setBounds(372, 101, 174, 25);
		getContentPane().add(tNomeProfessor);

	
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == bSair) {
			dispose();
		}
		if (e.getSource() == bBuscar) {
			
			codigoLista.addElement("001" );
			codigoLista.addElement("002 ");
			codigoLista.addElement("003 ");
			codigoLista.addElement("004 ");
			codigoLista.addElement("005");
			codigoLista.addElement("006 ");
			codigoLista.addElement("007 ");	
			nomesLista.addElement(" Programação Orientada a Objetos");
			nomesLista.addElement(" Banco de Dados");
			nomesLista.addElement(" Matemática Discreta");
			nomesLista.addElement(" Redes e Computadores");
			nomesLista.addElement(" Segurança de Redes");
			nomesLista.addElement(" Programação Estruturada");
			nomesLista.addElement(" Ciencias Sociais");
			tNomeProfessor.setText("Edinaldo");			

		}
		if (e.getSource() == bLimpar) {
			tNomeProfessor.setText("");
			nomesLista.clear();
			codigoLista.clear();
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {

	}

	@Override
	public void itemStateChanged(ItemEvent e) {

	}
}
