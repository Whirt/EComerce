/**
 * Customer main operating frame.
 * 
 * @author Hu Jia Cheng
 */

package mainframe;

import mainpanel.CustomerPanel;
import mainpanel.Panel;
import user.User;

public class CustomerFrame extends Frame {

	private Panel panel ;
	
	public CustomerFrame(String username, Panel panel) {
		super(username) ;
		panel.setHeaderName(username) ;
		setContentPane(panel) ;
	}
	public CustomerFrame(User user) { 
		this("Customer Frame", new CustomerPanel(user)) ; 
	}
	private CustomerFrame() { ; }
	
}
