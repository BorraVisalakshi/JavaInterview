package org.Singletondesignpatterns.com;

public class SingletonLazy {
	
	private static SingletonLazy lazy = null;
	
	private SingletonLazy() {
		
	}
	
	public static SingletonLazy getLzay() {
		
		if (lazy == null) {
			try {
				Thread.sleep(2000);
				lazy = new SingletonLazy();
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		return lazy;
	}

}
