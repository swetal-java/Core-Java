package Assignment;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*Write a Java program to iterate through all elements in a hash list.*/

public class Assign_q57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		set.add(1);
		set.add(2);
		set.add("java");
		System.out.println(set);
		
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
