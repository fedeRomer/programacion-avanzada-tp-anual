package com.AppFrontendPantallas.Pantallas;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



public class JTableExample extends JFrame {

	private JPanel contentPane;
	private JTable tabla;
	private JScrollPane scroll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTableExample frame = new JTableExample();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JTableExample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		this.initTable(true);
		this.initTable(false);
	}
	
	private void initTable(boolean withScroll) {
		String[] columnNames = TableHelper.getColumnNames();
		Object[] [] data = TableHelper.getData();
		this.tabla = new JTable(data, columnNames);		
		if(withScroll) {
			this.scroll = new JScrollPane(this.tabla);
			contentPane.add(this.scroll);
		} else {
			contentPane.add(this.tabla);
		}		
	}
	
}


