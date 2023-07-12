package Assignment;

//Create an abstract class 'Parent' with a method 'message'. It has two subclasses each 
//having a method with the same name 'message' that prints "This is first subclass" 
//and "This is second subclass" respectively. Call the methods 'message' by creating 
//an object for each subclass

abstract class p1{
	abstract public void message();
}

class ch1 extends p1{
	public void message() {
		System.out.println("This is first subclass..");
	}
}

class ch2 extends p1{
	public void message() {
		System.out.println("This is second subclass..");
	}
}

public class Assign_q27 {

	public static void main(String[] args) {
		ch1 c1 = new ch1();
		c1.message();
	    ch2 c2 = new ch2();
		c2.message();

	}

}
