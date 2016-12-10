/**
 * Basic Product abstraction.
 * 
 * A product name cannot be modified, as would generate an
 * inconsistent state. 
 * Removing and re-inserting the product is the only way
 * to change a product name.
 * 
 * @author Jia Cheng Hu
 */

package product;

public class Product {

	// product info
	private String name ;
	private String brand ;
	private String code ;
	private ProductType type ;
	private float price ;
	private String imagePath ;
	
	/** not used in Product class
	 * It's a king od force polymorphism, discount is only setted
	 * and used in DiscountedProduct, but for TableManager to work well
	 * it need to be definied here.
	 * 
	 * For this reason, by default is set to 0 automatically
	 */
	private int discount = 0 ;
	
	public Product(String name, String brand,
				   String code, ProductType type,
				   float price, String imagePath)
	throws IllegalArgumentException {
		/* available boolean tells whether some core information
		 * are missing it's used only at creation, after construction phase
		 * all information but name can be modified.
		 * 
		 * If is not available after construction phase, 
		 * IllegalArgumentException will be thrown. */
		boolean available =	false ;
		available = setName(name) && 
					setBrand(brand) && 
					setPrice(price) &&
					setType(type) ;
		if (!available)
			throw new IllegalArgumentException() ;
		
		this.imagePath = imagePath ;
		setCode(code) ;
	}
	public Product(String name, String brand, ProductType type, float price) {
		this(name, brand, null, type, price, null) ;
	}
	// void parameter can't be passed to constructor
	// as name field must be satisfied
	private Product() {	; }
	
	// getters
	public String getName() {
		return name ;
	}
	public String getBrand() {
		return brand ;
	}
	public String getCode() {
		return code ;
	}
	public ProductType getType() {
		return type ;
	}
	public float getPrice() {
		return price ;
	}
	public String getImagePath() {
		return imagePath ;
	}
	public int getDiscount() {
		return discount ;
	}
	
	// setters
	private boolean setName(String name) {
		if (name == null)
			return false ;
		this.name = name ;
		return true ;
	}
	public boolean setBrand(String brand) {
		if (brand == null)
			return false ;
		this.brand = brand ;
		return true ;
	}
	public void setCode(String code) {
		this.code = code ;
	}
	public boolean setType(ProductType type) {
		if (type == ProductType.ALL)
			return false ;
		this.type = type ;
		return true ;
	}
	public boolean setPrice(float price) {
		if (price <= 0) 
			return false ;
		this.price = price ;
		return true ;
	}
	public boolean setImagePath(String imagePath) {
		if (imagePath == null)
			return false ;
		this.imagePath = imagePath ;
		return true ;
	}
	public void setDiscount(int discount) {
		if (discount < 0) {
			discount = 0 ;
		}
		this.discount = discount ;
	}
	
	/**
	 * Buy Product return the price based on the given quantity.
	 * @param quantity
	 * @return float
	 */
	public float buyProduct(int quantity) {
		float totalPrice = 0 ;
		if (quantity <= 0)
			return totalPrice ;
		totalPrice = this.price * quantity ;
		return totalPrice ;
	}
}

