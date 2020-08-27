package com.AppFrontendPantallas.Pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class RegistroUsuario2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroUsuario2 frame = new RegistroUsuario2();
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
	public RegistroUsuario2() {
		setTitle("Aerolinea Avazada");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 204, 0));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, -14, 666, 415);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Dni");
		lblNewLabel.setBounds(436, 21, 95, 19);
		lblNewLabel.setForeground(new Color(255, 102, 0));
		
		JTextField textField = new JTextField();
		textField.setBounds(436, 52, 171, 19);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(563, 69, -173, 2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(336, 89, 1, 2);
		
		JLabel lblNewLabel_1 = new JLabel("Cuit/Cuil");
		lblNewLabel_1.setBounds(443, 98, 153, 15);
		lblNewLabel_1.setForeground(new Color(255, 102, 0));
		
		JTextField textField_1 = new JTextField();
		textField_1.setBounds(439, 125, 170, 19);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha nacimiento");
		lblNewLabel_2.setBounds(443, 170, 147, 15);
		lblNewLabel_2.setForeground(new Color(255, 102, 0));
		
		JLabel lblNewLabel_2_1 = new JLabel("Telefono");
		lblNewLabel_2_1.setBounds(441, 256, 166, 15);
		lblNewLabel_2_1.setForeground(new Color(255, 102, 0));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(0, 12, 371, 391);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon(RegistroUsuario1.class.getResource("/com/AppFrontendPantallas/Imagenes/aviones.jpg")));
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		panel.setLayout(null);
		panel.add(lblNewLabel_3);
		panel.add(textField);
		panel.add(separator);
		panel.add(lblNewLabel);
		panel.add(lblNewLabel_1);
		panel.add(textField_1);
		panel.add(lblNewLabel_2);
		panel.add(lblNewLabel_2_1);
		panel.add(separator_1);
		
		JButton btnNewButton_1 = new JButton("Continue");
		btnNewButton_1.setBounds(456, 353, 123, 24);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(new Color(204, 51, 0));
		panel.add(btnNewButton_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(437, 283, 170, 19);
		panel.add(textField_2);
	}
}
