package objetos;

import java.util.Random;

public class Password {
	
	//CONSTANTE PARA ASIGNAR EL VALOR POR DEFECTO DE LA LONGITUD
	protected final int LONGITUD_CONST=8;
	
	//ATRIBUTOS
	protected int longitud;
	protected String contrase�a;
	
	//OBJETO DE LA CLASE RANDOM
	Random random=new Random();
	
	//CONSTRUCTOR POR DEFECTO
	public Password() {
		this.longitud=LONGITUD_CONST;
		generarPassword();
	}
	
	//CONSTRUCTOR CON PARAMETROS
	public Password(int longitud) {
		this.longitud=longitud;
		generarPassword();
	}
	
	
	//M�TODOS GET Y SET
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
		generarPassword();
	}

	public String getContrase�a() {
		return contrase�a;
	}

	
	/*Devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 mayusculas
	*mas de 1 minuscula y mas de 5 numeros*/
	public boolean esFuerte() {
		boolean respuesta=false;
		
		char valorTemp;
		
		int isMayus=0;
		int isMin=0;
		int isNum=0;
		String caracterClave;
		
		for(int j=0;j<this.longitud;j++) {
			valorTemp=getContrase�a().charAt(j);
			caracterClave=Character.toString(valorTemp);
			System.out.println("valor por posicion: "+caracterClave);
			
			if(isNum(caracterClave)) {//Va al m�todo is num que retorna un true o false
				isNum++;
			}else if(caracterClave.equals(caracterClave.toUpperCase())) {//V�lida si el caracter es una letra mayuscula
				isMayus++;
			}else if(caracterClave.equals(caracterClave.toLowerCase())) {//V�lida si el caracter en una letra minuscula
				isMin++;	
			}
		}
		//Esta condici�n v�lida que la contrase�a tenga mas de 5 n�meros, mas de 2 letras mayusculas y mas de 1 letra minuscula
		if(isNum>5 && isMayus>2 && isMin>1) {
			respuesta=true;
		}
		return respuesta;
	}
	
	public boolean isNum(String n) {
		//Este m�todo es para revisar si el parametro es un numero entero o un caracter, si es un n�mero devolvera un true
		try {
			Integer.parseInt(n);
			return true;
		}catch(NumberFormatException e){
			return false;
		}
		
	}
	
	//Genera la contrase�a del objeto con la longitud que tenga
	public  void generarPassword() {
		
		String valores="1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz1234567890";
		StringBuilder sb=new StringBuilder(valores);//Se guarda la cadena de 'valores' a un StringBuilder
		int tama�o=sb.length();//Me da cantidad de caracteres de la cadena
		
		String password="";
		
		
		for(int i=0;i<getLongitud();i++) {
			int numAleatorio=random.nextInt(tama�o)+0;//Me genera un n�mero aleatorio que se encuentre entre el 1 y el tama�o de la cadena de texto
			password+=sb.charAt(numAleatorio);//Aqui me genera la contrase�a aleatoria
		
		}
		this.contrase�a=password;
	}

	
	
	
}
