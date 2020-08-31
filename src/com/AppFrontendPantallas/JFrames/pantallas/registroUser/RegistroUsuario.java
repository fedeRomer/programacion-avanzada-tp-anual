package com.AppFrontendPantallas.JFrames.pantallas.registroUser;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import com.AppFrontendPantallas.JFrames.pantallas.login.Loginprincipal;
import com.toedter.calendar.JCalendar;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;

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
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	
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
		apellido.setBounds(22, 62, 70, 15);
		contentPane.add(apellido);
		
		JLabel email = new JLabel("Email");
		email.setForeground(Color.WHITE);
		email.setBounds(295, 105, 70, 19);
		contentPane.add(email);
		
		JLabel password = new JLabel("Password");
		password.setForeground(Color.WHITE);
		password.setBounds(22, 107, 70, 15);
		contentPane.add(password);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(120, 60, 128, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(360, 105, 128, 19);
		contentPane.add(textField_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(120, 105, 128, 19);
		contentPane.add(passwordField);
		
		JLabel retry = new JLabel("Retry");
		retry.setForeground(Color.WHITE);
		retry.setBounds(295, 60, 70, 19);
		contentPane.add(retry);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(360, 60, 128, 19);
		contentPane.add(passwordField_1);
		
		JLabel dni = new JLabel("Dni");
		dni.setForeground(Color.WHITE);
		dni.setBounds(295, 12, 70, 15);
		contentPane.add(dni);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(360, 10, 128, 19);
		contentPane.add(textField_3);
		
		JLabel cuit = new JLabel("Cuit/Cuil");
		cuit.setForeground(Color.WHITE);
		cuit.setBounds(22, 167, 70, 15);
		contentPane.add(cuit);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(120, 165, 128, 19);
		contentPane.add(textField_4);
		
		JLabel fecha = new JLabel("Fecha de nacimiento");
		fecha.setForeground(Color.WHITE);
		fecha.setBounds(571, 12, 159, 15);
		contentPane.add(fecha);
		
		JButton continuar = new JButton("Continuar");
		continuar.addActionListener(this);
		continuar.setFont(new Font("Dialog", Font.BOLD, 14));
		continuar.setForeground(Color.WHITE);
		continuar.setBackground(new Color(0, 128, 0));
		continuar.setBounds(420, 429, 117, 25);
		contentPane.add(continuar);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.addActionListener(this);
		cancelar.setFont(new Font("Dialog", Font.BOLD, 14));
		cancelar.setForeground(Color.WHITE);
		cancelar.setBackground(Color.RED);
		cancelar.setBounds(232, 429, 117, 25);
		contentPane.add(cancelar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(295, 310, 170, 24);
		comboBox.addItem("Telefono...");
		comboBox.addItem("Telefono Personal");
		comboBox.addItem("Telefono Celular");
		comboBox.addItem("Telefono Laboral");

		contentPane.add(comboBox);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(477, 313, 128, 19);
		contentPane.add(textField_5);
		
		JLabel label = new JLabel("");
		
		JLabel label_1 = new JLabel("");
		
		JLabel label_2 = new JLabel("");
		
		JLabel label_3 = new JLabel("");
		
		JLabel label_4 = new JLabel("");
		
		JLabel label_5 = new JLabel("");
		
		JLabel label_6 = new JLabel("");
		
		JLabel Numero = new JLabel("Numero");
		Numero.setForeground(Color.WHITE);
		Numero.setBounds(22, 244, 70, 15);
		contentPane.add(Numero);
		
		JLabel Categoria = new JLabel("Categoria");
		Categoria.setForeground(Color.WHITE);
		Categoria.setBounds(279, 244, 70, 15);
		contentPane.add(Categoria);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(120, 240, 128, 19);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(383, 242, 128, 19);
		contentPane.add(textField_7);
		
		JComboBox aerolineacombo = new JComboBox();
		aerolineacombo.setBounds(639, 239, 135, 24);
		aerolineacombo.addItem("aerolineas...");
		contentPane.add(aerolineacombo);
		
		JComboBox alianzacombo = new JComboBox();
		alianzacombo.setBounds(120, 310, 128, 24);
		alianzacombo.addItem("alianza...");
		contentPane.add(alianzacombo);
		
		JLabel aerolineas = new JLabel("Aerolineas");
		aerolineas.setForeground(Color.WHITE);
		aerolineas.setBounds(543, 244, 117, 15);
		contentPane.add(aerolineas);
		
		JLabel alianza = new JLabel("Alianza");
		alianza.setForeground(Color.WHITE);
		alianza.setBounds(22, 315, 70, 15);
		contentPane.add(alianza);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(519, 39, 265, 159);
		contentPane.add(calendar);
		
		JLabel icono = new JLabel("");
		icono.setIcon(new ImageIcon(RegistroUsuario.class.getResource("/com/AppFrontendPantallas/Imagenes/6247308225_6aedf3cbb3_b.jpg")));
		icono.setBounds(-77, -73, 898, 551);
		contentPane.add(icono);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if("Cancelar".equals(e.getActionCommand())) {
			Loginprincipal principal = new Loginprincipal();
			principal.setVisible(true);
			this.dispose();
		}
		
		else if("Continuar".equals(e.getActionCommand())){
			RegistroUsuario2 registro2 = new RegistroUsuario2();
			registro2.setVisible(true);
			this.dispose();
		}
		
		
				
	}
}
