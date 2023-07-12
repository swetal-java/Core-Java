package Assignment;

/*W.A.J.P to concatenate a given string to the end of another string.*/

import java.util.Scanner;

public class Assign_q15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = "Hello";
		String strr2 = "I am studying at TOPS Technologies..";
		
		System.out.println(str1.concat(" "+strr2));
		
		System.out.print("Enter String1: ");
		String s1  = scanner.nextLine();
		System.out.print("Enter String2: ");
		String s2  = scanner.nextLine();
		
		System.out.println(s1.concat(" "+s2));

	}

}
