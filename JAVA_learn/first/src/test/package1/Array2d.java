package test.package1;

public class Array2d {
	public static void main(String arg[])
	{
		int[][] arr;
		
		
			arr=new int[10][10];
			
			for(int i=0;i<10;i++)
			{
				for(int j=0;j<10;j++)
				{
					arr[i][j]=0;
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
			
			int arr2[]= {1,2,3,4};
			int arr3[][]= {{1,2,3},{3,4,5},{5,6,7}};
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					arr3[i][j]=2;
					System.out.print(arr3[i][j]);
				}
				System.out.println();
			}
			
			for(int j=0;j<4;j++)
			{
				//arr2[j]=0;
				System.out.print(arr2[j]);
			}
		
	}

}
