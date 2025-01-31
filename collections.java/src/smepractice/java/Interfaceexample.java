package smepractice.java;

interface a{
	void m1();
}

interface b{
		void m2();
}

class child implements a,b{
	public void m1() {
		System.out.println("this is m1 method");
	}
	
	public void m2() {
		System.out.println("this is m2 method");
	}
	
}
class Interfaceexample  
{
	
	public static void main(String[] args) 
	{
	
	child obj = new child();
	obj.m1();
	obj.m2();
	

} }
