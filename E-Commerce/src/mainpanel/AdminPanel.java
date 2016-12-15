/**
 * Administrator frame outermost panel
 * 
 */

package mainpanel;

import adminelements.AdminCommands ;
import user.User;

public class AdminPanel extends Panel {
	
	private AdminCommands commands ;
	
	public AdminPanel(User user) {
		super(user) ;
		
		commands = new AdminCommands(table) ;
		add(commands) ;
	}
	
}
