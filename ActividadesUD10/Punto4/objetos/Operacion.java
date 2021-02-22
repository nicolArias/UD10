package objetos;

public class Operacion {
	
	protected String tipo;
	protected int op1;
	protected int op2;
	protected double resultado;
	
	public Operacion() {
		
	}
	
	public Operacion(String tipo,int op1,int op2) {
		this.tipo=tipo;
		this.op1=op1;
		this.op2=op2;
		Calcular();
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getOp1() {
		return op1;
	}

	public void setOp1(int op1) {
		this.op1 = op1;
	}

	public int getOp2() {
		return op2;
	}

	public void setOp2(int op2) {
		this.op2 = op2;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public void Calcular() {
		
		switch(this.tipo) {
		case("suma"):
			this.resultado=op1+op2;
			break;
		case("resta"):
			this.resultado=op1-op2;
			break;
		case("multiplicacion"):
			this.resultado=op1*op2;
			break;
		case("potencia"):
			this.resultado=Math.pow(op1, op2);
			break;
		case("raiz cuadrada"):
			this.resultado=Math.sqrt(op1);
			break;
		case("raiz cubica"):
			this.resultado=Math.cbrt(op1);
			break;
		case("division"):
			try {
				this.resultado=op1/op2;
			}catch(ArithmeticException a) {
				System.out.println("No se puede realizar una division por 0");
			}
			
			break;
			
		}
	}
	
	public String toString() {
		return "El resultado del calculo es: "+getResultado();
	}
}
