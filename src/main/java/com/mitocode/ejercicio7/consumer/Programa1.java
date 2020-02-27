package com.mitocode.ejercicio7.consumer;

import java.util.function.Consumer;

public class Programa1 {
	public static void main(String[] args) {
		
//		IConsumer ic = new IConsumer() {
//
//			@Override
//			public void accept(String s) {
//				// TODO Auto-generated method stub
//				System.out.println("Imprime: " + s);
//			}
//		};
		
		IConsumer<String> ic = (v) -> System.out.println(v);
		ic.accept("Dany");
		
		IConsumer<Integer> ic2 = (v) -> System.out.println(v);
		ic2.accept(22);
		
		Consumer<String> c1 = (v) -> System.out.println(v);
		c1.accept("Dany 2");
		
		Consumer<Integer> c2 = (v) -> System.out.println(v);
		c2.accept(322);
		
	}
}
