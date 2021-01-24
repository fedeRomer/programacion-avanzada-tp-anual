package JFrames.pantallas.usuarios;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ComboBoxEditor;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import JFrames.pantallas.login.Loginprincipal;
import com.toedter.calendar.JCalendar;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JComboBox;


public class RegistroUsuario2 extends JFrame implements ActionListener {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_2;
	private JTextField textField_3;
	
	public RegistroUsuario2(){
		
		setResizable(false);
		setTitle("Registro de Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nombre = new JLabel("Direccion");
		nombre.setBounds(22, 12, 70, 15);
		nombre.setForeground(Color.WHITE);
		contentPane.add(nombre);
		
		textField = new JTextField();
		textField.setBounds(110, 10, 128, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel altura = new JLabel("altura");
		altura.setBounds(302, 12, 70, 15);
		altura.setForeground(Color.WHITE);
		contentPane.add(altura);
		
		textField_1 = new JTextField();
		textField_1.setBounds(380, 10, 128, 19);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		JLabel password = new JLabel("Ciudad");
		password.setBounds(557, 12, 70, 15);
		password.setForeground(Color.WHITE);
		contentPane.add(password);
		
		JLabel provincia = new JLabel("Provincia");
		provincia.setBounds(302, 77, 70, 19);
		provincia.setForeground(Color.WHITE);
		contentPane.add(provincia);
		
		JLabel codigo = new JLabel("Cod postal");
		codigo.setBounds(22, 79, 94, 15);
		codigo.setForeground(Color.WHITE);
		contentPane.add(codigo);
		
		textField_4 = new JTextField();
		textField_4.setBounds(631, 10, 128, 19);
		textField_4.setColumns(10);
		contentPane.add(textField_4);
		
		JButton continuar = new JButton("Continuar");
		continuar.addActionListener(this);
		continuar.setActionCommand("Continuar");
		continuar.setBounds(372, 429, 117, 25);
		continuar.setFont(new Font("Dialog", Font.BOLD, 14));
		continuar.setForeground(Color.WHITE);
		continuar.setBackground(new Color(0, 128, 0));
		contentPane.add(continuar);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.addActionListener(this);
		cancelar.setActionCommand("Cancelar");
		cancelar.setBounds(642, 429, 117, 25);
		cancelar.setFont(new Font("Dialog", Font.BOLD, 14));
		cancelar.setForeground(Color.WHITE);
		cancelar.setBackground(Color.RED);
		contentPane.add(cancelar);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(110, 77, 128, 19);
		contentPane.add(textField_5);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("Dialog", Font.BOLD, 12));
		comboBox.setBounds(631, 77, 128, 19);
		comboBox.addItem("telefono");
		comboBox.addItem("telofono personal");
		comboBox.addItem("telofono celular");
		comboBox.addItem("telofono laboral");
		contentPane.add(comboBox);
		
		JComboBox<String> comboprovincia = new JComboBox<String>();
		comboprovincia.setFont(new Font("Dialog", Font.BOLD, 12));
		comboprovincia.setBounds(380, 77, 128, 19);
		contentPane.add(comboprovincia);
		
		JLabel Pais = new JLabel("Pais");
		Pais.setForeground(Color.WHITE);
		Pais.setBounds(557, 77, 70, 19);
		contentPane.add(Pais);
		
		JButton volver = new JButton("Volver");
		volver.addActionListener(this);
		volver.setForeground(Color.WHITE);
		volver.setFont(new Font("Dialog", Font.BOLD, 14));
		volver.setBackground(Color.BLUE);
		volver.setBounds(206, 429, 117, 25);
		contentPane.add(volver);
		
		JLabel numpasaporte = new JLabel("Numero de pasaporte");
		numpasaporte.setForeground(Color.WHITE);
		numpasaporte.setBounds(22, 141, 155, 15);
		contentPane.add(numpasaporte);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(195, 139, 128, 19);
		contentPane.add(textField_2);
		
		JLabel lblAutoridadDeEmision = new JLabel("Autoridad de emision");
		lblAutoridadDeEmision.setForeground(Color.WHITE);
		lblAutoridadDeEmision.setBounds(411, 141, 154, 15);
		contentPane.add(lblAutoridadDeEmision);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(583, 139, 128, 19);
		contentPane.add(textField_3);
		
		JLabel emision = new JLabel("Fecha de emision");
		emision.setForeground(Color.WHITE);
		emision.setBounds(22, 193, 155, 15);
		contentPane.add(emision);
		
		JLabel vencimiento = new JLabel("Fecha de vencimiento");
		vencimiento.setForeground(Color.WHITE);
		vencimiento.setBounds(411, 193, 154, 15);
		contentPane.add(vencimiento);
		
		JCalendar calendario1 = new JCalendar();
		calendario1.setBounds(409, 220, 265, 159);
		contentPane.add(calendario1);
		
		JCalendar calendar2 = new JCalendar();
		calendar2.setBounds(22, 220, 265, 159);
		contentPane.add(calendar2);
		
		JLabel Icono2 = new JLabel("");
		Icono2.setBounds(-48, -45, 872, 551);
		Icono2.setIcon(new ImageIcon(RegistroUsuario.class.getResource("/com/AppFrontendPantallas/Imagenes/6247308225_6aedf3cbb3_b.jpg")));
		contentPane.add(Icono2);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if("Cancelar".equals(e.getActionCommand())) {
			Loginprincipal principal = new Loginprincipal();
			principal.setVisible(true);
			this.dispose();
		}
		else if("Volver".equals(e.getActionCommand())) {
			RegistroUsuario registro1 = new RegistroUsuario();
			registro1.setVisible(true);
			this.dispose();
						
		}else {
			RegistroUsuario3 registro3 = new RegistroUsuario3();
			registro3.setVisible(true);
			this.dispose();
		}
	}
				
}