package Collections;

import java.util.ArrayList;

public class ArrayListPrograms {
public static void main(String[] args) {
		
	 ArrayList<Object> list = new ArrayList<>();
	 ArrayList<Object> list1 = new ArrayList<>();
	 list.add(0);
	 list.add(5);
	 list.add(3);
	 list1.add("a");
	 list1.add("b");
	 list1.add(1);
	 
	 System.out.println("list:"+list);
	 System.out.println("list1:"+list1);
	 
	 //list.addAll(2, list1);
	// list.addAll(list1);
	 System.out.println(list);
	 System.out.println(list.contains("b"));
	 //list.clear();
	 System.out.println(list.containsAll(list1));
	 //System.out.println(list);
	list.removeAll(list1);
	 //list.retainAll(list1);
	 list.sort(null);
	 System.out.println(list);
	
}
}
