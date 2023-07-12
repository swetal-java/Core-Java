package Assignment;

/*Create a class with a method that prints "This is a parent class" and its subclass with 
another method that prints "This is child class". Now, create an object for each of 
the class and call 1 - method of parent class by object of parent class 2 - method of 
child class by object of child class 3 - method of parent class by object of child class*/

class Parent{
   public void MessageP() {
	   System.out.println("This is a parent class.");
   }
}

class Child extends Parent{
	public void MessageC() {
		System.out.println("This is a child class.");
	}
}

public class Assign_Qu23 {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = new Parent();
		
		child.MessageC();
		parent.MessageP();
		child.MessageP();

	}

}
