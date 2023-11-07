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
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vendas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtVendas;
	private JTextField textField_1;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JButton btnNewButton;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vendas frame = new Vendas();
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
	public Vendas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 541);
		contentPane = new JPanel();

		setContentPane(contentPane);
		
		txtVendas = new JTextField();
		txtVendas.setText("VENDAS $");
		txtVendas.setHorizontalAlignment(SwingConstants.CENTER);
		txtVendas.setForeground(Color.WHITE);
		txtVendas.setFont(new Font("Arial", Font.BOLD, 16));
		txtVendas.setEditable(false);
		txtVendas.setColumns(10);
		txtVendas.setBackground(new Color(153, 102, 204));
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, new Color(0, 0, 0), null));
		panel.setBackground(Color.WHITE);
		
		JLabel lblSolicitaoDeMaterial = new JLabel("Solicitação de Material");
		lblSolicitaoDeMaterial.setForeground(new Color(153, 102, 204));
		lblSolicitaoDeMaterial.setFont(new Font("Arial", Font.BOLD, 15));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel_2 = new JLabel("Quantidade");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 11));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo de material");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 11));
		
		JLabel lblEscolhaOMaterial = new JLabel("Escolha o material solicitado e a quantidade");
		lblEscolhaOMaterial.setForeground(new Color(153, 102, 204));
		lblEscolhaOMaterial.setFont(new Font("Arial", Font.BOLD, 13));
		
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
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtVendas, GroupLayout.PREFERRED_SIZE, 679, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(63)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 552, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(txtVendas, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE)
					.addGap(37))
		);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.LIGHT_GRAY);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBackground(Color.LIGHT_GRAY);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setBackground(Color.LIGHT_GRAY);
		
		btnNewButton = new JButton("VENDER");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(153, 102, 204));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 11));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(202)
							.addComponent(lblSolicitaoDeMaterial, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(109)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblEscolhaOMaterial, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
									.addGap(128)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(79)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(239)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(109, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(11)
					.addComponent(lblSolicitaoDeMaterial)
					.addGap(9)
					.addComponent(lblEscolhaOMaterial)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2))
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(16)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(62, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}

}
