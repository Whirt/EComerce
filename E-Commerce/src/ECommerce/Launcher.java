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
 * 
 * The project was committed by Giacomo Cabri,
 * and developed by Jia Cheng Hu
 * 
 * Object Oriented Paradigm - Programmazione ad Oggetti
 * UniMORE, Math Department year: 2016/2017
 * 
 * @author Jia Cheng Hu
 */

package ECommerce;

import login.LoginFrame;
import user.User;
import user.UserType;

public class Launcher {

	public static void main(String[] args) {
		
		// Funzionamento originale, togliere commenti per il prodotto "finale"
		// LoginFrame mainFrame = new LoginFrame("Login E-Commerce") ;
		
		// Simulazione solo della parte interna di home
		User user1 = new User("Paolo", "asfasf", UserType.ADMINISTRATOR) ;
		User user2 = new User("Angelo", "asfasf", UserType.CUSTOMER) ;
		ECommerce ec = new ECommerce("E-Commerce", user1) ;
		
		
	}
	
}