package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Write a Java program to retrieve an element (at a specified index) from a given array 
list. */

public class Assign_q49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println();
		
		System.out.print("Enter index number to retrieve value: ");
		int index = scanner.nextInt();
		if(index >=0 && index<list.size()) {
			int  element = (int) list.get(index);
			System.out.println("Element at index "+index+" is "+ element);
		}else {
			System.out.println("Invalid index");
		}

	}

}
