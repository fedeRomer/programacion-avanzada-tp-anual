package com.AppFrontendPantallas.Pantallas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Aerilinea Avazada");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 204, 0));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(12, 12, 426, 364);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("User name");
		lblNewLabel.setForeground(new Color(0, 204, 0));
		lblNewLabel.setBounds(220, 31, 171, 15);
		
		textField = new JTextField();
		textField.setBounds(220, 52, 171, 19);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(389, 69, 1, 2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(336, 89, 1, 2);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setForeground(new Color(0, 204, 0));
		lblNewLabel_1.setBounds(220, 97, 153, 15);
		
		textField_1 = new JTextField();
		textField_1.setBounds(220, 118, 170, 19);
		textField_1.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(390, 135, 1, 2);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(new Color(0, 204, 0));
		lblNewLabel_2.setBounds(225, 165, 147, 15);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(225, 186, 166, 19);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(203, 219, 1, 2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Retry password");
		lblNewLabel_2_1.setForeground(new Color(0, 204, 0));
		lblNewLabel_2_1.setBounds(225, 245, 166, 15);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(225, 266, 166, 19);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(0, 204, 0));
		btnNewButton.setBounds(225, 328, 166, 25);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon(Login.class.getResource("/com/AppFrontendPantallas/Imagenes/aviones.jpg")));
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setBounds(28, 12, 179, 325);
		panel.setLayout(null);
		panel.add(btnNewButton);
		panel.add(lblNewLabel_3);
		panel.add(separator_3);
		panel.add(textField);
		panel.add(separator);
		panel.add(lblNewLabel);
		panel.add(lblNewLabel_1);
		panel.add(textField_1);
		panel.add(separator_2);
		panel.add(passwordField);
		panel.add(lblNewLabel_2);
		panel.add(passwordField_1);
		panel.add(lblNewLabel_2_1);
		panel.add(separator_1);
	}
}
