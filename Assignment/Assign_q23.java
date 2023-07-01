package Assignment;

class Member{
	int DataMembers;
	String name;
	int Age;
	int PhoneNumber;
	char Address;
	int Salary;
	
	public void Salary(int salary){
		System.out.println("Salary is : " +salary);
	}
}

public class Assign_q23 {

	public static void main(String[] args) {
		Member member = new Member();
		member.Salary(1000);

	}

}
