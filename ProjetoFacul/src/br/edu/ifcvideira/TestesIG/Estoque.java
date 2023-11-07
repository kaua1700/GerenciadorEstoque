package br.edu.ifcvideira.TestesIG;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

import br.com.timer.annotations.ColumnRow;

import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import java.awt.ComponentOrientation;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import br.com.timer.objects.DataHandler;
import br.com.timer.objects.builders.OrderType;
import br.com.timer.objects.rows.Rows;

public class Estoque extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tableMateriais;
	private JScrollPane scrollPane;
	private JTextField txtMateriasEmEstoque;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField novoMaterial;
	private JButton btnCadastrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Estoque frame = new Estoque();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	@ColumnRow
	List<String> nomesEmEstoque = new ArrayList<>();
	private JButton btnNewButton;
	/**
	 * Create the frame.
	 */
	public Estoque() {
		criarlista();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		scrollPane.setBounds(27, 201, 608, 290);
		contentPane.add(scrollPane);
		
		tableMateriais = new JTable();
		tableMateriais.setAutoCreateRowSorter(true);
		tableMateriais.setOpaque(false);
		tableMateriais.setShowHorizontalLines(false);
		scrollPane.setViewportView(tableMateriais);
		tableMateriais.setFillsViewportHeight(true);
		tableMateriais.setFont(new Font("Tahoma", Font.BOLD, 13));
		tableMateriais.setModel(new DefaultTableModel(
			new Object[][] {
				{"Saco de Gesso", new Integer(0), null},
			},
			new String[] {
				"Materiais", "Quantidade", "ID"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, Integer.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tableMateriais.getColumnModel().getColumn(0).setPreferredWidth(458);
		
		DefaultTableModel model = (DefaultTableModel) tableMateriais.getModel();
		int rowCount = model.getRowCount();

		List<String> nomesMateriais = new ArrayList<>();

		for (int i = 0; i < rowCount; i++) {
		    String material = (String) model.getValueAt(i, 0); // 0 é o índice da coluna "Materiais"
		    nomesMateriais.add(material);
		}
		
		JSeparator separator = new JSeparator();
		separator.setBounds(128, 133, 1, 2);
		contentPane.add(separator);
		
		txtMateriasEmEstoque = new JTextField();
		txtMateriasEmEstoque.setEditable(false);
		txtMateriasEmEstoque.setHorizontalAlignment(SwingConstants.CENTER);
		txtMateriasEmEstoque.setText("MATERIAS EM ESTOQUE");
		txtMateriasEmEstoque.setFont(new Font("Arial", Font.BOLD, 16));
		txtMateriasEmEstoque.setForeground(new Color(255, 255, 255));
		txtMateriasEmEstoque.setBackground(new Color(153, 102, 204));
		txtMateriasEmEstoque.setBounds(0, 0, 679, 55);
		contentPane.add(txtMateriasEmEstoque);
		txtMateriasEmEstoque.setColumns(10);
		
		lblNewLabel = new JLabel("CADASTRO DE MATERIAIS");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBounds(463, 65, 173, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Digite o nome do novo material:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_1.setBounds(450, 90, 185, 14);
		contentPane.add(lblNewLabel_1);
		
		novoMaterial = new JTextField();
		novoMaterial.setBounds(450, 115, 185, 20);
		contentPane.add(novoMaterial);
		novoMaterial.setColumns(10);
		
		btnCadastrar = new JButton("CADASTRAR");
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String novoNome = novoMaterial.getText();
                if (!novoNome.isEmpty()) {
                    nomesEmEstoque.add(novoNome);
                    Collections.sort(nomesEmEstoque);
                    DefaultTableModel model = (DefaultTableModel) tableMateriais.getModel();
                    model.setRowCount(0); // Limpa a tabela
                    for (String nome : nomesEmEstoque) {
                        model.addRow(new Object[]{nome, "0"});
                    }
                    novoMaterial.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Digite um nome válido!");
                }
            }
        });
        btnCadastrar.setForeground(new Color(255, 255, 255));
        btnCadastrar.setBackground(new Color(153, 102, 204));
        btnCadastrar.setFont(new Font("Arial", Font.BOLD, 11));
        btnCadastrar.setBounds(492, 146, 106, 23);
        contentPane.add(btnCadastrar);
        
        btnNewButton = new JButton("VOLTAR");
        btnNewButton.setBackground(new Color(204, 204, 204));
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
                // Cria e exibe a segunda tela
                telaprincipal telaprincipal = new telaprincipal();
                telaprincipal.setLocationRelativeTo(null);
                telaprincipal.setVisible(true);
        	}
        });
        btnNewButton.setFont(new Font("Arial", Font.BOLD, 11));
        btnNewButton.setBounds(27, 86, 89, 23);
        contentPane.add(btnNewButton);
    }
	
	private void criarlista() {
		Material material = new Material();
		material.setTypeMaterial("Saco de Gesso");
		material.setQuantidade(0);
		material.save();
		material.setTypeMaterial("Gesso Cola");
		material.setQuantidade(0);
		material.save();
		
		DataHandler data=telaprincipal.BancoDados.getHandler().fetch().from("Material").orderBy(OrderType.CESC).where(Rows.of("typeMaterial", "")).builder();
		if (data.isNext()) {
			data.of((key,valor)->{
				System.out.println(key+" "+valor);
				
			});
		}
	}
}