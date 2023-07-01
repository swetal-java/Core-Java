package Assignment;

import java.util.HashMap;
import java.util.Map;

/*Write a Java program to count the number of key-value (size) mappings in a map.*/

public class Assign_q60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put(1,"java");
		map.put(2, "c++");
		//map.put(null, "java");
		map.put(null, "c");
		
		System.out.println(map);
		System.out.println("Size and number of count for mappings are:" +map.size());

	}

}
