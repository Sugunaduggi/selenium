package smepractice.java;

class D{
	 
	 int result;
	 
	 public int add(int a,int b) {
		  result = a+b;
		 return result;
	 }
	 
	 public int add(int a,int b,int c) {
		 result = a+b+c;
		  return result;
	 }
	
	
}

public class Method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// example of method overloading
		D obj = new D();
		System.out.println(obj.add(35, 3557));
		System.out.println(obj.add(24, 235,57));
		

	}

}
