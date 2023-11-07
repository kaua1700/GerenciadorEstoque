package br.edu.ifcvideira.TestesIG;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;

public class GenEstoque extends Frame {

    private TextField txtAdmin;
    private TextField txtsenha;

    public GenEstoque() {
        setTitle("login");
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        Label lblNewLabel = new Label("Faça login na sua conta");
        lblNewLabel.setForeground(new Color(153, 102, 204));
        lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 18));
        lblNewLabel.setBounds(155, 60, 227, 29);
        add(lblNewLabel);

        Label lblNewLabel_2 = new Label("Usuário:");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_2.setBounds(122, 122, 77, 14);
        add(lblNewLabel_2);

        txtAdmin = new TextField();
        txtAdmin.setBackground(new Color(212, 212, 212));
        txtAdmin.setForeground(new Color(0, 0, 0));
        txtAdmin.setBounds(122, 138, 286, 20);
        add(txtAdmin);

        Label lblNewLabel_2_1 = new Label("Senha:");
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_2_1.setBounds(122, 164, 77, 14);
        add(lblNewLabel_2_1);

        Button btnNewButton = new Button("ENTRAR");
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(153, 102, 204));
        btnNewButton.setBounds(220, 223, 89, 23);
        add(btnNewButton);

        txtsenha = new TextField();
        txtsenha.setBackground(new Color(212, 212, 212));
        txtsenha.setEchoChar('*');
        txtsenha.setBounds(122, 183, 286, 20);
        add(txtsenha);

        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = txtAdmin.getText();
                String password = txtsenha.getText();

                if (username.equals("admin") && password.equals("admin1234")) {
                    openMainScreen();
                } else {
                	JOptionPane.showMessageDialog(null, "Usuário ou senha icorreto", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setSize(515, 311);
        setVisible(true);

        addWindowListener((WindowListener) new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    private void setDefaultCloseOperation(int disposeOnClose) {
		// TODO Auto-generated method stub
		
	}

	private void openMainScreen() {
        telaprincipal mainFrame = new telaprincipal();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        dispose();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                GenEstoque frame = new GenEstoque();
            }
        });
    }
}
