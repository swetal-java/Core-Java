package Assignment;
/*Write a Java program to iterate through all elements in an array list. */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assign_q47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add(1);
		list.add("Java Program");
		list.add(1245.2356);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
