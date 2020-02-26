package com.mitocode.ejercicio1.lambda.intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Programa2 {

	public static void main(String[] args) {
		
		List<Empleado> lista = new ArrayList<>(); 
		
		Empleado e1 = new Empleado("Dany", 2000, 29);
		Empleado e2 = new Empleado("Juan", 1500, 25);
		Empleado e3 = new Empleado("Pedro", 2300, 32);
		
		lista.add(e1);
		lista.add(e2);
		lista.add(e3);
		

	
		//comparacion por nombres 
//		Comparator<Empleado> comparatorNombre = new Comparator<Empleado>() {
//			@Override
//			public int compare(Empleado o1, Empleado o2) {
//				return -o1.getNombres().compareTo(o2.getNombres());
//			}
//		
//		};
		
//		Collections.sort(lista, comparatorNombre);
//		System.out.println("Lista empleados ordenados por nombre:  ");
//		for (Empleado empleado : lista) {
//			System.out.println(empleado);
//		}
		
//		
//		//comparacion por edad
//		Comparator<Empleado> comparatorEdad = new Comparator<Empleado>() {
//			@Override			
//			public int compare(Empleado o1, Empleado o2) {
//				if(o1.getEdad() < o2.getEdad()) {
//					return -1;
//				}else if(o1.getEdad() > o2.getEdad()) {
//					return 1;
//				}else {
//					return 0;
//					}
//			}
//			
//		};
		
//		Collections.sort(lista, comparatorEdad);
//		System.out.println("Lista empleados ordenados por edad:  ");
//		for (Empleado empleado : lista) {
//			System.out.println(empleado);
//		}
		
//		//comparacion por sueldo
//		Comparator<Empleado> comparatorSueldo = new Comparator<Empleado>() {
//			@Override
//			public int compare(Empleado o1, Empleado o2) {
//				if(o1.getSueldo() > o2.getSueldo()) {
//					return -1;
//				}else if(o1.getSueldo() < o2.getSueldo()) {
//					return 1;
//				}else {
//					return 0;
//				}
//			}
//			
//		};
		
//		Collections.sort(lista, comparatorSueldo);
//		System.out.println("Lista empleados ordenados por sueldo:  ");
//		for (Empleado empleado : lista) {
//			System.out.println(empleado);
//		}
		
		
//		lista.sort(comparator);
//		System.out.println("lista sort empleados con comparator: ");
//		for (Empleado empleado : lista) {
//			System.out.println(empleado);
//		}
		
		lista.sort(new Comparator<Empleado>(){

			@Override
			public int compare(Empleado o1, Empleado o2) {
				// TODO Auto-generated method stub
				return o1.getNombres().compareTo(o2.getNombres());
			}
			
		});
		
		//ordenamiento por nombres
		lista.sort(( o1, o2) -> o1.getNombres().compareTo(o2.getNombres()));
			
		
		System.out.println("lista sort empleados con comparator: ");
		for (Empleado empleado : lista) {
			System.out.println(empleado);
		}
		
		//ordenamiento por edad
		//lista.sort(( o1, o2) -> o1.getEdad().compareTo(o2.getEdad()));
			
		
		System.out.println("lista sort empleados con comparator: ");
		for (Empleado empleado : lista) {
			System.out.println(empleado);
		}
		
		
		
		
	
		
		
		
		

		
		
		
		
		
		
		
		
		
	}

}
