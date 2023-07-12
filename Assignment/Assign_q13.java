package Assignment;

/*Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 
and by both. */

import java.util.Scanner;

public class Assign_q13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Numbers divisible by 3");
		for(int i=1;i<=100;i++) {
			if(i%3 == 0) {
				
				System.out.print(i+",");
			}
		}
		System.out.println();
		//by userinput range
		System.out.print("Enter number 1st: ");
		int n1 = scanner.nextInt();
		System.out.print("Enter number 2nd: ");
		int n2 = scanner.nextInt();
		for(int i = n1 ; i<=n2 ; i++) {
			if(i%5 == 0) {
				System.out.print(i+",");
			}
		}
		System.out.println();
		System.out.println("Number Divisible by 3 and 5 both");
		for(int i=1;i<=100;i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i+",");
			}
		}

	}

}
