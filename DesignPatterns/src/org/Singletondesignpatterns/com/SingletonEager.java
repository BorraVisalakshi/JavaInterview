package org.Singletondesignpatterns.com;

public class SingletonEager {
	
	private static final SingletonEager EAGER = new SingletonEager();
	private SingletonEager() {
		
	}

	public static SingletonEager getInstance() {
		
		return EAGER;
   }

}

/* dont want it to initailize myltiple times only once it gets loaded
 * 
 * **/
