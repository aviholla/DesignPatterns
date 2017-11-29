package com.aviholla.creation.singleton;

public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton () {}
	
	// complete method in synchronized mode
	/*public static synchronized ThreadSafeSingleton getInstance () {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		
		return instance;
	}*/
	
	// synchronize only instance creation
	public static ThreadSafeSingleton getInstance () {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				instance = new ThreadSafeSingleton();
			}
		}
		
		return instance;
	}


}
