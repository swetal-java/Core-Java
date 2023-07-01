package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Write a Java program to shuffle elements in an array list.*/ 	

public class Assign_q55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println("List: " + list);
		Collections.shuffle(list);
		System.out.println("Shuffled elements are: " + list);

	}

}
