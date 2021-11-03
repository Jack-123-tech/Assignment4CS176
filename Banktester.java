
public class Banktester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountAssignemnt4 n  =new BankAccountAssignemnt4 ("Nina Winters",0001,1000);
		
		CheckingAccount j = new CheckingAccount("John smith",0002,500);
		SavingAccount a= new SavingAccount("Amy Smith",0003,1500,.035);
		System.out.println(n.toString());
		System.out.println(j.toString());
		System.out.println(a.toString());
		
	j.Deposit(1000);
	j.MonthEnd(15);
	a.Withdraw(500);
	a.MonthEnd(20);
	System.out.println(n.toString());
	System.out.println(j.toString());
	System.out.println(a.toString());
		
	}

}
