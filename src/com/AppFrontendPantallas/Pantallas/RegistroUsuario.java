package com.AppFrontendPantallas.Pantallas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import com.toedter.calendar.JCalendar;

public class RegistroUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroUsuario frame = new RegistroUsuario();
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
	public RegistroUsuario() {
		setTitle("Registro de Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBounds(22, 12, 70, 15);
		contentPane.add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(120, 10, 128, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setForeground(Color.WHITE);
		lblApellido.setBounds(323, 12, 70, 15);
		contentPane.add(lblApellido);
		
		JLabel lblNombre_1_1 = new JLabel("Email");
		lblNombre_1_1.setForeground(Color.WHITE);
		lblNombre_1_1.setBounds(22, 39, 70, 19);
		contentPane.add(lblNombre_1_1);
		
		JLabel lblNombre_1_1_1 = new JLabel("Password");
		lblNombre_1_1_1.setForeground(Color.WHITE);
		lblNombre_1_1_1.setBounds(22, 74, 70, 15);
		contentPane.add(lblNombre_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(411, 10, 128, 19);
		contentPane.add(textField_1);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(22, 151, 253, 143);
		contentPane.add(calendar);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(120, 41, 128, 19);
		contentPane.add(textField_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(120, 72, 128, 19);
		contentPane.add(passwordField);
		
		JLabel lblNombre_1_1_1_1 = new JLabel("Retry");
		lblNombre_1_1_1_1.setForeground(Color.WHITE);
		lblNombre_1_1_1_1.setBounds(323, 66, 70, 19);
		contentPane.add(lblNombre_1_1_1_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(411, 72, 128, 19);
		contentPane.add(passwordField_1);
		
		JLabel lblNombre_1_1_2 = new JLabel("Dni");
		lblNombre_1_1_2.setForeground(Color.WHITE);
		lblNombre_1_1_2.setBounds(323, 39, 70, 15);
		contentPane.add(lblNombre_1_1_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(411, 41, 128, 19);
		contentPane.add(textField_3);
		
		JLabel lblNombre_1_1_2_1 = new JLabel("Cuit/Cuil");
		lblNombre_1_1_2_1.setForeground(Color.WHITE);
		lblNombre_1_1_2_1.setBounds(22, 108, 70, 15);
		contentPane.add(lblNombre_1_1_2_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(120, 103, 128, 19);
		contentPane.add(textField_4);
		
		JLabel lblNombre_1_1_2_1_1 = new JLabel("Fecha de nacimiento");
		lblNombre_1_1_2_1_1.setForeground(Color.WHITE);
		lblNombre_1_1_2_1_1.setBounds(22, 135, 159, 15);
		contentPane.add(lblNombre_1_1_2_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(RegistroUsuario.class.getResource("/com/AppFrontendPantallas/Imagenes/6247308225_6aedf3cbb3_b.jpg")));
		lblNewLabel.setBounds(-65, -50, 872, 551);
		contentPane.add(lblNewLabel);
	}
}
