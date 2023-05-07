package test.package1;
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] arg)
	{
		LinkedList<String> list = new LinkedList<String>();
		LinkedList<String> list_copy = new LinkedList<String>();
		list.add("J");
		list.add("O");
		list.add("N");
		System.out.println(list);
		list.add(2,"H");
		System.out.println(list);
		list.addLast(")");
		list.addFirst("(");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		
		list_copy = list;
		System.out.println(list);
		System.out.println(list_copy);
		list.clear();
		System.out.println(list);
		System.out.println(list_copy); // clear too because it's copy of list adresses
		
	}

}
