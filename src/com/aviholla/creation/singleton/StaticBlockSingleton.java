package com.aviholla.creation.singleton;

public class StaticBlockSingleton {
	
	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton(){}
	
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured during creation of StaticBlockSingleton");
		}
	}
	
	public static StaticBlockSingleton getInstance () {
		return instance;
	}

}
