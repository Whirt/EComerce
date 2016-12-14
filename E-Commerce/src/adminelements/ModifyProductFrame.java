package adminelements;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import product.Product;
import table.ECommerceTable;

public class ModifyProductFrame extends AddProductFrame {
	
	private int productIndex ;
	
	public ModifyProductFrame(String title, ECommerceTable productTable,
							 int index) 
	throws IllegalArgumentException {
		super(title, productTable) ;
		
		// control index
		if ((index < 0) && (index >= productTable.getTableSize()))
			productIndex = index ;
		else
			throw new IllegalArgumentException() ;
		Product modifiedProduct = productTable.getProduct(index) ;
		
		// set data to be modified
		nameTextField.setText(modifiedProduct.getName()) ;
		brandTextField.setText(modifiedProduct.getBrand()) ;
		codeTextField.setText(modifiedProduct.getCode()) ;
		priceTextField.setText(
				Float.toString(modifiedProduct.getPrice())) ;
		detailTextArea.setText(modifiedProduct.getDetail()) ;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource() ;
		if (source != confirmButton) 
			return ;
		
		Product newProduct = addNewProduct() ;
		if (newProduct != null) {
			// modify consist of removing and re-applying
			productTable.removeProduct(productIndex) ;
			productTable.addProduct(newProduct) ;
			dispose() ;
		}
	}
}