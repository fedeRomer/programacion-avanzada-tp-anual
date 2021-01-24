package JFrames.pantallas.usuarios;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import JFrames.pantallas.login.Loginprincipal;
import util.Util;
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
	private JTextField innombre;
	private JTextField inapellido;
	private JTextField inemail;
	private JPasswordField inpass;
	private JPasswordField inretry;
	private JTextField indni;
	private JTextField incuit;
	private JTextField intelefono;
	private JTextField innumero;
	private JTextField incategoria;

	
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
		
		innombre = new JTextField();
		innombre.setBounds(120, 10, 128, 19);
		contentPane.add(innombre);
		innombre.setColumns(10);
				
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
		
		inapellido = new JTextField();
		inapellido.setColumns(10);
		inapellido.setBounds(120, 60, 128, 19);
		contentPane.add(inapellido);
		
		inemail = new JTextField();
		inemail.setColumns(10);
		inemail.setBounds(360, 105, 128, 19);
		contentPane.add(inemail);
		
		inpass = new JPasswordField();
		inpass.setBounds(120, 105, 128, 19);
		contentPane.add(inpass);
		
		JLabel retry = new JLabel("Retry");
		retry.setForeground(Color.WHITE);
		retry.setBounds(295, 60, 70, 19);
		contentPane.add(retry);
		
		inretry = new JPasswordField();
		inretry.setBounds(360, 60, 128, 19);
		contentPane.add(inretry);
		
		JLabel dni = new JLabel("Dni");
		dni.setForeground(Color.WHITE);
		dni.setBounds(295, 12, 70, 15);
		contentPane.add(dni);
		
		indni = new JTextField();
		indni.setColumns(10);
		indni.setBounds(360, 10, 128, 19);
		contentPane.add(indni);
		
		JLabel cuit = new JLabel("Cuit/Cuil");
		cuit.setForeground(Color.WHITE);
		cuit.setBounds(22, 167, 70, 15);
		contentPane.add(cuit);
		
		incuit = new JTextField();
		incuit.setColumns(10);
		incuit.setBounds(120, 165, 128, 19);
		contentPane.add(incuit);
		
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
		
		intelefono = new JTextField();
		intelefono.setColumns(10);
		intelefono.setBounds(477, 313, 128, 19);
		contentPane.add(intelefono);
		
		JLabel Numero = new JLabel("Numero");
		Numero.setForeground(Color.WHITE);
		Numero.setBounds(22, 244, 70, 15);
		contentPane.add(Numero);
		
		JLabel Categoria = new JLabel("Categoria");
		Categoria.setForeground(Color.WHITE);
		Categoria.setBounds(279, 244, 70, 15);
		contentPane.add(Categoria);
		
		innumero = new JTextField();
		innumero.setColumns(10);
		innumero.setBounds(120, 240, 128, 19);
		contentPane.add(innumero);
		
		incategoria = new JTextField();
		incategoria.setColumns(10);
		incategoria.setBounds(383, 242, 128, 19);
		contentPane.add(incategoria);
		
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
		
	 RegistroUsuario2 registro2 = new RegistroUsuario2();
	 
		
		if("Cancelar".equals(e.getActionCommand())) {
			Loginprincipal principal = new Loginprincipal();
			principal.setVisible(true);
			this.dispose();
		}
		
		if("Continuar".equals(e.getActionCommand())){
			registro2.setVisible(true);
            this.dispose();}
			
		  }
		}


