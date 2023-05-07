package test.package1;

public class ForLoop {
	public static void main(String arg[])
	{
		int[] number= {1,2,3,4,5,6};
		
		for(int i: number)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i=0;i<6;i++)
		{
			System.out.print(number[i] + " ");
		}
		
	}

}
