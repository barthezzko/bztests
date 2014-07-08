package collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

public class Maps {

	//@Test
	public void testMap() {
		System.out.println("HASHMAP");
		HashMap<Integer, Double> rnd = new HashMap<>();
		for (int i = 0; i < 100; i++) {
			rnd.put(i, Math.random());
		}
		for (int k: rnd.keySet()){
			System.out.println(k + " = " + rnd.get(k));
		}
		//no ordering at all
	}
	
	//@Test
	public void test(){
		System.out.println("LINKED");
		Map<Integer, Double> rnd = new LinkedHashMap<>();
		for (int i = 0; i < 100; i++) {
			rnd.put(i, Math.random());
		}
		for (int k: rnd.keySet()){
			System.out.println(k + " = " + rnd.get(k));
		}
		//arranged using the keyset order
	}
	
	@Test
	public void testTreeMap(){
		System.out.println("TREEMAP");
		Map<Integer, Double> rnd = new TreeMap<>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return String.valueOf(o1).compareTo(String.valueOf(o2));
			};
		});
		for (int i = 0; i < 100; i++) {
			rnd.put(i, Math.random());
		}
		for (int k: rnd.keySet()){
			System.out.println(k + " = " + rnd.get(k));
		}
		//arranged using the keyset order
	}
	

}
