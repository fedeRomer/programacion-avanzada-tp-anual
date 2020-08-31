package com.AppFrontendPantallas.JFrames.pantallas.admin;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.AppFrontendPantallas.JFrames.pantallas.login.Loginprincipal;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class Menuadm extends JFrame implements ActionListener{

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public Menuadm() {
		setResizable(false);
		setTitle("Menu administrador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton cancelar = new JButton("Salir");
		cancelar.addActionListener(this);
		cancelar.setFont(new Font("Dialog", Font.BOLD, 14));
		cancelar.setForeground(Color.WHITE);
		cancelar.setBackground(Color.RED);
		cancelar.setBounds(678, 406, 117, 48);
		contentPane.add(cancelar);
		
		JButton Cargarvuelos = new JButton("Cargar vuelos");
		Cargarvuelos.setFont(new Font("Dialog", Font.BOLD, 16));
		Cargarvuelos.setForeground(new Color(0, 0, 0));
		Cargarvuelos.setBackground(new Color(255, 255, 0));
		Cargarvuelos.setBounds(141, 120, 208, 48);
		contentPane.add(Cargarvuelos);
		
		JButton Consultausuarios = new JButton("Consulta usuarios");
		Consultausuarios.setFont(new Font("Dialog", Font.BOLD, 16));
		Consultausuarios.setForeground(new Color(0, 0, 0));
		Consultausuarios.setBackground(new Color(255, 255, 0));
		Consultausuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Consultausuarios.setBounds(141, 227, 208, 48);
		contentPane.add(Consultausuarios);
		
		JButton cargaraerolinea = new JButton("Cargar aerolinea");
		cargaraerolinea.setFont(new Font("Dialog", Font.BOLD, 16));
		cargaraerolinea.setBackground(new Color(255, 255, 0));
		cargaraerolinea.setForeground(new Color(0, 0, 0));
		cargaraerolinea.setBounds(438, 120, 214, 48);
		contentPane.add(cargaraerolinea);
		
		JButton cargapaises = new JButton("Cargar paises");
		cargapaises.setFont(new Font("Dialog", Font.BOLD, 16));
		cargapaises.setForeground(new Color(0, 0, 0));
		cargapaises.setBackground(new Color(255, 255, 0));
		cargapaises.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		cargapaises.setBounds(438, 227, 203, 48);
		contentPane.add(cargapaises);
		
	
		
		JLabel icono = new JLabel("");
		icono.setIcon(new ImageIcon(Menuadm.class.getResource("/com/AppFrontendPantallas/Imagenes/737-MAX-8-Peace-Air.jpg")));
		icono.setBounds(-690, -67, 1613, 551);
		contentPane.add(icono);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if("Salir".equals(e.getActionCommand())) {
			
	    	JOptionPane.showMessageDialog(null,"Sesión cerrada con exito \n"
	    			+ " que tengas un buen día ");
			Loginprincipal principal = new Loginprincipal();
			principal.setVisible(true);
			this.dispose();
		}
		
		else{System.out.println("hola mundo");};
		}
		
		
				
	}


