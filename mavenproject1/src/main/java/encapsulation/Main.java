package encapsulation;
import encapsulation.BankAccount;
public class Main {
	public static void main(String[] args) {
		BankAccount ba=new BankAccount();
		ba.setBalance("Stephy",100002434,6000);
		double balance =ba.getBalance();
		//System.out.println(balance);
		ba.displayAccountDetails();
		ba.deposit(700);
		ba.displayAccountDetails();
		ba.withdraw(800);
		ba.displayAccountDetails();
	}


}
