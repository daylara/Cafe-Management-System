import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class BossLogin extends JFrame {

	private JPanel contentPane;
	private JTextField NameText;
	private JTextField SurnameText;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BossLogin frame = new BossLogin();
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
	public BossLogin() {
		setTitle("Cafe Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		NameText = new JTextField();
		NameText.setBounds(183, 66, 96, 19);
		contentPane.add(NameText);
		NameText.setColumns(10);
		
		SurnameText = new JTextField();
		SurnameText.setBounds(183, 95, 96, 19);
		contentPane.add(SurnameText);
		SurnameText.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(183, 139, 96, 19);
		contentPane.add(passwordField);
		
		final JCheckBox chckbxNewCheckBox = new JCheckBox("Show my password");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		chckbxNewCheckBox.setBounds(299, 138, 131, 21);
		contentPane.add(chckbxNewCheckBox);
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox.isSelected()) {
					passwordField.setEchoChar((char)0);
				}
				else {
					passwordField.setEchoChar('*');
				}
			}
			});
		
		JLabel NameLabel = new JLabel("Name");
		NameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		NameLabel.setBounds(57, 69, 45, 13);
		contentPane.add(NameLabel);
		
		JLabel SurnameLabel = new JLabel("Surname");
		SurnameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		SurnameLabel.setBounds(57, 98, 67, 13);
		contentPane.add(SurnameLabel);
		
		JLabel PasswordLabel = new JLabel("Password");
		PasswordLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		PasswordLabel.setBounds(57, 142, 45, 13);
		contentPane.add(PasswordLabel);
		
		final JLabel ErrorMessage = new JLabel("the information you entered is incorrect!!!");
		ErrorMessage.setForeground(Color.RED);
		ErrorMessage.setFont(new Font("Tahoma", Font.ITALIC, 11));
		ErrorMessage.setBounds(205, 181, 225, 13);
		contentPane.add(ErrorMessage);
		ErrorMessage.setVisible(false);
		JButton LoginButton = new JButton("Login");
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ArrayList<String[]> EmployeeList=new ArrayList<String[]>();
				EmployeeList=Human.read_csv();
				int count =0;
				for (int i = 0; i < EmployeeList.size(); i++) {
					if (NameText.getText().equals(EmployeeList.get(i)[0])&&SurnameText.getText().equals(EmployeeList.get(i)[1])&&passwordField.getText().equals(EmployeeList.get(i)[3])) {	
						if (EmployeeList.get(i)[2].equals("Boss")) {
							BossLoginType login=new BossLoginType();
							login.setVisible(true);
							toBack();
							count++;
							ErrorMessage.setVisible(false);
						}
						else {
							JOptionPane.showMessageDialog(null, "You are not authorized");
						}
						
					}
				}
				if (count==0) {
					ErrorMessage.setVisible(true);
				}
					
				
				
			
			}
		});
		LoginButton.setBounds(299, 212, 85, 21);
		contentPane.add(LoginButton);
	}

}
