package exceptions.java;
import java.util.Scanner;

public class Agevalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		try {
			System.out.println("Enter the age");
			int age= sc.nextInt();
			if(age<18) {
				throw new IllegalArgumentException("age must be 18 or above");
			}
			else {
				System.out.println("you age is suitable to vote");
			}
			
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		

	}

}
