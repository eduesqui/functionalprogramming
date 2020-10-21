package com.eduesqui.functionalprogramming.examples;

import java.util.function.Predicate;

import com.eduesqui.functionalprogramming.pojos.Student;

public class PredicateDemo {
	
	public static void predicateExample() {
		
		Student student = new Student("Juan", 8);
		Predicate<Student> predicate = x -> x.score >=6;
		
		System.out.println("Student approved: " + predicate.test(student));
	}

}
