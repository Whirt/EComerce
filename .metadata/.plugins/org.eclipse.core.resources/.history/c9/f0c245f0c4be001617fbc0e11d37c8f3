/**
 * Administrator frame outermost panel
 * 
 */

package mainpanel;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import adminelements.AdminComands;
import table.ECommerceTable;

public class AdminPanel extends JPanel {

	private BoxLayout layout ;
	private FrameHeader header ;
	private ECommerceTable table ;
	private AdminComands comands ;
	
	public AdminPanel() {
		super() ;
		header = new FrameHeader() ;
		table = new ECommerceTable() ;
		comands = new AdminComands(table) ;
		layout = new BoxLayout(this, BoxLayout.Y_AXIS) ;
		setLayout(layout) ;
		add(header) ;
		add(table) ;
		add(comands) ;
	}
	
}
