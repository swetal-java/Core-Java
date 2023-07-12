package Assignment;

import java.util.HashMap;
import java.util.Map;

/*Write a Java program to get a collection view of the values contained in this map.*/

public class Assign_q73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map map = new HashMap();
		map.put(1, "java");
		map.put(2, "c++");
		map.put(3, "php");
		map.put(3, "css");
		System.out.println("Collection View " + map);

	}

}
