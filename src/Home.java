package berklee;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JPanel panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		tabbedPane.addTab("Entry", null, panel_2, null);
		
		JLabel lblRoll = new JLabel("Roll No");
		
		JLabel label_4 = new JLabel(":");
		
		JLabel lblName_1 = new JLabel("Name");
		
		JLabel label_5 = new JLabel(":");
		
		JLabel lblDate_1 = new JLabel("Date");
		
		JLabel label_6 = new JLabel(":");
		
		JLabel lblWebsite_1 = new JLabel("Website");
		
		JLabel label_7 = new JLabel(":");
		
		JLabel lblDamage = new JLabel("Damage");
		
		JLabel label_8 = new JLabel(":");
		
        JLabel lblOrderId = new JLabel("Order Id");
        
        JLabel label_9 = new JLabel(":");
        
        		
        		textField_4 = new JTextField();
        		String rollno = textField_4.getText();
        		textField_4.setColumns(10);
        		
        		textField_5 = new JTextField();
        		String name = textField_5.getText();
        		textField_5.setColumns(10);
        		
        		textField_6 = new JTextField();
        		String website = textField_6.getText();
        		textField_6.setColumns(10);
        		
        		textField_7 = new JTextField();
        		String date = textField_7.getText();
        		textField_7.setColumns(10);
        		
        		textField_8 = new JTextField();
        		String damage = textField_8.getText();
        		textField_8.setColumns(10);
        		
        		textField_9 = new JTextField();
        		String orderId = textField_9.getText();
        		textField_9.setColumns(10);
        		
        		JButton btnAdd = new JButton("Add");
        		btnAdd.addActionListener(new ActionListener() {
        			public void actionPerformed(ActionEvent arg0) {
        				String uID = "78";//sendSms.sendSms(1);
        			    deckAlloting da = new deckAlloting(1,orderId);
        			    String deckNum = da.orderId();
        			    System.out.println(name+""+da);
        			    Details det = new Details(uID,deckNum,orderId,name,rollno,date,website,damage);
        			    textField_9.setText("");
        			    textField_8.setText("");
        			    textField_7.setText("");
        			    textField_6.setText("");
        			    textField_5.setText("");
        			    textField_4.setText("");
        			}
        		});
        		
        		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
        		gl_panel_2.setHorizontalGroup(
        			gl_panel_2.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_panel_2.createSequentialGroup()
        					.addGap(73)
        					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
        						.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
        							.addGroup(gl_panel_2.createSequentialGroup()
        								.addComponent(lblDamage)
        								.addGap(18)
        								.addComponent(label_8))
        							.addGroup(gl_panel_2.createSequentialGroup()
        								.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
        									.addGroup(gl_panel_2.createSequentialGroup()
        										.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
        											.addComponent(lblRoll)
        											.addComponent(lblName_1)
        											.addComponent(lblDate_1))
        										.addGap(30))
        									.addGroup(gl_panel_2.createSequentialGroup()
        										.addComponent(lblOrderId)
        										.addGap(18)))
        								.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
        									.addComponent(label_9)
        									.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
        										.addComponent(label_7)
        										.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 5, GroupLayout.PREFERRED_SIZE)
        										.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 5, GroupLayout.PREFERRED_SIZE)
        										.addComponent(label_6)))))
        						.addComponent(lblWebsite_1))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
        						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addGroup(gl_panel_2.createSequentialGroup()
        							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addGap(43)
        							.addComponent(btnAdd))
        						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(30))
        		);
        		gl_panel_2.setVerticalGroup(
        			gl_panel_2.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_panel_2.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
        						.addComponent(label_9)
        						.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
        							.addComponent(lblOrderId)
        							.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        					.addGap(18)
        					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblRoll)
        						.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
        						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblName_1)
        						.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
        						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblDate_1)
        						.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
        						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblWebsite_1)
        						.addComponent(label_7)
        						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblDamage)
        						.addComponent(label_8)
        						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btnAdd))
        					.addContainerGap(16, Short.MAX_VALUE))
        		);
        		panel_2.setLayout(gl_panel_2);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Deliveries", null, panel, null);
		
		JLabel lblRollNo = new JLabel("Roll No");
		
		JLabel label = new JLabel(":");
		
		JLabel lblName = new JLabel("Name");
		
		JLabel label_1 = new JLabel(":");
		
		JLabel lblWebsite = new JLabel("Website");
		
		JLabel label_2 = new JLabel(":");
		
		JLabel lblDate = new JLabel("Date");
		
		JLabel label_3 = new JLabel(":");
		
		textField = new JTextField();
		String Roll = textField.getText();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		String Name = textField.getText();
		textField_1.setColumns(10);
		textField_1.enable(false);
		
		textField_2 = new JTextField();
		String Website = textField.getText();
		textField_2.setColumns(10);
		textField_2.enable(false);
		
		textField_3 = new JTextField();
		String Date = textField.getText();
		textField_3.setColumns(10);
		textField_3.enable(false);
		
		JButton btnLookIn = new JButton("Look In");
		btnLookIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Edit e = new Edit();
				e.search(Roll);
				e.setVisible(true);
				dispose();
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(74)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblRollNo)
								.addComponent(lblName))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(label)
								.addComponent(label_1)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblWebsite)
								.addComponent(lblDate))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(label_3)
								.addComponent(label_2))))
					.addGap(24)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(129, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(297, Short.MAX_VALUE)
					.addComponent(btnLookIn)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(48)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRollNo)
						.addComponent(label)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(label_1)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblWebsite)
						.addComponent(label_2)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDate)
						.addComponent(label_3)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
					.addComponent(btnLookIn)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sendSms.sendSms(2);
			}
		});
		tabbedPane.addTab("Other", null, panel_1, null);
		
		JButton btnNewButton = new JButton("Complaint");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				complaint c = new complaint();
				c.setVisible(true);
				dispose();
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnNewButton_1 = new JButton("Notify");
		
		JButton btnNewButton_2 = new JButton("statistics");
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(134)
							.addComponent(btnNewButton))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(147)
							.addComponent(btnNewButton_2))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(52)
							.addComponent(btnNewButton_1)
							.addGap(18)
							.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(163, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(39)
					.addComponent(btnNewButton)
					.addGap(29)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addComponent(btnNewButton_2)
					.addContainerGap(72, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		contentPane.setLayout(gl_contentPane);
	}
}