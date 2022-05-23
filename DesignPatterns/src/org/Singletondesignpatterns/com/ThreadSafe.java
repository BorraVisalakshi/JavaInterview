package org.Singletondesignpatterns.com;

public class ThreadSafe implements Runnable{

	@Override
	public void run() {
		
		SingletonThreadSafe threadsafe = SingletonThreadSafe.getThreadSafe();
		
		System.out.println(Thread.currentThread().getName()+" "+ threadsafe.hashCode());
		
	}
	

}
