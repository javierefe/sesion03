package com.mitocode.ejercicio6.referencias.metodos;

import java.util.Arrays;

public class Programa1 {
	
	
	static void referenciaMetodoStatic() {
		
		System.out.println("Metodo static");
	}
	
	
	public static void main(String[] args) {
		
		IOperacion op1 = () -> {
			int x = 5;
			int y = 3;
			System.out.println("Hojas: " + (x+y));
		};
		op1.imprimir();
		
		
		//LAMBDA SE LE ENVIA SOLO METODOS ESTATICO Y SIN PARAMETROS
		//Refenciar a un metodo estatico
		IOperacion op2 = () -> Programa1.referenciaMetodoStatic();
		op2.imprimir();
		
		
		//simplificado de lo de arriba, requisito es que el metodo estatico no tenga parametros
		IOperacion op3 = Programa1::referenciaMetodoStatic;
		op3.imprimir();
		
		
		System.out.println(" ");
		String[] colores = {"negro","amarillo","verde","azul","vileta"};
		System.out.println("Colores : ");
		for (String color : colores) {
			System.out.print(color + " ");
		}
		System.out.println(" ");
		Arrays.sort(colores, String::compareTo); //compareToIgnoreCase ignora las mayusculas
		System.out.println("\nColores ordenados: ");
		for (String color : colores) {
			System.out.print(color + " ");
		}
				
				
				
				
		

	}

}
