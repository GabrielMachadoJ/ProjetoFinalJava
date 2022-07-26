package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewInicioBarbeiro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewInicioBarbeiro frame = new ViewInicioBarbeiro();
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
	public ViewInicioBarbeiro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BarberShop");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Fira Code", Font.PLAIN, 18));
		lblNewLabel.setBounds(151, 11, 124, 41);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Agendamentos");
		btnNewButton.setFont(new Font("Fira Code", Font.PLAIN, 18));
		btnNewButton.setBounds(123, 75, 180, 41);
		contentPane.add(btnNewButton);
		
		JButton btnCortes = new JButton("Cortes");
		btnCortes.setFont(new Font("Fira Code", Font.PLAIN, 18));
		btnCortes.setBounds(123, 127, 180, 41);
		contentPane.add(btnCortes);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClientes.setFont(new Font("Fira Code", Font.PLAIN, 18));
		btnClientes.setBounds(123, 179, 180, 41);
		contentPane.add(btnClientes);
	}

}
