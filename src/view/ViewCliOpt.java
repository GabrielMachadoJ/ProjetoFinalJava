package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ViewCliOpt extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCliOpt frame = new ViewCliOpt();
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
	public ViewCliOpt() {
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
		
		JButton btnClientes = new JButton("Listar");
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewListaCli telaLista = new ViewListaCli();
				telaLista.setVisible(true);
				setVisible(false);
				
			}
		});
		btnClientes.setBounds(81, 217, 169, 72);
		btnClientes.setFont(new Font("Fira Code", Font.PLAIN, 17));
		btnClientes.setBackground(new Color(255, 255, 255));
		contentPane.add(btnClientes);
		
		JButton btnAgendamentos = new JButton("Cadastrar");
		btnAgendamentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewCadCli telaCad = new ViewCadCli();
				telaCad.setVisible(true);
			}
		});
		btnAgendamentos.setFont(new Font("Fira Code", Font.PLAIN, 17));
		btnAgendamentos.setBackground(Color.WHITE);
		btnAgendamentos.setBounds(81, 117, 169, 72);
		contentPane.add(btnAgendamentos);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setToolTipText("");
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(34, 50, 269, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("Clientes");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Fira Code", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(117, 76, 105, 19);
		contentPane.add(lblNewLabel_1);
	}
}
