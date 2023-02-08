import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TableUi extends JFrame {

	private JPanel contentPane;
	JLabel TableNumber ;
	
	
	static Menu menu=new Menu();
	static ArrayList<String[]> Products=menu.Reader();
	
	
	static ArrayList<String>Ordered=new ArrayList<String>();
	static Table Table_1=new Table(1,Ordered,0,0);
	static Table Table_2=new Table(2,Ordered,0,0);
	static Table Table_3=new Table(3,Ordered,0,0);
	static Table Table_4=new Table(4,Ordered,0,0);
	static Table Table_5=new Table(5,Ordered,0,0);
	static Table Table_6=new Table(6,Ordered,0,0);
	static Table Table_7=new Table(7,Ordered,0,0);
	static Table Table_8=new Table(8,Ordered,0,0);
	static Table Table_9=new Table(9,Ordered,0,0);
	static Table Table_10=new Table(10,Ordered,0,0);
	static Table Table_11=new Table(11,Ordered,0,0);
	static Table Table_12=new Table(12,Ordered,0,0);
	

	/**
	 * Launch the application.
	 */
	TableUi frame;
	private JTable MenuTable;
	static String ForOrder[][]=new String[40][1];
	static String ForMenu[][]=new String[Products.size()][];
	Stack<Table> stacks = new Stack<Table>();
	static Stack<Table> CreateS = new Stack<Table>();
	
	private JTable OrderTable;
	int OrderCounter=0;
	JPanel panel = new JPanel();
	public Stack CreateStack(Stack<Table> CreateS) {
		CreateS.push(Table_1);
		CreateS.push(Table_2);
		CreateS.push(Table_3);
		CreateS.push(Table_4);
		CreateS.push(Table_5);
		CreateS.push(Table_6);
		CreateS.push(Table_7);
		CreateS.push(Table_8);
		CreateS.push(Table_9);
		CreateS.push(Table_10);
		CreateS.push(Table_11);
		CreateS.push(Table_12);
		return CreateS;
	}
	public static int calculate_income(Stack<Table> stack,String ForMenu[][]){
		
		stack.push(Table_1);
		stack.push(Table_2);
		stack.push(Table_3);
		stack.push(Table_4);
		stack.push(Table_5);
		stack.push(Table_6);
		stack.push(Table_7);
		stack.push(Table_8);
		stack.push(Table_9);
		stack.push(Table_10);
		stack.push(Table_11);
		stack.push(Table_12);
		int Income=0;
		
		for (int i = 0; i < stack.size(); i++) {
			Table a =stack.pop();
			ArrayList<String>b=a.getOrdered();
			
			for (int k = 0; k < b.size(); i++) {
				if (b.get(k)!=null) {
					for (int j = 0; j < ForMenu.length; j++) {
						if (b.get(k).equals(ForMenu[j][0])) {
							Income=Income+Integer.parseInt(ForMenu[j][1]);
						}
						
					}
					
				}
				
			}
		}
		
		return Income;
	}
	public static void main(String[] args) {	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableUi frame = new TableUi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TableUi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 731, 614);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton CloseButton = new JButton("Close");
		CloseButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		CloseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toBack();
				
			}
		});
		
		
		
		CloseButton.setBounds(541, 472, 176, 105);
		contentPane.add(CloseButton);
		
		
		panel.setBackground(Color.PINK);
		panel.setBounds(0, 51, 717, 419);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton PrintReceiptButton = new JButton("Print  Receipt");
		PrintReceiptButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		PrintReceiptButton.setBounds(361, 472, 185, 105);
		contentPane.add(PrintReceiptButton);
		
		TableNumber = new JLabel("");
		TableNumber.setBounds(241, 22, 402, 19);
		contentPane.add(TableNumber);
		TableNumber.setBackground(Color.WHITE);
		TableNumber.setFont(new Font("Tahoma", Font.BOLD, 20));
		TableNumber.setForeground(Color.BLACK);
		JScrollPane TablescrollPane = new JScrollPane();
		OrderTable = new JTable();
		
		TablescrollPane.setBounds(26, 10, 326, 360);
		panel.add(TablescrollPane);
		
		final DefaultTableModel model2=new DefaultTableModel(ForOrder,
	            new String[] {"Orders"}                                                 
	            );
		OrderTable.setModel(model2);
		
		
		OrderTable.setBounds(392, 230, 119, 160);
		TablescrollPane.setViewportView(OrderTable);
		
		JScrollPane MenuscrollPane = new JScrollPane();
		MenuscrollPane.setBounds(543, 34, 164, 269);
		panel.add(MenuscrollPane);
		
		
		////
		
		JLabel lblNewLabel = new JLabel("Toplam:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(197, 373, 72, 13);
		panel.add(lblNewLabel);
		
		final JLabel lblNewLabel_1 = new JLabel("0,0");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(286, 373, 45, 13);
		panel.add(lblNewLabel_1);
		MenuTable = new JTable();
		for (int i = 0; i < Products.size(); i++) {     
    		ForMenu[i]=new String[]{                                   
            Products.get(i)[0],
            Products.get(i)[1],      
            };     
           }
		final DefaultTableModel model1=new DefaultTableModel(ForMenu,
            new String[] {"Products Name", "Cost"}                                                 
            );
    	MenuTable.setModel(model1);
		MenuTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer a=0;
				Table whichTable = null;
				if(MenuTable.getSelectedColumn()!=1)//COST sütununa BASARSA ORDER KISMINA EKLEMESÝN DÝYE
				{
					
					Stack<Table> searchTable=new Stack<Table>();
					searchTable=CreateStack(CreateS);
					for (int i = 0; i < searchTable.size(); i++) {
						whichTable=searchTable.pop();
						whichTable.getNumber();
						if (whichTable.getNumber()==Integer.parseInt(TableNumber.getText())) {
							break;
						}
					}
					
					
					whichTable.getOrdered().add((String) model1.getValueAt(MenuTable.getSelectedRow(), MenuTable.getSelectedColumn()));
					UpdateOrder(whichTable.getOrdered());
					final DefaultTableModel model2=new DefaultTableModel(ForOrder,
				            new String[] {"Orders"}                                                 
				            );
					a=Calculate(ForOrder,ForMenu);
					String b=a.toString();
					lblNewLabel_1.setText(b);
					OrderTable.setModel(model2);
				}
				
			}
		});
		MenuTable.setBounds(438, 161, 269, 221);
		MenuscrollPane.setViewportView(MenuTable);
		
		JButton CreditCardPaymnet = new JButton("get a credit card payment");
		CreditCardPaymnet.setFont(new Font("Tahoma", Font.BOLD, 12));
		CreditCardPaymnet.setBounds(0, 470, 185, 107);
		CreditCardPaymnet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminPage a=new AdminPage();
				Integer c =TableUi.calculate_income(CreateS,TableUi.ForMenu);
				a.IncomeAmount.setText(c.toString());
			}
		});
		contentPane.add(CreditCardPaymnet);
		
		JButton CashPayment = new JButton("get a cash payment");
		CashPayment.setFont(new Font("Tahoma", Font.BOLD, 12));
		CashPayment.setBounds(177, 472, 185, 105);
		contentPane.add(CashPayment);
		
	
		
		
		
		OrderTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(MenuTable.getSelectedColumn()==0)
				{
					Integer a=0;
					Table whichTable=null;
					Stack<Table> searchTable=new Stack<Table>();
					searchTable=CreateStack(CreateS);
					int count=0;
					for (int i = 0; i < searchTable.size(); i++) {
						whichTable=searchTable.pop();
						if (whichTable.getNumber()==Integer.parseInt(TableNumber.getText())) {
							break;
						}
						
					}
					whichTable.getOrdered().remove((String) model1.getValueAt(OrderTable.getSelectedRow(), OrderTable.getSelectedColumn()));
					
					UpdateOrder(whichTable.getOrdered());
					final DefaultTableModel model2=new DefaultTableModel(ForOrder,
				            new String[] {"Orders"}                                                 
				            );
					a=Calculate(ForOrder,ForMenu);
					String b=a.toString();
					lblNewLabel_1.setText(b);
					OrderTable.setModel(model2);
				}
			}
				
			}
		);
		

	}
	private int Calculate(String[][] forOrder2,String[][] forOrderMenu) {
		int Income=0;
		for (int i = 0; i < forOrder2.length; i++) {
			if (forOrder2[i][0]!=null) {
				for (int j = 0; j < forOrderMenu.length; j++) {
					if (forOrder2[i][0].equals(forOrderMenu[j][0])) {
						Income=Income+Integer.parseInt(forOrderMenu[j][1]);
					}
					
				}
				
			}
			
		}
		
		return Income;
	}
	
	private void UpdateOrder(ArrayList<String>WhichTableOrdered)
	{
		for (int i = 0; i < ForOrder.length; i++) {
			ForOrder[i][0]=null;
		}
		
		for (int i = 0; i < WhichTableOrdered.size(); i++) {
			ForOrder[i][0]=WhichTableOrdered.get(i);
		}

	}
}
