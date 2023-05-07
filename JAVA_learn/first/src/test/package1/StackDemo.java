package test.package1;
import java.util.Stack;
public class StackDemo {
	public static void main(String[] arg)
	{
		Stack<Integer> stc= new Stack<>();
		
		stc.push(2);
		stc.push(6);
		stc.push(11);
		System.out.println(stc);
		System.out.println("stack size: " +stc.size());
		Integer i= stc.pop();
		System.out.println("we popped: "+ i);
		System.out.println(stc);
	
	}

}
