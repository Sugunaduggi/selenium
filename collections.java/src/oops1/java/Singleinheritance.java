package oops1.java;

// single inheritance

class A{
	int a;
	void display() {
		System.out.println(a);
	}
}

class B extends A{
	int b;
	void show() {
		System.out.println(b);
	}
}

public class Singleinheritance {
	
	public static void main(String[] args) {
		B bobject = new B();
		bobject.a=35;
		bobject.b=46;
		
		bobject.display();
		bobject.show();

	}

}
