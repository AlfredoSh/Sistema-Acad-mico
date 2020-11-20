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

public class MostrarCursosDisciplinas extends JFrame implements ActionListener, ListSelectionListener, ItemListener {

	JButton bBuscar, bLimpar, bSair;
	JTextField tCodigoCurso, tNomeCurso;
	JLabel lTitulo, lMatricula, lNomeCurso, lTipoCurso;
	DefaultListModel codigoLista, nomesLista;
	JList list;
	// JRadioButton rBacharel, rGestao, rOutros;
	ButtonGroup bButtonGroup;
	private JLabel lblNomeDoProfessor;
	private JTextField tNomeCurso1;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;


	
	public MostrarCursosDisciplinas() {
		getContentPane().setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		setTitle("Mostrar Dados Cursos Professor");
		setSize(656, 574);
		setLocation(80, 50);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lTitulo = new JLabel("Disciplinas por Curso");
		lTitulo.setLocation(30, 20);
		lTitulo.setSize(490, 37);
		lTitulo.setFont(new Font("Serif", Font.BOLD, 22));

		lMatricula = new JLabel("C\u00F3d. Curso");
		lMatricula.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		lMatricula.setLocation(58, 93);
		lMatricula.setSize(120, 20);

		tCodigoCurso = new JTextField("123456");
		tCodigoCurso.setSize(120, 25);
		tCodigoCurso.setLocation(136, 91);

		codigoLista = new DefaultListModel();
		
		nomesLista = new DefaultListModel();
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(325, 215, 274, 122);
		getContentPane().add(scrollPane_1);


	    
	    
		JList list_2 = new JList(nomesLista);
		scrollPane_1.setViewportView(list_2);
		list_2.setBackground(SystemColor.inactiveCaptionBorder);


		JLabel lblCdigoDaDisciplina = new JLabel("Cod. Disciplina");
		lblCdigoDaDisciplina.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		lblCdigoDaDisciplina.setBounds(97, 184, 120, 20);
		getContentPane().add(lblCdigoDaDisciplina);

		JLabel lblNomeDaDisciplina = new JLabel("Nome da Disciplina");
		lblNomeDaDisciplina.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		lblNomeDaDisciplina.setBounds(374, 184, 120, 20);
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
		getContentPane().add(tCodigoCurso);
		getContentPane().add(lMatricula);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(58, 215, 188, 122);
		getContentPane().add(scrollPane);
		

		list = new JList(codigoLista);
		scrollPane.setViewportView(list);
		list.setBackground(SystemColor.inactiveCaptionBorder);
		list.addListSelectionListener(this);
		getContentPane().add(bBuscar);
		getContentPane().add(bLimpar);
		getContentPane().add(bSair);
		
		lblNomeDoProfessor = new JLabel("Nome do Curso");
		lblNomeDoProfessor.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		lblNomeDoProfessor.setBounds(282, 93, 120, 20);
		getContentPane().add(lblNomeDoProfessor);
		
		tNomeCurso1 = new JTextField("");
		tNomeCurso1.setBackground(SystemColor.inactiveCaption);
		tNomeCurso1.setEditable(false);
		tNomeCurso1.setBounds(384, 91, 174, 25);
		getContentPane().add(tNomeCurso1);

	
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
			tNomeCurso1.setText("Sistemas de Informações");
		}
		if (e.getSource() == bLimpar) {
			tNomeCurso1.setText("");
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
