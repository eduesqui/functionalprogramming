package com.eduesqui.functionalprogramming.examples;

import java.util.function.Consumer;
import java.util.function.Supplier;

import com.eduesqui.functionalprogramming.pojos.Student;

public class ConsumerSupplierDemo {
	
	public static void supplierDemo() {
		Supplier<Student> studentSupplier = () -> new Student("Juan Supplier", 8);
		System.out.println(studentSupplier.get().toString());
	}
	public static void consumerDemo() {
		Student student = new Student ("Juan Consumer", 9);
		Consumer<Student> studentConsumer = oneStudent -> System.out.println(oneStudent.toString());
		studentConsumer.accept(student);
	}
}
