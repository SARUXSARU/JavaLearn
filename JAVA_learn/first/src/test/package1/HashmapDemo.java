package test.package1;
import java.util.Map;

import java.util.HashMap;

public class HashmapDemo {
	
	public static void main(String[] arg)
	{
		Map<String,Integer> map= new HashMap<>();
		
		map.put("a", 10);
		map.put("b", 20);
		map.put("c", 30);
		map.put("a", 15); // we can overwrite key
		
		System.out.println(map.size());
		System.out.println(map);
		
		if(map.containsKey("a"))
		{
			Integer a = map.get("a");
			System.out.println("value of a: "+ a);
		}
		
		for(String key : map.keySet())
		{
			System.out.println("key: " + key + " " + map.get(key));
		}
		
	}

}
