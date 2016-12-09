/**
 * ECommerce is the main program state.
 * 
 * Any state of this software pass through ECommerce to communicate
 * to each other.
 * 
 * ECommerce class represents the program functionalities core.
 * It's also E-Commerce's home. It shows different option and commands
 * depending on which Operative Mode is previously selected.
 * 
 * @author Hu Jia Cheng
 */

package frame;

import javax.swing.JFrame;

import user.User;

public class ECommerceFrame extends JFrame {
	
	// Possible way of working
	private User user ;
	
	public ECommerceFrame(String title, User user) {
		super(title) ;
		this.user = user ; 
		
		// Occasione per sfruttare il polimorfismo
		// In base a user esegui la stessa implementazione!
		
		/**
		 * ECommerceFrame in base al tipo di utente costruirà in modi
		 * differenti per usermode e modalità utente
		 * tramite il polimorfismo.
		 * 
		 * L'idea è creare due oggetti di tipo ECommerce,
		 * ECommerce Panel, ECommerce Table, ECommerce Commands
		 * sono i tre elementi che devono raccogliere i principali
		 * elementi della pagina di ecommerce
		 */
	}
	public ECommerceFrame() { 
		this("E-Commerce", new User()) ; 
	}
	
	
}
