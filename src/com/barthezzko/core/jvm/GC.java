package com.barthezzko.core.jvm;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GC {

	@Test
	public void testGC(){
		assertFalse(false);
		assertTrue(true);
	}
	
	@Test
	public void testFinalize() throws Exception{
		new ObjectToClean();
		//obj.finalize();
		System.gc();
	}
	
	
}

class ObjectToClean{
	public void finalize() throws Exception{
		System.out.println("i'm garbage collected");
		throw new Exception("Collection failed");
	}
}

