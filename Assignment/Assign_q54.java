package Assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*Write a Java program to sort a given array list.
   At copying  if both the arraylist dont have same number of size the it will copy only that number of index will be copied 
   that is in Collections.copy(t1,t2) the second written list will be copied t2 is copied to t1 so if t2 list
   is 2 index array and and t1 list is 3 index array then only 2 data of t2 is copied to t1 the remaining element will remain same   
 * */

public class Assign_q54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list1 = new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		//System.out.println(list1);
		List list2 = new ArrayList();
		list2.add("A");
		list2.add("B");
		
		Collections.copy(list1,list2);
		
		System.out.println(list1);
		System.out.println(list2);
//
//		List<String> list = new ArrayList<String>();
//		list.add("hello");
//		list.add("Java");
//		List list2 = new ArrayList();
//		list2.add(1);
//		list2.add(2);
//		Collections.copy(list2, list);
//		System.out.println(list);
//		System.out.println(list2);
	}

}
