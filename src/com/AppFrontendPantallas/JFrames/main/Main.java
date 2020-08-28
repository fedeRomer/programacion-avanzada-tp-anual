package com.AppFrontendPantallas.JFrames.main;

import java.awt.EventQueue;

import com.AppFrontendPantallas.JFrames.pantallas.Login.Loginprincipal;


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
		
	