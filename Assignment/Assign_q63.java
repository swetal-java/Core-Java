package Assignment;

import java.util.ArrayList;
import java.util.List;

/*Write a Java program to compare two array lists.*/

public class Assign_q63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>();
		list1.add("java");
		list1.add("c++");
		list1.add("c");
		List list2 = new ArrayList();
		list2.add("java");
		list2.add("c++");
		list2.add("java");
		list2.add("php");
		
		List list3 = new ArrayList();
		
		for(String string : list1) {
			list3.add(list2.contains(string) ? "exists" : "not exists");
		}
		System.out.println(list3);
	}

}
