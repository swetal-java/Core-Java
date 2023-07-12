package Assignment;

import java.util.HashSet;
import java.util.Set;

/*Write a Java program to append the specified element to the end of a hash set. */

public class Assign_q56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		set.add("java");
		set.add("c++");
		set.add("c");
		
		System.out.println("Hash Set: " + set);
		
		String endelement = "python";
		set.add(endelement);
		System.out.println("Add elments at end: " + set);
		

	}

}
