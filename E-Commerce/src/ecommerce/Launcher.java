/**
 * Main Class
 * 
 * The following program is an example of 
 * Object Oriented Programming code structure.
 * Java has been chosen to work with.
 * 
 * This program focus on three Java main OOP features :
 * - Polymorphism 
 * - Inheritance
 * - Encapsulation
 * 
 * The project was committed by Giacomo Cabri,
 * and developed by Jia Cheng Hu
 * 
 * Object Oriented Paradigm - Programmazione ad Oggetti
 * UniMORE, Math Department year: 2016/2017
 * 
 * @author Hu Jia Cheng
 */

package ecommerce;

import adminelements.AddProductFrame;
import adminelements.ProductHandlerFrame;
import login.LoginFrame;
import mainframe.CartFrame;
import mainframe.Frame;
import table.ECommerceTable;
import user.User;
import user.UserType;

public class Launcher {

	public static void main(String[] args) {
		
		// Funzionamento originale, togliere commenti per il prodotto "finale"
		LoginFrame mainFrame = new LoginFrame("Login E-Commerce") ;
		
		//User user = new User("Geo", "asfasf", UserType.ADMINISTRATOR) ;
		//User user = new User("Angelo", "asfasf", UserType.CUSTOMER) ;
		
		//ECommerce frame = new ECommerce(user) ;
		
		//ECommerceTable table  = new ECommerceTable() ;
		//ProductHandlerFrame frame = 
		//		ProductHandlerFrame.getFrame(table) ;
		//CartFrame frame = CartFrame.getCartFrame() ;
		//AddProductFrame frame = new AddProductFrame(table) ;
		
		//frame.setVisible(true) ;
	}
	
}
