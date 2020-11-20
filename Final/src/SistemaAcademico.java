import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SistemaAcademico extends JFrame implements ActionListener {

	JMenuBar bMenu;
	JMenu menu1, menu2, menu3;
	JMenuItem m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13;
	private JMenu mnAlterar;


	public SistemaAjcademico() {
		//setVisible(true);
		setForeground(SystemColor.activeCaptionBorder);
		setResizable(false);
		getContentPane().setBackground(SystemColor.activeCaption);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alfredo S\\eclipse-workspace\\Aula25Septiembre\\Images\\Simbolo.png"));
		setTitle("Sistema Acadêmico");
		setSize(600, 500);
		setLocation(400, 250);
		setBackground(SystemColor.activeCaption);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sistema Acad\u00EAmico");
		lblNewLabel.setFont(new Font("Garamond", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(220, 37, 255, 34);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setDoubleBuffered(true);
		lblNewLabel_1.setInheritsPopupMenu(false);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(SystemColor.infoText);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Alfredo S\\eclipse-workspace\\Aula25Septiembre\\Images\\Simbolo.png"));
		lblNewLabel_1.setBounds(134, 82, 341, 234);
		getContentPane().add(lblNewLabel_1);

		menu1 = new JMenu("Cadastrar");
		m1 = new JMenuItem("Curso");
		m1.addActionListener(this);
		m2 = new JMenuItem("Disciplina");
		m2.addActionListener(this);
		m3 = new JMenuItem("Aluno");
		m3.addActionListener(this);
		m4 = new JMenuItem("Professor");
		m4.addActionListener(this);
		menu1.add(m1);
		menu1.add(m2);
		menu1.add(m3);
		menu1.add(m4);

		menu2 = new JMenu("Mostrar");
		m5 = new JMenuItem("Cursos");
		m5.addActionListener(this);
		m6 = new JMenuItem("Disciplinas");
		m6.addActionListener(this);
		m7 = new JMenuItem("Aluno");
		m7.addActionListener(this);
		m8 = new JMenuItem("Professores");
		m8.addActionListener(this);
		m9 = new JMenuItem("Cursos/Professores");
		m9.addActionListener(this);

		m10 = new JMenuItem("Cursos/Disciplinas");
		m10.addActionListener(this);
		m11 = new JMenuItem("Professores/Disciplinas");
		m11.addActionListener(this);
		menu2.add(m5);
		menu2.add(m6);
		menu2.add(m7);
		menu2.add(m8);
		menu2.addSeparator();
		menu2.add(m9);
		menu2.add(m10);
		menu2.add(m11);

		menu3 = new JMenu("Sair");
		m12 = new JMenuItem("Sair");
		m12.addActionListener(this);
		menu3.add(m12);

		bMenu = new JMenuBar();
		bMenu.setAutoscrolls(true);
		bMenu.add(menu1);
		
		mnAlterar = new JMenu("Alterar");
		m13 = new JMenuItem("Disciplina");
		mnAlterar.add(m13);
		m13.addActionListener(this);

		bMenu.add(mnAlterar);
		bMenu.add(menu2);
		bMenu.add(menu3);
		setJMenuBar(bMenu);
		
	}

	public static void main(String arg[]) {
		new SistemaAcademico();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {

		String evento = "";
		if (e.getSource() == m12)
			System.exit(0);
		else {
			if (e.getSource() == m1) {
				evento = "Cadastrar Curso";
				new CadastrarCurso().setVisible(true);
			}
			if (e.getSource() == m2) {
				evento = "Cadastrar Disciplina";
				new CadastrarDisciplina().setVisible(true);
			}
			if (e.getSource() == m3) {
				evento = "Cadastrar Aluno";
				new CadastrarAluno().setVisible(true);
			}
			
			if (e.getSource() == m13) {
				evento = "Alterar Disciplina";
				new AlterarDisciplina().setVisible(true);
			}


			if (e.getSource() == m4) {
				evento = "Cadastrar Professor";
				new CasastrarProfessor().setVisible(true);
			}

			if (e.getSource() == m5) {
				evento = "Mostrar Cursos";
				MostrarCursos mostrarCurso = new MostrarCursos();
				mostrarCurso.setVisible(true);
			}
			
			if (e.getSource() == m6) {
				evento = "Mostrar Disciplinas";
				MostraDisciplina mostrarDisciplina = new MostraDisciplina();
				mostrarDisciplina.setVisible(true);
			}
			
			if (e.getSource() == m7) {
				evento = "Mostrar Alunos";
				MostrarAluno mostrarAluno = new MostrarAluno();
				mostrarAluno.setVisible(true);
			}
			
			if (e.getSource() == m8) {
				evento = "Mostrar Professores";
				MostrarProfessor mostrarProfessor = new MostrarProfessor();
				mostrarProfessor.setVisible(true);
			}
			
			if (e.getSource() == m9) {
				evento = "Mostrar Cursos Professores";
				MostrarCursosProfessores mostrarCursosProfessores = new MostrarCursosProfessores();
				mostrarCursosProfessores.setVisible(true);
			}
			
			if (e.getSource() == m10) {
				evento = "Mostrar Cursos Disciplinas";
				MostrarCursosDisciplinas mostrarCursosDisciplinas = new MostrarCursosDisciplinas();
				mostrarCursosDisciplinas.setVisible(true);
			}
			
			if (e.getSource() == m11) {
				evento = "Mostrar Cursos Professores";
				MostrarProfessoresDisciplinas mostrarProfessoresDisciplinas = new MostrarProfessoresDisciplinas();
				mostrarProfessoresDisciplinas.setVisible(true);
			}
		}

	}
}
