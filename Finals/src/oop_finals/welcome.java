package oop_finals;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class welcome extends JFrame {

	JFrame welcome;
	JPanel contentPane;
    JTextField txtUser;
    
    public static String NAME;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcome frame = new welcome();
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
	public welcome() {
		setType(Type.POPUP);
		setTitle("Welcome ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 311);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("W E L C O M E ,");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 26));
		lblNewLabel.setBounds(53, 52, 201, 43);
		contentPane.add(lblNewLabel);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBackground(new Color(210, 180, 140));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int Exit =JOptionPane.showConfirmDialog(null,"Do you really want to exit this program?","Exit Program", JOptionPane.YES_NO_OPTION);
				
				if(Exit == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
				else if(Exit == JOptionPane.NO_OPTION) {
				}
			
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExit.setBounds(228, 232, 95, 33);
		contentPane.add(btnExit);
		
		JLabel lblNewLabel_2 = new JLabel("YOU DID GREAT!");
		lblNewLabel_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		lblNewLabel_2.setBounds(95, 128, 145, 43);
		contentPane.add(lblNewLabel_2);
		
		txtUser = new JTextField();
		txtUser.setHorizontalAlignment(SwingConstants.CENTER);
		txtUser.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		txtUser.setBounds(250, 52, 246, 43);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		txtUser.setEditable(false);
		txtUser.setText(login.USERNAME);
		
		JLabel lblNewLabel_2_1 = new JLabel("IT'S TIME FOR YOU TO RELAX.");
		lblNewLabel_2_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(227, 128, 221, 43);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("ENJOY YOUR SHORT ACAD BREAK . BE WITH YOUR FAMILY.");
		lblNewLabel_2_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		lblNewLabel_2_2.setBounds(61, 166, 440, 43);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblbg = new JLabel("");
		lblbg.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\Finals\\img\\bg3.jpg"));
		lblbg.setBounds(0, 0, 546, 288);
		contentPane.add(lblbg);
	}
}
