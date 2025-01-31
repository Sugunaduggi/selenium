package oops1.java;

public class Polymorphism {
	
	public int add(int a,int b){
		return a+b;
	}
	public double add(double  a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism myobj= new Polymorphism();
		System.out.println(myobj.add(35,46));
		System.out.println(myobj.add(35.3,46.1));

	}

}
