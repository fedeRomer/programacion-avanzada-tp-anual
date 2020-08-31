package com.AppFrontendPantallas.JFrames.pantallas.registroUser;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.AppFrontendPantallas.JFrames.pantallas.login.Loginprincipal;


public class RegistroUsuario3 extends JFrame implements ActionListener{

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public RegistroUsuario3() {
		setResizable(false);
		setTitle("Registro de Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton Continuar = new JButton("Menu principal");
		Continuar.addActionListener(this);
		Continuar.setBounds(269, 384, 185, 44);
		contentPane.setLayout(null);
		Continuar.setFont(new Font("Dialog", Font.BOLD, 16));
		Continuar.setForeground(Color.WHITE);
		Continuar.setBackground(new Color(0, 128, 0));
		contentPane.add(Continuar);
		
		JLabel lblNewLabel_1 = new JLabel("Registro con exito !!!"
				+ " vuelva al menu principal para logearse");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_1.setBounds(49, 22, 723, 99);
		contentPane.add(lblNewLabel_1);
		
		JLabel Menu = new JLabel("");
		Menu.setBounds(-147, -67, 1078, 551);
		Menu.setIcon(new ImageIcon(RegistroUsuario.class.getResource("/com/AppFrontendPantallas/Imagenes/6247308225_6aedf3cbb3_b.jpg")));
		contentPane.add(Menu);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if("Menu principal".equals(e.getActionCommand())) {
			Loginprincipal principal = new Loginprincipal();
			principal.setVisible(true);
			this.dispose();}
		
			else{
				System.out.println("hola mundo");
			
		}		
	}
}
