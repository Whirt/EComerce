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
	
	private int sale ;
	
	public Product(String name, String brand,
				   String code, ProductType type,
				   float price, String imagePath, 
				   int sale) throws IllegalArgumentException {
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
		setSale(sale) ;
	}
	public Product(String name, String brand, ProductType type, float price) {
		this(name, brand, null, type, price, null, 0) ;
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
	public int getSale() {
		return sale ;
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
	// quantity handling
	public void setSale(int quantity) {
		if (quantity < 0) {
			quantity = 0 ;
		}
		this.sale = quantity ;
	}
}

