package panel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProductHandlePanel extends JPanel implements ActionListener {

	private static final int TXTMAXLEN = 15 ;
	private static final int RIGHTPANELWIDTH = 200 ;
	private static final int RIGHTPANELHEIGHT = 100 ;
	
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
	private BoxLayout leftLayout ;
	
	public ProductHandlePanel() {
		super() ;
		
		// right panel component
		nameLabel = new JLabel("Name") ;
		nameTxtField = new JTextField("", TXTMAXLEN) ;
		nameTxtField.setEditable(true) ;
		modifyButton = new JButton("Modify") ;
		modifyButton.addActionListener(this) ;
		removeButton = new JButton("Remove") ;
		removeButton.addActionListener(this) ;
		outcomeLabel = new JLabel("Outcome") ;
		outcomeTxtField = new JTextField("", TXTMAXLEN*7/8) ;
		outcomeTxtField.setEditable(false) ;
		rightPanel = new JPanel() ;
		rightLayout = new FlowLayout(FlowLayout.TRAILING) ;
		rightPanel.setPreferredSize(new Dimension(RIGHTPANELWIDTH,
												  RIGHTPANELHEIGHT));
		rightPanel.setLayout(rightLayout) ;
		rightPanel.add(nameLabel) ;
		rightPanel.add(nameTxtField) ;
		rightPanel.add(modifyButton) ;
		rightPanel.add(removeButton) ;
		rightPanel.add(outcomeLabel) ;
		rightPanel.add(outcomeTxtField) ;
		
		// left panel components
		insertButton = new JButton("Insert") ;
		saveButton = new JButton("Save") ;
		loadButton = new JButton("Load") ;
		leftPanel = new JPanel() ;
		leftLayout = new BoxLayout(leftPanel, BoxLayout.Y_AXIS) ;
		leftPanel.setLayout(leftLayout) ;
		leftPanel.add(insertButton) ;
		leftPanel.add(saveButton) ;
		leftPanel.add(loadButton) ;
		
		// mixing up
		FlowLayout layout = new FlowLayout() ;
		setLayout(layout) ;
		add(rightPanel) ;
		add(leftPanel) ;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
}