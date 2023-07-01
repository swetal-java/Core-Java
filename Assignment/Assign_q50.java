package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Write a Java program to update specific array element by given element. */

public class Assign_q50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		System.out.println("arrayList: " + list);
		
		System.out.print("Enter index at which number should update: ");
		int index = scanner.nextInt();
		System.out.print("Enter New Number for Updation: ");
		int newnum = scanner.nextInt();
		
		if(index >=0 && index < list.size()) {
			list.set(index, newnum);
			System.out.println("Updated ArrayList: " + list);
		}else {
			System.out.println("Error");
		}
		
	}

}
