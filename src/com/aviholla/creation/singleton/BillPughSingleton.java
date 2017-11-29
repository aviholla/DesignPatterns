package com.aviholla.creation.singleton;

public class BillPughSingleton {

	private BillPughSingleton () {}
	
	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton ();
		
		
	}
	
	public static BillPughSingleton getInstabnce () {
		return SingletonHelper.INSTANCE;
	}
}
