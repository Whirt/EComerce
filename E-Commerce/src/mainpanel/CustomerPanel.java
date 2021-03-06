package mainpanel;

import java.awt.Color;
import java.awt.Graphics;

import customerelements.CustomerCommands;
import user.User;

public class CustomerPanel extends Panel {
	
	// Background
	private static final int R = 53 ;
	private static final int G = 53 ;
	private static final int B = 159 ;
	private Color backgroundColor ;
	
	private CustomerCommands commands ;
	
	public CustomerPanel(User user) {
		super(user) ;
		
		backgroundColor = new Color(R, G, B) ;
		
		commands = new CustomerCommands(table) ;
		commands.setBackground(backgroundColor) ;
		
		add(commands) ;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.setColor(backgroundColor) ;
		g.fillRect(0, 0, getWidth(), getHeight()) ;
	}
}
