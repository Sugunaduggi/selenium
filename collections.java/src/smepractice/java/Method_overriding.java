package smepractice.java;

class Animal
{
	int s= 35;
    void show() 
    {
    	System.out.println("this is inside animal method");
    }
	
}
class Dog extends Animal
{
	void show()
	{
		System.out.println("this is inside dog method");
	}
}

public class Method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj= new Dog();
		obj.show();

	}

}

