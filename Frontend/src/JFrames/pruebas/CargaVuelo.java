package JFrames.pruebas;


import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


public class CargaVuelo { 
   
    private  JFrame f; 
    private  JTable j; 

  
  CargaVuelo() 
  { 
      f = new JFrame(); 
      f.setTitle("JTable Example"); 

      String[][] data = {}; 

      String[] columnNames = { "Vuelo", "Cantidad", "Destino","Origen","Cod Vuelo" };
      f.getContentPane().setLayout(null);

      j = new JTable(data, columnNames); 
      j.setBounds(30, 40, 200, 300); 

      JScrollPane sp = new JScrollPane(j);
      sp.setBounds(0, 113, 776, 321);
      f.getContentPane().add(sp); 
      
      JLabel lblNewLabel = new JLabel("New label");
      lblNewLabel.setIcon(new ImageIcon(JTableExample.class.getResource("/com/AppFrontendPantallas/Imagenes/737-MAX-8-Peace-Air.jpg")));
      lblNewLabel.setBounds(-839, 0, 1615, 424);
      f.getContentPane().add(lblNewLabel);
      f.setSize(776, 410); 
      f.setVisible(true); 
  } 

  public static void main(String[] args) 
  { 
      new JTableExample(); 
  } 
} 
