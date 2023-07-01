package Assignment;

/*Write a Java program that takes the user to provide a single character from the 
alphabet. Print Vowel or Consonant, depending on the user input. If the user input 
is not a letter (between a and z or A and Z), or is a string of length > 1, print an error 
message. */

import java.util.Scanner;

public class Assign_q02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Character: ");
		String ch = sc.nextLine();
		if(ch.length() > 1) {
			System.out.println("Only enter one Character");
		}else {
		     char ch1 = ch.charAt(0);
			if(!Character.isLetter(ch1)) {
			   System.out.println("Enter Character only....");
			}else {
				if(ch1 == 'a' || ch1 == 'e'  || ch1 == 'i' || ch1 == 'o' || ch1 == 'u' || ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U') {
					System.out.println(ch1 +" is vowel");
				}else {
					System.out.println(ch1 +" is consonant");
				}
			}
			
		}
		
	}

}
