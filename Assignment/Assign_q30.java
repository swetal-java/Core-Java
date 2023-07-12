package Assignment;

import java.util.Scanner;

/*Write a program to print the factorial of a number by defining a method named 
'Factorial'. Factorial of any number n is represented by n!*/

class Factorial {
     public void fact() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any number to find its factorial: ");
		int f = scanner.nextInt();
		int number=1;
		int i;
		for(i=1;i<=f;i++) {
			number *= i;
		}
		System.out.println("Factorial of "+f+"is "+number);
	}
}

public class Assign_q30 {

	public static void main(String[] args) {
		Factorial f1=new Factorial();
		f1.fact();

	}

}
