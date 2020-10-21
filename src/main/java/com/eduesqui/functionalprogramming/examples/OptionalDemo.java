package com.eduesqui.functionalprogramming.examples;

import java.util.Optional;

public class OptionalDemo {
	
	
	static public String getSecondName() {
		return null;
	}
	static public String getFistName() {
		return "Juan";
	}
	
	static public Optional<String> getSecondNameWithOptional() {
		return Optional.ofNullable(getSecondName());
	}
	
	static public void getOldWay() {
		System.out.println(getSecondName().length());
	}
	
	static public void getOptionalWay() {
		Optional<String> secondName= getSecondNameWithOptional();
        if (secondName.isPresent()) {
        	System.out.println(secondName.get().length());
        }
	}
	
	static public void getOptionalWay2() {
		Optional<String> secondName= getSecondNameWithOptional();
        System.out.println(secondName.orElse("Paco"));
	}
	
	static public void getOptionalWay3() {
		Optional<String> secondName= getSecondNameWithOptional();
        System.out.println(secondName.orElseGet(OptionalDemo::getFistName));
	}
	
	
	
}
