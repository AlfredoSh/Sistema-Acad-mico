import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CadastrarDisciplina extends JFrame implements ActionListener, ListSelectionListener, ItemListener {

	JButton bIncluir, bLimpar, bSair;
	JTextField tCodigoDisciplina, tNomeDisciplina, tCargaHoraria;
	JLabel lTitulo, lCodigoDisciplina, lNomeCurso, lNomeDisciplina, lAulasSemana, lCargaHoraria;
	JRadioButton rAulaSemana1, rAulaSemana2, rAulaSemana3, rAulaSemana4, rAulaSemana5, rAulaSemana6;
	ButtonGroup bButtonGroup;

	String url = "jdbc:mysql://localhost:3306/test";
	String login = "root";
	String senha = "123456";

	Connection conn = null;
	private JPanel panel;

	public CadastrarDisciplina() {
		setTitle("Tela de Inclusão dos Dados da Disciplina");
		setSize(600, 500);
		setLocation(80, 50);

		lTitulo = new JLabel("Cadastramento da Disciplina");
		lTitulo.setLocation(30, 20);
		lTitulo.setSize(490, 20);
		lTitulo.setFont(new Font("Serif", Font.BOLD, 22));

		lCodigoDisciplina = new JLabel("Código da Disciplina:");
		lCodigoDisciplina.setFont(new Font("Cambria", Font.BOLD, 12));
		lCodigoDisciplina.setLocation(40, 101);
		lCodigoDisciplina.setSize(120, 20);

		tCodigoDisciplina = new JTextField("");
		tCodigoDisciplina.setSize(80, 25);
		tCodigoDisciplina.setLocation(170, 101);

		lNomeDisciplina = new JLabel("Nome da Disciplina:");
		lNomeDisciplina.setFont(new Font("Cambria", Font.BOLD, 12));
		lNomeDisciplina.setLocation(40, 151);
		lNomeDisciplina.setSize(120, 20);

		tNomeDisciplina = new JTextField("");
		tNomeDisciplina.setSize(80, 25);
		tNomeDisciplina.setLocation(170, 151);

		lCargaHoraria = new JLabel("Carga Horária:");
		lCargaHoraria.setFont(new Font("Cambria", Font.BOLD, 12));
		lCargaHoraria.setLocation(40, 201);
		lCargaHoraria.setSize(120, 20);

		tCargaHoraria = new JTextField("");
		tCargaHoraria.setSize(80, 25);
		tCargaHoraria.setLocation(170, 201);

		bButtonGroup = new ButtonGroup();

		bIncluir = new JButton("Incluir");
		bIncluir.setSize(100, 40);
		bIncluir.setLocation(110, 400);
		bIncluir.setBackground(new Color(150, 220, 255));
		bIncluir.addActionListener(this);
		bIncluir.setFont(new Font("Serif", Font.BOLD, 18));
		bIncluir.setBackground(new Color(150, 220, 255));

		bLimpar = new JButton("Limpar");
		bLimpar.setSize(100, 40);
		bLimpar.setLocation(250, 400);
		bLimpar.setBackground(new Color(150, 220, 255));
		bLimpar.addActionListener(this);
		bLimpar.setFont(new Font("Serif", Font.BOLD, 18));
		bLimpar.setBackground(new Color(150, 220, 255));

		bSair = new JButton("Sair");
		bSair.setSize(100, 40);
		bSair.setLocation(400, 400);
		bSair.setBackground(new Color(150, 220, 255));
		bSair.addActionListener(this);
		bSair.setFont(new Font("Serif", Font.BOLD, 18));
		bLimpar.setBackground(new Color(150, 220, 255));

		getContentPane().setLayout(null);
		getContentPane().add(lTitulo);
		getContentPane().add(tCodigoDisciplina);
		getContentPane().add(lCodigoDisciplina);
		getContentPane().add(lNomeDisciplina);
		getContentPane().add(tNomeDisciplina);

		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(359, 87, 161, 150);
		getContentPane().add(panel);
		panel.setLayout(null);

		lAulasSemana = new JLabel("Aulas na Semana");
		lAulasSemana.setBounds(32, 11, 100, 20);
		panel.add(lAulasSemana);
		lAulasSemana.setFont(new Font("Cambria", Font.BOLD, 12));

		rAulaSemana1 = new JRadioButton("1", true);
		rAulaSemana1.setBounds(32, 59, 40, 20);
		panel.add(rAulaSemana1);
		rAulaSemana1.addItemListener(this);
		rAulaSemana1.setBackground(SystemColor.menu);
		bButtonGroup.add(rAulaSemana1);

		rAulaSemana2 = new JRadioButton("2", false);
		rAulaSemana2.setBounds(32, 89, 40, 20);
		panel.add(rAulaSemana2);
		rAulaSemana2.addItemListener(this);
		rAulaSemana2.setBackground(SystemColor.menu);
		bButtonGroup.add(rAulaSemana2);

		rAulaSemana3 = new JRadioButton("3", false);
		rAulaSemana3.setBounds(32, 119, 40, 20);
		panel.add(rAulaSemana3);
		rAulaSemana3.addItemListener(this);
		rAulaSemana3.setBackground(SystemColor.menu);
		bButtonGroup.add(rAulaSemana3);

		rAulaSemana4 = new JRadioButton("4", false);
		rAulaSemana4.setBounds(82, 59, 40, 20);
		panel.add(rAulaSemana4);
		rAulaSemana4.addItemListener(this);
		rAulaSemana4.setBackground(SystemColor.menu);
		bButtonGroup.add(rAulaSemana4);

		rAulaSemana5 = new JRadioButton("5", false);
		rAulaSemana5.setBounds(82, 89, 40, 20);
		panel.add(rAulaSemana5);
		rAulaSemana5.addItemListener(this);
		rAulaSemana5.setBackground(SystemColor.menu);
		bButtonGroup.add(rAulaSemana5);

		rAulaSemana6 = new JRadioButton("6", false);
		rAulaSemana6.setBounds(82, 119, 40, 20);
		panel.add(rAulaSemana6);
		rAulaSemana6.addItemListener(this);
		rAulaSemana6.setBackground(SystemColor.menu);
		bButtonGroup.add(rAulaSemana6);
		getContentPane().add(lCargaHoraria);
		getContentPane().add(tCargaHoraria);
		getContentPane().add(bIncluir);
		getContentPane().add(bLimpar);
		getContentPane().add(bSair);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == bSair) {
			dispose();
		}

		if (e.getSource() == bIncluir) {
			// Implementar SQL

			conectarBD();
			cadastrarDisciplina();
		}

		if (e.getSource() == bLimpar) {
			tCodigoDisciplina.setText("");
			tCargaHoraria.setText("");
			tNomeDisciplina.setText("");
			bButtonGroup.clearSelection();

		}
	}

	private void conectarBD() {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, login, senha);
		} catch (ClassNotFoundException e) {
			System.out.println("Driver JDBC não encontrado.");
		} catch (SQLException e) {
			System.out.println("Problema na conexão com o BD");
		}
	}

	public void cadastrarDisciplina() {
		try {
			conectarBD();

			String sql = " INSERT INTO DISCIPLINA 	(id, NOMEDISCIPLINA, CARGAHORARIA, AULASSEMANA) "
					+ " VALUES 					( ?,    ?,     ?,     ? )";

			PreparedStatement psSQL = conn.prepareStatement(sql);

			psSQL.setString(1, tCodigoDisciplina.getText());
			psSQL.setString(2, tNomeDisciplina.getText());
			psSQL.setString(3, tCargaHoraria.getText());

			if (rAulaSemana1.isSelected()) {
				psSQL.setString(4, "1");
			}

			if (rAulaSemana2.isSelected()) {
				psSQL.setString(4, "2");
			}

			if (rAulaSemana3.isSelected()) {
				psSQL.setString(4, "3");
			}
			if (rAulaSemana4.isSelected()) {
				psSQL.setString(4, "4");
			}

			if (rAulaSemana5.isSelected()) {
				psSQL.setString(4, "5");
			}

			if (rAulaSemana6.isSelected()) {
				psSQL.setString(4, "6");
			}

			psSQL.execute();
			psSQL.close();

			JOptionPane.showMessageDialog(null, "Disciplina cadastrada com sucesso.");
			
			
			tNomeDisciplina.setText("");
			tCodigoDisciplina.setText("");
			tCargaHoraria.setText("");
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Falha na gravação.", "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {

	}

	@Override
	public void itemStateChanged(ItemEvent e) {

	}
}
