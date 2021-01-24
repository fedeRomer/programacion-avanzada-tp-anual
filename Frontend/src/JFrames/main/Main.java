package JFrames.main;

import java.awt.EventQueue;

import JFrames.pantallas.login.Loginprincipal;


public class Main {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginprincipal frame = new Loginprincipal();
					frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
		
	