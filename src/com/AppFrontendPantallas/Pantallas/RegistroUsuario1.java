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
import javax.swing.UIManager;
import java.awt.Font;

public class RegistroUsuario1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroUsuario1 frame = new RegistroUsuario1();
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
	public RegistroUsuario1() {
		setTitle("Aerilinea Avazada");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 204, 0));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, -14, 642, 399);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("User name");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel.setBounds(199, 43, 147, 19);
		lblNewLabel.setForeground(Color.WHITE);
		
		textField = new JTextField();
		textField.setForeground(new Color(240, 248, 255));
		textField.setBackground(Color.DARK_GRAY);
		textField.setBounds(184, 74, 171, 19);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2.setBounds(199, 140, 132, 15);
		lblNewLabel_2.setForeground(Color.WHITE);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(240, 248, 255));
		passwordField.setFont(new Font("Dialog", Font.PLAIN, 18));
		passwordField.setBackground(Color.DARK_GRAY);
		passwordField.setBounds(184, 180, 171, 19);
		panel.setLayout(null);
		panel.add(textField);
		panel.add(lblNewLabel);
		panel.add(passwordField);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton_1_1 = new JButton("Registrarse");
		btnNewButton_1_1.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setBackground(new Color(0, 0, 255));
		btnNewButton_1_1.setBounds(62, 326, 147, 24);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_1.setBounds(338, 326, 123, 24);
		btnNewButton_1.setForeground(new Color(240, 248, 255));
		btnNewButton_1.setBackground(new Color(0, 255, 0));
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(-33, 12, 668, 387);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon(RegistroUsuario1.class.getResource("/com/AppFrontendPantallas/Imagenes/aviones.jpg")));
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		panel.add(lblNewLabel_3);
	}
}
