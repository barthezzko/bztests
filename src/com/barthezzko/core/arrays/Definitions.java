package com.barthezzko.core.arrays;

public class Definitions {

	static {
		int [] array;
		//delayed init
		array = new int[2];
		array = new int[2434];
		//whty not? that's just a ref
		int array2 [] = {2,3,4};
		//array2 = {1,2,3}; <-- not ok! only into the initializers
		
		Object [][] objects = {{"a", "b"}, {"c"}};
	}
}
