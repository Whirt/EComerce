/**
 * Administrator frame outermost panel
 * 
 */

package mainpanel;

import adminelements.AdminCommands ;

public class AdminPanel extends Panel {
	
	private AdminCommands commands ;
	
	public AdminPanel() {
		super() ;

		commands = new AdminCommands(table) ;
		add(commands) ;
	}
	
}
