/**
 * Cart frame is a singleton
 * per due motivi:
 * 1) Nel caso in cui uno provi a creare piu' finestre di Cart fallisce
 * 2) i pannelli o bottoni che necssitano di spegnerlo
 * possono invocarlo direttamente senza passarlo come parametro
 */

package cart;

import javax.swing.JFrame;

public class CartFrame extends JFrame {

	private static final int START_X = 100 ;
	private static final int START_Y = 50 ;
	private static final int WIDTH = 630 ;
	private static final int HEIGHT = 300 ;
	private static final String title = "CART" ;
	
	private CartPanel panel ;
	
	// singleton
	private static CartFrame cartFrame = null ;
	
	// the only getter
	public static CartFrame getCartFrame() {
		if (cartFrame == null) {
			cartFrame = new CartFrame(title) ;
		}
		return cartFrame ;
	}
	
	// private constructors
	private CartFrame(String title) {
		super(title) ;
		setBounds(START_X, START_Y, WIDTH, HEIGHT) ;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE) ;
		setResizable(false) ;
		
		panel = new CartPanel() ;
		setContentPane(panel) ;
		
		setVisible(true) ;
	}
	private CartFrame() { ; }
	
}
