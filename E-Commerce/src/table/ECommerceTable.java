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
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;

import product.Product;

public class ECommerceTable extends JPanel {

	// table data dimension
	private static final int IMAGE_COLUMN_WIDTH = 150 ;
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
		
		// making header and main product structure
		tableHeader = new TableHeader() ;
		
		tableModel = new ProductTableModel() ;
		// table view managing
		tableView = new JTable(tableModel) ;
		tableView.setRowHeight(ROW_HEIGHT) ;
		
		// setting center alignment
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer() ;
		TableColumnModel columnModel = tableView.getColumnModel() ;
		dtcr.setHorizontalAlignment(SwingConstants.CENTER) ;
		for (int i = 0 ; i < tableModel.getColumnCount() ; i++) {
			if (i != ProductTableModel.IMAGE_COLUMN)
				columnModel.getColumn(i).setCellRenderer( dtcr) ;
		}
		//  setting tableColumnModel
		columnModel.getColumn(ProductTableModel.IMAGE_COLUMN).
			setPreferredWidth(IMAGE_COLUMN_WIDTH) ;
		
		// wrapping into a scrollPane
		scrollPane = new JScrollPane(tableView) ;
		
		// setting up
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
	public boolean removeProduct(int index) {
		return tableModel.removeProduct(index) ;
	}
	public int getTableSize() {
		return tableModel.getTableSize() ;
	}
	
	// needed for customerFrame and adminFrame to implement mouse listener
	public JTable getTableView() {
		return tableView ;
	}
}
