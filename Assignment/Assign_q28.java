package Assignment;

/*Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and 
$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC
are subclasses of class 'Bank', each having a method named 'getBalance'. Call this 
method by creating an object of each of the three classes. 
*/

abstract class Bank{
	abstract public void getBalance();
}

class BankA extends Bank{
	public void getBalance() {
		System.out.println("100 Rs Deposits..");
	}
}

class BankB extends Bank{
	public void getBalance() {
		System.out.println("200 Rs Deposits..");
	}
}

class BankC extends Bank{
	public void getBalance() {
		System.out.println("300 Rs Deposits..");
	}
}

public class Assign_q28 {

	public static void main(String[] args) {
		BankA a = new BankA();
		BankB b = new BankB();
		BankC c = new BankC();
		a.getBalance();
		b.getBalance();
		c.getBalance();
		
	}

}
