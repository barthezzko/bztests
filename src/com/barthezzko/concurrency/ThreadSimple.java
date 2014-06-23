package com.barthezzko.concurrency;

import org.junit.Test;

public class ThreadSimple {

	
	@Test
	public void runThreads(){
		Thread t = new Thread(){
			public void run(){
				for (int i=0; i<100;i++){
					System.out.println(i);
				}
			}
		};
		t.setDaemon(true);
		t.start();
	}
}
