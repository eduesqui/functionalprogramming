package com.eduesqui.functionalprogramming.examples;


@FunctionalInterface
public interface DefaultMethodDemo<S, U, P> {
	
	public Double getScore(Double s1, Double s2);
	
	public default boolean isApproved(Double s1, Double s2) {
		if(getScore(s1, s2)>=6) {
			return true;
		}
		return false;
	}
	
}
