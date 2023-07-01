package Assignment;

import java.util.ArrayList;
import java.util.List;

/*Write a Java program to remove the third element from an array list. */

public class Assign_q51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		
		list.remove(3);
		System.out.println("New ArrayList: " + list);

	}

}
