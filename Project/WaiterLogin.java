import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JCheckBox;

public class WaiterLogin extends JFrame {

	private JPanel contentPane;
	private JTextField NametextField;
	private JTextField SurnameTextField;
	private JButton LoginButton;
	private JPasswordField PasswordTextField;
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public WaiterLogin() {
		setTitle("Cafe Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		NametextField = new JTextField();
		NametextField.setBounds(185, 44, 96, 19);
		contentPane.add(NametextField);
		NametextField.setColumns(10);
		
		SurnameTextField = new JTextField();
		SurnameTextField.setBounds(185, 76, 96, 19);
		contentPane.add(SurnameTextField);
		SurnameTextField.setColumns(10);
		
		JLabel NameLabel = new JLabel("Name");
		
		NameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		NameLabel.setBounds(57, 47, 73, 13);
		contentPane.add(NameLabel);
		
		JLabel SurnameLabel = new JLabel("Surname");
		SurnameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		SurnameLabel.setBounds(57, 79, 84, 13);
		contentPane.add(SurnameLabel);
		
		final JLabel ErrorMessage = new JLabel("the information you entered is incorrect!!!");
		ErrorMessage.setForeground(Color.RED);
		ErrorMessage.setFont(new Font("Tahoma", Font.ITALIC, 11));
		ErrorMessage.setBounds(201, 192, 225, 13);
		contentPane.add(ErrorMessage);
		ErrorMessage.setVisible(false);
		
		PasswordTextField = new JPasswordField();
		PasswordTextField.setBounds(185, 112, 96, 21);
		contentPane.add(PasswordTextField);
		
		final JCheckBox CheckPassword = new JCheckBox("show my password");
		CheckPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		CheckPassword.setBounds(303, 112, 143, 21);
		contentPane.add(CheckPassword);
		CheckPassword.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (CheckPassword.isSelected()) {
				PasswordTextField.setEchoChar((char)0);
			}
			else {
				PasswordTextField.setEchoChar('*');
			}
		}
		});
		
		
		
		JLabel PasswordLabel = new JLabel("Password");
		PasswordLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		PasswordLabel.setBounds(57, 116, 84, 13);
		contentPane.add(PasswordLabel);
		LoginButton = new JButton("Login");
		LoginButton.setBounds(279, 154, 85, 21);
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String[]> EmployeeList=new ArrayList<String[]>();
				EmployeeList=Human.read_csv();
				int count =0;
				for (int i = 0; i < EmployeeList.size(); i++) {
					if (NametextField.getText().equals(EmployeeList.get(i)[0])&&SurnameTextField.getText().equals(EmployeeList.get(i)[1])&&PasswordTextField.getText().equals(EmployeeList.get(i)[3])) {						
						Tables login=new Tables();
						login.setVisible(true);
						toBack();
						count++;
						ErrorMessage.setVisible(false);
					}
				}
				if (count==0) {
					ErrorMessage.setVisible(true);
				}
					
				
				
			}

			
		});
		contentPane.add(LoginButton);
		
		
		
		
		
		
		
		
		
	
	}
}
