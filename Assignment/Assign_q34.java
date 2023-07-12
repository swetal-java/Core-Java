package Assignment;

import java.util.Scanner;

/*W.A.J. P to demonstrate try catch block, */

public class Assign_q34 {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter First Number: ");
			int num1 = scanner.nextInt();
			System.out.print("Enter Second Nummber: ");
			int num2 = scanner.nextInt();
			int divide = num1/num2;
			System.out.println("division is : " + divide);
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
