package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.Cliente;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSeparator;

public class ViewCadCli extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtEmail;
	private JTextField txtFone;
	protected Window frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCadCli frame = new ViewCadCli();
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
	public ViewCadCli() {
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
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setToolTipText("");
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(34, 50, 269, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Fira Code", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(34, 63, 63, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CPF");
		lblNewLabel_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1_1.setFont(new Font("Fira Code", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(34, 122, 63, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("E-mail");
		lblNewLabel_1_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1_1_1.setFont(new Font("Fira Code", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(34, 178, 63, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Telefone");
		lblNewLabel_1_1_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1_1_1_1.setFont(new Font("Fira Code", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1.setBounds(34, 233, 72, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		txtNome = new JTextField();
		txtNome.setBounds(34, 88, 269, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(34, 147, 269, 20);
		contentPane.add(txtCpf);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(34, 203, 269, 20);
		contentPane.add(txtEmail);
		
		txtFone = new JTextField();
		txtFone.setColumns(10);
		txtFone.setBounds(34, 258, 269, 20);
		contentPane.add(txtFone);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setForeground(new Color(255, 255, 255));
		btnCadastrar.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				Cliente cliente = new Cliente(txtNome.getText(), txtCpf.getText(), txtEmail.getText(), txtFone.getText());
				Cliente.clientes.add(cliente);
				JOptionPane.showMessageDialog(null, "Seu login: " + txtNome.getText() + "\nSua senha: " + txtCpf.getText());
				ViewLogin telaLogin = new ViewLogin();
				telaLogin.setVisible(true);
				setVisible(false);
			}
		});
		btnCadastrar.setBackground(new Color(0, 153, 0));
		btnCadastrar.setFont(new Font("Fira Code", Font.PLAIN, 15));
		btnCadastrar.setBounds(34, 305, 126, 41);
		contentPane.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancelar.setBackground(new Color(153, 0, 0));
		btnCancelar.setForeground(new Color(255, 255, 255));
		btnCancelar.setFont(new Font("Fira Code", Font.PLAIN, 15));
		btnCancelar.setBounds(177, 305, 126, 41);
		contentPane.add(btnCancelar);
	}
}
