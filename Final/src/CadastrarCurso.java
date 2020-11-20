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
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CadastrarCurso extends JFrame implements ActionListener, ListSelectionListener, ItemListener {

	JButton bIncluir, bLimpar, bSair;
	JTextField tCodCurso, tCargaHoraria, tCodInstituto;
	JLabel lTitulo, lCodCurso, lCargaHoraria, lTipoCurso, lCodigoInstituto, lblNomeDoCurso;
	DefaultListModel<String> lista;
	JList<String> list;
	JRadioButton rBacharel, rGestao, rOutros;
	ButtonGroup bButtonGroup;
	private JPanel panel;

	public CadastrarCurso() {
		setTitle("Tela de Inclusão dos Dados do Curso");
		setSize(600, 500);
		setLocation(80, 50);

		lTitulo = new JLabel("Cadastro dos Dados do Curso");
		lTitulo.setLocation(30, 20);
		lTitulo.setSize(490, 20);
		lTitulo.setFont(new Font("Serif", Font.BOLD, 22));

		lCodCurso = new JLabel("Código do Curso:");
		lCodCurso.setFont(new Font("Book Antiqua", Font.BOLD, 12));
		lCodCurso.setLocation(30, 100);
		lCodCurso.setSize(120, 20);

		tCodCurso = new JTextField("");
		tCodCurso.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tCodCurso.setSize(80, 25);
		tCodCurso.setLocation(160, 100);

		lCargaHoraria = new JLabel("Carga Horaria:");
		lCargaHoraria.setFont(new Font("Book Antiqua", Font.BOLD, 12));
		lCargaHoraria.setLocation(30, 150);
		lCargaHoraria.setSize(120, 20);

		tCargaHoraria = new JTextField("");
		tCargaHoraria.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tCargaHoraria.setSize(80, 25);
		tCargaHoraria.setLocation(160, 150);

		lCodigoInstituto = new JLabel("Código do Institulo:");
		lCodigoInstituto.setFont(new Font("Book Antiqua", Font.BOLD, 12));
		lCodigoInstituto.setLocation(30, 200);
		lCodigoInstituto.setSize(120, 20);

		tCodInstituto = new JTextField("");
		tCodInstituto.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tCodInstituto.setSize(80, 25);
		tCodInstituto.setLocation(160, 200);

		lista = new DefaultListModel<String>();
		lista.addElement("Administração de Empresas");
		lista.addElement("Bio Medicina");
		lista.addElement("Ciências Biologicas");
		lista.addElement("Direito");
		lista.addElement("Educação Física");
		lista.addElement("Farmacologia");
		lista.addElement("Sistemas de Informações");

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

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(296, 88, 250, 130);

		list = new JList<String>(lista);
		scrollPane.setViewportView(list);
		list.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list.setBackground(SystemColor.inactiveCaption);
		list.addListSelectionListener(this);

		lblNomeDoCurso = new JLabel("Nome do Curso");
		lblNomeDoCurso.setFont(new Font("Book Antiqua", Font.BOLD, 12));
		lblNomeDoCurso.setBounds(368, 51, 100, 20);

		getContentPane().setLayout(null);
		getContentPane().add(lTitulo);
		getContentPane().add(tCodCurso);
		getContentPane().add(lCodCurso);
		getContentPane().add(lCargaHoraria);
		getContentPane().add(tCargaHoraria);

		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(30, 242, 219, 138);
		getContentPane().add(panel);
		panel.setLayout(null);

		lTipoCurso = new JLabel("Tipo de Curso");
		lTipoCurso.setBounds(6, 16, 100, 20);
		panel.add(lTipoCurso);
		lTipoCurso.setFont(new Font("Book Antiqua", Font.BOLD, 12));

		rBacharel = new JRadioButton("Bacharel", true);
		rBacharel.setBounds(6, 52, 100, 20);
		panel.add(rBacharel);
		rBacharel.addItemListener(this);
		rBacharel.setBackground(SystemColor.menu);
		bButtonGroup.add(rBacharel);

		rGestao = new JRadioButton("Gestão", false);
		rGestao.setBounds(6, 82, 100, 20);
		panel.add(rGestao);
		rGestao.addItemListener(this);
		rGestao.setBackground(SystemColor.menu);
		bButtonGroup.add(rGestao);

		rOutros = new JRadioButton("Outros", false);
		rOutros.setBounds(6, 112, 100, 20);
		panel.add(rOutros);
		rOutros.addItemListener(this);
		rOutros.setBackground(SystemColor.menu);
		bButtonGroup.add(rOutros);
		getContentPane().add(lCodigoInstituto);
		getContentPane().add(tCodInstituto);
		getContentPane().add(bIncluir);
		getContentPane().add(bLimpar);
		getContentPane().add(bSair);
		getContentPane().add(scrollPane);
		getContentPane().add(lblNomeDoCurso);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == bSair) {
			dispose();
		}

		if (e.getSource() == bLimpar) {
			tCodCurso.setText("");
			tCodInstituto.setText("");
			tCargaHoraria.setText("");
			bButtonGroup.clearSelection();
			list.clearSelection();

		}
		if (e.getSource() == bIncluir) {

			JOptionPane.showMessageDialog(null, "Curso: " + tCodCurso.getText() + "\n Cadastrado com sucesso",
					"Atenção:", JOptionPane.INFORMATION_MESSAGE);
		}

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {

	}

	@Override
	public void itemStateChanged(ItemEvent e) {

	}
}
