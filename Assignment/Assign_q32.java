package Assignment;

import java.util.Scanner;

/*Write a program which will ask the user to enter his/her 
marks (out of 100). Define a method that will display grades according to the marks 
entered as below: 
Marks Grade 
91-100 AA 
81-90 AB 
71-80 BB 
61-70 BC 
51-60 CD 
41-50 DD 
40 Fail
*/

class Student{
	public void marks() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the marks: ");
		int marks = scanner.nextInt();
		if(marks<=100 && marks>=91) {
			System.out.println("GRADE is AA");
		}else if (marks<=90 && marks>=81) {
			System.out.println("GRADE is AB");
		}else if (marks<=80 && marks>=71) {
			System.out.println("GRADE is BB");
		}else if (marks<=70 && marks>=61) {
			System.out.println("GRADE is BC");
		}else if (marks<=60 && marks>=51) {
			System.out.println("GRADE is CD");
		}else if (marks<=50 && marks>=41) {
			System.out.println("GRADE is DD");
		}else {
			System.out.println("YOU WILL DO BETTER IN NEXT EXAM!!WORK HARD...");
		}
	}
}

public class Assign_q32 {

	public static void main(String[] args) {
		Student student = new Student();
		student.marks();
		 
	}

}
