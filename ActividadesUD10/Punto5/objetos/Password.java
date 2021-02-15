package objetos;

import java.util.Random;

public class Password {
	
	//CONSTANTE PARA ASIGNAR EL VALOR POR DEFECTO DE LA LONGITUD
	protected final int LONGITUD_CONST=8;
	
	//ATRIBUTOS
	protected int longitud;
	protected String contraseña;
	
	//OBJETO DE LA CLASE RANDOM
	Random random=new Random();
	
	//CONSTRUCTOR POR DEFECTO
	public Password() {
		this.longitud=LONGITUD_CONST;
		this.contraseña="";
	}
	
	//CONSTRUCTOR CON PARAMETROS
	public Password(int longitud) {
		this.longitud=longitud;
		this.contraseña=generarPassword();
	}
	
	
	//MÉTODOS GET Y SET
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
		this.contraseña=generarPassword();
	}

	public String getContraseña() {
		return contraseña;
	}

	
	/*Devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 mayusculas
	*mas de 1 minuscula y mas de 5 numeros*/
	public boolean esFuerte() {
		boolean respuesta=false;
		
		String c;
		int isMayus=0;
		int isMin=0;
		int isNum=0;
		for(int j=0;j<longitud;j++) {
			c=getContraseña().valueOf(j);
			
			if(isNum(c)) {//Va al método is num que retorna un true o false
				isNum++;
			}else if(c.equals(c.toUpperCase())) {//Válida si el caracter es una letra mayuscula
				isMayus++;
			}else if(c.equals(c.toLowerCase())) {//Válida si el caracter en una letra minuscula
				isMin++;	
			}
		}
		
		//Esta condición válida que la contraseña tenga mas de 5 números, mas de 2 letras mayusculas y mas de 1 letra minuscula
		if(isNum>5 && isMayus>2 && isMin>1) {
			respuesta=true;
		}
		
		return respuesta;
	}
	
	public boolean isNum(String n) {
		//Este método es para revisar si el parametro es un numero entero o un caracter, si es un número devolvera un true
		try {
			Integer.parseInt(n);
			return true;
		}catch(NumberFormatException e){
			return false;
		}
		
	}
	
	//Genera la contraseña del objeto con la longitud que tenga
	public  String generarPassword() {
		
		String valores="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb=new StringBuilder(valores);//Se guarda la cadena de 'valores' a un StringBuilder
		int tamaño=sb.length();//Me da cantidad de caracteres de la cadena
		
		String password="";
		
		
		for(int i=0;i<getLongitud();i++) {
			int numAleatorio=random.nextInt(tamaño)+1;//Me genera un número aleatorio que se encuentre entre el 1 y el tamaño de la cadena de texto
			password+=sb.charAt(numAleatorio);//Aqui me genera la contraseña aleatoria
		
		}
		System.out.println(password);
		return password;
	}

	
	
	
}
