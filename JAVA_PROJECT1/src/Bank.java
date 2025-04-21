
public class Bank {
	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount(1,500.2,2.5);
		CheckingAccount c = new CheckingAccount(1,250.0,20.5);
		System.out.println(s.calculateInterest());
		System.out.println(c.calculateInterest());
	}	
}
