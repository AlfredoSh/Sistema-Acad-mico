import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MostrarCursos extends JFrame implements ActionListener, ListSelectionListener {

	private JTextField tCargaHoraria;
	private JTextField tCodigoCurso;
	private JTextField tTipoCurso;
	private JTextField tNomeCurso;

	public MostrarCursos() {

		setTitle("Mostrar Cursos");
		setResizable(false);
		setSize(600, 500);
		setLocation(400, 250);
		setBackground(Color.yellow);
		getContentPane().setLayout(null);

		

		JLabel lblCursosCadastradso = new JLabel("Cursos Cadastrados");
		lblCursosCadastradso.setFont(new Font("Serif", Font.BOLD, 22));
		lblCursosCadastradso.setBounds(172, 27, 344, 20);
		getContentPane().add(lblCursosCadastradso);

		JLabel lCodCurso = new JLabel("C\u00F3digo do Curso:");
		lCodCurso.setFont(new Font("Book Antiqua", Font.BOLD, 12));
		lCodCurso.setBounds(37, 98, 120, 20);
		getContentPane().add(lCodCurso);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(37, 146, 376, 140);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lCargaHoraria = new JLabel("Carga Horaria:");
		lCargaHoraria.setBounds(6, 47, 120, 20);
		panel.add(lCargaHoraria);
		lCargaHoraria.setFont(new Font("Book Antiqua", Font.BOLD, 12));

		JLabel lTipoCurso = new JLabel("Tipo de Curso");
		lTipoCurso.setBounds(6, 78, 78, 16);
		panel.add(lTipoCurso);
		lTipoCurso.setFont(new Font("Book Antiqua", Font.BOLD, 12));

		tCargaHoraria = new JTextField();
		tCargaHoraria.setBounds(136, 47, 175, 20);
		panel.add(tCargaHoraria);
		tCargaHoraria.setEditable(false);
		tCargaHoraria.setColumns(10);

		tTipoCurso = new JTextField();
		tTipoCurso.setBounds(136, 78, 175, 20);
		panel.add(tTipoCurso);
		tTipoCurso.setEditable(false);
		tTipoCurso.setColumns(10);

		JLabel lNomeCurso = new JLabel("Nome do Curso");
		lNomeCurso.setBounds(6, 16, 87, 16);
		panel.add(lNomeCurso);
		lNomeCurso.setFont(new Font("Book Antiqua", Font.BOLD, 12));

		tNomeCurso = new JTextField();
		tNomeCurso.setBounds(136, 16, 175, 20);
		panel.add(tNomeCurso);
		tNomeCurso.setEditable(false);
		tNomeCurso.setColumns(10);

		tCodigoCurso = new JTextField();
		tCodigoCurso.setColumns(10);
		tCodigoCurso.setBounds(167, 98, 86, 20);
		getContentPane().add(tCodigoCurso);

		JButton bSair = new JButton("Sair");
		bSair.setFont(new Font("Serif", Font.BOLD, 18));
		bSair.setBackground(new Color(150, 220, 255));
		bSair.setBounds(354, 354, 100, 40);
		getContentPane().add(bSair);
		tCodigoCurso.setText("001");

		JButton bBuscar = new JButton("Buscar");

		bBuscar.setFont(new Font("Serif", Font.BOLD, 18));
		bBuscar.setBackground(new Color(150, 220, 255));
		bBuscar.setBounds(49, 354, 100, 40);
		getContentPane().add(bBuscar);

		JButton bLimpar = new JButton("Limpar");
		bLimpar.setFont(new Font("Serif", Font.BOLD, 18));
		bLimpar.setBackground(new Color(150, 220, 255));
		bLimpar.setBounds(196, 354, 100, 40);
		getContentPane().add(bLimpar);
		
		
		bBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tCargaHoraria.setText("3");
				tNomeCurso.setText("Sistemas de Informação");
				tTipoCurso.setText("Bacharel");
				
				
			}
		});
		
		
		
		bLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tCargaHoraria.setText("");
				tNomeCurso.setText("");
				tTipoCurso.setText("");
				
				
			}
		});
		
		
		bSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
	}

	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {

	}
}
