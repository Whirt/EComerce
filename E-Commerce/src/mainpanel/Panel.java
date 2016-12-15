/**
 * 
 * 
 */

package mainpanel;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import table.ECommerceTable;
import user.User;
import user.UserType;

public class Panel extends JPanel {
	
	protected BoxLayout layout ;
	protected FrameHeader header ;
	protected ECommerceTable table ;
	
	public Panel(User user) {
		super() ;
		
		// create header depending on whether cart is needed or not
		if (user.getType() == UserType.ADMINISTRATOR)
			header = new FrameHeader(user, false) ;  
		if (user.getType() == UserType.CUSTOMER)
			header = new FrameHeader(user, true) ;
		table = new ECommerceTable() ;
		
		// integrating into panel
		layout = new BoxLayout(this, BoxLayout.Y_AXIS) ;
		setLayout(layout) ;
		add(header) ;
		add(table) ;
	}
	private Panel() { } // user argument is mandatory
	
	public void setHeaderName(String username) {
		header.setHelloUserName(username);
	}
}
