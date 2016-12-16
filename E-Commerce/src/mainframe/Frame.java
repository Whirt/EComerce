/**
 * Frame consist of program base frame setting
 * 
 * 
 * @author Hu Jia Cheng
 * @revision 1.0
 */

package mainframe;

import java.awt.Dimension;

import javax.swing.JFrame;

import user.User;

public class Frame extends JFrame {
	
	private static final int WIDTH = 840 ;
	private static final int HEIGHT = 620 ;
	
	public Frame(String username) {
		super(username + " E-Commerce home") ;
		setPreferredSize(new Dimension(WIDTH, HEIGHT)) ;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		setResizable(false) ;
	}
	public Frame() { this("E-Commerce home") ; } 
	
}
