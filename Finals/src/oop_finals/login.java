package oop_finals;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.Window.Type;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;


public class login extends JFrame {
public JFrame loginframe;
public static String USERNAME;
	
	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JLabel lblNewLabel;
	private JLabel lblPassword;
	private JLabel lblNewLabel_1;
	private JLabel lblClock;
	private JLabel lblbg;
	@SuppressWarnings("rawtypes")
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public login() {
		initialize();
		clock();
		}

	/**
	 * Create the frame.
	 */
	private void initialize() {
		setType(Type.POPUP);
		setTitle("SIGN IN");
		setBackground(SystemColor.control);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 398);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtUsername.setBounds(175, 110, 306, 37);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		JPasswordField txtPassword= new JPasswordField();
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPassword.setColumns(10);
		txtPassword.setBounds(175, 195, 306, 41);
		contentPane.add(txtPassword);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBackground(new Color(210, 180, 140));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try{
				//set the mysql jdbc driver
					Class.forName("com.mysql.cj.jdbc.Driver");
				//set the mysql connection string
					Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/oopl_finals","root","");
					Statement stmt = (Statement) con.createStatement();
					
				//sql query for the login
					String username = txtUsername.getText();
					String password = txtPassword.getText();
					String sql = "SELECT * FROM sign_in WHERE username='"+username+"'AND password='"+password+"'";
				//Execute the query
					ResultSet rs =((java.sql.Statement) stmt).executeQuery(sql);
					
				//condition for the username and password
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Login successful.","Login Alert",2);
						
						welcome frmwelcome = new welcome();
						frmwelcome.setVisible(true);
						frmwelcome.show();
						dispose();
						USERNAME =txtUsername.getText().toString();
						frmwelcome.txtUser.setText(USERNAME);
						
					}
					else if(txtUsername.getText().trim().equals("")) {
						JOptionPane.showMessageDialog(null, "Username is required.","Login Warning",2);
					}
					else if(txtPassword.getText().trim().equals("")) {
						JOptionPane.showMessageDialog(null, "Password is required.","Login Warning",2);
					}
					else {
						JOptionPane.showMessageDialog(null, "Invalid Username/Password.","Login Warning",2);
					}
				}catch(Exception ex) {
					System.out.print(ex);
				}
			}
		});
		btnLogin.setBounds(343, 298, 107, 34);
		contentPane.add(btnLogin);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setBackground(new Color(210, 180, 140));
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					txtUsername.setText("");
					txtPassword.setText("");
				}catch(Exception ex) {
					System.out.print(ex);
				}
		loginframe.getContentPane().add(btnClear);
			}
		});
		btnClear.setBounds(210, 298, 107, 34);
		contentPane.add(btnClear);
			
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\COPL\\img\\Picture3.png"));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(122, 110, 43, 48);
		contentPane.add(lblNewLabel);
		
		lblPassword = new JLabel("");
		lblPassword.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\COPL\\img\\Picture2.png"));
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(123, 196, 31, 40);
		contentPane.add(lblPassword);
		
		lblNewLabel_1 = new JLabel("SIGN-IN");
		lblNewLabel_1.setFont(new Font("Wide Latin", Font.BOLD, 25));
		lblNewLabel_1.setBounds(198, 23, 211, 55);
		contentPane.add(lblNewLabel_1);
		
		lblClock = new JLabel("Time");
		lblClock.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblClock.setBounds(198, 65, 241, 22);
		contentPane.add(lblClock);
		
		lblbg = new JLabel("");
		lblbg.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\Finals\\img\\g.jpg"));
		lblbg.setBounds(0, 0, 561, 373);
		contentPane.add(lblbg);
	}
		
	//TIME AND DATE METHOD
			public void clock() {
				Thread clock = new Thread() {
					public void run() {
						try {
							while(true) {
								Calendar cl = new GregorianCalendar();
								int day = cl.get(Calendar.DAY_OF_MONTH);
								int month = cl.get(Calendar.MONTH);
								int year = cl.get(Calendar.YEAR);
								
								int sec = cl.get(Calendar.SECOND);
								int min =cl.get(Calendar.MINUTE);
								int hr = cl.get(Calendar.HOUR);
								
								lblClock.setText("Time : " +hr + ":" +min+ ":" +sec + " | Date : "+ month + "/" + day + "/" +year);
								sleep(1000);
							}
						}catch(InterruptedException ex) {
							ex.printStackTrace();
						}}};
						clock.start();
					}
}
