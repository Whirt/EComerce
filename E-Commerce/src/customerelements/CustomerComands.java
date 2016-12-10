package customerelements;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import table.ECommerceTable;

public class CustomerComands extends JPanel implements ActionListener {
	
	private static final int TXTMAXLEN = 15 ;
	
	// background color 
	private static final Color backgroundColor = new Color(222, 38, 38) ;
	private static final Color innerColor = new Color(215, 67, 67) ;
	
	// this class button do work on table content
	private ECommerceTable table ;
	
	// components
	private JLabel nameLabel ;
	private JLabel brandLabel ;
	private JLabel codeLabel ;
	private JLabel quantityLabel ;
	private JLabel priceLabel ;
	private JTextField nameTextField ;
	// ... 1:04 9/12/16
	
	public CustomerComands(ECommerceTable table) {
		super() ;
		
		this.table = table ;
		
		// panel components
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}