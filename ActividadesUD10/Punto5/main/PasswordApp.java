package main;

import javax.swing.JOptionPane;

import objetos.Password;

/*Autora: Nicol Dayana Arias Lebro
 * 14-02-2021*/
public class PasswordApp {
	
 
	
	public static void main(String[] args) {
		Password pss;
		int longitudArreglo=0;
		//Mostrará un mensaje en caso de que el usuario ingrese otro tipo de dato que no sea un entero
		try {
			longitudArreglo=Integer.parseInt(JOptionPane.showInputDialog("Longitud del arreglo"));//Pedirá el tamaño del arreglo de contraseñas
			
			
			
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "No se reconoce el dato de entrada");
		}
		
		//Válida que la longitud ingresada no sea un 0
		if(longitudArreglo!=0) {
			Password contraseñas[]=new Password[longitudArreglo];//Array de passwords
			Boolean esFuerte[]=new Boolean[longitudArreglo];//Arreglo que guardara si la contraseña es fuerte o no
			
			
			JOptionPane.showMessageDialog(null, arregloPassword(contraseñas,esFuerte));
		}
		
	}
	
	public static String arregloPassword(Password contra[],Boolean esFuerte[]) {
		Password classPassword;
		

		String mensaje="";
		String longPassword=JOptionPane.showInputDialog("Longitud de la contraseña");
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
			
			
			mensaje+="\nContraseña: "+contra[i].getContraseña()+" Seguridad: "+esFuerte[i];
			System.out.println("\nContraseña: "+contra[i].getContraseña()+" "+esFuerte[i]);
		}

		return mensaje;
		
	}
	


}
