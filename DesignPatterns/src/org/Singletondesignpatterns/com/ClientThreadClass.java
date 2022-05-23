package org.Singletondesignpatterns.com;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientThreadClass {
	
	public static void main(String[] args) {
		ThreadSafe ts = new ThreadSafe();
		
		ExecutorService es = null;
		try {
			es = Executors.newFixedThreadPool(8);
			es.execute(ts);
			es.execute(ts);
			es.execute(ts);
			es.execute(ts);
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			if(es != null) {
				es.shutdown();
			}
			
		}
	
	}

}
