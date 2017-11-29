package com.aviholla.creation.abstractfactory;

import com.aviholla.creation.factory.Computer;

public class ComputerFactory {
	
	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}
}
