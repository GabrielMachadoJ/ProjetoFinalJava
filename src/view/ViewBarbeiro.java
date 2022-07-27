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

public class ViewBarbeiro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewBarbeiro frame = new ViewBarbeiro();
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
	public ViewBarbeiro() {
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
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewCliOpt telaOpt = new ViewCliOpt();
				telaOpt.setVisible(true);
				
			}
		});
		btnClientes.setBounds(81, 217, 169, 72);
		btnClientes.setFont(new Font("Fira Code", Font.PLAIN, 17));
		btnClientes.setBackground(new Color(255, 255, 255));
		contentPane.add(btnClientes);
		
		JButton btnAgendamentos = new JButton("Agenda");
		btnAgendamentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewAgenda telaAgenda = new ViewAgenda();
				telaAgenda.setVisible(true);
			}
		});
		btnAgendamentos.setFont(new Font("Fira Code", Font.PLAIN, 17));
		btnAgendamentos.setBackground(Color.WHITE);
		btnAgendamentos.setBounds(81, 81, 169, 72);
		contentPane.add(btnAgendamentos);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setToolTipText("");
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(34, 50, 269, 2);
		contentPane.add(separator_1);
	}
}
