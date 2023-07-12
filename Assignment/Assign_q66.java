package Assignment;

import java.util.HashSet;
import java.util.Set;

/*Write a Java program to convert a hash set to an array.*/

public class Assign_q66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("c++");
		set.add("python");
		set.add("c");
		System.out.println("Hash set "+set);
		
		String[] array = new String[set.size()];
		set.toArray(array);
		
		for(String elements : array) {
			System.out.println("Array " + elements);
		}
		
		
				
	

	}

}
