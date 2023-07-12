package Assignment;

/*W.A.J.P to start the same Thread twice by calling start () method twice. Test 
ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start ();*/

class ThreadExample extends Thread{
	
	public void run() {
		System.out.println("Thread is started Running");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Thread stops..");
	}
}

public class Assign_q45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample t1 = new ThreadExample();
		t1.start();
		
		ThreadExample t2 = new ThreadExample();
		t2.start();

	}

}
