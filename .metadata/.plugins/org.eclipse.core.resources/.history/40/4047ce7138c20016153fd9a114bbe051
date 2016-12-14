/**
 * Main Cart List element.
 * 
 * It consist of a product and its counter
 */

package product;

public class ListedProduct extends Product {

	// core extension
	private int quantity ;
	
	public ListedProduct(String name, String brand, 
						 String code, ProductType type, 
						 float price, String imagePath, int quantity)
	throws IllegalArgumentException {
		super(name, brand, code, type, price, imagePath);
		this.quantity = quantity ;
	}
	public ListedProduct(String name, String brand, 
					   ProductType type, float price) {
		this(name, brand, null, type, price, null, 1) ;
	}
	
	public int getQuantity() {
		return quantity ;
	}
	public void setQuantity(int quantity) {
		if (quantity <= 0)
			this.quantity = 1 ;
		this.quantity = quantity ;
	}
	public void inc() {
		quantity++ ;
	}
	public void dec() {
		if (quantity > 1)
			quantity-- ;
		
	}
}
