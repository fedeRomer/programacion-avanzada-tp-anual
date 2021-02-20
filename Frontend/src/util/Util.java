package util;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Util extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public static void validarcampos(JTextField e) {
			 
	
	if( e.getText().isEmpty() ) {
		
	  JOptionPane.showMessageDialog(null,"El campo no puede estar vacio","Error",JOptionPane.ERROR_MESSAGE);
	  
	  
	  
	  
	  }	
	 }
	}


