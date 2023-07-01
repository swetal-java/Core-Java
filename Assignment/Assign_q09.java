package Assignment;

/*Write a Java program to count the letters, spaces, numbers and other characters of 
an input string. */

import java.util.Scanner;

public class Assign_q09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter here...");
		String input = sc.nextLine();
	
		int letter = 0 ;
		int space= 0;
		int number = 0 ;
		int otherchar = 0 ;
		
		for(int i = 0 ; i<input.length(); i++) {
		char ch = input.charAt(i) ;
		if(Character.isLetter(ch)) {
			letter++;
		}
	  }
		
	}

}
