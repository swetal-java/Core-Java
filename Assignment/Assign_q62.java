package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Write a Java program to extract a portion of an array list
 
 to extract some portion from array list we use sulist method 
 
 */

public class Assign_q62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list);
		
		List subList = list.subList(0, 4);
	    System.out.println(subList);
	}

}
