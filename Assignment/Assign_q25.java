package Assignment;

class Triangle{
	int side1;
	int side2;
	int side3;
	Triangle(){
		 side1 = 3 ;
		 side2 = 4;
		 side3= 5;
	}
	public void Areatriangle() {
		int s = side1+side2+side3;
		System.out.println("area of triangle: " + ((s)/2));
	}
	public void PerimeterTriangle() {
		System.out.println("Perimeter of triangle is :" + (side1+side2+side3));
	}
}

public class Assign_q25 {

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		triangle.Areatriangle();
		triangle.PerimeterTriangle();

	}

}
