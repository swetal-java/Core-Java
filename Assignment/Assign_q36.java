package Assignment;

/*W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero 
exception and another one is to handle 
ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0;*/

public class Assign_q36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[] = new int[5];
		    a[5] = 30/0;
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
