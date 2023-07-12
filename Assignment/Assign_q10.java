package Assignment;

/*Write a Java program to print the ASCII value of a given character*/

import java.util.Scanner;

public class Assign_q10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Any character between A-Z or a-z: ");
		char value = scanner.next().charAt(0);
		int ascii = (int) value;
		System.out.println("Value of "+value+ " is "+ascii);
	}
}
