package Assignment;

import java.util.Scanner;

/*W.A.J. P to demonstrate try catch block, take two numbers from the user by 
Command line argument and perform the division operation and handle Arithmetic 
O/PException in thread main java. Lang. Arithmetic Exception:/ by zero
*/
public class Assign_q38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter Second Number: ");
		int num2 = scanner.nextInt();
		try {
			int div = num1/num2;
			System.out.print("Division of two numbr is : " + div);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
