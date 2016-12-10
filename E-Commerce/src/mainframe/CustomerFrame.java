/**
 * Customer main operating frame.
 * 
 * @author Hu Jia Cheng
 */

package mainframe;

import mainpanel.CustomerPanel;

public class CustomerFrame extends Frame {

	private CustomerPanel panel ;
	
	public CustomerFrame(String title) {
		super(title) ;
		panel = new CustomerPanel() ;
		setContentPane(panel) ;
	}
	public CustomerFrame() { this("Customer Frame") ; }
}
