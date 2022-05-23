package org.Singletondesignpatterns.com;

public class SingletonThreadSafe {
	
	private static SingletonThreadSafe tsafe = null;
	
	private SingletonThreadSafe() {
		
	}
	public static SingletonThreadSafe getThreadSafe() {
		
		if(tsafe == null) {
			synchronized (SingletonThreadSafe.class) {
				if(tsafe == null) {
				try {
					Thread.sleep(2000);
					tsafe = new SingletonThreadSafe();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
		}
		
	}
		return tsafe;
	}
}
