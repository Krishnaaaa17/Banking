
public class SavingsAccount extends Account{
	double interestRate;
	SavingsAccount(int accountNumber,double balance,double interestRate){
		super(accountNumber,balance);
		this.interestRate=interestRate;
	}
	double calculateInterest() {
		return balance * interestRate;
	}
}

