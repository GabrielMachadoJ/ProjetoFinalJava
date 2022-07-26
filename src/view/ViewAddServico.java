package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class ViewAddServico extends JFrame {

	private JPanel contentPane;
	private JTextField txtCorte;
	private JTextField txtValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAddServico frame = new ViewAddServico();
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
	public ViewAddServico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Corte");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Fira Code", Font.PLAIN, 20));
		lblNewLabel.setBounds(166, 11, 86, 30);
		contentPane.add(lblNewLabel);
		
		txtCorte = new JTextField();
		txtCorte.setBounds(148, 52, 142, 30);
		contentPane.add(txtCorte);
		txtCorte.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setHorizontalAlignment(SwingConstants.CENTER);
		lblValor.setFont(new Font("Fira Code", Font.PLAIN, 20));
		lblValor.setBounds(166, 93, 86, 30);
		contentPane.add(lblValor);
		
		txtValor = new JTextField();
		txtValor.setColumns(10);
		txtValor.setBounds(148, 134, 142, 30);
		contentPane.add(txtValor);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setFont(new Font("Fira Code", Font.PLAIN, 18));
		btnNewButton.setBounds(148, 192, 142, 30);
		contentPane.add(btnNewButton);
		
		
	}
}

