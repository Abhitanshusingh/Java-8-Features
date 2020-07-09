package com.intellect.default_method.interfaces;

public interface FourWheeler {

	default void print() {
		System.out.println("I am four wheeler!");
	}
}
