package Assignment;

import java.util.Scanner;

public class Assign_q06 {

	public static void main(String[] args) {
		/*Write a program in Java to display the pattern like right angle triangle with a number.
		 * 1 
		 * 12 
		 * 123 
		 * 1234 
		 * 12345
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		for(int i = 1 ; i<=n;i++) {
			for(int j= 1; j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
