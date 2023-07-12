package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Write a Java program to reverse elements in an array list*/

public class Assign_q61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println("Reverse array list are : " + list);
	}

}
