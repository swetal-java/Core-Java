package Assignment;

/*W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch 
block. try { 
try 
{//code} 
catch (Exception e) 
{//code} 
catch (Exception e) 
{//code}*/
public class Assign_q37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[] = new int[3];
			try {
				System.out.println(a[10]);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
