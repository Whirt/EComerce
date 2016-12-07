/**
 * Frame consist of program base frame setting
 * 
 * 
 * @author Hu Jia Cheng
 * @revision 1.0
 */

package frame;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Frame extends JFrame {

	
	/**
	 * 
		menuBar = new JMenuBar() ;
		menu = new JMenu("Help") ;
		infoItem = new JMenuItem("Info") ;
		exitItem = new JMenuItem("Exit") ;
		menuBar.add(menu) ;
		menu.add(infoItem) ;
		menu.add(exitItem) ;
		setJMenuBar(menuBar) ;
	 */
	
	private static final int START_X = 100 ;
	private static final int START_Y = 100 ;
	private static final int WIDTH = 600 ;
	private static final int HEIGHT = 300 ;
	
	public Frame(String title) {
		super(title) ;
		setBounds(START_X, START_Y, WIDTH, HEIGHT) ;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE) ;
		setResizable(false) ;
	
	}
	public Frame() { this("Frame") ; } 
	
}
