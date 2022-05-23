package org.Singletondesignpatterns.com;

public class SingletonStatic {
  
	private static SingletonStatic single = null;
	
	private SingletonStatic() {
		
	}
	static {
		if(single == null) {
			
			single = new SingletonStatic();
		}
	}
	public static SingletonStatic getInstanceStatic() {
		
		return single;
	}
}
