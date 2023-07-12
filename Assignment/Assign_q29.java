package Assignment;

/*We have to calculate the percentage of marks obtained in three subjects (each out of 
100) by student A and in four subjects (each out of 100) by student B. Create an 
abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two 
other classes 'A' and 'B' each having a method with the same name which returns the 
percentage of the students. The constructor of student A takes the marks in three 
subjects as its parameters and the marks in four subjects as its parameters for student 
B. Create an object for each of the two classes and print the percentage of marks for 
both the students. */

abstract class Marks{
	abstract public int getpercentage();
}

class StudentA extends Marks{
	int marks1,marks2,marks3;
	public StudentA(int mark1,int mark2, int mark3) {
		this.marks1 = mark1;
		this.marks2 = mark2;
		this.marks3 = mark3;
	}
	public int getpercentage() {
		return ((marks1+marks2+marks3)/300)*100;
	}
}

class StudentB extends Marks{
	int m1,m2,m3,m4;
	StudentB(int mark1,int mark2,int mark3 ,int mark4){
		this.m1 = mark1;
		this.m2 = mark2;
		this.m3 = mark3;
		this.m4 = mark4;
	}
    public int getpercentage() {
		return ((m1+m2+m3+m4)/400)*100 ;
	}
}


public class Assign_q29 {

	public static void main(String[] args) {
		StudentA a = new StudentA(50, 50, 50);
		StudentB b = new StudentB(60, 60, 60, 60);
		a.getpercentage();
		b.getpercentage();
	}

}
