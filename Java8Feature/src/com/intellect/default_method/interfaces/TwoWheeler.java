package com.intellect.default_method.interfaces;

public interface TwoWheeler {

	// Default method
	default void print() {
		System.out.println("I am two wheeler");
	}

	// Static Default method
	static void blowHorn() {
		System.out.println("Blowing horn!!");
	}
}
