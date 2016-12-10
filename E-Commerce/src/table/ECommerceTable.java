/**
 * This class consist of the centered panel part of ECommerce's home
 * it includes Table, and relative buttons.
 * 
 * It wrappers ProductTableModel.
 */

package table;

import javax.swing.BoxLayout;
import javax.swing.DefaultCellEditor;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;

import product.Product;

public class ECommerceTable extends JPanel {

	private static final int IMAGE_COLUMN = 6 ;
	private static final int QUANTITY_COLUMN = 7 ;
	private static final int QUANTITY_COLUMN_WIDTH = 10 ;
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
		// center all of its column
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer() ;
		// align all to center
		dtcr.setHorizontalAlignment(SwingConstants.CENTER) ;
		for (int i = 0 ; i < tableModel.getColumnCount() ; i++)
			tableView.getColumnModel().getColumn(i).setCellRenderer( dtcr) ;
		// adding quantity box
		QuantityBox qtyBox = new QuantityBox() ;
		tableView.getColumnModel().getColumn(QUANTITY_COLUMN)
			.setCellEditor(new DefaultCellEditor(qtyBox)) ;
		// other settings
		tableView.setRowHeight(ROW_HEIGHT) ;
		TableColumnModel columnModel = tableView.getColumnModel() ;
		columnModel.getColumn(QUANTITY_COLUMN).
			setPreferredWidth(QUANTITY_COLUMN_WIDTH) ;
		columnModel.getColumn(IMAGE_COLUMN).
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
	
}
