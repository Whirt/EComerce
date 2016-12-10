/**
 * Singleton
 */

package adminelements;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import table.ECommerceTable;

public class ProductHandlerFrame extends JFrame {

	private static final int TXTMAXLEN = 25 ;
	private static final int R = 28 ;
	private static final int G = 106 ;
	private static final int B = 208 ;
	private Color backgroundColor ;
	
	private static final int START_X = 100 ;
	private static final int START_Y = 80 ;
	private static final int WIDTH = 400 ;
	private static final int HEIGHT = 500 ;

	private static ProductHandlerFrame productHandlerFrame = null ;
	
	public static ProductHandlerFrame getFrame(ECommerceTable productTable) {
		if (productHandlerFrame == null) 
			productHandlerFrame = 
				new ProductHandlerFrame("New/Modify", productTable) ;
		productHandlerFrame.repaint() ;
		return productHandlerFrame ;
	}
	
	// constructor part
	private ECommerceTable productTable ;
	
	// panel components
	protected JLabel nameLabel ;
	protected JLabel brandLabel ;
	protected JLabel codeLabel ;
	protected JLabel priceLabel ;
	protected JLabel discountLabel ;
	protected JLabel descriptionLabel ;
	protected JTextField nameTextField ;
	protected JTextField brandTextField ;
	protected JTextField codeTextField ;
	protected JTextField priceTextField ;
	protected JTextField discountTextField ;
	protected JTextField descriptionTextField ;
	protected JLabel ImageIcon ;
	
	private ProductHandlerFrame(String title, 
								ECommerceTable productTable) {
		super(title) ;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE) ;
		setBounds(START_X, START_Y, WIDTH, HEIGHT) ;
		setResizable(false) ;
		
		backgroundColor = new Color(R, G, B) ;
		
		this.productTable = productTable ;
		// setting up components
		nameLabel = new JLabel("    Name") ;
		brandLabel = new JLabel("    Brand") ;
		codeLabel = new JLabel("     Code") ;
		priceLabel = new JLabel("     Price") ;
		discountLabel = new JLabel("Discount") ;
		descriptionLabel = new JLabel("Description") ;
		nameTextField = new JTextField("", TXTMAXLEN) ;
		brandTextField = new JTextField("", TXTMAXLEN) ;
		codeTextField = new JTextField("", TXTMAXLEN) ;
		priceTextField = new JTextField("", TXTMAXLEN) ;
		discountTextField = new JTextField("", TXTMAXLEN) ;
		descriptionTextField = new JTextField("", TXTMAXLEN) ;
		// setting background color
		nameLabel.setBackground(backgroundColor) ;
		brandLabel.setBackground(backgroundColor) ;
		codeLabel.setBackground(backgroundColor) ;
		priceLabel.setBackground(backgroundColor) ;
		discountLabel.setBackground(backgroundColor) ;
		descriptionLabel.setBackground(backgroundColor) ;
		// text color
		nameLabel.setForeground(Color.WHITE) ;
		brandLabel.setForeground(Color.WHITE) ;
		codeLabel.setForeground(Color.WHITE) ;
		priceLabel.setForeground(Color.WHITE) ;
		discountLabel.setForeground(Color.WHITE) ;
		descriptionLabel.setForeground(Color.WHITE) ;
		// image handling
		
		
		// adding up
		JPanel panel = new JPanel() ;
		FlowLayout layout = new FlowLayout(FlowLayout.TRAILING) ;
		panel.setLayout(layout) ;
		panel.setBackground(backgroundColor) ;
		panel.add(nameLabel) ; panel.add(nameTextField) ;
		panel.add(brandLabel) ; panel.add(brandTextField) ;
		panel.add(codeLabel) ; panel.add(codeTextField) ;
		panel.add(priceLabel) ; panel.add(priceTextField) ;
		panel.add(discountLabel) ; panel.add(discountTextField) ;
		panel.add(descriptionLabel) ; panel.add(descriptionTextField) ;	
		setContentPane(panel) ;
		
		setVisible(true) ;
	}
	private ProductHandlerFrame() { ; } 
}