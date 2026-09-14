package pack2;

public class Employee2 {
	String name="janu";
	int salary=5000;
	
	public  void displayEmployee() {
		System.out.println(name);
		System.out.println(salary);
		
	}

	public static void main(String[] args) {
		Employee2 emp1=new Employee2();
		emp1.displayEmployee();
		
		}

}
