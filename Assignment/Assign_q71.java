package Assignment;

import java.util.ArrayList;
import java.util.List;

/*Write a Java program to print all the elements of an Array List using the position of 
the elements.*/

public class Assign_q71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("List " + list);
		int count = list.size();
		for(int i = 0;i<count;i++) {
			System.out.println(list.get(i));
		}

	}

}
