package JFrames.pantallas.administrador;

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

import JFrames.pantallas.login.Loginprincipal;

public class Menuadmin1 extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public Menuadmin1() {
		setTitle("Menu Administrador");
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
		
		JPanel panelausuarios = new JPanel();
		tabbedPane.addTab(" Usuarios", null, panelausuarios, null);
		
		JPanel panelpaises = new JPanel();
		tabbedPane.addTab("Paises", null, panelpaises, null);
		tabbedPane.setBackgroundAt(1, Color.WHITE);
		
		JPanel panelarolineas = new JPanel();
		tabbedPane.addTab("Aerolineas", null, panelarolineas, null);
		
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
		
		else{System.out.println("hola mundo");};
		}
	
	
	
	
	
	
	
	
	
	
}
