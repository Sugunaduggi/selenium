package smepractice.java;


interface vehicle {
	 void driver();
}

interface Engine {
	void startEngine();
}

class car implements vehicle,Engine{
	public  void driver() {
		System.out.println("this is vehicle method");
	}
	 public void startEngine() {
		System.out.println("this is engine method ");
	}
	
}

public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car obj = new car();
		obj.driver();
		obj.startEngine();
		

	}

}
