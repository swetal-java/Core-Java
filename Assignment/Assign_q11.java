package Assignment;

/*Write a Java program that accepts an integer (n) and computes the value of 
n+nn+nnn. Input number: 5 
5 + 55 + 55*/

import java.util.Scanner;

public class Assign_q11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = scanner.nextInt();
		System.out.println(n +""+"+"+n+n+""+"+"+n+n+n);

	}

}
