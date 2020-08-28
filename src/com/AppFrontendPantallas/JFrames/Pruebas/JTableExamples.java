package com.AppFrontendPantallas.JFrames.Pruebas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;



public class JTableExamples { 
   
    private  JFrame f; 
    private  JTable j; 

  
  JTableExamples() 
  { 
      // Frame initiallization 
      f = new JFrame(); 

      // Frame Title 
      f.setTitle("JTable Example"); 

      // Data to be displayed in the JTable 
      String[][] data = { /*
          { "Kundan Kumar Jha", "4031", "CSE" }, 
          { "Anand Jha", "6014", "IT" } */
      }; 

      // Column Names 
      String[] columnNames = { "Vuel", "Cantidad", "Destino","Origen","Cod Vuelo" };
      f.getContentPane().setLayout(null);

      // Initializing the JTable 
      j = new JTable(data, columnNames); 
      j.setBounds(30, 40, 200, 300); 

      // adding it to JScrollPane 
      JScrollPane sp = new JScrollPane(j);
      sp.setBounds(0, 113, 776, 321);
      f.getContentPane().add(sp); 
      
      JLabel lblNewLabel = new JLabel("New label");
      lblNewLabel.setIcon(new ImageIcon(JTableExamples.class.getResource("/com/AppFrontendPantallas/Imagenes/737-MAX-8-Peace-Air.jpg")));
      lblNewLabel.setBounds(-839, 0, 1615, 424);
      f.getContentPane().add(lblNewLabel);
      // Frame Size 
      f.setSize(776, 410); 
      // Frame Visible = true 
      f.setVisible(true); 
  } 

  // Driver  method 
  public static void main(String[] args) 
  { 
      new JTableExamples(); 
  } 
} 
