package smepractice.java;

interface Appliance{
	void turnOn();
	
	void turnOff();
}


class Fan implements Appliance{
	public void turnOn() {
		System.out.println(" fan is  in turn on  mode");
	}
	 public void turnOff() {
		System.out.println(" fan is in  turn  off mode");
	}
	
}

public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   Fan obj = new Fan();
	   obj.turnOn();
	   obj.turnOff();
	}

}
