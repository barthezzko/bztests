package com.barthezzko.core.operators;

import org.junit.Test;

public class TypeChanges {
	
	@Test
	public void testIntLong(){
		int a = 5;
		long b = 100;
		a=(int) (a*b);
		a*=b; //<-compound operator not need to cast
	} 

}
