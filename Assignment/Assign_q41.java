package Assignment;

import java.util.Scanner;

/*W.A.J.P to create a class Student with attributes roll no, name, age and course. 
Initialize values through parameterized constructor. If age of student is not in 
between 15 and 21 then generate user defined exception 
"AgeNotWithinRangeException". If name contains numbers or special symbols 
raise exception "NameNotValidException". Define the two exception classes.*/

class AgeNotWithinRangeException extends Exception{
	public String toString() {
		return "Age must between 15 to 20";
	}
}

class NameNotValidException extends Exception{
	public String inproperinput() {
		return "Age must contain number";
	}
}

class Students{
	int rollno;
	String name;
    int age;
    String course;
    
    public Students(int rollno,int age,String name,String course) {
    	
		// TODO Auto-generated constructor stub
    	
    	this.name = name;
    	this.rollno = rollno;
    	this.age = age;
    	this.course = course;
    	try {
    		if(age>=15 && age<=20) {
        		System.out.println("Welcome to Data..");
        	}else {
        		System.out.println();
    			throw new AgeNotWithinRangeException();
    		}
    	}catch (AgeNotWithinRangeException e) {
			// TODO: handle exception
    	System.out.println(e);
		//e.printStackTrace();
    	}
    	
    	
    
	}
    void print() {
		System.out.println("Your roll no is: " +rollno);
		System.out.println("Your name is : " + name);
		System.out.println("Your age is : " + age);
		System.out.println("Your course is: " + course);
		
	}
}

public class Assign_q41 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age = scanner.nextInt();
		System.out.print("ENter Name: ");
		String name = scanner.next();
		System.out.print("Enter Id: ");
		int id = scanner.nextInt();
		System.out.print("Enter course: ");
		String course = scanner.next();
		Students student = new Students(id,age,name,course);
		student.print();
	}

}
