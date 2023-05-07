package test.package1;

public class array {
	
	public static void main(String arg[]) {
		
		int[] arr;
		arr=new int[10];
		for(int i=0;i<10;i++)
		{
			arr[i]=i+100;
		}
		for(int i=0;i<10;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}
}