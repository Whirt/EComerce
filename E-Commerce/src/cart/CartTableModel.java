/**
 * ProductTableModel is a table model.
 * 
 * ProductTableModel works both as table model and productManager wrapper.
 * It provides all of productManager method.
 */

package cart;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import product.ListedProduct;
import product.Product;
import product.ProductManager;

public class CartTableModel extends DefaultTableModel {

	// This parameter states the class version
	private static final long serialVersionUID = -8133314890195531670L;
	
	// column and rows
	public static final int NAME_COLUMN = 0 ;
	public static final int BRAND_COLUMN = 1 ;
	public static final int PRICE_COLUMN = 2 ;
	public static final int QUANTITY_COLUMN = 3 ;
	public static final int REMOVE_COLUMN = 4 ;
	public static final int INC_COLUMN = 5 ;
	public static final int DEC_COLUMN = 6 ;
	private static final String[] COLUMNBAR =
		{"Name", "Brand", "Price", "Qty", "Remove", "Inc", "Dec"} ;
	private static final int NUMCOLUMN = 7 ;
	private int rows ;
	
	private JTextField txtField = new JTextField("", 30);
	
	// Wrapped class
	private ProductManager<ListedProduct> productManager ;
	
	public CartTableModel() {
		super(null, COLUMNBAR) ;
		
		productManager = new ProductManager<ListedProduct>() ;
		rows = 0 ; 
	}
	
	@Override
	public int getRowCount() {
		return rows ;
	}
	@Override
	public int getColumnCount() {
		return NUMCOLUMN ;
	}

	// product manager getters & adder
	public Product getProduct(int index) {
		return productManager.getProduct(index) ;
	}
	public boolean addProduct(ListedProduct newProduct) {
		boolean success = productManager.add(newProduct) ;
		if (success) {
			rows++ ;
			fireTableDataChanged() ;
			return true ;
		}
		return false ;
	}
	public int getSize() {
		return productManager.getSize() ;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		ListedProduct product = productManager.getProduct(rowIndex) ;
		if (product == null)
			return null ;
		switch (columnIndex) {
		case 0: return product.getName() ;
		case 1: return product.getBrand() ;
		case 2: return product.getPrice() ;
		case 3: return product.getQuantity() ;
		// other cases handled by JTable 
		default: return null ;
		}
	}
	
	@Override
	public boolean isCellEditable(int row, int column) {
		if (column != INC_COLUMN || column != DEC_COLUMN ||
			column != REMOVE_COLUMN)
			return false ;
		return true ;
	}
	
	// Is protected to be invoked by TableHeader
	protected Product searchProduct(String pattern) {
		return productManager.getProduct(0) ;
	}
}

