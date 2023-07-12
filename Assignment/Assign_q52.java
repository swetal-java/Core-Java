package Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Write a Java program to search an element in an array list. */

public class Assign_q52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		if(list.contains(2)) {
			System.out.println("element is present");
		}else {
			System.out.println("element is not present");
		}
	}

}
