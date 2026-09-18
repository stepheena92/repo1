package polymorphism;

public class Main {

	public static void main(String[] args) {
		Animal a1=new Animal();
		a1.sound();
		Animal a2=new Dog();//upcasting
		a2.sound();
		a2=new Cat();
		a2.sound();
	}

}
