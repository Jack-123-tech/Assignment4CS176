
public class CheckingAccount extends BankAccountAssignemnt4  {

	
public CheckingAccount(String name, double accountNumber, double balance) {
		super(name, accountNumber, balance);
		
		
		
		
		
		// TODO Auto-generated constructor stub
	}

void MonthEnd(double averageDailyBalance) {
	
	 double balance= getBalance();
	if(balance< 1500) {
		setBalance(balance-20);
	}
	
}
	
	
	
	public String toString() {
		String s=super.toString();
		return s;
		
}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
