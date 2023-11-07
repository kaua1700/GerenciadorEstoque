package br.edu.ifcvideira.TestesIG;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

import br.com.timer.collectors.DBCollector;
import br.com.timer.objects.DBCollectors;
import br.com.timer.types.MySQL;

import javax.swing.UIManager;
import javax.swing.border.BevelBorder;

public class telaprincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDepsitoSobralGesso;
	private JButton btnVendasSada;
	private JButton btnEntradaDeMateriais;
	
	public static DBCollector<MySQL>BancoDados=DBCollectors.create(new MySQL("localhost", 3306, "root", "", "BancEstoque"));

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BancoDados.getHandler().table(Material.class);
					telaprincipal frame = new telaprincipal();
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
	public telaprincipal() {
		setTitle("Tela Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 541);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 245));

		setContentPane(contentPane);
		
		txtDepsitoSobralGesso = new JTextField();
		txtDepsitoSobralGesso.setForeground(new Color(255, 255, 255));
		txtDepsitoSobralGesso.setFont(new Font("Arial", Font.BOLD, 19));
		txtDepsitoSobralGesso.setEditable(false);
		txtDepsitoSobralGesso.setHorizontalAlignment(SwingConstants.CENTER);
		txtDepsitoSobralGesso.setText("DEPÓSITO SOBRAL GESSO");
		txtDepsitoSobralGesso.setBackground(new Color(153, 102, 204));
		txtDepsitoSobralGesso.setColumns(10);
		
		JButton btnAbrirEstoque = new JButton("ESTOQUE");
		btnAbrirEstoque.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, new Color(0, 0, 0), null));
		btnAbrirEstoque.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	dispose();
                // Cria e exibe a segunda tela
                Estoque estoque = new Estoque();
                estoque.setLocationRelativeTo(null);
                estoque.setVisible(true);
            }
        });
		

		btnAbrirEstoque.setForeground(new Color(153, 102, 204));
		btnAbrirEstoque.setFont(new Font("Arial", Font.BOLD, 16));
		btnAbrirEstoque.setBackground(new Color(255, 255, 255));
		
		btnVendasSada = new JButton("VENDAS / SAÍDA");
		btnVendasSada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
                // Cria e exibe a segunda tela
                Vendas vendas = new Vendas();
                vendas.setLocationRelativeTo(null);
                vendas.setVisible(true);
			}
		});
		btnVendasSada.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, new Color(0, 0, 0), null));
		btnVendasSada.setForeground(new Color(153, 102, 204));
		btnVendasSada.setFont(new Font("Arial", Font.BOLD, 16));
		btnVendasSada.setBackground(Color.WHITE);
		
		btnEntradaDeMateriais = new JButton("ENTRADA DE MATERIAIS");
		btnEntradaDeMateriais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
                // Cria e exibe a segunda tela
                EntradaMateriais entradaMateriais = new EntradaMateriais();
                entradaMateriais.setLocationRelativeTo(null);
                entradaMateriais.setVisible(true);
			}
		});
		btnEntradaDeMateriais.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, new Color(0, 0, 0), null));
		btnEntradaDeMateriais.setForeground(new Color(153, 102, 204));
		btnEntradaDeMateriais.setFont(new Font("Arial", Font.BOLD, 13));
		btnEntradaDeMateriais.setBackground(Color.WHITE);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(txtDepsitoSobralGesso, GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(24)
					.addComponent(btnAbrirEstoque, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnEntradaDeMateriais, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnVendasSada, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(19, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(txtDepsitoSobralGesso, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addGap(87)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnEntradaDeMateriais, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnVendasSada, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAbrirEstoque, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(217, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
