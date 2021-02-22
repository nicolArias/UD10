package vista;

import javax.swing.JOptionPane;

public class VistaCalculos {
	
	public VistaCalculos() {
		
	}
	
	public String menu() {
		String menu="";
		String resp="";
		//try {
			menu=JOptionPane.showInputDialog("Que tipo de operación desea realizar?"+
					"\n1. Suma"+
					"\n2. Resta"+
					"\n3. Multiplicacion"+
					"\n4. Potencia"+
					"\n5. Raiz cuadrada"+
					"\n6. Raiz cubica"+
					"\n7. Division");
			resp=menu;
		//}catch(Null){
			
		//}
		
		return resp;
	}
	
	public int numero1() {
		int numero1;
		int respuesta=0;
		
	/*Este try catch nos controla llegado el caso en que el usuario ingrese un valor en otro formato al declarado
		y el sistema lo tome como un valor que no sea Int*/
		try {
			numero1=Integer.parseInt(JOptionPane.showInputDialog("Número 1"));
			respuesta=numero1;
			
		}catch(NumberFormatException e) {
			//Si se genera la excepcion nos mostrara un mensaje y volvera a mostrar la ventana donde podremos
			//ingresar nuevamente el valor
			JOptionPane.showMessageDialog(null, "El formato ingresado no es compatible");
			respuesta=numero1();
		}
		
		
		return respuesta;
	}
	
	public int numero2() {
		int numero2;
		int respuesta=0;
		
		try {
			numero2=Integer.parseInt(JOptionPane.showInputDialog("Número 2"));
			
			respuesta=numero2;
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "El formato ingresado no es compatible");
			respuesta=numero2();
		}
		
		
		return respuesta;
	}
	
	public void respuesta(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
