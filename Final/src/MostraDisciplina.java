import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MostraDisciplina extends JFrame implements ActionListener, ItemListener {

	JButton bBuscar, bLimpar, bSair;
	JTextField tCodDisciplina, tNomeDisciplina, tCargaHoraria;
	JLabel lTitulo, lCodDisciplina, lNomeCurso, lNomeDisciplina, lAulasSemana, lCargaHoraria;
	JRadioButton rAulaSemana1, rAulaSemana2, rAulaSemana3, rAulaSemana4, rAulaSemana5, rAulaSemana6;
	ButtonGroup bButtonGroup;

	public MostraDisciplina() {
		getContentPane().setEnabled(false);
		setTitle("Mostrar Dados da Disciplina");
		setSize(600, 500);
		setLocation(80, 50);

		lTitulo = new JLabel("Mostrar Dados da Disciplina");
		lTitulo.setLocation(30, 20);
		lTitulo.setSize(490, 20);
		lTitulo.setFont(new Font("Serif", Font.BOLD, 22));

		lCodDisciplina = new JLabel("Código da Disciplina:");
		lCodDisciplina.setFont(new Font("Cambria", Font.BOLD, 12));
		lCodDisciplina.setLocation(40, 101);
		lCodDisciplina.setSize(120, 20);

		tCodDisciplina = new JTextField("001");
		tCodDisciplina.setSize(126, 25);
		tCodDisciplina.setLocation(170, 101);

		lNomeDisciplina = new JLabel("Nome da Disciplina:");
		lNomeDisciplina.setFont(new Font("Cambria", Font.BOLD, 12));
		lNomeDisciplina.setLocation(40, 151);
		lNomeDisciplina.setSize(120, 20);

		tNomeDisciplina = new JTextField("");
		tNomeDisciplina.setBackground(SystemColor.inactiveCaption);
		tNomeDisciplina.setEditable(false);
		tNomeDisciplina.setSize(126, 25);
		tNomeDisciplina.setLocation(170, 151);

		lCargaHoraria = new JLabel("Carga Horária:");
		lCargaHoraria.setFont(new Font("Cambria", Font.BOLD, 12));
		lCargaHoraria.setLocation(40, 201);
		lCargaHoraria.setSize(120, 20);

		tCargaHoraria = new JTextField("");
		tCargaHoraria.setBackground(SystemColor.inactiveCaption);
		tCargaHoraria.setEditable(false);
		tCargaHoraria.setSize(126, 25);
		tCargaHoraria.setLocation(170, 201);

		lAulasSemana = new JLabel("Aulas na Semana");
		lAulasSemana.setFont(new Font("Cambria", Font.BOLD, 12));
		lAulasSemana.setLocation(363, 103);
		lAulasSemana.setSize(100, 20);

		rAulaSemana1 = new JRadioButton("1", false);
		rAulaSemana1.setEnabled(false);
		rAulaSemana1.setLocation(363, 151);
		rAulaSemana1.setSize(40, 20);
		rAulaSemana1.addItemListener(this);
		rAulaSemana1.setBackground(SystemColor.inactiveCaption);

		rAulaSemana2 = new JRadioButton("2", false);
		rAulaSemana2.setEnabled(false);
		rAulaSemana2.setLocation(363, 181);
		rAulaSemana2.setSize(40, 20);
		rAulaSemana2.addItemListener(this);
		rAulaSemana2.setBackground(SystemColor.inactiveCaption);

		rAulaSemana3 = new JRadioButton("3", false);
		rAulaSemana3.setEnabled(false);
		rAulaSemana3.setLocation(363, 211);
		rAulaSemana3.setSize(40, 20);
		rAulaSemana3.addItemListener(this);
		rAulaSemana3.setBackground(SystemColor.inactiveCaption);

		rAulaSemana4 = new JRadioButton("4", false);
		rAulaSemana4.setEnabled(false);
		rAulaSemana4.setLocation(413, 151);
		rAulaSemana4.setSize(40, 20);
		rAulaSemana4.addItemListener(this);
		rAulaSemana4.setBackground(SystemColor.inactiveCaption);

		rAulaSemana5 = new JRadioButton("5", false);
		rAulaSemana5.setEnabled(false);
		rAulaSemana5.setLocation(413, 181);
		rAulaSemana5.setSize(40, 20);
		rAulaSemana5.addItemListener(this);
		rAulaSemana5.setBackground(SystemColor.inactiveCaption);

		rAulaSemana6 = new JRadioButton("6", false);
		rAulaSemana6.setEnabled(false);
		rAulaSemana6.setLocation(413, 211);
		rAulaSemana6.setSize(40, 20);
		rAulaSemana6.addItemListener(this);
		rAulaSemana6.setBackground(SystemColor.inactiveCaption);

		bButtonGroup = new ButtonGroup();
		bButtonGroup.add(rAulaSemana1);
		bButtonGroup.add(rAulaSemana2);
		bButtonGroup.add(rAulaSemana3);
		bButtonGroup.add(rAulaSemana4);
		bButtonGroup.add(rAulaSemana5);
		bButtonGroup.add(rAulaSemana6);

		bBuscar = new JButton("Buscar");
		bBuscar.setSize(100, 40);
		bBuscar.setLocation(110, 400);
		bBuscar.setBackground(new Color(150, 220, 255));
		bBuscar.addActionListener(this);
		bBuscar.setFont(new Font("Serif", Font.BOLD, 18));
		bBuscar.setBackground(new Color(150, 220, 255));

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
		getContentPane().add(tCodDisciplina);
		getContentPane().add(lCodDisciplina);
		getContentPane().add(lNomeDisciplina);
		getContentPane().add(tNomeDisciplina);
		getContentPane().add(lAulasSemana);
		getContentPane().add(rAulaSemana1);
		getContentPane().add(rAulaSemana2);
		getContentPane().add(rAulaSemana3);
		getContentPane().add(rAulaSemana4);
		getContentPane().add(rAulaSemana5);
		getContentPane().add(rAulaSemana6);
		getContentPane().add(lCargaHoraria);
		getContentPane().add(tCargaHoraria);
		getContentPane().add(bBuscar);
		getContentPane().add(bLimpar);
		getContentPane().add(bSair);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == bSair) {
			dispose();
		}
		if (e.getSource() == bBuscar) {

			tCargaHoraria.setText("3");
			rAulaSemana1.setSelected(true);
			tNomeDisciplina.setText("Banco de Dados");

		}
		if (e.getSource() == bLimpar) {

			tCodDisciplina.setText("");
			tCargaHoraria.setText("");
			tNomeDisciplina.setText("");
			bButtonGroup.clearSelection();
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {

	}
}
