package main;

import java.util.Scanner;

import vista.VistaJuego;

public class Main {
	

	public static void main(String[] args) {
		int opcion=0;
		Scanner sc=new Scanner(System.in);
		
		VistaJuego miVistaJuego=new VistaJuego();
		/*do {
			System.out.println("Elija un personaje");
			System.out.println("1-Knight");
			System.out.println("2-Mage");
			System.out.println("3-Rogue");
			System.out.println("0-Salir");
			opcion=sc.nextInt();
			
			if(opcion!=0) {
				miVistaJuego.setPersonaje(opcion);
			}
			
		}while(opcion!=0);*/
		
		miVistaJuego.iniciarHilo();
		miVistaJuego.setVisible(true);
		
	}

}
