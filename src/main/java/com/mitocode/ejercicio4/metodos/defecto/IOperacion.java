package com.mitocode.ejercicio4.metodos.defecto;

@FunctionalInterface //garantiza que solo haya un solo metodo abstracto para que se una interfaz funcional 
public interface IOperacion {
	//interfaz funcional , un unico metodo abstratc0 
	//metodo publico abstracto
	int suma(int x, int y);
	
	
	//metodos por default java8 
	
	default void metodoDefecto() {
		
		System.out.println("Metodo por defecto sin parametros ");
	}
	
	default void metodoDefecto(String operacion) {
		System.out.println("Metodo por defecto sin parametros ");
	}
	
	default double valorPI() {
		return Math.PI;
	}
	
	default int resta(int x, int y) {
		return x - y;
	}
	
	
}
