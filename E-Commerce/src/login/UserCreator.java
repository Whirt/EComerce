/**
 * Frame that handles account creation. 
 * If success E-Commerce home will be shown.
 * 
 * @author hu
 */

package login;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import frame.ECommerceFrame;
import user.User;
import user.UserType;

public class UserCreator extends JFrame implements ActionListener {
	
	// frame and text static params
	private static final int START_X = 220 ;
	private static final int START_Y = 280 ;
	private static final int WIDTH = 280 ;
	private static final int HEIGHT = 190 ;
	private static final int TXTMAXLEN = 15 ;
	
	// components
	private JLabel nameLabel ;
	private JLabel pswdLabel ;
	private JLabel repeatPswdLabel ;
	private JLabel outcomeLabel ;
	private JTextField nameTxtField ;
	private JTextField pswdField ;
	private JTextField repeatPswdField ;
	private JTextField outcomeTxtField ;
	// buttons
	private JButton createButton ;
	private JButton backButton ;
	private ButtonGroup group ;
	private JRadioButton administratorButton ;
	private JRadioButton customerButton ;
	
	// layout
	private FlowLayout layout ;
	
	public UserCreator(String title) {
		super(title) ;
		setBounds(START_X, START_Y, WIDTH, HEIGHT) ;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE) ;
		setResizable(false) ;
		
		// text and labels
		nameLabel = new JLabel("Name: ") ;
		pswdLabel = new JLabel("Password: ") ;
		repeatPswdLabel = new JLabel("Repeat: ") ;
		outcomeLabel = new JLabel("Outcome: ") ;
		nameTxtField = new JTextField("", TXTMAXLEN) ;
		nameTxtField.setEditable(true) ;
		pswdField = new JPasswordField("", TXTMAXLEN) ;
		pswdField.setEditable(true) ;
		repeatPswdField = new JPasswordField("", TXTMAXLEN) ;
		repeatPswdField.setEditable(true) ;
		outcomeTxtField = new JTextField("", TXTMAXLEN) ;
		outcomeTxtField.setEditable(false) ;
		// buttons
		createButton = new JButton("Create") ;
		createButton.addActionListener(this) ;
		backButton = new JButton("Back") ;
		backButton.addActionListener(this) ;
		group = new ButtonGroup() ;
		administratorButton = new JRadioButton("Administrator") ;
		customerButton = new JRadioButton("Customer") ;
		group.add(administratorButton) ;
		group.add(customerButton) ;
		
		Container contentPane = getContentPane() ;
		layout = new FlowLayout(FlowLayout.TRAILING) ;
		contentPane.setLayout(layout) ;
		contentPane.add(nameLabel) ; contentPane.add(nameTxtField) ;
		contentPane.add(pswdLabel) ; contentPane.add(pswdField) ;
		contentPane.add(repeatPswdLabel) ; contentPane.add(repeatPswdField) ;
		contentPane.add(outcomeLabel) ; contentPane.add(outcomeTxtField) ;
		contentPane.add(administratorButton) ;
		contentPane.add(customerButton) ;
		contentPane.add(createButton) ; contentPane.add(backButton) ;
		
		setVisible(true) ;
	}
	public UserCreator() { this("New Account creation") ; }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource() ;
		if (source != createButton)
			dispose() ;
		if (nameTxtField.getText() == null)
			dispose() ;
		// This can be seen as the real launcher
		if (pswdField.getText().equals(repeatPswdField.getText())) {
			UserType type = null ;
			if (administratorButton.isSelected())
				type = UserType.ADMINISTRATOR ;
			if (customerButton.isSelected())
				type = UserType.CUSTOMER ;
			User user = new User(nameTxtField.getText(),
						            pswdField.getText(), type) ;
			ECommerceFrame ec = new ECommerceFrame(user.getUsername()
										 + " E-Commerce Home", user) ;
			dispose() ;
		}	
		outcomeTxtField.setText("Password not repeated") ;
	}
	
}
