package main;
import controlador.Controlador;
import vista.Vista;

public class EjecutableApp {

	public static void main(String[] args) {
			Vista vista=new Vista();
			//Usuario usuario=new Usuario();
			//Ordenador ordenador=new Ordenador();
			
			vista.ingresarNum();//Llamara el constructor de la clase vista para poder ingresar el numero
			Controlador controller=new Controlador(vista);//Instanciamos la clase controlador para realizar todas las funciones.
			controller.ingresarNum();//Aquí llamaremos al metodo que enviara el número a la clase usuario.
			controller.adivinaNum();//Aqui llamaremos al metodo que realizará las validaciones respectivas para el número ingresado
	}

}
