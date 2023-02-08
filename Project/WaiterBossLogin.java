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

public class WaiterBossLogin extends JFrame {

	private JPanel contentPane;
	private JTextField NametextField;
	private JTextField SurnameTextField;
	private JPasswordField PasswordTextField;
	private JButton LoginButton;
	private ArrayList<String[]> EmployeeList=new ArrayList<String[]>();

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public WaiterBossLogin() {
		setTitle("Cafe Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		NametextField = new JTextField();
		NametextField.setBounds(185, 44, 96, 19);
		contentPane.add(NametextField);
		String name =NametextField.getText();
		NametextField.setColumns(10);
		
		SurnameTextField = new JTextField();
		SurnameTextField.setBounds(185, 76, 96, 19);
		contentPane.add(SurnameTextField);
		String surname =SurnameTextField.getText();
		SurnameTextField.setColumns(10);
		
		PasswordTextField = new JPasswordField();
		PasswordTextField.setToolTipText("ffdgf");
		PasswordTextField.setBounds(185, 113, 96, 19);
		
		contentPane.add(PasswordTextField);
		
		JLabel NameLabel = new JLabel("Name");
		NameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		NameLabel.setBounds(57, 47, 73, 13);
		contentPane.add(NameLabel);
		
		JLabel SurnameLabel = new JLabel("Surname");
		SurnameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		SurnameLabel.setBounds(57, 79, 84, 13);
		contentPane.add(SurnameLabel);
		
		JLabel PasswordLabel = new JLabel("Password");
		PasswordLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		PasswordLabel.setBounds(57, 116, 84, 13);
		contentPane.add(PasswordLabel);
		
		LoginButton = new JButton("Login");
		LoginButton.setBounds(279, 154, 85, 21);
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*EmployeeData s=new EmployeeData();
				EmployeeList =s.read_csv();
				EmployeeList.contains(PasswordLabel)
				
				
				if (rootPaneCheckingEnabled) {
					
				}*/
				Tables login=new Tables();
				login.setVisible(true);
				toBack();
			}
		});
		contentPane.add(LoginButton);
	}
}
