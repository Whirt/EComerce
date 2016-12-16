package adminelements;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import IO.ErrorValue;
import IO.IOPath;
import IO.ObjectWR;
import product.Product;
import product.ProductManager;
import table.ECommerceTable;

public class AdminCommands extends JPanel implements ActionListener {

	private static final int TXTMAXLEN = 15 ;
	private static final Color backgroundColor = new Color(222, 38, 38) ;
	private static final Color innerColor = new Color(215, 67, 67) ;
	
	protected ECommerceTable ecommerceTable ;
	
	// title
	private JLabel titleLabel ;
	
	// right Panel components
	private JLabel nameLabel ;
	private JTextField nameTextField ;
	private JButton modifyButton ;
	private JButton removeButton ;
	private JLabel outcomeLabel ;
	private JTextField outcomeTextField ;
	private JPanel rightPanel ;
	private FlowLayout rightLayout ;

	// left Panel components
	private JButton insertButton ;
	private JButton saveButton ;
	private JButton loadButton ;
	private JPanel leftPanel ;
	private FlowLayout leftLayout ;
	
	public AdminCommands(ECommerceTable ecommerceTable) {
		super() ;
		
		this.ecommerceTable = ecommerceTable ;
		
		// setting up title
		titleLabel = new JLabel("ADMINISTRATOR COMANDS BOARD") ;
		titleLabel.setForeground(Color.WHITE) ;
		titleLabel.setFont(new Font(null, Font.BOLD, 20)) ;
		
		// right panel component
		nameLabel = new JLabel("Name") ;
		nameLabel.setBackground(backgroundColor) ;
		nameLabel.setForeground(Color.WHITE) ;
 		nameTextField = new JTextField("", TXTMAXLEN) ;
		nameTextField.setEditable(true) ;
		modifyButton = new JButton("Modify") ;
		modifyButton.addActionListener(this) ;
		removeButton = new JButton("Remove") ;
		removeButton.addActionListener(this) ;
		outcomeLabel = new JLabel("Outcome") ;
		outcomeLabel.setBackground(backgroundColor) ;
		outcomeLabel.setForeground(Color.WHITE) ;
		outcomeTextField = new JTextField("", TXTMAXLEN) ;
		outcomeTextField.setEditable(false) ;
		// setting up right Panel
		rightPanel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.setColor(innerColor) ;
				g.fillRect(0, 0, getWidth(), getHeight());
			}
		} ;
		rightLayout = new FlowLayout(FlowLayout.CENTER) ;
		rightPanel.setLayout(rightLayout) ;
		rightPanel.add(nameLabel) ;
		rightPanel.add(nameTextField) ;
		rightPanel.add(modifyButton) ;
		rightPanel.add(removeButton) ;
		rightPanel.add(outcomeLabel) ;
		rightPanel.add(outcomeTextField) ;
		
		// left panel components
		insertButton = new JButton("Insert") ;
		insertButton.addActionListener(this) ;
		saveButton = new JButton("Save") ;
		saveButton.addActionListener(this) ;
		loadButton = new JButton("Load") ;
		loadButton.addActionListener(this) ;
		// setting up left panel
		leftPanel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				// Setting red background
				g.setColor(backgroundColor) ;
				g.fillRect(0, 0, getWidth(), getHeight());
			}
		} ;
		leftLayout = new FlowLayout(FlowLayout.CENTER) ;
		leftPanel.setLayout(leftLayout) ;
		leftPanel.add(insertButton) ;
		leftPanel.add(saveButton) ;
		leftPanel.add(loadButton) ;
		
		// merge into the main panel
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
			System.out.println("Arrivato fin qui!!!!!!") ;
			AddProductFrame addProdFrame = new AddProductFrame(ecommerceTable) ;
			addProdFrame.setVisible(true) ;
			return ;
			/*
			Product newProd = new Product
					("Pc", "Hp", "1232sl", ProductType.ELECTRONICS,
					 3500F,
					 //"./media/logo.png") ;
					 "http://ssl-product-images.www8-hp.com/digmedialib"
					 +"/prodimg/lowres/c05059975.png") ;
			*/
		}
		if (source == saveButton) {
			saveProductManager() ;
			outcomeTextField.setText("Saved Successfully") ;
			return ;
		}
		if (source == loadButton) {
			loadProductManager() ;
			outcomeTextField.setText("Loaded Successfully") ;
			return ;
		}
		
	}
	
	private void saveProductManager() {
		// save product manager into standard product list path
		File file = new File(IOPath.PRODUCTS_PATH) ;
		try {
			ObjectWR.write(ecommerceTable.getProductManager(), file);
		} catch (IOException e) {
			System.err.println("Error during product list save command") ;
			e.printStackTrace() ;
			System.exit(ErrorValue.IO_PRODUCT_FAILED_TO_SAVE_ERROR);
		}
	}
	private void loadProductManager() {
		// load product manager from standard product list path
		File file = new File(IOPath.PRODUCTS_PATH) ;
		if (!file.exists()) {
			System.err.println("Failed attempt to load no existing file") ;
			System.exit(ErrorValue.IO_FILE_NO_EXIST) ;
		}
		
		ProductManager<Product> loadedProducts = null ;
		try { loadedProducts = (ProductManager<Product>)
				ObjectWR.read(file) ;
		} catch (IOException | ClassNotFoundException e) {
			System.err.println("Error during product manager loading") ;
			e.printStackTrace() ;
			System.exit(ErrorValue.IO_PRODUCT_FAILED_TO_LOAD_ERROR) ;
		}
		
		if (loadedProducts == null) {
			System.err.println("Error after product loading") ;
			System.exit(ErrorValue.IO_PRODUCT_FAILED_TO_LOAD_ERROR) ;
		}
		
		ecommerceTable.setProductManager(loadedProducts) ;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// painting outermost panel background color 
		g.setColor(backgroundColor) ;
		g.fillRect(0, 0, getWidth(), getHeight()) ;
	}
}
