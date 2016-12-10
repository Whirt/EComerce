package customerelements;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.JTable;

import product.Product;
import table.ECommerceTable;

public class CustomerCommands extends JPanel implements MouseListener {
	
	private ECommerceTable table ;
	// panel components
	private ImageCustomerPanel leftPanel ;
	private ProductProfile centerPanel ;
	private BuyCommands rightPanel ;
	
	// EcommerceTable view
	private JTable ecommerceTableView ;
	
	public CustomerCommands(ECommerceTable table) {
		super() ;
		
		// fixing together
		this.table = table ;
		ecommerceTableView = table.getTableView() ;
		ecommerceTableView.addMouseListener(this) ;
		
		// panel components
		leftPanel = new ImageCustomerPanel() ;
		centerPanel = new ProductProfile() ;
		rightPanel = new BuyCommands(table) ;
		
		// setting up
		FlowLayout layout = new FlowLayout() ;
		setLayout(layout) ;
		add(leftPanel) ;
		add(centerPanel) ;
		add(rightPanel) ;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int row = ecommerceTableView.rowAtPoint(e.getPoint()) ;
		Product clickedProduct = table.getProduct(row) ;
		leftPanel.setImage(clickedProduct.getImagePath()) ;
		centerPanel.setProductProfile(clickedProduct) ;
	}

	// not implemented
	@Override
	public void mousePressed(MouseEvent e) { }
	@Override
	public void mouseReleased(MouseEvent e) { }
	@Override
	public void mouseEntered(MouseEvent e) { }
	@Override
	public void mouseExited(MouseEvent e) { }
}
