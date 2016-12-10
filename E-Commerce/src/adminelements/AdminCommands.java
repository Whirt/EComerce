package adminelements;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import product.Product;
import product.ProductType;
import table.ECommerceTable;

public class AdminCommands extends JPanel implements ActionListener {

	private static final int TXTMAXLEN = 15 ;
	// background color 
	private static final Color backgroundColor = new Color(222, 38, 38) ;
	private static final Color innerColor = new Color(215, 67, 67) ;
	
	// this class button do work on table content
	private ECommerceTable table ;
	
	// title
	private JLabel titleLabel ;
	
	// Right Panel components
	private JLabel nameLabel ;
	private JTextField nameTxtField ;
	private JButton modifyButton ;
	private JButton removeButton ;
	private JLabel outcomeLabel ;
	private JTextField outcomeTxtField ;
	private JPanel rightPanel ;
	private FlowLayout rightLayout ;

	// Left Panel components
	private JButton insertButton ;
	private JButton saveButton ;
	private JButton loadButton ;
	private JPanel leftPanel ;
	private FlowLayout leftLayout ;
	
	public AdminCommands(ECommerceTable table) {
		super() ;
		
		this.table = table ;
		
		//title settings
		titleLabel = new JLabel("ADMINISTRATOR COMANDS BOARD") ;
		titleLabel.setForeground(Color.WHITE) ;
		titleLabel.setFont(new Font(null, Font.BOLD, 20)) ;
		
		// right panel component
		nameLabel = new JLabel("Name") ;
		nameLabel.setBackground(backgroundColor) ;
		nameLabel.setForeground(Color.WHITE) ;
 		nameTxtField = new JTextField("", TXTMAXLEN) ;
		nameTxtField.setEditable(true) ;
		modifyButton = new JButton("Modify") ;
		modifyButton.addActionListener(this) ;
		removeButton = new JButton("Remove") ;
		removeButton.addActionListener(this) ;
		outcomeLabel = new JLabel("Outcome") ;
		outcomeLabel.setBackground(backgroundColor) ;
		outcomeLabel.setForeground(Color.WHITE) ;
		outcomeTxtField = new JTextField("", TXTMAXLEN*7/8) ;
		outcomeTxtField.setEditable(false) ;
		// setting up right Panel
		rightPanel = new JPanel() {
			// Setting inner panel color
			@Override
			protected void paintComponent(Graphics g) {
				g.setColor(innerColor) ;
				g.fillRect(0, 0, getWidth(), getHeight());
			}
		} ;
		rightLayout = new FlowLayout(FlowLayout.CENTER) ;
		rightPanel.setLayout(rightLayout) ;
		rightPanel.add(nameLabel) ;
		rightPanel.add(nameTxtField) ;
		rightPanel.add(modifyButton) ;
		rightPanel.add(removeButton) ;
		rightPanel.add(outcomeLabel) ;
		rightPanel.add(outcomeTxtField) ;
		
		// left panel components
		insertButton = new JButton("Insert") ;
		insertButton.addActionListener(this) ;
		saveButton = new JButton("Save") ;
		saveButton.addActionListener(this) ;
		loadButton = new JButton("Load") ;
		loadButton.addActionListener(this) ;
		// setting up left panel
		leftPanel = new JPanel() {
			// Setting red background
			@Override
			protected void paintComponent(Graphics g) {
				g.setColor(backgroundColor) ;
				g.fillRect(0, 0, getWidth(), getHeight());
			}
		} ;
		leftLayout = new FlowLayout(FlowLayout.CENTER) ;
		leftPanel.setLayout(leftLayout) ;
		leftPanel.add(insertButton) ;
		leftPanel.add(saveButton) ;
		leftPanel.add(loadButton) ;
		
		// mixing all up
		BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS) ;
		setLayout(layout) ;
		add(titleLabel) ;
		add(rightPanel) ;
		add(leftPanel) ;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource() ;
		if (source == insertButton) {
			// Test
			Product newProd = new Product
					("Pc", "Hp", "1232sl", ProductType.ELECTRONICS,
					 3500F, null) ;
			table.addProduct(newProd) ;
		}	
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// painting outermost panel background color 
		g.setColor(backgroundColor) ;
		g.fillRect(0, 0, getWidth(), getHeight()) ;
	}
}
