package test.package1;

import java.util.TreeMap;

public class TreeHashDemo {
	
	public static void main(String[] arg)
	{
		TreeMap<Integer, String> map = new TreeMap<>(); // we can also key: string value: integer 
		map.put(3, "A");
		map.put(4, "C");
		map.put(2, "B"); // it will be sorted by key: numbers 
		
		System.out.println(map);
		
	
	
	

	
		
	}
}
