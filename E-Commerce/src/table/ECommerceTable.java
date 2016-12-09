/**
 * This class consist of the centered panel part of ECommerce's home
 * it includes Table, and relative buttons.
 * 
 * It wrappers ProductTableModel.
 */

package table;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import product.Product;

public class ECommerceTable extends JPanel {

	private static final int ROW_HEIGHT = 50 ;
	
	// panel components
	private TableHeader tableHeader ;
	private ProductTableModel tableModel ;
	private JTable tableView ;
	private JScrollPane scrollPane ;
	
	// container panel components
	private BoxLayout layout ;
	
	public ECommerceTable() {
		super() ;
		tableHeader = new TableHeader() ;
		tableModel = new ProductTableModel() ;
		tableView = new JTable(tableModel) ;
		tableView.setRowHeight(ROW_HEIGHT) ;
		scrollPane = new JScrollPane(tableView) ;
		
		layout = new BoxLayout(this, BoxLayout.Y_AXIS) ;
		setLayout(layout) ;
		add(tableHeader) ;
		add(scrollPane) ;
	}
	
	// ProductTable API
	public boolean addProduct(Product newProduct) {
		return tableModel.addProduct(newProduct) ;
	}
	public Product getProduct(int index) {
		return tableModel.getProduct(index) ;
	}
	
}
