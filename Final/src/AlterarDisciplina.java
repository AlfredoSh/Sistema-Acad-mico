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
import java.sql.ResultSet;
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

public class AlterarDisciplina extends JFrame implements ActionListener, ListSelectionListener, ItemListener {

	JButton bBuscar, bAlterar, bSair, bExcluir;
	JTextField tcodigoDisciplina, tNomeDisciplina, tCargaHoraria;
	JLabel lTitulo, lCodCurso, lNomeCurso, lNomeDisciplina, lAulasSemana, lCargaHoraria;
	JRadioButton rAulaSemana1, rAulaSemana2, rAulaSemana3, rAulaSemana4, rAulaSemana5, rAulaSemana6;
	ButtonGroup bButtonGroup;

	String url = "jdbc:mysql://localhost:3306/test";
	String login = "root1";
	String senha = "123456";

	Connection conn = null;
	private JPanel panel;
	private JPanel panel_1;

	public AlterarDisciplina() {
		setTitle("Tela de Alteração dos Dados da Disciplina");
		setSize(600, 500);
		setLocation(80, 50);

		lTitulo = new JLabel("Alterar Disciplina");
		lTitulo.setLocation(30, 20);
		lTitulo.setSize(490, 20);
		lTitulo.setFont(new Font("Garamond", Font.BOLD, 22));

		bButtonGroup = new ButtonGroup();

		bBuscar = new JButton("Buscar");
		bBuscar.setSize(100, 40);
		bBuscar.setLocation(36, 400);
		bBuscar.setBackground(new Color(150, 220, 255));
		bBuscar.addActionListener(this);
		bBuscar.setFont(new Font("Serif", Font.BOLD, 18));
		bBuscar.setBackground(new Color(150, 220, 255));

		bAlterar = new JButton("Alterar");
		bAlterar.setEnabled(false);
		bAlterar.setSize(100, 40);
		bAlterar.setLocation(170, 400);
		bAlterar.setBackground(new Color(150, 220, 255));
		bAlterar.addActionListener(this);
		bAlterar.setFont(new Font("Serif", Font.BOLD, 18));
		bAlterar.setBackground(new Color(150, 220, 255));

		bSair = new JButton("Sair");
		bSair.setSize(100, 40);
		bSair.setLocation(462, 400);
		bSair.setBackground(new Color(150, 220, 255));
		bSair.addActionListener(this);
		bSair.setFont(new Font("Serif", Font.BOLD, 18));
		bAlterar.setBackground(new Color(150, 220, 255));

		bExcluir = new JButton("Excluir");
		bExcluir.setFont(new Font("Serif", Font.BOLD, 18));
		bExcluir.setEnabled(false);
		bExcluir.setBackground(new Color(150, 220, 255));
		bExcluir.setBounds(314, 400, 100, 40);
		bExcluir.addActionListener(this);
		bButtonGroup.clearSelection();

		getContentPane().setLayout(null);
		getContentPane().add(lTitulo);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(34, 85, 222, 152);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
				tcodigoDisciplina = new JTextField("");
				tcodigoDisciplina.setBounds(136, 16, 80, 25);
				panel_1.add(tcodigoDisciplina);
				
						lCodCurso = new JLabel("Código da Disciplina:");
						lCodCurso.setBounds(6, 16, 120, 20);
						panel_1.add(lCodCurso);
						lCodCurso.setFont(new Font("Cambria", Font.BOLD, 12));
						
								lNomeDisciplina = new JLabel("Nome da Disciplina:");
								lNomeDisciplina.setBounds(6, 66, 120, 20);
								panel_1.add(lNomeDisciplina);
								lNomeDisciplina.setFont(new Font("Cambria", Font.BOLD, 12));
								
										tNomeDisciplina = new JTextField("");
										tNomeDisciplina.setBounds(136, 66, 80, 25);
										panel_1.add(tNomeDisciplina);
										tNomeDisciplina.setEnabled(false);
										
												lCargaHoraria = new JLabel("Carga Horária:");
												lCargaHoraria.setBounds(6, 116, 120, 20);
												panel_1.add(lCargaHoraria);
												lCargaHoraria.setFont(new Font("Cambria", Font.BOLD, 12));
												
														tCargaHoraria = new JTextField("");
														tCargaHoraria.setBounds(136, 116, 80, 25);
														panel_1.add(tCargaHoraria);
														tCargaHoraria.setEnabled(false);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(336, 87, 165, 150);
		getContentPane().add(panel);
		panel.setLayout(null);
		
				lAulasSemana = new JLabel("Aulas na Semana");
				lAulasSemana.setBounds(32, 11, 100, 20);
				panel.add(lAulasSemana);
				lAulasSemana.setFont(new Font("Cambria", Font.BOLD, 12));
				
						rAulaSemana1 = new JRadioButton("1", true);
						rAulaSemana1.setBounds(32, 59, 40, 20);
						panel.add(rAulaSemana1);
						rAulaSemana1.setEnabled(false);
						rAulaSemana1.addItemListener(this);
						rAulaSemana1.setBackground(SystemColor.menu);
						bButtonGroup.add(rAulaSemana1);
						
								rAulaSemana2 = new JRadioButton("2", false);
								rAulaSemana2.setBounds(32, 89, 40, 20);
								panel.add(rAulaSemana2);
								rAulaSemana2.setEnabled(false);
								rAulaSemana2.addItemListener(this);
								rAulaSemana2.setBackground(SystemColor.menu);
								bButtonGroup.add(rAulaSemana2);
								
										rAulaSemana3 = new JRadioButton("3", false);
										rAulaSemana3.setBounds(32, 119, 40, 20);
										panel.add(rAulaSemana3);
										rAulaSemana3.setEnabled(false);
										rAulaSemana3.addItemListener(this);
										rAulaSemana3.setBackground(SystemColor.menu);
										bButtonGroup.add(rAulaSemana3);
										
												rAulaSemana4 = new JRadioButton("4", false);
												rAulaSemana4.setBounds(82, 59, 40, 20);
												panel.add(rAulaSemana4);
												rAulaSemana4.setEnabled(false);
												rAulaSemana4.addItemListener(this);
												rAulaSemana4.setBackground(SystemColor.menu);
												bButtonGroup.add(rAulaSemana4);
												
														rAulaSemana5 = new JRadioButton("5", false);
														rAulaSemana5.setBounds(82, 89, 40, 20);
														panel.add(rAulaSemana5);
														rAulaSemana5.setEnabled(false);
														rAulaSemana5.addItemListener(this);
														rAulaSemana5.setBackground(SystemColor.menu);
														bButtonGroup.add(rAulaSemana5);
														
																rAulaSemana6 = new JRadioButton("6", false);
																rAulaSemana6.setBounds(82, 119, 40, 20);
																panel.add(rAulaSemana6);
																rAulaSemana6.setEnabled(false);
																rAulaSemana6.addItemListener(this);
																rAulaSemana6.setBackground(SystemColor.menu);
																bButtonGroup.add(rAulaSemana6);
		getContentPane().add(bBuscar);
		getContentPane().add(bAlterar);
		getContentPane().add(bSair);
		getContentPane().add(bExcluir);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == bSair) {
			dispose();
		}
		if (e.getSource() == bBuscar) {
			buscarDisciplina();
		}
		if (e.getSource() == bAlterar) {
			alterarDisciplina();
		}

		if (e.getSource() == bExcluir) {
			excluirDisciplina();
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

	protected void buscarDisciplina() {
		String sql = "SELECT * FROM DISCIPLINA WHERE ID=?";
		try {

			conectarBD();

			PreparedStatement psSQL = conn.prepareStatement(sql);
			psSQL.setString(1, tcodigoDisciplina.getText());

			ResultSet rs = psSQL.executeQuery();

			if (rs != null && rs.next()) {
				tNomeDisciplina.setText(rs.getString("nomeDisciplina"));
				tCargaHoraria.setText(rs.getString("cargaHoraria"));

				if (rs.getString("aulasSemana").equals("1")) {
					rAulaSemana1.setSelected(true);
				}

				if (rs.getString("aulasSemana").equals("2")) {
					rAulaSemana2.setSelected(true);
				}

				if (rs.getString("aulasSemana").equals("3")) {
					rAulaSemana3.setSelected(true);
				}

				if (rs.getString("aulasSemana").equals("4")) {
					rAulaSemana4.setSelected(true);
				}

				if (rs.getString("aulasSemana").equals("5")) {
					rAulaSemana5.setSelected(true);
				}

				if (rs.getString("aulasSemana").equals("6")) {
					rAulaSemana6.setSelected(true);
				}


				bAlterar.setEnabled(true);
				rAulaSemana1.setEnabled(true);
				rAulaSemana2.setEnabled(true);
				rAulaSemana3.setEnabled(true);
				rAulaSemana4.setEnabled(true);
				rAulaSemana5.setEnabled(true);
				rAulaSemana6.setEnabled(true);
				tNomeDisciplina.setEnabled(true);
				tCargaHoraria.setEnabled(true);
				bExcluir.setEnabled(true);
				tcodigoDisciplina.setEnabled(false);

			} else
				JOptionPane.showMessageDialog(null, "Disciplina não localizada.");

			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void excluirDisciplina() {

		conectarBD();

		String sql = " DELETE FROM DISCIPLINA " + " WHERE ID=?";

		try {
			PreparedStatement psSQL = conn.prepareStatement(sql);
			psSQL.setString(1, tcodigoDisciplina.getText());

			psSQL.execute();
			psSQL.close();

			JOptionPane.showMessageDialog(null, "Disciplina: " + tNomeDisciplina.getText() + "\n Excluida com sucesso",
					"Atenção:", JOptionPane.INFORMATION_MESSAGE);

			tcodigoDisciplina.setText("");
			tcodigoDisciplina.setEnabled(true);
			tNomeDisciplina.setText("");
			tNomeDisciplina.setEnabled(false);
			tCargaHoraria.setText("");
			tCargaHoraria.setEnabled(false);
			bAlterar.setEnabled(false);
			bExcluir.setEnabled(false);
			bButtonGroup.clearSelection();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	protected void alterarDisciplina() {

		String sql = " UPDATE DISCIPLINA " + " SET NOMEDISCIPLINA=?,  CARGAHORARIA=?,  AULASSEMANA=? " + " WHERE ID=? ";
		try {
			conectarBD();
			PreparedStatement psSQL = conn.prepareStatement(sql);

			psSQL.setString(1, tNomeDisciplina.getText());
			psSQL.setString(4, tcodigoDisciplina.getText());
			psSQL.setString(2, tCargaHoraria.getText());

			if (rAulaSemana1.isSelected()) {
				psSQL.setString(3, "1");
			}

			if (rAulaSemana2.isSelected()) {
				psSQL.setString(3, "2");
			}

			if (rAulaSemana3.isSelected()) {
				psSQL.setString(3, "3");
			}
			if (rAulaSemana4.isSelected()) {
				psSQL.setString(3, "4");
			}

			if (rAulaSemana5.isSelected()) {
				psSQL.setString(3, "5");
			}

			if (rAulaSemana6.isSelected()) {
				psSQL.setString(3, "6");
			}

			int qtdeLinhas = psSQL.executeUpdate();

			if (qtdeLinhas == 0) {
				JOptionPane.showMessageDialog(null, "Disciplina não alterada", "Info", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Disciplina alterada!", "Info", JOptionPane.INFORMATION_MESSAGE);

				bAlterar.setEnabled(false);
				bExcluir.setEnabled(false);
				rAulaSemana1.setEnabled(false);
				rAulaSemana2.setEnabled(false);
				rAulaSemana3.setEnabled(false);
				rAulaSemana4.setEnabled(false);
				rAulaSemana5.setEnabled(false);
				rAulaSemana6.setEnabled(false);
				tNomeDisciplina.setEnabled(false);
				tCargaHoraria.setEnabled(false);
				tcodigoDisciplina.setText("");
				tNomeDisciplina.setText("");
				tCargaHoraria.setText("");
				tcodigoDisciplina.setEnabled(true);
				bButtonGroup.clearSelection();

			}
			psSQL.close();

		} catch (SQLException e) {
			System.out.println(e);
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
