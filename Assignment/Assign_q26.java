package Assignment;

import java.security.spec.MGF1ParameterSpec;
import java.util.Scanner;

//Print the sum, difference and product of two complex numbers by creating a class 
//named 'Complex' with separate methods for each operation whose real and 
//imaginary parts are entered by user.

class Complex {
	double r, img;

	Complex(double r, double imag) {
		this.r = r;
		this.img = imag;
	}

	public Complex add(Complex c) {
		return new Complex(r + c.r, img + c.img);
	}
	
	public Complex sub(Complex c) {
		return new Complex(r + c.r, img - c.img);
	}
	
	
}

public class Assign_q26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the nummber 1: ");
		double real = scanner.nextDouble();
		double imaginary =  scanner.nextDouble();
		Complex c1 = new Complex(real, imaginary);
		
		System.out.print("Enter the nummber 1: ");
		double real2 = scanner.nextDouble();
		double imaginary2 =  scanner.nextDouble();
		Complex c2 = new Complex(real2, imaginary2);
		
		Complex sum = c1.add(c2);
		Complex sub = c1.sub(c2);
		
		System.out.println("The sum of Two complex number is " + sum.r);
		System.out.println("The difrrence between complex number is " + sub.r);

	}

}
