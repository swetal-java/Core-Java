package Assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*Write a Java program to sort a given array list.
  to sort array li8st we use Collections.sort() method 
  */

public class Assign_q53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add(10);
		list.add(2);
		list.add(9);
		list.add(1);
		System.out.println(list);
		Collections.sort(list);
		System.out.println("Sorted array " + list);
	}

}
