package com.barthezzko.concurrency;

import org.junit.Test;

public class ThreadSimple {

	
	@Test
	public void runThreads(){
		Thread t = new Thread(){
			private int i; 
			public void run(){
				for (i=0; i<100;i++){
					System.out.println(i);
				}
			}
			
			protected void finalize(){
				System.out.println("finalizing i at " + i);
			}
		};
		t.setDaemon(true);
		t.start();
	}
}
