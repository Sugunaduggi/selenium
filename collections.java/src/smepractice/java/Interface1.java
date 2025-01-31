package smepractice.java;

interface USB{
	void connectUSB();
}


interface Bluetooth {
	void connectBluetooth();
}

class smartphone implements USB,Bluetooth {
	public  void connectUSB() {
		System.out.println("usb is connected successfully");
		
	}
	public void connectBluetooth() {
		System.out.println("bluetooth is connected successfully");
	}
	
}
public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		smartphone obj = new smartphone();
		obj.connectUSB();
		obj.connectBluetooth();

	}

}
