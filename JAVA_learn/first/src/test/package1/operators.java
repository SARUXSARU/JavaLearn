package test.package1;

public class operators {
	public static void main(String arg[]) {
		int a=30;
		int b=20;
		String s="text";
		String st="test1";
		String str="text";
		if(s==str)
		{
			System.out.println("same strings");
			System.out.println(str);
		}
		if(s!=st)
		{
			System.out.println("strings are different");
		}
		if(s!=st && s==str)
		{
			System.out.println("all is good");
		}
		if(a>b)
		{
			System.out.println(" a > b");
		}
		else if(a<b)
		{
			System.out.println("a < b");
		}
		else
		{
			System.out.println("a=b ");
		}
		float result = a+b;
		if(true)
		{
			System.out.println("a+b = " + result);
		}
		
		a+=1;
		System.out.println(a);
		a++;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		boolean x=true;
		System.out.println(x);
		System.out.println(!x);
		System.out.println("a&b " + (a&b)); // because of bit and operation
		System.out.println("a|b " + (a|b)); // because of bit or
		
		int a2=20;
		int b2=30;
		int result2;
		
		result2= a2 < b2 ? a2 : b2; // if yes then a2 else b2
		System.out.println(result2);
		
	}

}
