package smepractice.java;

interface BankAccount{
	void deposit(double  amount);
	
	void withdraw(double amount);
}

interface LoanAccount {
	void applyLoan(double amount);
}


class customer implements BankAccount,LoanAccount {
	int balance=0;
	public void deposit(double amount) 
	{
		
		balance += amount;
		
	}
	
	public void withdraw(double amount) 
	{
		if(balance<amount) 
		{
			System.out.println("insufficient funds");
		}
		
		else 
		{
			 balance  -= amount;
			 System.out.println(balance);
		}
	}
	public void applyLoan(double amount) 
	{
		System.out.println("applied loan of : " +amount);
	}
}
public class Interface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customer obj = new customer();
		obj.deposit(35570000);
		obj.withdraw(35634);
		obj.applyLoan(324);
		
		
		

	}

}
