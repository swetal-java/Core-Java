package Assignment;

import java.util.Scanner;

/*W.A.J.P to create the validate method that takes integer value as a parameter. If the 
age is less than 18, then throw an Arithmetic Exception otherwise print a message 
welcome to vote. 
O/P- Enter your age: 16*/



public class Assign_q39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter The age: ");
		int age = scanner.nextInt();
		if(age < 18) {
			throw new ArithmeticException("Not Valid For Voting");
		}else {
			System.out.println("Welcome to Vote..");
		}

	}

}
