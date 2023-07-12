package Assignment;

/*W.A.J. P to create one thread by implementing Runnable interface in 
Class.*/

class Mythread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is Running..");
	}
	
}

public class Assign_q42 {
	public static void main(String[] args) {
		Mythread mt = new Mythread();
		Thread t1 = new Thread(mt);
		t1.start();
		
	}
}
