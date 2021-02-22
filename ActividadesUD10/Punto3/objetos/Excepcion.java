package objetos;

public class Excepcion extends Exception {
		
	private int codigoExcepcion;
	private int numero;
	
	public Excepcion() {
		
	}
	
	public Excepcion(int codigoEx,int numero) {
		super();
		this.codigoExcepcion=codigoEx;
		this.numero=numero;
	}
	
	public String getMessage() {
		String mensaje="";
		
		if(codigoExcepcion==1) {
			mensaje="Es par";
		}else if(codigoExcepcion==2){
			mensaje="Es impar";
		}
		
		
		return "Generando número aleatorio..."+
				"\nEl número aleatorio generado es: "+numero+
				"\n"+mensaje;
	}
	
}
