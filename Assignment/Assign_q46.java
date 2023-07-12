package Assignment;

/*W.A.J.P to create 2 threads and make one thread as Daemon Thread by using set 
Daemon () method of Thread class and check whether the thread is set daemon or 
not by using is Daemon () method. 
TestDaemonThread2 t1=new TestDaemonThread2(); 
TestDaemonThread2 t2=new TestDaemonThread2(); t1.start(); 
t1.setDaemon(true);//will throw exception here t2.start(); */

class DaemonThread extends Thread{
	public void run() {
		System.out.println("Thread starts..");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Thread Stops..");
	}
}

public class Assign_q46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DaemonThread tDaemonThread = new DaemonThread();
		DaemonThread tDaemonThread2 = new DaemonThread();
		
		//tDaemonThread.setDaemon(true);
		
		tDaemonThread.start();
		tDaemonThread2.start();
		
		System.out.println("Thread1 " + tDaemonThread.isDaemon());
		System.out.println("Thread 2" + tDaemonThread2.isDaemon());

	}

}
