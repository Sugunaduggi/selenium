package practiceprograms;
import java.util.Scanner;

public class Factorialusingforloop {
	 public static int fact(int number) {
		if(number==0 || number==1) {
			return 1;
		}
		else {
			return number*fact(number-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// factorial of a number using for loop 
		/*
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int number= sc.nextInt();
		int fact=1;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("factorial of the number is :"+fact);
		*/
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int result=fact(num);
		System.out.println(result);
		

	}

}
