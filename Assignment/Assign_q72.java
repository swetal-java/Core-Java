package Assignment;

import java.util.HashSet;
import java.util.Set;

/*Write a Java program to compare two sets and retain elements which are same on 
both sets.*/

public class Assign_q72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set1 = new HashSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		System.out.println("Set1 " + set1);
		
		
		Set set2 = new HashSet();
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		System.out.println("Set2 " + set2);
		
		set1.retainAll(set2);

	}

}
