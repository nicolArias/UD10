package objetos;

import java.util.Random;

public class Aleatorio {

	Random random=new Random();
	private int numAleatorio=random.nextInt(999)+1;
	
	private int numero;
	
	public Aleatorio() {
		this.numero=numAleatorio;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
}
