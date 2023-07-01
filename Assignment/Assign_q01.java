package Assignment;

/*Write a Java program to Take three numbers from the user and print the greatest 
number*/

import java.util.Scanner;

public class Assign_q01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
        System.out.print("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        int num3 = sc.nextInt();
        
        if(num1 > num2 || num1 > num3) {
        	System.out.println(num1 + "is greater then " +num2+" and " +num3);
        }else if (num2 > num1 || num2 > num3) {
			System.out.println(num2 + "is greater then " +num1+" and " +num3);
		}else {
			System.out.println(num3 + "is greater then " +num1+" and " +num2);
		}
	}

}
