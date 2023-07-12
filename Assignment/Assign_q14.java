package Assignment;

/*W.A.J.P to get the character at the given index within the String. Original String = 
Tops Technologies! The character at position 0 is T, The character at position 10 is 
o */

public class Assign_q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String originalString = "Tops Technologies!";
		System.out.println("Original string is " + originalString);
		
		int index1 = originalString.charAt(0);
		int index2 = originalString.charAt(10);
		
		System.out.println("The Character at position at 0th position is " + (char)index1);
		System.out.println("The Character at position at 10th position is " + (char)index2);

	}

}
