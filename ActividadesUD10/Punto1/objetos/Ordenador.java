package objetos;

import java.util.Random;

public class Ordenador {
	
	//Clase Random
	private Random random=new Random();
	
	//ATRIBUTOS
	private Usuario usuario;
	private int numeroRandom=random.nextInt(500)+1;//G�nera un n�mero aleatorio entre el 1 y el 500
	
	
	public Ordenador(Usuario u){
		this.usuario=u;
	}
	
	//M�todo que devolvera un true si el numero que ingreso el usuario es mayor que el n�mero random
	public boolean esMayor() {

		if(usuario.getiNum()>numeroRandom) {
			return true;
		}
		
		return false;
	}
	
	//M�todo que devolvera un true si el numero que ingreso el usuario es igual que el n�mero random
	public boolean esIgual() {
		if(usuario.getiNum()==numeroRandom) {
			return true;
		}
		return false;
	}
	
	
}
