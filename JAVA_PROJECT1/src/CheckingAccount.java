
public class CheckingAccount extends Account{
	double monthlyFee;
	CheckingAccount(int accountNumber,double balance,double monthlyFee){
		super(accountNumber,balance);
		this.monthlyFee=monthlyFee;
	}
	double calculateInterest() {
		return 0.0;
	}
}
