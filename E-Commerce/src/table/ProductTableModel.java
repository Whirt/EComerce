/**
 * ProductTableModel is a table model.
 * 
 * ProductTableModel works both as table model and productManager wrapper.
 * It provides all of productManager method.
 */

package table;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import product.Product;
import productManager.ProductManager;

public class ProductTableModel extends DefaultTableModel {

	// This parameter states the class version
	private static final long serialVersionUID = -8133314890195531670L;
	
	// column and rows
	private static final String[] COLUMNBAR =
		{"Name", "Brand", "Code", "Class", "Price", "Sale", "Image", "Qty"} ;
	private static final int NUMCOLUMN = 8 ;
	private int rows ;
	
	private JTextField txtField = new JTextField("", 30);
	
	// Wrapped class
	private ProductManager<Product> productManager ;
	
	public ProductTableModel() {
		super(null, COLUMNBAR) ;
		
		productManager = new ProductManager<Product>() ;
		rows = 0 ; 
	}
	
	// table model methods
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
	public boolean addProduct(Product newProduct) {
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
		Product product = productManager.getProduct(rowIndex) ;
		if (product == null)
			return null ;
		switch (columnIndex) {
		case 0: return product.getName() ;
		case 1: return product.getBrand() ;
		case 2: return product.getCode() ;
		case 3: return product.getType() ;
		case 4: return product.getPrice() ;
		case 5: return product.getSale() ;
		case 6: return product.getImagePath() ;
		// handled by JTable 
		default: return null ;
		}
	}
	
	//@Override
	//public boolean isCellEditable(int row, int column) {
	//	return false ;
	//}
	
	// Is protected to be invoked by TableHeader
	protected Product searchProduct(String pattern) {
		return productManager.getProduct(0) ;
	}
}

