package main;

import javax.swing.JOptionPane;

import objetos.Password;

/*Autora: Nicol Dayana Arias Lebro
 * 14-02-2021*/
public class PasswordApp {
	
	
	
	public static void main(String[] args) {
		
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
			
			arregloPassword(contraseñas,esFuerte);
			JOptionPane.showMessageDialog(null, arregloPassword(contraseñas,esFuerte));
		}
		
	}
	
	public static String arregloPassword(Password contra[],Boolean esFuerte[]) {
		
		int longitud;

		String mensaje="";
		//El ciclo creara en cada posicion del array un objeto de password
		for(int i=0;i<3;i++) {
			
			String longPassword=JOptionPane.showInputDialog("Longitud de la contraseña");
			if(longPassword.equals("")) {
				contra[i]=new Password();
			}else {
				longitud=Integer.parseInt(longPassword);
				contra[i]=new Password(longitud);
			}
			
			 Password classPassword=new Password();
			if(classPassword.esFuerte()) {
				esFuerte[i]=true;
				
			}else {
				esFuerte[i]=false;
			}
			
			mensaje+="\nContraseña: "+contra[i]+" "+esFuerte[i];
		}
		
		return mensaje;
		
	}
	


}
