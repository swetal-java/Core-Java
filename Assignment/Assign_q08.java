package Assignment;

import java.util.Scanner;

/*Write a Java program that reads a positive integer and count the number of digits the 
number. 
Input an integer number less than ten billion: 125463 
Number of digits in the number: 6*/

public class Assign_q08 {
     public static void main(String[] args) {
    	 int a = 0;
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter Number: ");
	    int number = scanner.nextInt();
	    while(number != 0) {
	    	number = number/10;
	    	a++;
	    }
	    System.out.println("Number of digit in number : " + a);
    }
}
