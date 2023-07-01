package Assignment;

import java.util.Scanner;

/*W.A.J.P to create a custom exception if Customer withdraw amount which is greater 
than account balance then program will show custom exception otherwise amount will deduct from account balance. 
Account balance is: 2000 Enter withdraw amount: 
2500 
Sorry, insufficient balance, you need more 500 Rs. To perform this transaction.*/

public class Assign_q40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 2000;
		Scanner scanner = new Scanner(System.in);
		System.out.print("ENter the amount: ");
		int amt = scanner.nextInt();
		if(amt > balance) {
			int diffrencce = amt - balance;
			throw new ArithmeticException("Sorry, insufficient balance you need " + diffrencce + " Rs to perform Transaction");
		}

	}

}
