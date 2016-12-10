/**
 * Discounted Product.
 * 
 * 
 */

package product;

public class DiscountedProduct extends Product {

	// constructor
	public DiscountedProduct(String name, String brand,
							 String code, ProductType type, 
							 float price, String imagePath,
							 int discount) 
	throws IllegalArgumentException {
		super(name, brand, code, type, price, imagePath) ;
		setDiscount(discount) ;
	}
	public DiscountedProduct(String name, String brand, 
							 ProductType type, float price) {
		this(name, brand, null, type, price, null, 0) ;
	}
	
	private void setDiscount(int discount) {
		if (discount < 0) {
			discount = 0 ;
		}
		this.discount = discount ;
	}
	
	/**
	 * Polymorphism
	 */
	@Override
	public float buyProduct(int quantity) {
		float totalPrice = 0 ;
		if (quantity <= 0)
			return totalPrice ;
		float discountedPrice = super.getPrice() ;
		discountedPrice -= super.getPrice() * discount / 100 ;
		totalPrice = discountedPrice * quantity ;
		return totalPrice ;
	}
}
