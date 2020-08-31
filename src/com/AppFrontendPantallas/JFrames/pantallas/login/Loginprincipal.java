package com.AppFrontendPantallas.JFrames.pantallas.login;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import com.AppFrontendPantallas.JFrames.pantallas.admin.Menuadm;
import com.AppFrontendPantallas.JFrames.pantallas.registroUser.RegistroUsuario;


public class Loginprincipal extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
    private JTextField ingresonombre;
    private JPasswordField ingresopassword;
    private JButton btnLogin;
    private JButton btnRegistrarse;   
    private String usuariohelper;
    private String passhelper;
    
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
		Usernametext.setBounds(216, 27, 167, 25);
		panel.add(Usernametext);}
	
	public void ingresoname() {
		ingresonombre = new JTextField();
		ingresonombre.setForeground(Color.WHITE);
		ingresonombre.setBackground(Color.GRAY);
		ingresonombre.setBounds(216, 64, 167, 25);
		panel.add(ingresonombre);
		ingresonombre.setColumns(10);
	}
	
	public void Textpass(){	
		JLabel passwordtext = new JLabel("Password");
		passwordtext.setForeground(Color.WHITE);
		passwordtext.setFont(new Font("Dialog", Font.BOLD, 20));
		passwordtext.setBounds(216, 120, 167, 25);
		panel.add(passwordtext);
		}
	
	public void ingresopass() { 	
		ingresopassword = new JPasswordField();
		ingresopassword.setFont(new Font("Dialog", Font.PLAIN, 14));
		ingresopassword.setForeground(Color.WHITE);
		ingresopassword.setBackground(new Color(128, 128, 128));
		ingresopassword.setBounds(216, 157, 167, 25);
		panel.add(ingresopassword);}
   
	public void Botonlogin() {
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(this);
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(0, 255, 0));
		btnLogin.setFont(new Font("Dialog", Font.BOLD, 18));
		btnLogin.setBounds(216, 245, 167, 25);
		panel.add(btnLogin);
		}
	
	
	public void BotonRegistro() {
		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(this);
		btnRegistrarse.setForeground(new Color(255, 255, 255));
		btnRegistrarse.setBackground(new Color(0, 0, 255));
		btnRegistrarse.setFont(new Font("Dialog", Font.BOLD, 18));	
		btnRegistrarse.setBounds(434, 336, 152, 25);
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
		
		usuariohelper = ingresonombre.getText();
		passhelper = ingresopassword.getText();
		
		if("Registrarse".equals(e.getActionCommand())) {
			RegistroUsuario registro = new RegistroUsuario();
			registro.setVisible(true);
			this.dispose();
		}
		
		else if (usuariohelper.equals("admin") && passhelper.equals("123")) {		    	
	    	JOptionPane.showMessageDialog(null,"bienvenido " + usuariohelper);
		    Menuadm admin = new Menuadm();
		    admin.setVisible(true);
		    this.dispose();
				
			 }
	    else { JOptionPane.showMessageDialog(null, "Datos incorrectos \nvuelva a intentarlo","Error",JOptionPane.ERROR_MESSAGE); }
			
		   
		} 		
	}
