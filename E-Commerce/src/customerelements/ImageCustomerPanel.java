/**
 * Simply Image Renderer
 */

package customerelements;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class ImageCustomerPanel extends JPanel {

	// Backgrouund
	private static final int R = 222 ;
	private static final int G = 38 ;
	private static final int B = 38 ;
	private Color backgroundColor ;
	
	private String imagePath = null ;
	
	
	public ImageCustomerPanel() {
		super() ;
		backgroundColor = new Color(222, 38, 38) ;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		if (imagePath == null) {
			g.setColor(backgroundColor) ;
			
 		} else {
			Toolkit t = Toolkit.getDefaultToolkit() ;
			Image newImage = t.getImage(imagePath) ;
			g.drawImage(newImage, 0, 0, getWidth(), getHeight(), null) ;
		}
	}
	
	public void setImage(String imagePath) {
		this.imagePath = imagePath ;
		
		repaint() ;
	}
	
}