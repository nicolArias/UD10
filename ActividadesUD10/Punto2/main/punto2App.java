package main;

import miExcepcion.ExcepcionCustomizada;

public class punto2App {

	public static void main(String[] args) {
		
		try {
			throw new ExcepcionCustomizada(27);

		} catch (ExcepcionCustomizada e) {
			System.out.println(e.getMessage());
		}

	}

}
