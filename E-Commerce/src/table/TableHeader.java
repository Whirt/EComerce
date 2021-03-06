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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import product.ProductType;

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
	private JLabel fieldLabel ;
	private JComboBox<String> fieldComboBox ;
	private JComboBox<ProductType> categoryComboBox ;
	
	public TableHeader() {
		super() ;
		// setting color
		backgroundColor = new Color(R, G, B) ;
		
		// creating components
		searchLabel = new JLabel("Find") ;
		searchLabel.setForeground(Color.WHITE) ;
		searchField = new JTextField("", MAXSEARCHLEN) ;
		searchField.setEditable(true) ;
		searchField.setBackground(Color.WHITE) ;
		
		// button and icon image handling
		searchIcon = new ImageIcon("./media/searchIcon.png") ;
		searchButton = new JButton() ;
		searchButton.setBorderPainted(false) ;
		searchButton.setBackground(backgroundColor) ;
		searchButton.addActionListener(this) ;
		searchButton.setIcon(searchIcon) ;
		
		// combo box setting
		fieldLabel = new JLabel("Field") ;
		fieldLabel.setForeground(Color.WHITE) ;
		String[] fields = {"Name", "Brand", "Code", "Price", "Quantity"} ;
		fieldComboBox = new JComboBox<String>(fields) ;
		fieldComboBox.addActionListener(this) ;
		categoryComboBox = new JComboBox<ProductType>(ProductType.values()) ;
		categoryComboBox.addActionListener(this) ;
		
		// mixing up
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER) ;
		setLayout(layout) ;
		add(searchLabel) ;
		add(searchField) ;
		add(searchButton) ;
		add(fieldLabel) ;
		add(fieldComboBox) ;
		add(categoryComboBox) ;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
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
