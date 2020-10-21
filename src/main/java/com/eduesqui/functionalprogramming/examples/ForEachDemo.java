package com.eduesqui.functionalprogramming.examples;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {
	
	
	
	public static List<String> removeElement(List<String> listaNombres) {
		listaNombres.removeIf(x-> x.equals("Juan"));
		return listaNombres;
	}
	
	public static void printList(List<String> listaNombres) {
		listaNombres.forEach(x-> System.out.println(x));
	}
	
	
	public static void testList() {
		List<String> listaNombres = new ArrayList();
		listaNombres.add("Juan");
		listaNombres.add("Carlos");
		listaNombres.add("Luis");
		listaNombres.add("Jorge");
		printList(listaNombres);
		System.out.println("-----------------------------------");
		listaNombres =removeElement(listaNombres);
		printList(listaNombres);
		
	}

}
