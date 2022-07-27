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
import javax.swing.DropMode;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.DefaultComboBoxModel;

public class ViewAgendamento extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAgendamento frame = new ViewAgendamento();
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
	public ViewAgendamento() {
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
		
		JButton btnAgendar = new JButton("Salvar");
		btnAgendar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAgendar.setBounds(87, 340, 166, 35);
		btnAgendar.setFont(new Font("Fira Code", Font.PLAIN, 17));
		btnAgendar.setBackground(new Color(255, 255, 255));
		contentPane.add(btnAgendar);
		
		JComboBox optHoras = new JComboBox();
		optHoras.setModel(new DefaultComboBoxModel(new String[] {"", "8:30", "9:30", "10:30", "13:30", "14:30", "15:30", "16:30", "17:30"}));
		optHoras.setBackground(new Color(255, 255, 255));
		optHoras.setBounds(31, 133, 269, 30);
		contentPane.add(optHoras);
		
		JComboBox optBarbeiro = new JComboBox();
		optBarbeiro.setModel(new DefaultComboBoxModel(new String[] {"", "Jorge", "Vitor", "Juninho", "Trevor"}));
		optBarbeiro.setBackground(Color.WHITE);
		optBarbeiro.setBounds(31, 174, 269, 30);
		contentPane.add(optBarbeiro);
		
		JEditorPane agendaLista = new JEditorPane();
		agendaLista.setText("Nome: Vitor" + "\nDia: 10/03/2022" + "\nHora: 14:30" + "\nBarbeiro: Jorge");
		agendaLista.setFont(new Font("Fira Code", Font.PLAIN, 16));
		agendaLista.setBounds(31, 228, 269, 90);
		contentPane.add(agendaLista);
		
		JSeparator separator = new JSeparator();
		separator.setToolTipText("");
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(31, 215, 269, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Agendamento Da Semana");
		lblNewLabel_1.setFont(new Font("Fira Code", Font.ITALIC, 14));
		lblNewLabel_1.setBounds(67, 52, 207, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox optData = new JComboBox();
		optData.setModel(new DefaultComboBoxModel(new String[] {"", "29/07/2022", "30/07/2022", "31/07/2022", "01/07/2022", "02/07/2022", "03/07/2022", "04/07/2022"}));
		optData.setBackground(Color.WHITE);
		optData.setBounds(31, 92, 129, 30);
		contentPane.add(optData);
		
		JComboBox optPeriodo = new JComboBox();
		optPeriodo.setModel(new DefaultComboBoxModel(new String[] {"", "Manhã", "Tarde"}));
		optPeriodo.setBackground(Color.WHITE);
		optPeriodo.setBounds(179, 92, 121, 30);
		contentPane.add(optPeriodo);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setToolTipText("");
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(31, 79, 269, 2);
		contentPane.add(separator_1);
	}
}
