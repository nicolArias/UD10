package main;

import objetos.Operacion;
import vista.VistaCalculos;

public class CalculosApp {

	public static void main(String[] args) {
		
		VistaCalculos v=new VistaCalculos();
		Operacion operacion=new Operacion();
		//En esta variable se almacena la respuesta que nos da el metodo 'menu' de la clase VistaCalculos
		String tipo=(v.menu()).toLowerCase();
		
		//Varibles donde se almacenara el valor del numero que el usuario ingresa por pantalla
		int num1;
		int num2;
		
		switch(tipo) {
		case("suma"):
			num1=v.numero1();
			num2=v.numero2();
			operacion=new Operacion(tipo,num1,num2);
			
			break;
		case("resta"):
			num1=v.numero1();
			num2=v.numero2();
			operacion=new Operacion(tipo,num1,num2);
			
			break;
		case("multiplicacion"):
			num1=v.numero1();
			num2=v.numero2();
			operacion=new Operacion(tipo,num1,num2);
			
			break;
		case("potencia"):
			num1=v.numero1();
			num2=v.numero2();
			operacion=new Operacion(tipo,num1,num2);
			break;
		case("raiz cuadrada"):
			num1=v.numero1();
			num2=0;
			operacion=new Operacion(tipo,num1,num2);
			break;
		case("raiz cubica"):
			num1=v.numero1();
			num2=0;
			operacion=new Operacion(tipo,num1,num2);
			break;
		case("division"):
			num1=v.numero1();
			num2=v.numero2();
			if(num2!=0) {
				operacion=new Operacion(tipo,num1,num2);
			}else {
				v.respuesta("La division no se puede realizar por 0");
			}
			
			break;
		default:
			v.respuesta("El tipo de operacion no es válida");
			break;
		}
		
		v.respuesta(operacion.toString());
	}

}
