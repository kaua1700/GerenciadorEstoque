package br.edu.ifcvideira.TestesIG;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EntradaMateriais extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEntradaDeMateriais;
	private JComboBox comboBox;
	private JLabel lblNewLabel;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntradaMateriais frame = new EntradaMateriais();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EntradaMateriais() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 541);
		contentPane = new JPanel();

		setContentPane(contentPane);
		
		txtEntradaDeMateriais = new JTextField();
		txtEntradaDeMateriais.setText("ENTRADA DE MATERIAIS");
		txtEntradaDeMateriais.setHorizontalAlignment(SwingConstants.CENTER);
		txtEntradaDeMateriais.setForeground(Color.WHITE);
		txtEntradaDeMateriais.setFont(new Font("Arial", Font.BOLD, 16));
		txtEntradaDeMateriais.setEditable(false);
		txtEntradaDeMateriais.setColumns(10);
		txtEntradaDeMateriais.setBackground(new Color(153, 102, 204));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, new Color(0, 0, 0), null));
		
		btnNewButton_1 = new JButton("VOLTAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
                // Cria e exibe a segunda tela
                telaprincipal telaprincipal = new telaprincipal();
                telaprincipal.setLocationRelativeTo(null);
                telaprincipal.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 11));
		btnNewButton_1.setBackground(new Color(204, 204, 204));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(txtEntradaDeMateriais, GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(64, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 552, GroupLayout.PREFERRED_SIZE)
					.addGap(63))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(50)
					.addComponent(btnNewButton_1)
					.addContainerGap(540, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(txtEntradaDeMateriais, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_1)
					.addPreferredGap(ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE)
					.addGap(42))
		);
		
		comboBox = new JComboBox();
		comboBox.setBackground(new Color(192, 192, 192));
		comboBox.addItem("");
		
		lblNewLabel = new JLabel("Escolha o material e a quantidade a serem adicionados ao estoque");
		lblNewLabel.setForeground(new Color(153, 102, 204));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Tipo de material");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		lblNewLabel_2 = new JLabel("Quantidade");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 11));
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.LIGHT_GRAY);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBackground(Color.LIGHT_GRAY);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setBackground(Color.LIGHT_GRAY);
		
		btnNewButton = new JButton("ADICIONAR");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(153, 102, 204));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 11));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(46)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
									.addGap(56))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(81)))))
					.addGap(53))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(93)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(354, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(229)
					.addComponent(btnNewButton)
					.addContainerGap(228, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(27)
					.addComponent(lblNewLabel)
					.addGap(20)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(73, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}

}
