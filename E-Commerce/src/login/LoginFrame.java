/**
 * LoginFrame handles E-Commerce and decides whether to sign in as administrator
 * or normal user. It's possible to create account.
 * @author Hu Jia Cheng
 * @revision 1.0
 */

package login;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginFrame extends JFrame implements ActionListener {
	
	private static final int START_X = 200 ;
	private static final int START_Y = 300 ;
	private static final int WIDTH = 320 ;
	private static final int HEIGHT = 230 ;
	
	private LogoPanel logoPanel ;
	
	private JPanel componentsPanel ;
	private JLabel nameLabel ;
	private JLabel passwdLabel ;
	private JLabel infoLabel ;
	
	private final static int TXTMAXLEN = 20 ;
	private JTextField nameField ;
	private JTextField passwdField ;
	private JTextField errorField ;
	
	private JButton loginButton ;
	private JButton createNewAccountButton ; 

	public LoginFrame(String title) {
		super(title) ;
		setBounds(START_X, START_Y, WIDTH, HEIGHT) ;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		//setResizable(false) ;
		
		logoPanel = new LogoPanel() ;
		
		nameLabel = new JLabel("Name ") ;
		passwdLabel = new JLabel("Password ") ;
		infoLabel = new JLabel("Info: ") ;
		nameField = new JTextField("", TXTMAXLEN) ;
		nameField.setEditable(true) ;
		passwdField = new JTextField("", TXTMAXLEN) ;
		passwdField.setEditable(true) ;
		errorField = new JTextField("", TXTMAXLEN) ;
		errorField.setEditable(false) ;
		
		loginButton = new JButton("Login") ;
		loginButton.addActionListener(this) ;
		createNewAccountButton = new JButton("Create new account") ;
		createNewAccountButton.addActionListener(this) ;
		
		FlowLayout flowLayout = new FlowLayout(FlowLayout.TRAILING) ;
		componentsPanel = new JPanel() ;
		componentsPanel.setLayout(flowLayout) ;
		componentsPanel.add(nameLabel) ; 
		componentsPanel.add(nameField) ;
		componentsPanel.add(passwdLabel) ; 
		componentsPanel.add(passwdField) ;
		componentsPanel.add(infoLabel) ;
		componentsPanel.add(errorField) ;
		componentsPanel.add(loginButton) ; 
		componentsPanel.add(createNewAccountButton) ;
		
		Container contentPane = getContentPane() ;
		BoxLayout boxLayout = new BoxLayout(contentPane, BoxLayout.Y_AXIS) ;
		//BorderLayout borderLayout = new BorderLayout() ;
		//borderLayout.minimumLayoutSize(contentPane) ;
		//borderLayout.setVgap(10) ;
		contentPane.setLayout(boxLayout) ;
		contentPane.add(componentsPanel) ;
		contentPane.add(logoPanel) ;
	}
	public LoginFrame() { this("Login") ; }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}
