package com.AppFrontendPantallas.JFrames.pantallas.registroUser;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import com.AppFrontendPantallas.JFrames.pantallas.Login.Loginprincipal;
import com.toedter.calendar.JCalendar;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroUsuario extends JFrame implements ActionListener {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_3;
	private JTextField textField_4;

	
	public RegistroUsuario() {
		setResizable(false);
		setTitle("Registro de Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nombre = new JLabel("Nombre");
		nombre.setForeground(Color.WHITE);
		nombre.setBounds(22, 12, 70, 15);
		contentPane.add(nombre);
		
		textField = new JTextField();
		textField.setBounds(120, 10, 128, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel apellido = new JLabel("Apellido");
		apellido.setForeground(Color.WHITE);
		apellido.setBounds(323, 12, 70, 15);
		contentPane.add(apellido);
		
		JLabel email = new JLabel("Email");
		email.setForeground(Color.WHITE);
		email.setBounds(22, 39, 70, 19);
		contentPane.add(email);
		
		JLabel password = new JLabel("Password");
		password.setForeground(Color.WHITE);
		password.setBounds(22, 74, 70, 15);
		contentPane.add(password);
		
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
		
		JLabel retry = new JLabel("Retry");
		retry.setForeground(Color.WHITE);
		retry.setBounds(323, 66, 70, 19);
		contentPane.add(retry);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(411, 72, 128, 19);
		contentPane.add(passwordField_1);
		
		JLabel dni = new JLabel("Dni");
		dni.setForeground(Color.WHITE);
		dni.setBounds(323, 39, 70, 15);
		contentPane.add(dni);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(411, 41, 128, 19);
		contentPane.add(textField_3);
		
		JLabel cuit = new JLabel("Cuit/Cuil");
		cuit.setForeground(Color.WHITE);
		cuit.setBounds(22, 108, 70, 15);
		contentPane.add(cuit);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(120, 103, 128, 19);
		contentPane.add(textField_4);
		
		JLabel fecha = new JLabel("Fecha de nacimiento");
		fecha.setForeground(Color.WHITE);
		fecha.setBounds(22, 135, 159, 15);
		contentPane.add(fecha);
		
		JButton continuar = new JButton("Continuar");
		continuar.addActionListener(this);
		continuar.setFont(new Font("Dialog", Font.BOLD, 14));
		continuar.setForeground(Color.WHITE);
		continuar.setBackground(new Color(0, 128, 0));
		continuar.setBounds(648, 410, 117, 25);
		contentPane.add(continuar);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.addActionListener(this);
		cancelar.setFont(new Font("Dialog", Font.BOLD, 14));
		cancelar.setForeground(Color.WHITE);
		cancelar.setBackground(Color.RED);
		cancelar.setBounds(460, 410, 117, 25);
		contentPane.add(cancelar);
		
		JLabel Icono2 = new JLabel("");
		Icono2.setIcon(new ImageIcon(RegistroUsuario.class.getResource("/com/AppFrontendPantallas/Imagenes/6247308225_6aedf3cbb3_b.jpg")));
		Icono2.setBounds(-65, -50, 872, 551);
		contentPane.add(Icono2);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if("Cancelar".equals(e.getActionCommand())) {
			Loginprincipal principal = new Loginprincipal();
			principal.setVisible(true);
			this.dispose();
		}
		
		
				
	}
}
