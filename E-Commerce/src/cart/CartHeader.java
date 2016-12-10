package cart;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CartHeader extends JPanel {
	
	// background color
	private static final int R = 51 ;
	private static final int G = 88 ;
	private static final int B = 212 ;
	private Color backgroundColor ;
	
	// panel components
	private Font titleFont ;
	private JLabel titleLabel ;
	private Image titleImage ;
	
	public CartHeader() {
		super() ;
		
		// setting color
		backgroundColor = new Color(R, G, B) ;
		
		// making up components
		titleFont = new Font(null, Font.ITALIC, 30) ;
		titleLabel = new JLabel("  E-COMMERCE CART") ;
		titleLabel.setForeground(Color.WHITE) ;
		titleLabel.setFont(titleFont) ;
		Toolkit t = Toolkit.getDefaultToolkit() ;
		titleImage = t.getImage("./media/shopping-cart.png") ;
		
		// mixing up
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT) ;
		setLayout(layout) ;
		add(titleLabel) ;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.setColor(backgroundColor) ;
		g.fillRect(0, 0, getWidth(), getHeight()) ;
		g.drawImage(titleImage, 
					getWidth() - titleImage.getWidth(null) - 10,
					0, null) ;
	}
	
}