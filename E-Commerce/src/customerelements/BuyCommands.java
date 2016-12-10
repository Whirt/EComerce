/**
 * BuyCommands Panel.
 * 
 * 
 * BuyCommands Panel consist of main customer interaction 
 * button to buy the product.
 * 
 * It's pretty simply, it offers a quantity Box and a button
 * to add into cart and the cost will be shown.
 */

package customerelements;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import table.ECommerceTable;
import table.QuantityBox;

public class BuyCommands extends JPanel implements ActionListener {

	private static final int PREFERRED_WIDTH = 150 ;
	private static final int PREFERRED_HEIGHT = 150 ;
	private static final int TXTMAXLEN = 12 ;
	// Backgrouund
	private static final int R = 28 ;
	private static final int G = 106 ;
	private static final int B = 208 ;
	private Color backgroundColor ;
	
	// table of product to work on
	private ECommerceTable ecommerceTable ;
	
	// componenents
	private JLabel chooseLabel ;
	private QuantityBox qtyBox ;
	private JButton addProductButton ;
	private JLabel costLabel ;
	private JTextField costTextField ;
	
	public BuyCommands(ECommerceTable ecommerceTable) {
		super() ;
		
		// setting color
		backgroundColor = new Color(R, G, B) ;
		
		this.ecommerceTable = ecommerceTable ;
		
		// setting components
		chooseLabel = new JLabel("Qty ") ;
		chooseLabel.setForeground(Color.WHITE) ;
		qtyBox = new QuantityBox() ;
		addProductButton = new JButton("Add to cart") ;
		costLabel = new JLabel("Price ") ;
		costLabel.setForeground(Color.WHITE) ;
		costTextField = new JTextField("", TXTMAXLEN) ;
		//costTextField.setEditable(false) ;
		
		// adding up
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT) ;
		setPreferredSize(new Dimension(PREFERRED_WIDTH, PREFERRED_HEIGHT)) ;
		setLayout(layout) ;
		add(chooseLabel) ; add(qtyBox) ;
		add(addProductButton) ;
		add(costLabel) ; add(costTextField) ;
	}
	// to construct without EcommerceTable is prohibited
	private BuyCommands() { ; }
	
	@Override
	protected void paintComponent(Graphics g) {
		g.setColor(backgroundColor) ;
		g.fillRect(0, 0, getWidth(), getHeight());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
