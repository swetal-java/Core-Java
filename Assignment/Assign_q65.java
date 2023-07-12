package Assignment;

import java.util.ArrayList;
import java.util.List;

/*Write a Java program to join two array lists.*/

public class Assign_q65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list1 = new  ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		System.out.println("List1"+list1);
		
		List list2 = new ArrayList();
		list2.add(5);
		list2.add(6);
		System.out.println("List2" + list2);
		
		list1.addAll(list2);
		
		System.out.println("Merged two Array List Are "+list1);

	}

}
