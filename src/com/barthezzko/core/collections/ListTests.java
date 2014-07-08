package com.barthezzko.core.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

import org.junit.Test;

public class ListTests {
	
	@Test
	public void addDuplicates(){
		List<String> strings = new ArrayList<>();
		strings.add("hello");
		strings.add("hello");
		strings.add("hello");
		strings.add("world");
		System.out.println(strings);
	}
	
	@Test
	public void doublyLinked(){
		List<Integer> ints = new LinkedList<>(Arrays.asList(1,2,3));
		ListIterator<Integer> iter = ints.listIterator();
		System.out.print("next > ");
		while(iter.hasNext()) System.out.print(iter.next());
		System.out.print(" previous < ");
		while(iter.hasPrevious()) System.out.print(iter.previous());
	}
	
	@Test
	public void vector(){
		Vector<String> vector = new Vector<>();
		vector.add("a");
		vector.add("b");
		vector.add("c");
		vector.add("d");
		vector.add("e");
		vector.ensureCapacity(6);
	}
}
