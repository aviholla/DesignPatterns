package com.aviholla.creation.test;

import com.aviholla.creation.builder.Computer;

public class TestBuilderPattern {
	public static void main(String[] args) {
		// Using builder to get the object in a single line of code and
		// without any inconsistent state or arguments management issues
		Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
		
		System.out.println("Compter Config:: " + comp);
		
		comp = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(false)
				.setGraphicsCardEnabled(true).build();
		
		System.out.println("Compter Config:: " + comp);
	}
}
