package Assignment;

/*We have to calculate the area of a rectangle, a square and a circle. Create an abstract 
class 'Shape' with three abstract methods namely 'RectangleArea' taking two 
parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The 
parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its 
side and that of 'CircleArea' is its radius. Now create another class 'Area' containing 
all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the 
area of rectangle, square and circle respectively. Create an object of class 'Area' and 
call all the three methods.*/

abstract class Shape{
	abstract public void RectangleArea(int l,int b);
	abstract public void SquareArea(int s);
	abstract public void CircleArea(int r);
}

class Area extends Shape{

	@Override
	public void RectangleArea(int l, int b) {
		System.out.println("Area of Rectangle is: " + l*b);
		
	}

	@Override
	public void SquareArea(int s) {
		// TODO Auto-generated method stub
		System.out.println("Area of Square is: "+ (s*s));
	}

	@Override
	public void CircleArea(int r) {
		// TODO Auto-generated method stub
		System.out.println("Area of Circle is : " +(Math.PI*r*r));
	}
	
}

public class Assign_q31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Area area = new Area();
         area.CircleArea(5);
         area.SquareArea(2);
         area.RectangleArea(5, 2);
	}

}
