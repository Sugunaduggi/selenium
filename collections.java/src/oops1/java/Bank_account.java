package oops1.java;

public class Bank_account {
	private int accountnumber;
	private String accountholdername;
	private int salary;
	int balance;
	
	
	public void setAccountNumber(int accountnumber) {
		this.accountnumber=accountnumber;
	}
	
	public void setAccountHolderName(String accountholdername) {
		this.accountholdername=accountholdername;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	
	public int getAccountNumber() {
		return accountnumber;
	}
	
	public String getAccountHolderName() {
		return accountholdername;
	}
	public int getSalary() {
		return salary;
	}
	
	public void depositmoney() {
		
		balance = balance+salary;
		System.out.println("your balance is"+balance);
	}
	
	public void withdraw(int amount) {
		if(amount<=balance) 
		{
			int withdraw_money=balance-amount;
			System.out.println("your withdraw amount is "+withdraw_money);
			
		}
		else 
		{
			System.out.println("insufficient funds");
		}
		
		
			
	}

	public static void main(String[] args) {
		
		
		Bank_account obj =new Bank_account();
		
		obj.setAccountNumber(446);
		obj.setAccountHolderName("suguna");
		obj.setSalary(33457);
		
	    obj.depositmoney();
	    obj.withdraw(46583);
		
		
		

	}

}
