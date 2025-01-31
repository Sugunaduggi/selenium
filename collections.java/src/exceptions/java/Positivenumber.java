package exceptions.java;
import java.util.Scanner;

public class Positivenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		while(true) {
			try {
			System.out.println("Enter a number");
			int number= sc.nextInt();
			if(number <0) {
				throw new IllegalArgumentException("Number must be a posiitve");
			}
			System.out.println("you entered a correct number");
			
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}
		

	}

}
