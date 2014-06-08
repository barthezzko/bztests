package com.barthezzko.core;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class StringIntern {
	
	@Test
	public void testIntern(){
		String a = "aaa";
		String b = new String("aaa");
		String c = new String("aaa").intern();
		assertFalse(a==b);
		assertTrue(a==c);
		assertTrue("Hel" + "lo" == "Hello");
		String str1 = "abc";
		String str2 = "ab"; 
		String str3 = str2 + "c"; 
		assertFalse(str3 == str1);
		//WHY???
	}
	
	@Test
	public void testInternHashesGCCollected(){
		String a = "aaaa";
		int aCode = a.hashCode();
		System.gc();
		String b = new String("a") + new String("aaa");
		int bCode = b.hashCode();
		assertTrue(aCode == bCode);
		//Can't be garbage collected :(
	}

}
