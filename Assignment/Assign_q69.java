package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Write a Java program to increase the size of an array list.*/

public class Assign_q69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list =  new ArrayList<String>(3);
		list.add("java");
		list.add("c++");
		list.add("c");
		
		System.out.println(list);
		((ArrayList<String>) list).ensureCapacity(5);
		list.add("php");
		list.add("html");
		
	}

}
