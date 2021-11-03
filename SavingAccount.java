
public class SavingAccount extends BankAccountAssignemnt4 {

	double interestRate;
	
	public SavingAccount(String name, double accountNumber, double balance,double interestRate) {
		super(name, accountNumber, balance);
		this.interestRate=interestRate;
	}
void MonthEnd(double averageDailyBalance) {
	 
		 double balance =getBalance();
	 double  Interest = balance* interestRate;
  		   setBalance( balance+ Interest);
	;
	   
}
public double getInterestRate() {
	return interestRate;
}
public void setInterestRate(double interestRate) {
	this.interestRate = interestRate;
}

public String toString() {
	String s=super.toString();
	return s+ ","+interestRate;
	
	
	
	
}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
