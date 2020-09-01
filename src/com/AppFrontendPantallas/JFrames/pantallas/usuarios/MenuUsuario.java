package com.AppFrontendPantallas.JFrames.pantallas.usuarios;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import com.AppFrontendPantallas.JFrames.pantallas.administrador.Menuadmin1;
import com.AppFrontendPantallas.JFrames.pantallas.login.Loginprincipal;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import java.awt.Font;
import javax.swing.JTextField;


	public class MenuUsuario extends JFrame implements ActionListener{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private JTextField textField_1;
		private JTextField textField_2;

		
		public MenuUsuario() {
			setTitle("Menu Usuario");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 941, 597);
			contentPane = new JPanel();
			contentPane.setBackground(Color.DARK_GRAY);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(12, 35, 763, 513);
			tabbedPane.setBackground(new Color(255, 255, 255));
			contentPane.add(tabbedPane);
			
			JPanel ComprarVuelo = new JPanel();
			ComprarVuelo.setBackground(new Color(30, 144, 255));
			tabbedPane.addTab("Comprar Vuelos", null, ComprarVuelo, null);
			ComprarVuelo.setLayout(null);
			
			JComboBox comboBoxorigen = new JComboBox();
			comboBoxorigen.setBounds(126, 40, 168, 24);
			ComprarVuelo.add(comboBoxorigen);
			
			JComboBox comboBoxdestino = new JComboBox();
			comboBoxdestino.setBounds(471, 40, 168, 24);
			ComprarVuelo.add(comboBoxdestino);
			
			JLabel lblOrigen = new JLabel("Origen");
			lblOrigen.setFont(new Font("Dialog", Font.BOLD, 16));
			lblOrigen.setBounds(26, 39, 82, 24);
			ComprarVuelo.add(lblOrigen);
			
			JLabel lblDestino = new JLabel("Destino");
			lblDestino.setFont(new Font("Dialog", Font.BOLD, 16));
			lblDestino.setBounds(371, 39, 82, 24);
			ComprarVuelo.add(lblDestino);
			
			JLabel lblPartida = new JLabel("Partida");
			lblPartida.setFont(new Font("Dialog", Font.BOLD, 16));
			lblPartida.setBounds(23, 118, 82, 24);
			ComprarVuelo.add(lblPartida);
			
			JLabel lblRegreso = new JLabel("Regreso");
			lblRegreso.setFont(new Font("Dialog", Font.BOLD, 16));
			lblRegreso.setBounds(371, 118, 82, 24);
			ComprarVuelo.add(lblRegreso);
			
			JDateChooser dateChooser = new JDateChooser();
			dateChooser.setBounds(126, 118, 168, 24);
			ComprarVuelo.add(dateChooser);
			
			JLabel lblPasajeros = new JLabel("Pasajeros");
			lblPasajeros.setFont(new Font("Dialog", Font.BOLD, 16));
			lblPasajeros.setBounds(23, 187, 107, 24);
			ComprarVuelo.add(lblPasajeros);
			
			JComboBox comboBoxpasajeros = new JComboBox();
			comboBoxpasajeros.setBounds(126, 187, 168, 24);
			ComprarVuelo.add(comboBoxpasajeros);
			
			JDateChooser dateChooser_1 = new JDateChooser();
			dateChooser_1.setBounds(471, 118, 168, 24);
			ComprarVuelo.add(dateChooser_1);
			
			JPanel mireserva = new JPanel();
			mireserva.setBackground(new Color(30, 144, 255));
			tabbedPane.addTab("Mi reserva", null, mireserva, null);
			mireserva.setLayout(null);
			
			JButton buscarreserva = new JButton("Buscar mi reserva");
			buscarreserva.setForeground(new Color(255, 255, 255));
			buscarreserva.setBackground(new Color(0, 255, 0));
			buscarreserva.setFont(new Font("Dialog", Font.BOLD, 16));
			buscarreserva.setBounds(195, 329, 204, 35);
			mireserva.add(buscarreserva);
			
			textField_1 = new JTextField();
			textField_1.setBounds(195, 71, 175, 28);
			mireserva.add(textField_1);
			textField_1.setColumns(10);
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(195, 176, 175, 28);
			mireserva.add(textField_2);
			
			JLabel lblCodReserva = new JLabel("Cod Reserva");
			lblCodReserva.setFont(new Font("Dialog", Font.BOLD, 16));
			lblCodReserva.setForeground(new Color(255, 255, 255));
			lblCodReserva.setBounds(34, 66, 150, 35);
			mireserva.add(lblCodReserva);
			
			JLabel reservaapellido = new JLabel("Apellido");
			reservaapellido.setForeground(Color.WHITE);
			reservaapellido.setFont(new Font("Dialog", Font.BOLD, 16));
			reservaapellido.setBounds(34, 171, 150, 35);
			mireserva.add(reservaapellido);
			
			JPanel estadovuelo = new JPanel();
			estadovuelo.setBackground(new Color(30, 144, 255));
			tabbedPane.addTab("Estado de Vuelo", null, estadovuelo, null);
			estadovuelo.setLayout(null);
			
			JLabel lblNewLabel_1 = new JLabel("Número de vuelo");
			lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 16));
			lblNewLabel_1.setForeground(new Color(255, 255, 255));
			lblNewLabel_1.setBounds(62, 56, 187, 39);
			estadovuelo.add(lblNewLabel_1);
			
			JLabel lblNewLabel_1_1 = new JLabel("Fecha");
			lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 16));
			lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
			lblNewLabel_1_1.setBounds(61, 149, 141, 32);
			estadovuelo.add(lblNewLabel_1_1);
			
			JDateChooser dateChooser_2 = new JDateChooser();
			dateChooser_2.setBounds(267, 156, 187, 25);
			estadovuelo.add(dateChooser_2);
			
			JButton btnNewButton = new JButton("Consultar");
			btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setBackground(new Color(0, 255, 0));
			btnNewButton.setBounds(267, 260, 124, 39);
			estadovuelo.add(btnNewButton);
			
			JDateChooser dateChooser_2_1 = new JDateChooser();
			dateChooser_2_1.setBounds(267, 70, 187, 25);
			estadovuelo.add(dateChooser_2_1);
			tabbedPane.setBackgroundAt(2, new Color(255, 255, 255));
			
			JPanel panelvuelos = new JPanel();
			tabbedPane.addTab("Vuelos", null, panelvuelos, null);
			
			JButton Cargar = new JButton("Cargar");
			Cargar.setForeground(new Color(255, 255, 255));
			Cargar.setBackground(new Color(0, 255, 0));
			Cargar.setBounds(812, 60, 117, 35);
			contentPane.add(Cargar);
			
			JButton Borrar = new JButton("Borrar");
			Borrar.setForeground(new Color(255, 255, 255));
			Borrar.setBackground(new Color(255, 69, 0));
			Borrar.setBounds(812, 239, 117, 35);
			contentPane.add(Borrar);
			
			JButton Modificar = new JButton("Modificar");
			Modificar.setForeground(new Color(255, 255, 255));
			Modificar.setBackground(new Color(0, 0, 205));
			Modificar.setBounds(812, 153, 117, 35);
			contentPane.add(Modificar);
			
			JButton salirmenuadmin = new JButton("Salir");
			salirmenuadmin.addActionListener(this);
			salirmenuadmin.setBackground(new Color(255, 0, 0));
			salirmenuadmin.setForeground(new Color(255, 255, 255));
			salirmenuadmin.setBounds(812, 513, 117, 35);
			contentPane.add(salirmenuadmin);
			
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon(Menuadmin1.class.getResource("/com/AppFrontendPantallas/Imagenes/737-MAX-8-Peace-Air.jpg")));
			lblNewLabel.setBounds(-611, -16, 1587, 611);
			contentPane.add(lblNewLabel);
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
     	}	
	}		
		
		
