/**
 * TableHeader contains search bar, chart icon, and char elements counter.
 */

package table;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TableHeader extends JPanel implements ActionListener {

	// background color
	private static final int R = 43 ;
	private static final int G = 105 ;
	private static final int B = 210 ;
	private Color backgroundColor ;
	
	private static final int MAXSEARCHLEN = 15 ;
	
	// panel components
	private JLabel searchLabel ;
	private JTextField searchField ;
	private ImageIcon searchIcon ;
	private JButton searchButton ;
	
	// container panel layout
	private FlowLayout layout ;
	
	public TableHeader() {
		super() ;
		// setting color
		backgroundColor = new Color(R, G, B) ;
		
		// creating components
		searchLabel = new JLabel("Search") ;
		searchField = new JTextField("", 15) ;
		searchField.setEditable(true) ;
		searchField.setBackground(Color.WHITE) ;
		
		// button and icon handling
		searchIcon = new ImageIcon("./media/searchIcon.png") ;
		searchButton = new JButton() ;
		searchButton.setBorderPainted(false) ;
		searchButton.setBackground(backgroundColor) ;
		searchButton.addActionListener(this) ;
		searchButton.setIcon(searchIcon) ;
		
		// mixing up
		layout = new FlowLayout(FlowLayout.LEFT) ;
		setLayout(layout) ;
		add(searchLabel) ;
		add(searchField) ;
		add(searchButton) ;
		
		setVisible(true) ;
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(backgroundColor) ;
		g.fillRect(0, 0, getWidth(), getHeight()) ;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource() ;
		if (source == searchButton)
			System.out.println("Search Button pressed") ;	
	}

}
