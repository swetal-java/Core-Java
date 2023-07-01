package Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*Write a Java program to convert a hash set to a List/Array List. */

public class Assign_q67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		System.out.println("Hash Set " + set);
		
		List list = new ArrayList(set);
		System.out.println("ArrayList: " + list);

	}

}
