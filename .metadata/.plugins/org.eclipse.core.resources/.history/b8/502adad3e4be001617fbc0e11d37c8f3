package mainpanel;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import customerelements.CustomerCommands;
import table.ECommerceTable;

public class CustomerPanel extends JPanel {

	// Backgrouund
	private static final int R = 53 ;
	private static final int G = 53 ;
	private static final int B = 159 ;
	private Color backgroundColor ;
	
	private BoxLayout layout ;
	private FrameHeader header ;
	private ECommerceTable table ;
	private CustomerCommands commands ;
	
	public CustomerPanel() {
		super() ;
		
		backgroundColor = new Color(R, G, B) ;
		
		table = new ECommerceTable() ;
		table.setBackground(backgroundColor) ;
		header = new FrameHeader() ;
		header.setBackground(backgroundColor) ;
		commands = new CustomerCommands(table) ;
		commands.setBackground(backgroundColor) ;
		
		layout = new BoxLayout(this, BoxLayout.Y_AXIS) ;
		setLayout(layout) ;
		add(header) ;
		add(table) ;
		add(commands) ;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.setColor(backgroundColor) ;
		g.fillRect(0, 0, getWidth(), getHeight()) ;
	}
}
