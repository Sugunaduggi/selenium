package practiceprograms;
import java.util.Scanner;


public class Finalpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = sc.nextInt();
	
		int original = number;
		int temp=0;
		while(number!=0) {
			int num = number %10;
			temp = temp*10+num;
			number = number/10;
			
		}
		if (original ==temp) {
			System.out.println("armstrong");
		}else {
			System.out.println("Not armstrong");
		}
		
	}
}
