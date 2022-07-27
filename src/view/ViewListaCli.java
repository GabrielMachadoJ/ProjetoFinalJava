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

public class ViewListaCli extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewListaCli frame = new ViewListaCli();
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
	public ViewListaCli() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 352, 439);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BarberShop");
		lblNewLabel.setBounds(87, 11, 166, 52);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Fira Code", Font.PLAIN, 25));
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(443, -25, -437, 296);
		contentPane.add(scrollPane);
		
		JEditorPane clienteLista = new JEditorPane();
		clienteLista.setText("Nome: Vitor\r\nDia: 10/03/2022\r\nHora: 14:30\r\nBarbeiro: Jorge\r\n----------------------\r\nNome: Junior\r\nDia: 29/03/2022\r\nHora: 15:30\r\nBarbeiro: Trevor");
		clienteLista.setFont(new Font("Fira Code", Font.PLAIN, 16));
		clienteLista.setBounds(45, 103, 269, 265);
		contentPane.add(clienteLista);
		
		JSeparator separator = new JSeparator();
		separator.setToolTipText("");
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(45, 90, 269, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Clientes Cadastrados");
		lblNewLabel_1.setFont(new Font("Fira Code", Font.ITALIC, 14));
		lblNewLabel_1.setBounds(75, 65, 207, 14);
		contentPane.add(lblNewLabel_1);
	}
}
