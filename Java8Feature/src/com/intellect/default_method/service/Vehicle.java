package com.intellect.default_method.service;

import com.intellect.default_method.interfaces.FourWheeler;
import com.intellect.default_method.interfaces.TwoWheeler;

public class Vehicle implements TwoWheeler, FourWheeler {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.print();
	}
	@Override
	public void print() {
		FourWheeler.super.print();
		TwoWheeler.super.print();
		TwoWheeler.blowHorn();
	}
}
