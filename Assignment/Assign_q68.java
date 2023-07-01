package Assignment;

import java.util.HashMap;
import java.util.Map;

/*Write a Java program to check whether a map contains key-value mappings (empty) 
or not. */

public class Assign_q68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map map = new HashMap();
		 map.put(1, "java");
		 map.put(2, "c++");
		 map.put(3, "c");
		 
		 boolean result = map.isEmpty();
		 System.out.println(result);
		 map.clear();
		 result = map.isEmpty();
		 System.out.println(result + " is empty or not");

	}

}
