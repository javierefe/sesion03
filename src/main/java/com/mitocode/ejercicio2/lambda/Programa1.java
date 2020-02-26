package com.mitocode.ejercicio2.lambda;

public class Programa1 {

	public static void main(String[] args) {
		
		IOperacion o1 = new IOperacion() {

			@Override
			public int suma(int n1, int n2) {
				// TODO Auto-generated method stub
				return n1 + n2;
			}

//			@Override
//			public int resta(int n1, int n2) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
			
		};
		// int resultado = o1.suma(5, 3);
		System.out.println("resultado  = " + o1.suma(5, 3));
//		System.out.println("resultado  = " + o1.resta(5, 3));
		
		
		//usando expresion lambda
		IOperacion o2 = (int x, int y) -> x + y;
		IOperacion o3 = (int x, int y) -> x - y;
		System.out.println("resultado  = " + o2.suma(5, 3));
//		lo ideal seria cambiarle el nombre al metodo 
		System.out.println("resultado  = " + o3.suma(5, 3));
		
		
		
		
		
		
	}

}
