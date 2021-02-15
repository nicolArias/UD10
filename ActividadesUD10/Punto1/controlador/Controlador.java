package controlador;

import java.util.InputMismatchException;

import objetos.Ordenador;
import objetos.Usuario;
import vista.Vista;

public class Controlador {
	
	private Vista vista;
	private Usuario usuario=new Usuario();
	private Ordenador ord;
	
	public Controlador(Vista v) { 
		this.vista=v;
		//this.usuario=u;
	}
	
	public int ingresarNum() {
	
		
			int num=vista.getNum();
			usuario.setiNum(num);	
		
			return vista.getContador() ;
	}
	
	public void adivinaNum() {
		
		ord=new Ordenador(usuario);
		int cont=1;
		
		
		for(int i=0;i<=cont;i++) {
			if(ord.esMayor()) {
				vista.setMensaje("El número que ha ingresado es mayor");
				vista.ingresarNum();
				ingresarNum();
				cont++;
				
			}else if(ord.esIgual()) {
				vista.setMensaje("El número que ingreso es igual\n"+"El número de intentos es: "+cont);
				break;
			}else if(!ord.esMayor()) {
				vista.setMensaje("El número que ha ingresado es menor");
				vista.ingresarNum();
				ingresarNum();
				cont++;
			}
		}
		
	}
}
