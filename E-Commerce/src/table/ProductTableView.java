/**
 * This class consist of the centered panel part of ECommerce's home
 * it includes Table, and relative buttons.
 * 
 * It wrappers ProductTableModel.
 */

package table;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

import product.Product;

public class ProductTableView extends JPanel {

	
	private ProductTableModel tableModel ;
	private JTable tableView ;
	private JScrollPane scrollPane ;
	
	public ProductTableView() {
		super() ;
		
		tableModel = new ProductTableModel() ;
		tableView = new JTable(tableModel) ;
		scrollPane = new JScrollPane(tableView) ;

		add(scrollPane) ;
	}
	
	public boolean addProduct(Product newProduct) {
		return tableModel.addProduct(newProduct) ;
	}
	public Product getProduct(int index) {
		return tableModel.getProduct(index) ;
	}
	
	
}
