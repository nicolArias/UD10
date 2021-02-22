package main;

import javax.swing.JOptionPane;


import objetos.Aleatorio;
import objetos.Excepcion;

public class Punto3App {

	public static void main(String[] args) {
		
		Aleatorio aleatorio=new Aleatorio();
		
		int numero=aleatorio.getNumero();
		
	
		try {
			if(numero%2==0) {
				throw new Excepcion(1,numero);
			}else {
				throw new Excepcion(2,numero);
			}
			
		}catch(Excepcion ex) {
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
		
		
		
		

	}

}
