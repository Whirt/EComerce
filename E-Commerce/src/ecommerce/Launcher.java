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

import frame.Frame;
import login.LoginFrame;
import product.Product;
import product.ProductType;
import table.ECommerceTable;
import user.User;
import user.UserType;

public class Launcher {

	public static void main(String[] args) {
		
		// Funzionamento originale, togliere commenti per il prodotto "finale"
		// LoginFrame mainFrame = new LoginFrame("Login E-Commerce") ;
		
		// Simulazione solo della parte interna di home
		//User user1 = new User("Paolo", "asfasf", UserType.ADMINISTRATOR) ;
		//User user2 = new User("Angelo", "asfasf", UserType.CUSTOMER) ;
		//ECommerce ec = new ECommerce("E-Commerce", user1) ;
		
		Frame frame = new Frame() ;
		
		ECommerceTable table = new ECommerceTable() ;

		frame.setContentPane(table) ;
		
		try {
		Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Interrupt") ;
		}
		
		frame.setVisible(true) ;
		

		try {
		Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Interrupt") ;
		}
		
		Product newProd = new Product
				("Pc", "Hp", "1232sl", ProductType.ELECTRONICS,
				 3500F, null, 1) ;
		
		table.addProduct(newProd) ;
		
		
		
	}
	
}
