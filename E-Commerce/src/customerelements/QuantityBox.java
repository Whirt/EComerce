package customerelements;

import javax.swing.JComboBox;

public class QuantityBox extends JComboBox {

	public QuantityBox() {
		super() ;
		for (int i = 1 ; i <= 100 ; i++) {
			addItem(new Integer(i)) ;
		}
	}
}
