package collections.set;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

public class HashSetTests {
	
	
	@Test
	public void test(){
		HashSet<String> set = new HashSet<String>(Arrays.asList("I like to watch porn films".split(" ")));
		System.out.println(set.add("meow"));
		System.out.println(set.add("meow"));
		System.out.println(set);
	}
	

}
