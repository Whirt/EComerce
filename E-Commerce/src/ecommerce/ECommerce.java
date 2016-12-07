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

package ecommerce;

import javax.swing.JFrame;

import user.User;

public class ECommerce extends JFrame {
	
	// Possible way of working
	private User user ;
	
	public ECommerce(String title, User user) {
		super(title) ;
		this.user = user ; 
		
		// Occasione per sfruttare il polimorfismo
		// In base a user esegui la stessa implementazione!
	}
	public ECommerce() { 
		this("E-Commerce", new User()) ; 
	}
	
	
}