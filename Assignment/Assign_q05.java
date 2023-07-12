package Assignment;

/*Write a program in Java to input 5 numbers from keyboard and find their sum and 
average using for loop.*/

import java.util.Scanner;

public class Assign_q05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		int avg ;
		
		for(int i = 1;i<=5;i++) {
			System.out.print("Enter number: ");
			 num = sc.nextInt();
			 sum = sum + num;
	     }
		 avg = sum/5;
		 System.out.println("Sum of 5 number is "+sum+ " and Average is " + avg);

	}

}
