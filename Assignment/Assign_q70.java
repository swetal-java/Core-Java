package Assignment;

import java.util.ArrayList;
import java.util.List;

/*Write a Java program to replace the second element of an Array List with the 
specified element. */

public class Assign_q70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("java");
		list.add("c++");
		list.add("php");
		System.out.println("Original list"+list);

		String element = "c";
		list.set(1, element);
		
		int num = list.size();
		System.out.println("replaced elements");
		for(int i=0;i<num;i++) {
			System.out.println(list.get(i));
		}
		
	}

}
