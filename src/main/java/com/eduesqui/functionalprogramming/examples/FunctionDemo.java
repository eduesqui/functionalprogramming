package com.eduesqui.functionalprogramming.examples;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
	
	/**
	 * Metodo que regresa una function
	 * @return Function
	 */
	public static Function<String,String> functionExample() {
		System.out.println("Functional Demo");
		
		//.........Type,Result
		Function<String, String> function = new Function<String, String>() {

			@Override
			public String apply(String msg) {
				// TODO Auto-generated method stub
				return msg + " !!! ";
			}
			
		};
		
		return function;
		
	}
	
	/**
	 * Se metodo que regresa una funcion con sintaxis simplificada
	 * @return Function
	 */
	public static Function<String,Integer> functionNewSintaxis() {
		Function<String, Integer> counter  = x -> x.length();
		return counter;
	}
	
	/**
	 * Se metodo que regresa una funcion con sintaxis simplificada
	 * @return Function
	 */
	public static Function<String,Integer> functionLambdaSintaxis() {
		return x -> x.length();
	}
	
	
	public static BiFunction<Integer,Integer,Integer> funcionParameters() {
		
		return (x,y)->x*y+1;
	}
	
	public static Function<Integer,Integer> functionMultipleOperations(){
		return (x)->{
			x=x * 2;
			x++;
			x= x* 5;
			return x;
		};
	}

	
}
