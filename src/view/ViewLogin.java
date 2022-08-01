package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.Cliente;

import javax.swing.JLabel;

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

public class ViewLogin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField txtPass;
	public static String nome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin frame = new ViewLogin();
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
	public ViewLogin() {

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 352, 439);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("BarberShop");
		lblNewLabel.setBounds(95, 11, 164, 41);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Fira Code", Font.PLAIN, 25));
		contentPane.add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(443, -25, -437, 296);
		contentPane.add(scrollPane);

		txtLogin = new JTextField();
		txtLogin.setBounds(95, 111, 146, 35);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);

		JLabel lblNewLabel_1_1 = new JLabel("Senha");
		lblNewLabel_1_1.setBounds(95, 172, 68, 22);
		lblNewLabel_1_1.setForeground(new Color(153, 153, 153));
		lblNewLabel_1_1.setFont(new Font("Fira Code", Font.ITALIC, 14));
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Login");
		lblNewLabel_1_1_1.setBounds(95, 78, 68, 22);
		lblNewLabel_1_1_1.setForeground(new Color(153, 153, 153));
		lblNewLabel_1_1_1.setFont(new Font("Fira Code", Font.ITALIC, 14));
		contentPane.add(lblNewLabel_1_1_1);

		JButton btnLogin = new JButton("Entrar");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewBarbeiro telaInicio = new ViewBarbeiro();

				if (txtLogin.getText().equals("admin") && new String(txtPass.getPassword()).equals("admin")) {
					telaInicio.setVisible(true);
					setVisible(false);

				} else {
					if (Cliente.clientes.size() > 0) {
						for (int i = 0; i < Cliente.clientes.size(); i++) {
							if (txtLogin.getText().equals(Cliente.clientes.get(i).getNome() )&& new String(txtPass.getPassword()).equals(Cliente.clientes.get(i).getCpf())) {
								ViewAgendamento agenda = new ViewAgendamento(txtLogin.getText());
								agenda.setVisible(true);
								setVisible(false);

							} else {
								setVisible(false);
								ViewSemCadastro cadastrar = new ViewSemCadastro();
								cadastrar.setVisible(true);
							}
						}

					} else {
						setVisible(false);
						ViewSemCadastro cadastrar = new ViewSemCadastro();
						cadastrar.setVisible(true);
					}

				}
			}
		});
		btnLogin.setBounds(95, 251, 146, 35);
		btnLogin.setFont(new Font("Fira Code", Font.PLAIN, 17));
		btnLogin.setBackground(new Color(255, 255, 255));
		contentPane.add(btnLogin);

		txtPass = new JPasswordField();
		txtPass.setBounds(95, 205, 146, 35);
		contentPane.add(txtPass);

		JSeparator separator_1 = new JSeparator();
		separator_1.setToolTipText("");
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(36, 50, 269, 2);
		contentPane.add(separator_1);
	}
}
