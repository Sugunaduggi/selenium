package smepractice.java;

interface payment
{
	void makePayment(double amount);
}

class creditcardpayment implements payment{
	public void makePayment(double amount) {
		System.out.println("Paid" +amount+ " using credit card");
	}
}

class UPIPayment implements payment{
	public void makePayment(double amount) {
		System.out.println("Paid "+amount+ " using UPI");
	}
	
}
public class Abstract2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		creditcardpayment obj= new creditcardpayment();
		obj.makePayment(25656);
		UPIPayment obj2 = new UPIPayment();
		obj2.makePayment(35672);
		
		
		

	}

}
