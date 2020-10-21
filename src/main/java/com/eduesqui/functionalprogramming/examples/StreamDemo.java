package com.eduesqui.functionalprogramming.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.eduesqui.functionalprogramming.pojos.Group;
import com.eduesqui.functionalprogramming.pojos.Student;

public class StreamDemo {
	
	public static void printStream(Stream<String> stringNumbers) {
		
		stringNumbers.forEach(System.out::println);
	}
	
	public static void streamMap(Stream<String> stringNumbers) {
		Stream<Integer> integerStream = stringNumbers.map(number->Integer.parseInt(number)*10);
		integerStream.forEach(System.out::println);	
		
		
	}
	
	public static Stream<String>createStream(){
		Stream<String> stringNumbers =  Stream.of("1","2","3","4","5","6","7","8","9","10");
		return stringNumbers;
	}
	
	public static void streamFilter(Stream<String> stringNumbers) {
		stringNumbers.map(number->Integer.parseInt(number)*10).filter(x-> x>= 60).forEach(System.out::println);
		
	}
	
	public static void streamFlatMap(Stream<Group> groupsStream) {
		groupsStream.flatMap(x->x.getStudents().stream()).forEach(y -> System.out.println(" Felicitaciones" + y.name ));
	}
	
	
	public static Stream<Group> createGroupStream() {
		Group groupA = new Group();
		groupA.setGroupName("Group A");
		
		Group groupB = new Group();
		groupB.setGroupName("Group B");
		
		Student s1 = new Student("Juan", 5);
		Student s2 = new Student("Carlos", 7);
		Student s3 = new Student("Luis", 8);
		Student s4 = new Student("Santiago", 8);
		Student s5 = new Student("Felipe", 9);
		Student s6 = new Student("Leo", 10);
		
		List<Student> studentA = new ArrayList<>();
		studentA.add(s1);
		studentA.add(s2);
		studentA.add(s3);
		
		List<Student> studentB = new ArrayList<>();
		studentB.add(s4);
		studentB.add(s5);
		studentB.add(s6);
		
		groupA.setStudents(studentA);
		groupB.setStudents(studentB);
		
		List<Group> groups = new ArrayList<Group>();
		groups.add(groupA);
		groups.add(groupB);
		
		return groups.stream();
		
		
	}
	
	public static void testStreams() {
		printStream(createStream());
		System.out.println("---------");
		streamMap(createStream());
		System.out.println("---------");
		streamFilter(createStream());
		System.out.println("---------");
		streamFlatMap(createGroupStream());
	}

}
