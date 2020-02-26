package com.mitocode.ejercicio3.scope;

public class Programa1 {
	
	//variable global
	int entero;
	float flotante;
	double decimal;
	String cadena;
	boolean estado;
	
	public void variableGlobales() {
		System.out.println("int = " + entero);
		System.out.println("floar = " + flotante);
		System.out.println("double = " + decimal);
		System.out.println("String = " + cadena);
		System.out.println("boolean = " + estado);
	}
	
	public void variableLocales() {
		int entero2 = 10;
		double decimal2=0;
		System.out.println(entero2);
		//varibales locales deben ser inicializadas
		System.out.println(decimal2);
	}
	
	public static void main(String[] args) {
		
		Programa1 p = new Programa1();
		p.variableGlobales();

	}

}
