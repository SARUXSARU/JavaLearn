package test.package1;
import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] arg)
	{
		ArrayList<Integer> smth = new ArrayList<>();
		
		for(int i =0;i<20;i++)
		{
			smth.add(i);
		}
		
		for(int i =0;i<smth.size();i++)
		{
			System.out.print(smth.get(i) + " ");
		}
		System.out.println();
		System.out.println(smth.size());
		
		smth.remove(16);
		System.out.println();
		for(int i =0;i<smth.size();i++)
		{
			System.out.print(smth.get(i) + " ");
		}
	}

}
