package objetos;

import java.util.Random;

public class Ordenador {
	
	//Clase Random
	private Random random=new Random();
	
	//ATRIBUTOS
	private Usuario usuario;
	private int numeroRandom=random.nextInt(500)+1;//Génera un número aleatorio entre el 1 y el 500
	
	
	public Ordenador(Usuario u){
		this.usuario=u;
	}
	
	//Método que devolvera un true si el numero que ingreso el usuario es mayor que el número random
	public boolean esMayor() {

		if(usuario.getiNum()>numeroRandom) {
			return true;
		}
		
		return false;
	}
	
	//Método que devolvera un true si el numero que ingreso el usuario es igual que el número random
	public boolean esIgual() {
		if(usuario.getiNum()==numeroRandom) {
			return true;
		}
		return false;
	}
	
	
}
