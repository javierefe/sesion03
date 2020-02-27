package com.mitocode.ejercicio91.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programa1 {

	public static void main(String[] args) {
		
		List<Empleado> lista = new ArrayList<>();
		
		Empleado e1 = new Empleado("Dany", 200 , 29, "java");
		Empleado e2 = new Empleado("Juan", 1500 , 25,".Net" );
		Empleado e3 = new Empleado("Pedro", 200 , 32,"python");
		
		lista.add(e1);
		lista.add(e2);
		lista.add(e3);
		
		lista.stream().forEach(e -> System.out.println(e));
		
		//contar empleados
		int c=0;
		for (int i = 0; i < lista.size(); i++) {
			c++;
		}
		System.out.println("# empleados: "+ c);
		
		//usando stream
		long count = lista.parallelStream().count();
		System.out.println("# empleados: " + count);
		
		//ordenar ascendente 
		lista.stream().sorted((x,y) -> x.getNombres().compareTo(y.getNombres())).forEach(e -> System.out.println(e));
		//ordenar descendente
		lista.stream().sorted((x,y) -> y.getNombres().compareTo(x.getNombres())).forEach(e -> System.out.println(e));
		
		//filtros
		
		//uso de predicate
		System.out.println("Empleados que empiezan con D");
		lista.stream().filter(e -> e.getNombres().startsWith("D") ).forEach(e -> System.out.println(e));
		
		
		System.out.println("Empleados que empiezan con  D o P");
		lista.stream().filter(e -> e.getNombres().startsWith("D")||e.getNombres().startsWith("P") ).forEach(e -> System.out.println(e));
		
		System.out.println("Empleados que son mayores a 25 y tienen skill java");
		lista.stream().filter(e -> e.getEdad() > 25 && e.getSkill().equals("Java")).forEach(e -> System.out.println(e));
		
		//limitar
		System.out.println("\n EMpleados 2 primeros: ");
		lista.stream().limit(2).forEach(System.out::println);
		
		System.out.println(" ");
		lista.stream().sorted((x,y) -> -x.getNombres().compareTo(y.getNombres())).limit(2).forEach(e -> System.out.println(e));
		
		System.out.println("\n Lista nueva");
		List<Empleado> listaNueva = lista.stream().filter(e -> e.getSueldo()>1500).collect(Collectors.toList());
		listaNueva.forEach(System.out::println);
		
//		String nombre = "Dany";
//		boolean estado = nombre.startsWith("D");
//		System.out.println(estado);
//		
		
		
		
		
		
	}

}
