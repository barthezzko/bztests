package com.barthezzko.core.byvalue;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class ByValuePassingArgument {
	
	@Test
	public void testPassing(){
		Cat catA =  new Cat();
		assertFalse(catA.isKicked());
		Cat catB = kickACat(catA);
		assertTrue(catA.isKicked());
		assertTrue(catB.isKicked());
	}
	
	@Test
	public void testPassingPrimitive(){
		int a = 10;
		assertTrue(a == 10);
		int b = increment(a);
		assertFalse(b == 10);
		assertTrue(a == 10);
	}
	
	public int increment(int incomin){
		return ++incomin;
	}
	public Cat kickACat(Cat cat){
		cat.setKicked(true);
		return cat;
	}
	
}

class Cat{
	
	private boolean isKicked;

	public boolean isKicked() {
		return isKicked;
	}

	public void setKicked(boolean isKicked) {
		this.isKicked = isKicked;
	}
		
}
