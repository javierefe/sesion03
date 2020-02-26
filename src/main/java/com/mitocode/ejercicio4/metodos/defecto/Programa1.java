package com.mitocode.ejercicio4.metodos.defecto;

public class Programa1 {

	public static void main(String[] args) {
		
		IOperacion op = (x,y) -> x + y;
		
		
		System.out.println("La suma es : " + op.suma(5,3));
		
		System.out.println("PI: " + op.valorPI());
		
//		System.out.println(op.metodoDefecto());
		
		System.out.println("javier");
		
		System.out.println("Resta: " + op.resta(5, 3));
		
		
		
		
		

	}

}
