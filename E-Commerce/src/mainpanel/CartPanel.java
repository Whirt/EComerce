package mainpanel;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import cart.CartHeader;
import cart.CartTableView;
import user.User;

public class CartPanel extends JPanel {

	private static final float CART_HEADER_PORTION = 1F/3 ;
	private static final float CART_TABLE_PORTION = 2F/3 ;
	
	private CartHeader cartHeader ;
	private CartTableView cartTable ;
	
	private BoxLayout cartLayout ;
	
	public CartPanel(User user) {
		super() ;
		
		cartHeader = new CartHeader() ;
		cartHeader.setPreferredSize(new Dimension(getWidth(), 
				(int)(getHeight()*CART_HEADER_PORTION))) ;
		cartTable = new CartTableView(user.getCartProduct()) ;
		cartTable.setPreferredSize(new Dimension(getWidth(),
				(int)(getHeight()*CART_TABLE_PORTION)));
		
		cartLayout = new BoxLayout(this, BoxLayout.Y_AXIS) ;
		setLayout(cartLayout) ;
		add(cartHeader) ;
		add(cartTable) ;
	}
	
}
