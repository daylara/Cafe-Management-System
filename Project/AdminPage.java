import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.TableUI;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Stack;
import java.awt.event.ActionEvent;

public class AdminPage extends JFrame {

	JLabel IncomeAmount;
	private JPanel contentPane;
	private JTextField textField;
	ArrayList<Integer> Earning = new ArrayList<Integer>();
	Date Date=new Date();
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	int Counter=0;
	IncomeExpense Money=new IncomeExpense();
	Survey CafeSurvey=new Survey();
	static Stack<Table> Create = new Stack<Table>();
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage frame = new AdminPage();
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
	public AdminPage() {
		setTitle("BOSS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Date:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(382, 10, 38, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("INCOME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(91, 76, 77, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("OUTCOME");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(195, 76, 77, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Cash");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(21, 109, 45, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Credit Card");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(21, 162, 83, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Daily Earnings:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(45, 217, 90, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("------------------------------------------------------------------------");
		lblNewLabel_7.setBounds(21, 94, 288, 13);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("------------------------------------------------------------------------");
		lblNewLabel_7_1.setBounds(21, 132, 288, 13);
		contentPane.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("------------------------------------------------------------------------");
		lblNewLabel_7_1_1.setBounds(21, 176, 288, 13);
		contentPane.add(lblNewLabel_7_1_1);
		
		JButton btnNewButton = new JButton("Finish Day");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Money.addItem(Date, Money.getIncome(), Money.getExpense());//Dosyaya yazma
				Date.setDay();
				Counter++;
				Earning.add(null);
				textField = new JTextField(Date.Print_Date());
				textField.setBounds(423, 11, 96, 19);
				contentPane.add(textField);
				textField.setColumns(10);
				
				
			}
		});
		btnNewButton.setBounds(409, 96, 98, 38);
		contentPane.add(btnNewButton);
		
		textField = new JTextField(Date.Print_Date());
		textField.setBounds(423, 11, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
		JButton Refresh = new JButton("Refresh");
		Refresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1 = new JTextField();
				textField_1.setBounds(72, 106, 96, 19);
				contentPane.add(textField_1);
				textField_1.setColumns(10);
				
				textField_2 = new JTextField(Integer.toString(Money.Employee_Expense()));
				textField_2.setBounds(189, 106, 96, 19);
				contentPane.add(textField_2);
				textField_2.setColumns(10);
				
				textField_3 = new JTextField("daily");
				textField_3.setBounds(295, 284, 96, 19);
				contentPane.add(textField_3);
				textField_3.setColumns(10);
			}
		});
		Refresh.setBounds(45, 338, 85, 21);
		contentPane.add(Refresh);
		
		IncomeAmount = new JLabel("..........");
		IncomeAmount.setBounds(90, 109, 45, 13);
		contentPane.add(IncomeAmount);
		
		JLabel OutcomeAmount = new JLabel("..........");
		OutcomeAmount.setBounds(90, 162, 45, 13);
		contentPane.add(OutcomeAmount);
	}
}
