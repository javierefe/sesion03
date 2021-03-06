package com.mitocode.ejercicio2.lambda;

public class Programa2 {
	public static void main(String[] args) {
		
		IOperacion op1 = new IOperacion() {

			@Override
			public int suma(int n1, int n2) {
				int z= 10;
				return n1 + n2 + z;
			}
			
		};
		
		System.out.println("Suma: " + op1.suma(5, 3));
		
		
		IOperacion op2 = (x,y) -> {
			int z = 10;
			return x + y + z;
		};
		
		//con lambda
		System.out.println("Suma: " + op2.suma(5, 3));
		
//		lambda sin argumentos		
		IOperacionSinParametros op3 = () -> Math.PI;
		System.out.println( "El valor de PI: " +   op3.operacion());
		
		
		
	}
}
