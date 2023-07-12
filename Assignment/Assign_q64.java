package Assignment;

import java.util.ArrayList;
import java.util.List;

/*Write a Java program of swap two elements in an array list.*/

public class Assign_q64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list1 = new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		System.out.println("LIST1"+list1);
 
		List list2 = new ArrayList();
		list2.add(1);
		list2.add(2);
		System.out.println("LIST2"+list2);
	
		List list3 = new ArrayList();
		list3 = list1;
		list1 = list2;
		list2 = list3;
		
		System.out.println("list1" + list1);
		System.out.println("List2" + list2);
	}

}
