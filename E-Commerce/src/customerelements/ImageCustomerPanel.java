/**
 * Simply Image Renderer
 */

package customerelements;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JPanel;

public class ImageCustomerPanel extends JPanel {
	
	private static final int PREFERRED_WIDTH = 200 ;
	private static final int PREFERRED_HEIGHT = 150 ;
	
	// image loader 
	private Toolkit t ;
	private String imagePath ;
	
	public ImageCustomerPanel() {
		super() ;
		imagePath = null ;
		setBackground(Color.WHITE) ;
		setPreferredSize(new Dimension(PREFERRED_WIDTH, PREFERRED_HEIGHT)) ;
		t = Toolkit.getDefaultToolkit() ;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.setColor(Color.WHITE) ;
		g.fillRect(0, 0, PREFERRED_WIDTH, PREFERRED_HEIGHT) ;
		
		if (imagePath != null) {
			URL imgUrl = null ;
			try { imgUrl = new URL(imagePath) ;
			} catch (MalformedURLException e) {
				System.out.println("Url Error") ; e.printStackTrace(); }
			Image newImage = t.getImage(imgUrl) ;
			g.drawImage(newImage, 0, 0, 
					PREFERRED_WIDTH, PREFERRED_HEIGHT, this) ;
		}
	}
	
	public void setImage(String imagePath) {
		this.imagePath = imagePath ;
		repaint() ;
	}
	
}
