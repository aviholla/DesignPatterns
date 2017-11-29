package com.aviholla.creation.abstractfactory;

import com.aviholla.creation.factory.Computer;
import com.aviholla.creation.factory.PC;

public class PCFactory implements ComputerAbstractFactory {
	private String ram;
	private String hdd;
	private String cpu;

	public PCFactory(String ram, String hdd, String cpu) {
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
	}
	
	@Override
	public Computer createComputer() {
		return new PC(ram, hdd, cpu);
	}

}
