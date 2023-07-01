package Assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*Write a Java program to associate the specified value with the specified key in a 
Hash Map. single null key value allowed not duplicate key values are allowed*/

public class Assign_q59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put(1,"java");
		map.put(2, "c++");
		//map.put(null, "java");
		map.put(null, "c");
		System.out.println(map);
		
		/*to print key and value seperately..
		 
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			Map.Entry entry = (Entry)itr.next();
			System.out.println("Key: " +entry.getKey());
			System.out.println("Value: "+ entry.getValue());
		}*/
	}

}
