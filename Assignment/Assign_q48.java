package Assignment;

import java.util.ArrayList;
import java.util.List;

/*Write a Java program to insert an element into the array list at the first position.*/

public class Assign_q48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println("ArrayList: " + list);
		
		int newelement = 1 ;
		list.add(0,newelement);
		
		System.out.println("New ArrayList: " + list);

	}

}
