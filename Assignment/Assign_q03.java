package Assignment;

/*Write a Java program that takes a year from user and print whether that year is a leap 
year or not*/

import java.util.Scanner;

public class Assign_q03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		if(year % 4 == 0)
			System.out.println(year + " is a LeapYear");
		else 
			System.err.println(year + " is not a LeapYear");

	}

}
