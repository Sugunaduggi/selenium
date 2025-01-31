package exceptions.java;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		try {
			int a = sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("your result is :" +c);
			
		}
		catch(ArithmeticException e) {
			System.out.println("dont enter zeros");
		}catch(InputMismatchException e) {
			System.out.println("pls enter only numbers");
		}
        finally {
        	System.out.println("hello i am in finally block");
        }
	}

}
