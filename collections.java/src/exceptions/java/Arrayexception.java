package exceptions.java;
import java.util.Scanner;

public class Arrayexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements");
		try {
			int[] arr =  new int[5];
			for(int i=0;i<5;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter the index");
			int index=sc.nextInt();
			System.out.println("your element is :" + arr[index]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("pls enter the correct index");
		}
		

	}

}
