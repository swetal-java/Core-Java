package Assignment;

class Rectangle {
	Rectangle(int l,int b){
		this.length = l;
		this.breadth = b;
	}
	int length;
	int breadth;
	public void AreaRctangle() {
		System.out.println("Area of rectangle is : "+ length * breadth);
	}
	public void PerimeterRectangle() {
		System.out.println("Perimeter is: " + 2*(length+breadth));
	}
}

class Square extends Rectangle{
	Square(int s){
		super(s, s);
	}
}

public class Assign_q24 {

	public static void main(String[] args) {
		Square square = new Square(5);
		Rectangle rectangle = new Rectangle(10,20);
		square.AreaRctangle();
		square.PerimeterRectangle();
		rectangle.AreaRctangle();
		rectangle.PerimeterRectangle();

	}

}
