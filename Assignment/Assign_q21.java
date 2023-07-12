package Assignment;

/*Create a class named 'Print Number' to print various numbers of different data types 
by creating different methods with the same name 'printn' having a parameter for 
each data type. */

public class Assign_q21 {
	public static void main(String[] args) {
		Assign_q21 p = new Assign_q21();
		int n = 4;
		long l = 15567865L;
		double d = 1.25465;
		float f = 1.25f;
		
		p.printn(n);
		p.printn(l);
		p.printn(d);
		p.printn(f);
	}
	
	public void printn(int n) {
		System.out.println("Integer " + n);
	}
	public void printn(long l) {
		System.out.println("Long "+ l);
	}
	public void printn(double d) {
		System.out.println("Double " + d);
	}
	public void printn(float f) {
		System.out.println("Float " + f);
	}
}
