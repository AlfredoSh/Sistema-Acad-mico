import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

public class CasastrarProfessor extends JFrame implements ActionListener, ItemListener {

	JButton bIncluir, bLimpar, bSair;
	JTextField tIdentidade, tNome, tEndereco, tDataNascimento;
	JLabel lTitulo, lIdentidade, lTituloProfessor, lNome, lTipoCurso, lEndereco, lDataNascimento;
	JRadioButton rBacharel, rGestao, rOutros;
	ButtonGroup bButtonGroup;
	JCheckBox cDireito, cInformatica, cMatematica, cMedicina, cBacharel, cEspecialista, cMaestrado, cDoutorado;

	public CasastrarProfessor() {
		setTitle("Tela de Inclusão dos Dados do Professor");
		setSize(600, 500);
		setLocation(80, 50);
		lTitulo = new JLabel("Cadastro dos Dados do Professor");
		lTitulo.setLocation(30, 20);
		lTitulo.setSize(490, 20);
		lTitulo.setFont(new Font("Serif", Font.BOLD, 22));

		lIdentidade = new JLabel("Identidade:");
		lIdentidade.setFont(new Font("Book Antiqua", Font.BOLD, 12));
		lIdentidade.setLocation(30, 70);
		lIdentidade.setSize(120, 20);

		tIdentidade = new JTextField("");
		tIdentidade.setBorder(new MatteBorder(1, 1, 1, 1, (Color) SystemColor.inactiveCaption));
		tIdentidade.setSize(80, 25);
		tIdentidade.setLocation(160, 70);

		lNome = new JLabel("Nome:");
		lNome.setFont(new Font("Book Antiqua", Font.BOLD, 12));
		lNome.setLocation(30, 120);
		lNome.setSize(120, 20);

		tNome = new JTextField("");
		tNome.setBorder(new MatteBorder(1, 1, 1, 1, (Color) SystemColor.inactiveCaption));
		tNome.setSize(80, 25);
		tNome.setLocation(160, 120);

		lEndereco = new JLabel("Endereço:");
		lEndereco.setFont(new Font("Book Antiqua", Font.BOLD, 12));
		lEndereco.setLocation(30, 170);
		lEndereco.setSize(120, 20);

		tEndereco = new JTextField("");
		tEndereco.setBorder(new MatteBorder(1, 1, 1, 1, (Color) SystemColor.inactiveCaption));
		tEndereco.setSize(80, 25);
		tEndereco.setLocation(160, 170);

		cDireito = new JCheckBox("Direito", false);
		cDireito.setLocation(25, 280);
		cDireito.setSize(120, 20);
		cDireito.addItemListener(this);
		cDireito.setBackground(SystemColor.menu);

		cInformatica = new JCheckBox("Informática", false);
		cInformatica.setLocation(25, 300);
		cInformatica.setSize(120, 20);
		cInformatica.addItemListener(this);
		cInformatica.setBackground(SystemColor.menu);

		cMatematica = new JCheckBox("Matemática", false);
		cMatematica.setLocation(25, 320);
		cMatematica.setSize(120, 20);
		cMatematica.addItemListener(this);
		cMatematica.setBackground(SystemColor.menu);

		cMedicina = new JCheckBox("Medicina", false);
		cMedicina.setLocation(25, 340);
		cMedicina.setSize(120, 20);
		cMedicina.addItemListener(this);
		cMedicina.setBackground(SystemColor.menu);

		lDataNascimento = new JLabel("Data de Nascimento:");
		lDataNascimento.setFont(new Font("Book Antiqua", Font.BOLD, 12));
		lDataNascimento.setLocation(30, 220);
		lDataNascimento.setSize(120, 20);

		tDataNascimento = new JTextField("");
		tDataNascimento.setBorder(new MatteBorder(1, 1, 1, 1, (Color) SystemColor.inactiveCaption));
		tDataNascimento.setSize(80, 25);
		tDataNascimento.setLocation(160, 220);

		lTituloProfessor = new JLabel("Título Professor");
		lTituloProfessor.setFont(new Font("Book Antiqua", Font.BOLD, 12));
		lTituloProfessor.setLocation(300, 260);
		lTituloProfessor.setSize(120, 20);

		lTipoCurso = new JLabel("Especialidade");
		lTipoCurso.setFont(new Font("Book Antiqua", Font.BOLD, 12));
		lTipoCurso.setLocation(30, 260);
		lTipoCurso.setSize(100, 20);

		cBacharel = new JCheckBox("Bacharel", false);
		cBacharel.setLocation(300, 280);
		cBacharel.setSize(120, 20);
		cBacharel.addItemListener(this);
		cBacharel.setBackground(SystemColor.menu);

		cEspecialista = new JCheckBox("Especialista Lato Sensu", false);
		cEspecialista.setLocation(300, 300);
		cEspecialista.setSize(200, 20);
		cEspecialista.addItemListener(this);
		cEspecialista.setBackground(SystemColor.menu);

		cMaestrado = new JCheckBox("Maestrado", false);
		cMaestrado.setLocation(300, 320);
		cMaestrado.setSize(120, 20);
		cMaestrado.addItemListener(this);
		cMaestrado.setBackground(SystemColor.menu);

		cDoutorado = new JCheckBox("Doutorado", false);
		cDoutorado.setLocation(300, 340);
		cDoutorado.setSize(120, 20);
		cDoutorado.addItemListener(this);
		cDoutorado.setBackground(SystemColor.menu);

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
		getContentPane().add(tIdentidade);
		getContentPane().add(lIdentidade);
		getContentPane().add(lNome);
		getContentPane().add(tNome);
		getContentPane().add(lTituloProfessor);
		getContentPane().add(lTipoCurso);
		getContentPane().add(lEndereco);
		getContentPane().add(tEndereco);
		getContentPane().add(bIncluir);
		getContentPane().add(bLimpar);
		getContentPane().add(bSair);
		getContentPane().add(cDireito);
		getContentPane().add(cInformatica);
		getContentPane().add(cMatematica);
		getContentPane().add(cMedicina);
		getContentPane().add(cBacharel);
		getContentPane().add(cEspecialista);
		getContentPane().add(cMaestrado);
		getContentPane().add(cDoutorado);
		getContentPane().add(lDataNascimento);
		getContentPane().add(tDataNascimento);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == bSair) {
			dispose();
		}
		if (e.getSource() == bIncluir) {
			JOptionPane.showMessageDialog(null, "Professor: " + tNome.getText() + "\n Cadastrado com sucesso",
					"Atenção:", JOptionPane.INFORMATION_MESSAGE);
		}
		if (e.getSource() == bLimpar) {
			tDataNascimento.setText("");
			tEndereco.setText("");
			tIdentidade.setText("");
			tNome.setText("");

		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == rBacharel && e.getStateChange() == ItemEvent.SELECTED) {
			System.out.println(rBacharel.getText());
		}
	}

}
