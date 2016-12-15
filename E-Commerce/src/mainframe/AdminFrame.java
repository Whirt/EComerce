/**
 * Admin main operating frame
 * 
 * @author hu
 */

package mainframe;

import mainpanel.Panel;

public class AdminFrame extends Frame {
	
	public AdminFrame(String username, Panel panel) {
		super(username) ;
		panel.setHeaderName(username) ;
		setContentPane(panel) ;
	}
}
