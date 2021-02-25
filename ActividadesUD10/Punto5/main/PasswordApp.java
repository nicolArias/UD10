package main;

import javax.swing.JOptionPane;

import objetos.Password;

/*Autora: Nicol Dayana Arias Lebro
 * 14-02-2021*/
public class PasswordApp {
	
 
	
	public static void main(String[] args) {
		Password pss;
		int longitudArreglo=0;
		//Mostrar� un mensaje en caso de que el usuario ingrese otro tipo de dato que no sea un entero
		try {
			longitudArreglo=Integer.parseInt(JOptionPane.showInputDialog("Longitud del arreglo"));//Pedir� el tama�o del arreglo de contrase�as
			
			
			
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "No se reconoce el dato de entrada");
		}
		
		//V�lida que la longitud ingresada no sea un 0
		if(longitudArreglo!=0) {
			Password contrase�as[]=new Password[longitudArreglo];//Array de passwords
			Boolean esFuerte[]=new Boolean[longitudArreglo];//Arreglo que guardara si la contrase�a es fuerte o no
			
			
			JOptionPane.showMessageDialog(null, arregloPassword(contrase�as,esFuerte));
		}
		
	}
	
	public static String arregloPassword(Password contra[],Boolean esFuerte[]) {
		Password classPassword;
		

		String mensaje="";
		String longPassword=JOptionPane.showInputDialog("Longitud de la contrase�a");
		int longitud=Integer.parseInt(longPassword);
		
		//El ciclo creara en cada posicion del array un objeto de password
		for(int i=0;i<contra.length;i++) {
			for(int p=0;p<longitud;p++) {
				if(longPassword.equals("")) {
					contra[i]=new Password();
				}else {
					longitud=Integer.parseInt(longPassword);
					contra[i]=new Password(longitud);
				}

			}
			if(contra[i].esFuerte()) {
				esFuerte[i]=true;
				
			}else {
				esFuerte[i]=false;
			}
			
			
			mensaje+="\nContrase�a: "+contra[i].getContrase�a()+" Seguridad: "+esFuerte[i];
			System.out.println("\nContrase�a: "+contra[i].getContrase�a()+" "+esFuerte[i]);
		}

		return mensaje;
		
	}
	


}
