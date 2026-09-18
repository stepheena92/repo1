package finalkeydemo;

//final variable demo
public class Student {
	final int rollNo=10;
	String name="anu";
	void display() {
		System.out.println(rollNo);
		System.out.println(name);
	}

	public static void main(String[] args) {
		Student s=new Student();
		s.display();
		//s.rollNo=98;//final variable value cannot change
		s.display();

	}

}
