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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.awt.Window.Type;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;


public class signup extends JFrame {
public JFrame loginframe;
public static String USERNAME;
	
	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_3;
	private JTextField txtEmail;
	private JLabel lblEmail;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JLabel lblConfirmPassword;
	private JPasswordField txtPass2;
	private JTextField txtLname;
	private JTextField txtFname;
	@SuppressWarnings("rawtypes")
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup frame = new signup();
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
	public signup() {
		setType(Type.POPUP);
		setTitle("SIGN UP");
		setBackground(SystemColor.control);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 965, 453);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtUsername.setBounds(175, 214, 306, 37);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPassword.setColumns(10);
		txtPassword.setBounds(175, 299, 306, 41);
		contentPane.add(txtPassword);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setBackground(new Color(210, 180, 140));
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validation();
				
			}
		});
		btnSubmit.setBounds(557, 373, 107, 34);
		contentPane.add(btnSubmit);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBackground(new Color(210, 180, 140));
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 15));
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
		btnExit.setBounds(417, 373, 107, 34);
		contentPane.add(btnExit);
		
		lblNewLabel_1 = new JLabel("R E G I S T R A T I O N     F O R M");
		lblNewLabel_1.setFont(new Font("Wide Latin", Font.BOLD, 22));
		lblNewLabel_1.setBounds(175, 11, 652, 41);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_3 = new JLabel("It's free and it will just take less than 1 min.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(360, 39, 291, 26);
		contentPane.add(lblNewLabel_3);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtEmail.setBounds(175, 138, 306, 37);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		lblEmail = new JLabel("E-MAIL :");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblEmail.setBounds(285, 114, 93, 14);
		contentPane.add(lblEmail);
		
		lblUsername = new JLabel("USERNAME :");
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblUsername.setBounds(272, 186, 125, 17);
		contentPane.add(lblUsername);
		
		lblPassword = new JLabel("PASSWORD :");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblPassword.setBounds(272, 263, 125, 25);
		contentPane.add(lblPassword);
		
		lblConfirmPassword = new JLabel("REPEAT PASSWORD :");
		lblConfirmPassword.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblConfirmPassword.setBounds(662, 263, 219, 25);
		contentPane.add(lblConfirmPassword);
		
		txtPass2 = new JPasswordField();
		txtPass2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPass2.setColumns(10);
		txtPass2.setBounds(610, 299, 306, 41);
		contentPane.add(txtPass2);
		
		txtLname = new JTextField();
		txtLname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtLname.setColumns(10);
		txtLname.setBounds(610, 214, 306, 37);
		contentPane.add(txtLname);
		
		JLabel lblLastName = new JLabel("LAST NAME :");
		lblLastName.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblLastName.setBounds(696, 186, 125, 17);
		contentPane.add(lblLastName);
		
		txtFname = new JTextField();
		txtFname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtFname.setColumns(10);
		txtFname.setBounds(610, 138, 306, 37);
		contentPane.add(txtFname);
		
		JLabel lblFullname = new JLabel("FIRST NAME :");
		lblFullname.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblFullname.setBounds(696, 113, 125, 16);
		contentPane.add(lblFullname);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\lenovo\\eclipse-workspace\\Finals\\img\\Picture3.jpg"));
		lblNewLabel.setBounds(0, 0, 953, 418);
		contentPane.add(lblNewLabel);
		
	}
	//DATABASE CONNECTION
		static Connection connect() {
			try {
			
				//set the mysql driver
				String myDriver = "com.mysql.cj.jdbc.Driver";
				//connection string
				String url = "jdbc:mysql://localhost:3306/oopl_finals";
				Class.forName(myDriver);
				return(Connection)DriverManager.getConnection(url,"root","");
			}
			
			catch(Exception e) {
					System.out.print("Cannot connect to the database.");
				}
			return null;
			}
		
		private void addRecord() {
			Connection con = connect();
			Calendar date = Calendar.getInstance();
			java.sql.Date datecreated = new java.sql.Date(date.getTime().getTime());
			
			try {
				String sql = "INSERT INTO users_tbl (email, username, password,first_name,last_name,password2, date_created) VALUES(?,?,?,?,?,?,NOW())";
				PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
				
				ps.setString(1, txtEmail.getText());
				ps.setString(2, txtUsername.getText());
				ps.setString(3, txtPassword.getText());
				ps.setString(4, txtFname.getText());
				ps.setString(5, txtLname.getText());
				ps.setString(6, txtPass2.getText());
			  //ps.setDate  (7, datecreated);
				ps.execute();
				
				JOptionPane.showMessageDialog(null, "The record is Successfully Added.");
			
			}
			catch(Exception e) {
				System.out.print("Error" + e);
			}
		}
		
		//VALIDATION (PAIRING SET)
		@SuppressWarnings("deprecation")
		public void validation() {
			Connection con = connect();
			
			try {
				Statement stmt = con.createStatement();
				String chk = "SELECT * FROM users_tbl where email='"+txtEmail.getText()+"'and username ='"+txtUsername.getText() +"'and password='"+txtPassword.getText()+"'"
						+ "and first_name='"+txtFname.getText()+"'and last_name='"+txtLname.getText()+"'and password2='"+txtPass2.getText()+"'";
				ResultSet rs = stmt.executeQuery(chk); 
				if(rs.next()) 
					
				{
					//JOptionPane.showMessageDialog(null, "Username " + txtUsername.getText() + " is already used.","Error", JOptionPane.ERROR_MESSAGE);
					JOptionPane.showMessageDialog(null, "Please fill-up the form.","Error", JOptionPane.ERROR_MESSAGE);
					clearTextfield();
				}
				else if (!txtPassword.getText().equals(txtPass2.getText()))
				{
					JOptionPane.showMessageDialog(null, "Password is not match","Error", JOptionPane.ERROR_MESSAGE);
					clearTextfield();
				}
				else if (txtEmail.getText().equals("") ||txtUsername.getText().equals("")|| txtPassword.getText().equals("") || txtFname.getText().equals("")||txtLname.getText().equals("")||txtPass2.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "You must fill in all of the fields. ","Error", JOptionPane.ERROR_MESSAGE);
					clearTextfield();
				}else {
			
					String sql = "INSERT INTO users_tbl (email, username, password, first_name,last_name,password2, date_created) VALUES(?,?,?,?,?,?,NOW())";
				PreparedStatement ps =(PreparedStatement) con.prepareStatement(sql);
				
				ps.setString(1, txtEmail.getText());
				ps.setString(2, txtUsername.getText());
				ps.setString(3, txtPassword.getText());
				ps.setString(4, txtFname.getText());
				ps.setString(5, txtLname.getText());
				ps.setString(6, txtPass2.getText());
			  //ps.setDate  (7, datecreated);
				ps.execute();
				
				JOptionPane.showMessageDialog(null, "The record is Successfully Added.");
				
				 
					login frmlogin = new login();
					frmlogin.setVisible(true);
					frmlogin.show();
					dispose();
			}
				
				
			}catch(Exception e) {
				System.out.print("Error" + e);
			}
		}// end of reg

		private void clearTextfield() {
			// TODO Auto-generated method stub
			
			
		}
		
		
}
