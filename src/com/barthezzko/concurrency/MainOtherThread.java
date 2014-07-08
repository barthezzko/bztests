package com.barthezzko.concurrency;

import org.junit.Test;

public class MainOtherThread {

	@Test
	public void startThread() throws InterruptedException {
		PrimeCalculator pc = new PrimeCalculator();
		pc.setStillWorking(true);
		Thread t = new Thread(pc);
		t.start();
		System.out.println("start thread");
		Thread.sleep(500);
		pc.setStillWorking(false);
		System.out.println("stop calc -----------------");
		Thread.sleep(500);
		System.out.println("stop main");
	}

}

class PrimeCalculator implements Runnable {

	private boolean stillWorking;

	@Override
	public void run() {
		int i = 0, prime=0;
		while (stillWorking) {
			i++;
			if (isPrime(i)) {
				prime++;
				System.out.println(prime + ". prime: " + i);
			}
		}
		System.out.println("stillWorking -> false");
	}

	boolean isPrime(int n) {
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

	public boolean isStillWorking() {
		return stillWorking;
	}

	public void setStillWorking(boolean stillWorking) {
		this.stillWorking = stillWorking;
	}

}
