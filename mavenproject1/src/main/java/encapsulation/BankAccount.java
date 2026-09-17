package encapsulation;

public class BankAccount {
	private double balance;
	private double amount;
	private String accholder;
	private int accnumber;
	
	public void setBalance(String accholder,int accnumber,double balance) {
		this.accholder=accholder;
		this.accnumber=accnumber;
		if(balance>=0) {
				this.balance = balance;
		}
		
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		System.out.println("Deposit amount:"+amount+"\n");
		if(amount>0) {
			this.amount=amount;
			this.balance+=amount;
		}else if(amount<=0) {
			System.out.println("Invalid deposit amount");
			
		}
	}
	public void withdraw(double amount) {
		System.out.println("withdraw amount: "+amount+"\n");
		if(amount>0 && balance>=amount) {
			this.amount =amount;
			this.balance-=amount;
		}else if(amount>balance) {
			System.out.println("Insufficient balance");
			
		}
	}
	public void displayAccountDetails() {
		System.out.println("Account Holder Name: "+ accholder);
		System.out.println("Account Number: "+accnumber);
		System.out.println("Account Balance: "+balance);
		System.out.println();
	}

	
}
