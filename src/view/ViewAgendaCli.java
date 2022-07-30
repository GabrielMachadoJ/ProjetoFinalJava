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
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import classes.Agendamento;

public class ViewAgendaCli extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static final String String = null;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAgendaCli frame = new ViewAgendaCli(String);
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
	public ViewAgendaCli(String nome) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 352, 439);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BarberShop");
		lblNewLabel.setBounds(87, 4, 166, 52);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Fira Code", Font.PLAIN, 25));
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(443, -25, -437, 296);
		contentPane.add(scrollPane);
		
		JLabel lblNewLabel_1 = new JLabel("Agendamento Da Semana");
		lblNewLabel_1.setFont(new Font("Fira Code", Font.ITALIC, 14));
		lblNewLabel_1.setBounds(67, 52, 207, 14);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setToolTipText("");
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(31, 79, 269, 2);
		contentPane.add(separator_1);
		
		JButton btnAgendar = new JButton("Voltar");
		btnAgendar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewAgendamento agendamento = new ViewAgendamento(nome);
				agendamento.setVisible(true);
				setVisible(false);
				
			}
		});
		btnAgendar.setBounds(31, 340, 128, 35);
		btnAgendar.setFont(new Font("Fira Code", Font.PLAIN, 17));
		btnAgendar.setBackground(new Color(255, 255, 255));
		contentPane.add(btnAgendar);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setBounds(31, 92, 269, 237);
		contentPane.add(scrollPane_1);
		
		JTextArea txtAgenda = new JTextArea();
		txtAgenda.setEditable(false);
		txtAgenda.setFont(new Font("Fira Code", Font.PLAIN, 15));
		txtAgenda.setText(Agendamento.listarAgendamento());
		scrollPane_1.setViewportView(txtAgenda);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnSair.setFont(new Font("Fira Code", Font.PLAIN, 17));
		btnSair.setBackground(Color.WHITE);
		btnSair.setBounds(169, 340, 128, 35);
		contentPane.add(btnSair);
	}
}
