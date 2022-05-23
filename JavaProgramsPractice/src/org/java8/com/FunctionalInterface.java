package org.java8.com;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		
		//Functional Interfaces
		//1)Predicate -> input and output is boolean
		
		Predicate<String> predicate = str -> str.length()>=5;
		predicate.test("Hellooo");
		System.out.println(predicate.test("Hello"));
		
		//2)Consumer -> Only input no output
		FunctionalInterface fi = new FunctionalInterface();
		
		Consumer<FunctionalInterface> consumer = x -> x.setName("Vishali");
		
		consumer.accept(fi);
		System.out.println(fi.getName());
		
		//3) Functions -> both input and output - Single paramter -> direct variable for lambda expressions
		Function<Integer, String> func = x -> (x*10)+"Data is multiplied by 10";
		
		func.apply(4);
		System.out.println(func.apply(4));
		
		//4 Supplier-> only output no input -> if No input - empty paranthesis for lambda expressions
		Supplier<Double> sup = () -> Math.random();
		sup.get();
		System.out.println(sup.get());
		
	}

}
