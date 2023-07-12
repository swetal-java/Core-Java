package Assignment;

/*Create a class to print the area of a square and a rectangle. The class has two methods 
with the same name but different number of parameters. The method for printing 
area of a rectangle has two parameters which are length and breadth respectively 
while the other method for printing area of square has one parameter which is side 
of square. */

import java.util.Scanner;

class AreaRectangleSquare {
	public void Area(int l, int b) {
		System.out.println("Area of rectangle is "+l*b);
	}
	public void Area(int sq) {
		System.out.println("Area of square is " + sq*sq);
	}
}

public class Assign_q22 {

	public static void main(String[] args) {
		AreaRectangleSquare aSquare = new AreaRectangleSquare();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Lenght: ");
		int length = scanner.nextInt();
		System.out.print("Enter Breadth: ");
		int breadth = scanner.nextInt();
		aSquare.Area(length, breadth);
		
		System.out.print("Enter Sides: ");
		int sides = scanner.nextInt();
		aSquare.Area(sides);
//		aSquare.Area(10, 10);
//		aSquare.Area(2);

	}

}
