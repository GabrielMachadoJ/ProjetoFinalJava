package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import classes.Agendamento;

public class ViewAgendamento extends JFrame {

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
					ViewAgendamento frame = new ViewAgendamento(String);
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
	public ViewAgendamento(String nome) {
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
		
		JComboBox<String> optBarbeiro = new JComboBox<String>();
		optBarbeiro.setFont(new Font("Fira Code", Font.PLAIN, 15));
		optBarbeiro.setModel(new DefaultComboBoxModel<String>(new String[] {"Barbeiro", "Jorge", "Vitor", "Gabriel", "Trevor"}));
		optBarbeiro.setBackground(Color.WHITE);
		optBarbeiro.setBounds(31, 147, 269, 30);
		contentPane.add(optBarbeiro);
		
		JSeparator separator = new JSeparator();
		separator.setToolTipText("");
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(31, 200, 269, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Agendamento Da Semana");
		lblNewLabel_1.setFont(new Font("Fira Code", Font.ITALIC, 14));
		lblNewLabel_1.setBounds(67, 52, 207, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox<String> optData = new JComboBox<String>();
		optData.setFont(new Font("Fira Code", Font.PLAIN, 15));
		optData.setModel(new DefaultComboBoxModel<String>(new String[] {"Data", "31/07/2022", "01/08/2022", "02/08/2022", "03/08/2022", "04/08/2022", "05/08/2022", "06/08/2022"}));
		optData.setBackground(Color.WHITE);
		optData.setBounds(31, 106, 129, 30);
		contentPane.add(optData);
		
		JComboBox<String>  optHoras = new JComboBox<String>();
		optHoras.setFont(new Font("Fira Code", Font.PLAIN, 15));
		optHoras.setModel(new DefaultComboBoxModel<String>(new String[] {"Hora", "8:30", "9:30", "10:30", "13:30", "14:30", "15:30", "16:30", "17:30"}));
		optHoras.setBackground(Color.WHITE);
		optHoras.setBounds(182, 106, 118, 30);
		contentPane.add(optHoras);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setToolTipText("");
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(31, 79, 269, 2);
		contentPane.add(separator_1);
		
		JButton btnAgendar = new JButton("Agendar");
		btnAgendar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Agendamento novoAgendamento = new Agendamento(nome, optData.getSelectedItem().toString(), optHoras.getSelectedItem().toString(), optBarbeiro.getSelectedItem().toString());
				
				Agendamento.agendamentos.add(novoAgendamento);
				JOptionPane.showMessageDialog(null, "Agendamento registrado");
			}
		});
		btnAgendar.setBounds(31, 211, 118, 62);
		btnAgendar.setFont(new Font("Fira Code", Font.PLAIN, 15));
		btnAgendar.setBackground(new Color(255, 255, 255));
		contentPane.add(btnAgendar);
		
		JButton btnMinhaAgenda = new JButton("Minha Agenda");
		btnMinhaAgenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewAgendaCli agendaCli = new ViewAgendaCli(nome);
				agendaCli.setVisible(true);
				setVisible(false);
			}
		});
		btnMinhaAgenda.setFont(new Font("Fira Code", Font.PLAIN, 15));
		btnMinhaAgenda.setBackground(Color.WHITE);
		btnMinhaAgenda.setBounds(160, 211, 140, 62);
		contentPane.add(btnMinhaAgenda);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Bem vindo " + nome);
		lblNewLabel_2.setFont(new Font("Fira Code", Font.PLAIN, 17));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(31, 322, 269, 40);
		contentPane.add(lblNewLabel_2);
	}
}
