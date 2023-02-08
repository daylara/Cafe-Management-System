import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Font;

public class LoginType extends JFrame {
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginType frame = new LoginType();
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
	public LoginType() {
		setTitle("Cafe Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));
		JButton CustomerButton = new JButton("CUSTOMER");
		CustomerButton.setBackground(Color.pink);
		CustomerButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		CustomerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerLogin login=new CustomerLogin();
				login.setVisible(true);
				toBack();
			}
		});
		
		contentPane.add(CustomerButton);
		JButton WaiterButton = new JButton("WAITER");
		WaiterButton.setBackground(Color.pink);
		WaiterButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		WaiterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WaiterLogin login=new WaiterLogin();
				login.setVisible(true);
				toBack();
			}
		});
		
		contentPane.add(WaiterButton);
		JButton BossButton = new JButton("BOSS");
		BossButton.setBackground(Color.pink);
		BossButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		BossButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BossLogin login=new BossLogin();
				login.setVisible(true);
				toBack();
			}
		});
		contentPane.add(BossButton);
	}

}
