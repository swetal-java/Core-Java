package Assignment;

/*W.A.J. P to create one thread by extending Thread class in another Class.*/

class Mythreads extends Thread{
	
	public void run() {
       System.out.println("Thread is running");
    }
}

public class Assign_q43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythreads mythread = new Mythreads();
		mythread.start();
		
	}

}
