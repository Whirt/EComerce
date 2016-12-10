/**
 * Admin main operating frame
 * 
 * @author hu
 */

package mainframe;

import mainpanel.AdminPanel;
import mainpanel.Panel;

public class AdminFrame extends Frame {
	
	public AdminFrame(String username, Panel panel) {
		super(username + " home") ;
		panel.setHeaderName(username) ;
		setContentPane(panel) ;
	}
	public AdminFrame() { 
		this("Administrator ECommerce Home", new AdminPanel()) ; }
}
