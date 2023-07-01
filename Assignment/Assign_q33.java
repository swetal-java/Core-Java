package Assignment;

/*Create a class named 'Shape' with a method to print "This is this is shape". Then 
create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both 
having a method to print "This is rectangular shape" and "This is circular shape" 
respectively. Create a subclass 'Square' of 'Rectangle' having a method to print 
"Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the 
object of 'Square' class.*/

class Shapes{
	public void message() {
		System.out.println("This is a Shape..");
	}
}

class Rectanglees extends Shapes{
	public void messsage1() {
		System.out.println("This is a Rectangle..");
	}
}

class Circle extends Shapes{
	public void message2() {
		System.out.println("This is a Circle..");
	}
}

class Squares extends Rectanglees{
	public void message3() {
		System.out.println("Square is Rectangle..");
	}
}

public class Assign_q33 {

	public static void main(String[] args) {
		Squares s = new Squares();
		s.message();
		s.messsage1();
	}

}
