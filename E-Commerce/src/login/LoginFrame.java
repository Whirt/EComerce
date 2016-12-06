package login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * LoginFrame handles E-Commerce and decides whether to sign in as administrator
 * or normal user. It's possible to create account.
 * @author Hu Jia Cheng
 * @revision 1.0
 */

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginFrame extends JFrame implements ActionListener {
	
	private static final int START_X = 200 ;
	private static final int START_Y = 300 ;
	private static final int WIDTH = 200 ;
	private static final int HEIGHT = 100 ;

	private Image logo ;
	
	private JLabel nameLabel ;
	private JLabel passwdLabel ;
	private final static int TXTMAXLEN = 30 ;
	private JTextField nameField ;
	private JTextField passwdField ;
	private JTextField errorField ;
	
	private JButton loginButton ;
	private JButton createNewAccountButton ; 

	private JPanel panel ;
	private BoxLayout layout ;
	
	public LoginFrame() {
		super() ;
		setBounds(START_X, START_Y, WIDTH, HEIGHT) ;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		setResizable(false) ;
		
		nameLabel = new JLabel("Name ") ;
		passwdLabel = new JLabel("Password ") ;
		nameField = new JTextField("", TXTMAXLEN) ;
		nameField.setEditable(true) ;
		passwdField = new JTextField("", TXTMAXLEN) ;
		passwdField.setEditable(true) ;
		errorField = new JTextField("Error check the password or username") ;
		errorField.setEditable(false) ;
		
		loginButton = new JButton("Login") ;
		loginButton.addActionListener(this) ;
		createNewAccountButton = new JButton("Create new account") ;
		createNewAccountButton.addActionListener(this) ;
		
		panel = new JPanel() ;
		final int NUMELEM = 5 ;
		layout = new BoxLayout(panel, NUMELEM) ;
		panel.add(comp)
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}
