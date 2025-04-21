
public class Account {
	int accountNumber;
	double balance;
	Account(int accountNumber,double balance){
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	public int getSccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		balance = balance + amount;
	}
	public void withdraw(double amount) {
		balance = balance - amount;
	}
	public double calculateinterest() {
		return 0.0;
	}
	
}
