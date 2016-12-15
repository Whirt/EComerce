package mainpanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mainframe.CartFrame;
import user.User;

public class FrameHeader extends JPanel implements ActionListener {

	// background parameters
	private static final int R = 54 ;
	private static final int G = 84 ;
	private static final int B = 206 ;
	private Color backgroundColor ;
	
	// components
	private JLabel helloLabel ;
	private JButton ecommerceButton ;
	private ImageIcon ecommerceIcon ;
	
	// frame header not visible data
	private User user ;
	private boolean cartListen ;
	
	public FrameHeader(User user, boolean cartListen) {
		super() ;
		
		this.user = user ;
		this.cartListen = cartListen ;
		
		backgroundColor = new Color(R, G, B) ;
		
		// setting up components
		helloLabel = new JLabel("  Hello User!") ;
		helloLabel.setFont(new Font(null, Font.PLAIN, 27)) ;
		helloLabel.setForeground(Color.WHITE) ;
		ecommerceIcon = new ImageIcon("./media/inLogo80x50.png") ;
		ecommerceButton = new JButton(ecommerceIcon) ;
		ecommerceButton.addActionListener(this) ;
		ecommerceButton.setBorderPainted(false) ;
		ecommerceButton.setBackground(backgroundColor) ;
		
		// merging into panel
		setLayout(new BorderLayout()) ;
		add(helloLabel, BorderLayout.WEST) ;
		add(ecommerceButton, BorderLayout.EAST) ;
	}
	public FrameHeader(User user) { this(user, false) ; }
	public FrameHeader() { this(new User(), false) ; } 

	public void setHelloUserName(String userName) {
		helloLabel.setText("  Hello " + userName + "!") ;
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.setColor(backgroundColor) ;
		g.fillRect(0, 0, getWidth(), getHeight()) ;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (cartListen) { // if cartListen is set to true get cart frame
			CartFrame.initCartUser(user) ;
		}
		
	}
}
