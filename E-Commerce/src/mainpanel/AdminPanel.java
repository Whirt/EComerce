/**
 * Administrator frame outermost panel
 * 
 */

package mainpanel;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import adminelements.AdminCommands;
import table.ECommerceTable;

public class AdminPanel extends JPanel {

	private BoxLayout layout ;
	private FrameHeader header ;
	private ECommerceTable table ;
	private AdminCommands commands ;
	
	public AdminPanel() {
		super() ;
		
		header = new FrameHeader() ;
		table = new ECommerceTable() ;
		commands = new AdminCommands(table) ;
		
		layout = new BoxLayout(this, BoxLayout.Y_AXIS) ;
		setLayout(layout) ;
		add(header) ;
		add(table) ;
		add(commands) ;
	}
	
}
