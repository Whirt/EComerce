package ECommerce;

import login.LoginFrame;

public class ECommerce {

	public static void main(String[] args) {
		
		LoginFrame frame = new LoginFrame("Login") ;
		
		try {
			Thread.sleep(1000) ;
		} catch (InterruptedException e) {
			System.out.println("Interrupted") ;
		}
		
		frame.setVisible(true) ;
	}
}
