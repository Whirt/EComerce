/**
 * Frame consist of program base frame setting
 * 
 * 
 * @author Hu Jia Cheng
 * @revision 1.0
 */

package mainframe;

import javax.swing.JFrame;

public class Frame extends JFrame {
	
	private static final int START_X = 100 ;
	private static final int START_Y = 80 ;
	private static final int WIDTH = 800 ;
	private static final int HEIGHT = 620 ;
	
	public Frame(String title) {
		super(title) ;
		setBounds(START_X, START_Y, WIDTH, HEIGHT) ;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE) ;
		setResizable(false) ;
	
	}
	public Frame() { this("Frame") ; } 
	
}