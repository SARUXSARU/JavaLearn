package test.package1;
import java.util.*;
public class HashDemo {
	
	public static void main(String[] arg) {
		
		Set<String> hash = new HashSet<>();
		
		hash.add("A");
		hash.add("B");
		boolean r1= hash.add("C");
		System.out.println(r1);
		boolean r2= hash.add("C"); // only unique properties in set that is why false
		System.out.println(r2);
		
		System.out.print(hash);
		
		System.out.println(hash.contains("C")); // if contain then true else false
		
		hash.remove("A");
		System.out.println(hash);
		
		for(String item : hash)
		{
			System.out.println(item);
		}
	}
	

}
