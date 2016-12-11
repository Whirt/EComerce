package adminelements;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import table.ECommerceTable;

public class ModifyProductFrame extends ProductHandlerFrame 
								implements ActionListener {
	
	private static final int TXTMAXLEN = 15 ;
	
	private JButton confirmButton ;
	private JLabel outcomeLabel ;
	private JTextField outcomeTextField ;
	
	public ModifyProductFrame(String title, ECommerceTable productTable) {
		super(title, productTable) ;
	
		confirmButton = new JButton("Confirm") ;
		confirmButton.addActionListener(this) ;
		outcomeLabel = new JLabel("Outcome") ;
		outcomeTextField = new JTextField("", TXTMAXLEN) ;
		outcomeTextField.setEditable(false) ;
		
		add(outcomeLabel) ;
		add(outcomeTextField) ;
		add(confirmButton) ;
	}
	public ModifyProductFrame(ECommerceTable productTable) {
		super(productTable) ;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
