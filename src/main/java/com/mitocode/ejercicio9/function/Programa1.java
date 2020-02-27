package com.mitocode.ejercicio9.function;

import java.util.function.Function;

public class Programa1 {

	public static void main(String[] args) {
		
		// el input en un entero y el resultado un entero 
		IFunction<Integer, Integer>  fn  = (x) -> x*x;
		int resultado = fn.apply(5);
		System.out.println(resultado);	
		
		
		IFunction<Double, Double>  fn2  = (x) -> x*x;
		double decimal = fn2.apply(5.0);
		System.out.println(resultado);	
		
		Function<Integer, Integer>  fn3  = (x) -> x*x;
		resultado = fn3.apply(6);
		System.out.println(resultado);	
		
		
		Function<Double, Double>  fn4  = (x) -> x*x;
		decimal = fn4.apply(6.0);
		System.out.println(resultado);
		
		
	}

}
