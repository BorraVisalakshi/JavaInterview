package org.Singletondesignpatterns.com;

public class ClientClass {
	
	public static void main(String[] args) {
		
	// Singleton Eager Loading
		
//		SingletonEager s1 = SingletonEager.getInstance();
//		System.out.println(s1.hashCode());
//		SingletonEager s2 = SingletonEager.getInstance();
//		System.out.println(s2.hashCode());
//		SingletonEager s3 = SingletonEager.getInstance();
//		System.out.println(s3.hashCode());
		
		//Singleton Static Loading
		
//		SingletonStatic staticsingle = SingletonStatic.getInstanceStatic();
//		System.out.println(staticsingle.hashCode());
//		
//		SingletonStatic staticsingle1 = SingletonStatic.getInstanceStatic();
//		System.out.println(staticsingle1.hashCode());
//		
//		SingletonStatic staticsingle2 = SingletonStatic.getInstanceStatic();
//		System.out.println(staticsingle2.hashCode());
		
		//Singleton Lazy Loading
		SingletonLazy sl = SingletonLazy.getLzay();
		System.out.println(sl.hashCode());
		
		SingletonLazy sl1 = SingletonLazy.getLzay();
		System.out.println(sl1.hashCode());
		
		SingletonLazy sl2 = SingletonLazy.getLzay();
		System.out.println(sl2.hashCode());
		
	}

}
