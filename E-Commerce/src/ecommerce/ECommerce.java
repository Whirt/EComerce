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

package ecommerce ;

import javax.swing.JFrame;
import javax.swing.JLabel;

import mainframe.AdminFrame;
import mainframe.Frame;
import table.ECommerceTable;
import user.User;
import user.UserType;

public class ECommerce {
	
	// Possible way of working
	private User user ;
	
	public ECommerce(User user) {
		this.user = user ; 
		
		Frame mainFrame = new Frame() ;
		if (user.getType() == UserType.ADMINISTRATOR)
			mainFrame = new AdminFrame(user.getUsername() + " ECommerce home") ;
		else if (user.getType() == UserType.CUSTOMER) ;
			// not implemented yet
		
		
		// Occasione per sfruttare il polimorfismo
		// In base a user esegui la stessa implementazione!
		
		/**
		 * ECommerceFrame in base al tipo di utente costruirà in modi
		 * differenti per usermode e modalità utente
		 * 
		 * L'idea è creare due oggetti di tipo ECommerce,
		 * ECommerce Panel, ECommerce Table, ECommerce Commands
		 * sono i tre elementi che devono raccogliere i principali
		 * elementi della pagina di ecommerce
		 */
	}
	
	private ECommerce() {
		// user must be definied!
	}
	
	
}
