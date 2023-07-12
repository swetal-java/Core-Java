package Assignment;

/*W.A.J.P to check whether a given string ends with the contents of another string. 
"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True*/

public class Assign_q17 {

	public static void main(String[] args) {
		String str1 = "Java Exercises";
		String str2 = "Java Exercise";
		String str3 = "se";
		
		System.out.println(str1.endsWith(str3));
		System.out.println(str2.endsWith(str3));

	}

}
