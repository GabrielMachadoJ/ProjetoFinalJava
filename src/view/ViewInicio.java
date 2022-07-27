package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.View;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;

public class ViewInicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewInicio frame = new ViewInicio();
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
	public ViewInicio() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 352, 439);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BarberShop");
		lblNewLabel.setBounds(81, 11, 169, 41);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Fira Code", Font.PLAIN, 25));
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(443, -25, -437, 296);
		contentPane.add(scrollPane);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewLogin telaLogin = new ViewLogin();
				telaLogin.setVisible(true);
			}
		});
		btnEntrar.setFont(new Font("Fira Code", Font.PLAIN, 17));
		btnEntrar.setBackground(Color.WHITE);
		btnEntrar.setBounds(81, 134, 169, 54);
		contentPane.add(btnEntrar);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setToolTipText("");
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(34, 50, 269, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("Seja Bem-Vindo!");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Fira Code", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(81, 89, 169, 34);
		contentPane.add(lblNewLabel_1);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewCadCli telaCad = new ViewCadCli();
				telaCad.setVisible(true);
			}
		});
		btnCadastrar.setFont(new Font("Fira Code", Font.PLAIN, 17));
		btnCadastrar.setBackground(Color.WHITE);
		btnCadastrar.setBounds(81, 252, 169, 54);
		contentPane.add(btnCadastrar);
		
		JLabel lblNewLabel_1_1 = new JLabel("Não tem cadastro?");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Fira Code", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(81, 207, 169, 34);
		contentPane.add(lblNewLabel_1_1);
	}
}
