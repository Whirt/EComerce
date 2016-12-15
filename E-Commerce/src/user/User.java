/**
 * The user identify all of people who this software can be used for.
 * The application is developed to support two ways of working
 * - Administrator mode
 * - Customer mode
 * During the account creation process a way can be chosen
 * 
 * @author Jia Cheng Hu
 * @revision 1.0
 */

package user;

import java.io.Serializable;

import product.ListedProduct;
import product.ProductManager;
import table.CartTableModel;

public class User implements Serializable {

	// serial class version unique identifier
	private static final long serialVersionUID = 2064696062064722263L;
	
	private String username ;
	private String password ;

	private ProductManager<ListedProduct> cartProducts ;
	
	private UserType type ;
	
	// Constructor
	public User(String username, String password, UserType type,
				ProductManager<ListedProduct> cartProducts) 
	throws IllegalArgumentException {
		if (username == null || password == null ||
			username.equals("") || password.equals(""))
			throw new IllegalArgumentException() ;
		
		this.username = username ;
		this.password = password ;
		this.cartProducts = cartProducts ;
		this.type = type ;
	}
	public User(String username, String password, UserType type) {
		this(username, password, type, 
				new ProductManager<ListedProduct>()) ;
	}
	public User() { this("user", "user", UserType.CUSTOMER) ; }
	
	// getters
	public String getUsername() {
		return username ;
	}
	public String getPassword() {
		return password ;
	}
	public ProductManager<ListedProduct> getCartProduct() {
		return cartProducts ;
	}
	public UserType getType() {
		return type ;
	}
	
}
