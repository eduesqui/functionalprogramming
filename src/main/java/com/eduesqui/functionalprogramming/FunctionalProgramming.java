package com.eduesqui.functionalprogramming;

import java.util.function.Function;

import com.eduesqui.functionalprogramming.examples.ConsumerSupplierDemo;
import com.eduesqui.functionalprogramming.examples.DefaultMethodDemo;
import com.eduesqui.functionalprogramming.examples.ForEachDemo;
import com.eduesqui.functionalprogramming.examples.FunctionDemo;
import com.eduesqui.functionalprogramming.examples.PredicateDemo;
import com.eduesqui.functionalprogramming.examples.SAMInterfaceDemo;
import com.eduesqui.functionalprogramming.examples.StreamDemo;
import com.eduesqui.functionalprogramming.pojos.Student;
import com.eduesqui.functionalprogramming.examples.MethodReferenceDemo;
import com.eduesqui.functionalprogramming.examples.OptionalDemo;

public class FunctionalProgramming {
	
	public static void main(String[] args) {
		System.out.println("Start example");
		//FunctionalProgramming.functionDemo();
		//FunctionalProgramming.predicateDemo();
		//FunctionalProgramming.consumerSupplierDemo();
		//FunctionalProgramming.funtionalIterfaceDemo();
		//FunctionalProgramming.defaultMethodDemo();
		//FunctionalProgramming.methodReferenceDemo();
		//FunctionalProgramming.optionalDemo();
		//FunctionalProgramming.forEachDemo();
		//FunctionalProgramming.streamsDemo();

	}
	
	static void predicateDemo() {
		System.out.println("Predicate Example");
		PredicateDemo.predicateExample();
		
	}
	
	static void functionDemo() {
		System.out.println("Function demo example");
		
		Function funtionExample =FunctionDemo.functionExample();
		System.out.println(funtionExample.apply("Hello"));
		
		Function functionLambdaSintaxis =FunctionDemo.functionLambdaSintaxis();
		System.out.println(functionLambdaSintaxis.apply("Hello Word"));
	}
	
	static void consumerSupplierDemo() {
		System.out.println("Supplier Example");
		ConsumerSupplierDemo.supplierDemo();
		System.out.println("Consumer Example");
		ConsumerSupplierDemo.consumerDemo();
	}
	
	static void funtionalIterfaceDemo() {
		System.out.println("Functional Interface Example");
		SAMInterfaceDemo<Double, Double, Double> finalScoreMath = (s1,s2) -> s1*.4 + s2*.6;
		System.out.println(finalScoreMath.getScore(8.0, 9.0));
		
		SAMInterfaceDemo<Double, Double, Double> finalScoreEnglish = (s1,s2) -> s1*.3 + s2*.7;
		System.out.println(finalScoreEnglish.getScore(7.0, 7.5));
	}
	
	
	static void defaultMethodDemo() {
		System.out.println("Default Method Example");
		DefaultMethodDemo<Double, Double, Double> finalScoreMath = (s1,s2) -> s1*.4 + s2*.6;
		System.out.println(finalScoreMath.isApproved(5.5, 7.0));
	}
	
	static void methodReferenceDemo() {
		System.out.println("Reference :: Example");
		MethodReferenceDemo reference = new MethodReferenceDemo();
		DefaultMethodDemo<Double, Double, Double> finalScoreMath=reference::congratulationMessage;
		System.out.println(finalScoreMath.isApproved(5.0, 8.0));	
	}
	
	static void optionalDemo() {
		System.out.println("Optional  Example");
		OptionalDemo.getOptionalWay();
		OptionalDemo.getOptionalWay2();
		OptionalDemo.getOptionalWay3();
	}
	
	static void forEachDemo() {
		System.out.println("ForEach Example");
		ForEachDemo.testList();
	}
	
	static void streamsDemo() {
		System.out.println("Streams Example");
		StreamDemo.testStreams();
	}
	

}
