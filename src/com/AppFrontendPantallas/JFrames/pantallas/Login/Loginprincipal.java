package com.AppFrontendPantallas.JFrames.pantallas.Login;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.AppFrontendPantallas.JFrames.pantallas.registroUser.RegistroUsuario;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Loginprincipal extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
    private JTextField textField;
    private JPasswordField password;
    private JButton btnLogin;
    private JButton btnRegistrarse;   
    
    
	public Loginprincipal() {
		
		setVisible(true);
		setResizable(false);		
		setTitle("Aerolinea Avazada");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 422);
	    IniciarTodo();	
	 }
	
	public void panel() {
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);}
	
	public void Textname() {
		JLabel Usernametext = new JLabel("User name");
		Usernametext.setFont(new Font("Dialog", Font.BOLD, 20));
		Usernametext.setForeground(Color.WHITE);
		Usernametext.setBounds(202, 47, 167, 25);
		panel.add(Usernametext);}
	
	public void ingresoname() {
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.GRAY);
		textField.setBounds(202, 82, 167, 25);
		panel.add(textField);
		textField.setColumns(10);
	}
	
	public void Textpass(){	
		JLabel passwordtext = new JLabel("Password");
		passwordtext.setForeground(Color.WHITE);
		passwordtext.setFont(new Font("Dialog", Font.BOLD, 20));
		passwordtext.setBounds(202, 162, 167, 25);
		panel.add(passwordtext);
		}
	
	public void ingresopass() { 	
		password = new JPasswordField();
		password.setFont(new Font("Dialog", Font.PLAIN, 14));
		password.setForeground(Color.WHITE);
		password.setBackground(new Color(128, 128, 128));
		password.setBounds(202, 203, 167, 25);
		panel.add(password);}
   
	public void Botonlogin() {
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(this);
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(0, 255, 0));
		btnLogin.setFont(new Font("Dialog", Font.BOLD, 18));
		btnLogin.setBounds(368, 323, 117, 25);
		panel.add(btnLogin);
		}
	
	
	public void BotonRegistro() {
		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(this);
		btnRegistrarse.setForeground(new Color(255, 255, 255));
		btnRegistrarse.setBackground(new Color(0, 0, 255));
		btnRegistrarse.setFont(new Font("Dialog", Font.BOLD, 18));	
		btnRegistrarse.setBounds(107, 323, 152, 25);
		panel.add(btnRegistrarse);}
	
	
	public void Icono() {
		JLabel icono = new JLabel("");
		icono.setFont(new Font("Dialog", Font.BOLD, 14));
		icono.setVerticalAlignment(SwingConstants.TOP);
		icono.setIcon(new ImageIcon(Loginprincipal.class.getResource("/com/AppFrontendPantallas/Imagenes/aviones.jpg")));
		icono.setBounds(0, -28, 598, 413);
		panel.add(icono);
	}

   public void IniciarTodo() {
	   
	   panel();
	   Textname();
	   ingresoname();
	   Textpass();
	   ingresopass();
	   Botonlogin();
	   BotonRegistro();
	   Icono();
   }
	
  
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if("Registrarse".equals(e.getActionCommand())) {
			RegistroUsuario registro = new RegistroUsuario();
			registro.setVisible(true);
			this.dispose();
		}
		
		else if ("Login".equals(e.getActionCommand())) {
			  
			System.out.println("Login");
		   
		} 		
	}
}