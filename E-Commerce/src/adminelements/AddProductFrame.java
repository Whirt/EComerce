package adminelements;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import product.DiscountedProduct;
import product.Product;
import product.ProductType;
import product.SpecialSaleProduct;
import table.ECommerceTable;

public class AddProductFrame extends ProductHandlerFrame 
							 implements ActionListener {
	
	private JLabel urlLabel ;
	private JTextField urlTextField ;

	// handling option
	private JButton confirmButton ;
	private JLabel outcomeLabel ;
	private JTextField outcomeTextField ;
	
	public AddProductFrame(String title, ECommerceTable productTable) {
		super(title, productTable);
		
		// adding elements

		urlLabel = new JLabel("URL") ;
		urlLabel.setForeground(Color.WHITE) ;
		urlTextField = new JTextField("", TXTMAXLEN) ;
		
		confirmButton = new JButton("Confirm") ;
		confirmButton.addActionListener(this) ;
		outcomeLabel = new JLabel("Outcome") ;
		outcomeLabel.setForeground(Color.WHITE) ;
		outcomeTextField = new JTextField("", TXTMAXLEN) ;
		outcomeTextField.setEditable(false) ;
		
		panel.add(urlTextField) ; panel.add(urlLabel) ;
		panel.add(outcomeTextField) ; panel.add(outcomeLabel) ;
		panel.add(confirmButton) ;
		
		setContentPane(panel) ;
	}
	public AddProductFrame(ECommerceTable productTable) {
		this("Add new product", productTable) ;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource() ;
		if (source != confirmButton) 
			return ;
		
		String name = nameTextField.getText() ;
		String brand = brandTextField.getText() ;
		String code = codeTextField.getText() ;
		ProductType productType =  
				(ProductType)categoryComboBox.getSelectedItem() ;
		String priceString = priceTextField.getText() ;
		String discountString = discountTextField.getText() ;
		String detail = detailTextField.getText() ;
		String url = urlTextField.getText() ;
		
		if (name.equals("") || brand.equals("") || 
			!checkFloatString(priceString)) {
			outcomeTextField.setText("Name, Brand or price must be defined") ;
			return ;
		}
		
		if (productType == ProductType.ALL) {
			outcomeTextField.setText("Class cannot be ALL") ;
			return ;
		}
			
		
		float price = Float.parseFloat(priceString) ;
		
		// data control and product creation
		boolean isNotEmpty = discountString.equals("") ;
		// a product cannot be either discounted and special
		if (!isNotEmpty && specialSaleCheck.isSelected()) {
			outcomeTextField.
				setText("ERROR: No Special and discounted") ;
			return ;
		}
		boolean isDiscountCorrect = 
				isNotEmpty && checkIntegerString(discountString, false) ;
		if (!isDiscountCorrect)
			outcomeTextField.setText("Discount must contain only numbers") ;
		
		// polymorphic new product creation
		Product newProduct = null ;
		if (!isNotEmpty) {
			System.out.println("Discount product created") ;
			int discount = Integer.parseInt(discountString) ;
			newProduct = new DiscountedProduct(name, brand, code, productType,
											   price, url, discount, detail) ;
		} else if (specialSaleCheck.isSelected()) {
			System.out.println("Special Sale product created") ;
			newProduct = new SpecialSaleProduct(name, brand, code,
											productType, price, url, detail) ;
		} else {
			System.out.println("Normal product created") ;
			newProduct = new Product(name, brand, code, 
									 productType, price, url, detail) ;
		}
		
		if (productTable.addProduct(newProduct))
			outcomeTextField.setText("Success") ;
			//dispose() ; // if everything fine
		
		//outcomeTextField.setText("Error occurred during product insertion") ;
	}

	// Check if floatString has valid correct format
	private boolean checkFloatString(String floatString) {
		if (floatString.equals("") || floatString == null)
			return false ;
		int length = floatString.length() ;
		boolean dotContainedOnce = false ;
		for (int i = 0 ; i < length ; i++) {
			char examinedChar = floatString.charAt(i) ;
			boolean isADot = examinedChar == '.' ;
			if (isADot) {
				if (dotContainedOnce) return false ; // dot occurred twice!
				else dotContainedOnce = true ;
			}
		}
		// check if is a number
		if (!checkIntegerString(floatString, true))
			return false ;
		
		return true ;
	}
	// check whether integerString has valid correct format
	private boolean checkIntegerString(String integerString, 
									   boolean acceptDot) {
		if (integerString == null)
			return false ;
		// checking string contents
		int length = integerString.length() ;
		for (int i = 0 ; i < length ; i++) {
			char examinedChar = integerString.charAt(i) ;
			boolean isNumber = examinedChar >= '0' && examinedChar <= '9'  ;
			boolean isAcceptedDot = examinedChar == '.' && acceptDot ;
			if (!(isNumber || isAcceptedDot))
				return false ;
		}
		
		return true ;
	}
	
}
