package vista;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Vista {
	private int num;
	private String mensaje;
	private int nroIntentos;
	private Scanner teclado;
	private int contador;
	public Vista() {
		
		
	}
	public void ingresarNum() {
		this.contador=0;//Esta variable se usa llegado al caso de que se genere la excepcion se pueda ir contando como un intento por parte del usuario
		//Aquí trataremos la excepción en caso de que el usuario ingrese un valor diferente al tipo int
		try {
			System.out.println("*Ingrese un número entre 1 y 500:");
		 	teclado = new Scanner(System.in);//El valor lo ingresara por consola
		 	
		 	this.num=teclado.nextInt();//En esta variable de tipo int se guardara el valor que ingresa el usuario por teclado
		}catch(InputMismatchException e) {
			//Si el usuario ingresa un caracter o cadena de texto se ejecutará lo que este dentro del catch, en este caso imprimira un mensaje
			System.out.println("!! No se reconoce la entrada !!");
			this.contador=1;
		}
		
	}

	//MÉTODOS GET Y SET
	public int getContador() {
		return contador;
	}
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje=mensaje;
		System.out.println(mensaje);//Aqui imprimira el mensaje que llegue del controlador
	
	}

	public int getNroIntentos() {
		return nroIntentos;
	}

	public void setNroIntentos(int nroIntentos) {
		this.nroIntentos = nroIntentos;
	}
	
	
	
	
}
