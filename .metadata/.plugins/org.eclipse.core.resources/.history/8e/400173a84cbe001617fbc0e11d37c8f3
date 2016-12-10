package panel;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class AdminPanel extends JPanel {

	private Image background ;
	private BoxLayout layout ;
	
	// private searchBar bar ;
	// private Jtable
	
	public AdminPanel() {
		super() ;
		Toolkit t = Toolkit.getDefaultToolkit() ;
		background = t.getImage("./media/adminFrame.jpeg") ;
		
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(background, 0, 0, getWidth(), getHeight(), null) ;
	}
}
