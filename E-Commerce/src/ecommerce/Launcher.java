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

import javax.swing.BoxLayout;

import adminelements.AdminCommands;
import login.LoginFrame;
import mainframe.AdminFrame;
import mainframe.CustomerFrame;
import mainframe.Frame;
import product.Product;
import product.ProductType;
import table.ECommerceTable;
import table.TableHeader;
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
		
		Frame frame = new CustomerFrame() ;
		
		try {
		Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupt") ;
		}
		
		frame.pack();
		frame.setVisible(true) ;
	}
	
}
