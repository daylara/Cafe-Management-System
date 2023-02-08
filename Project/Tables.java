import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollBar;

public class Tables extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public void tablefunction(final JButton button,final String number) {
		button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					TableUi screen =new TableUi();
					screen.TableNumber.setText(number);
					screen.setVisible(true);

				}
			});
		
	}
	@SuppressWarnings("deprecation")
	public Tables() {
		setTitle("Cafe Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 764, 514);
		contentPane = new JPanel();
		contentPane.setToolTipText("help");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		 
		
		
		final JButton Table4Button = new JButton("4");
		Table4Button.setBackground(Color.PINK);
		Table4Button.setFont(new Font("Tahoma", Font.BOLD, 20));
		Table4Button.setBounds(552, 30, 188, 122);
		tablefunction(Table4Button,Table4Button.getLabel());
		contentPane.setLayout(null);
		contentPane.add(Table4Button);
	
		JButton Table1Button = new JButton("1");
		Table1Button.setBackground(Color.PINK);
		Table1Button.setFont(new Font("Tahoma", Font.BOLD, 20));
		Table1Button.setBounds(0, 30, 188, 122);
		tablefunction(Table1Button,Table1Button.getLabel());
		contentPane.setLayout(null);
		contentPane.add(Table1Button);
		
		JButton Table3Button = new JButton("3");
		Table3Button.setBackground(Color.PINK);
		Table3Button.setFont(new Font("Tahoma", Font.BOLD, 20));
		tablefunction(Table3Button,Table3Button.getLabel());
		Table3Button.setBounds(371, 30, 188, 122);
		contentPane.add(Table3Button);
		contentPane.add(Table4Button);
		
		JButton Table2Button = new JButton("2");
		Table2Button.setBackground(Color.PINK);
		Table2Button.setFont(new Font("Tahoma", Font.BOLD, 20));
		tablefunction(Table2Button,Table2Button.getLabel());
		Table2Button.setBounds(184, 30, 188, 122);
		contentPane.add(Table2Button);
		
		JButton Table5Button = new JButton("5");
		Table5Button.setBackground(Color.PINK);
		Table5Button.setFont(new Font("Tahoma", Font.BOLD, 20));
		tablefunction(Table5Button,Table5Button.getLabel());
		Table5Button.setBounds(0, 147, 188, 122);
		contentPane.add(Table5Button);
		
		JButton Table6Button = new JButton("6");
		Table6Button.setBackground(Color.PINK);
		Table6Button.setFont(new Font("Tahoma", Font.BOLD, 20));
		tablefunction(Table6Button,Table6Button.getLabel());
		Table6Button.setBounds(184, 147, 188, 122);
		contentPane.add(Table6Button);
		
		JButton Table9Button = new JButton("9");
		Table9Button.setBackground(Color.PINK);
		Table9Button.setFont(new Font("Tahoma", Font.BOLD, 20));
		tablefunction(Table9Button,Table9Button.getLabel());
		Table9Button.setBounds(0, 267, 188, 122);
		contentPane.add(Table9Button);
		
		JButton Table7Button = new JButton("7");
		Table7Button.setBackground(Color.PINK);
		Table7Button.setFont(new Font("Tahoma", Font.BOLD, 20));
		tablefunction(Table7Button,Table7Button.getLabel());
		Table7Button.setBounds(371, 147, 188, 122);
		contentPane.add(Table7Button);
		
		JButton Table10Button = new JButton("10");
		Table10Button.setBackground(Color.PINK);
		Table10Button.setFont(new Font("Tahoma", Font.BOLD, 20));
		tablefunction(Table10Button,Table10Button.getLabel());
		Table10Button.setBounds(184, 267, 188, 122);
		contentPane.add(Table10Button);
		
		JButton Table8Button = new JButton("8");
		Table8Button.setBackground(Color.PINK);
		Table8Button.setFont(new Font("Tahoma", Font.BOLD, 20));
		tablefunction(Table8Button,Table8Button.getLabel());
		Table8Button.setBounds(552, 147, 188, 122);
		contentPane.add(Table8Button);
		
		JButton Table12Button = new JButton("12");
		Table12Button.setBackground(Color.PINK);
		Table12Button.setFont(new Font("Tahoma", Font.BOLD, 20));
		tablefunction(Table12Button,Table12Button.getLabel());
		Table12Button.setBounds(558, 267, 182, 122);
		contentPane.add(Table12Button);
		
		JButton Table11Button = new JButton("11");
		Table11Button.setBackground(Color.PINK);
		Table11Button.setFont(new Font("Tahoma", Font.BOLD, 20));
		tablefunction(Table11Button,Table11Button.getLabel());
		Table11Button.setBounds(371, 267, 188, 122);
		
		contentPane.add(Table11Button);
		
		JButton CloseButton = new JButton("Close");
		CloseButton.setBounds(604, 421, 112, 34);
		contentPane.add(CloseButton);
		CloseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toBack();
				
			}
		});
		
	
	}
}
