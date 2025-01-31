package practiceprograms;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1;i<=20;i++) {
			if(i%3==0) {
				continue;
				
			}
			if(i==15) {
				break;
			}
			
			System.out.println(i);
		}
		

	}

}
