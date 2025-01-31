package practiceprograms;
import java.util.Scanner;

public class Reverseanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array elements");
		int[] arr=new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("reversing the array elements");
		for(int i=4;i>=0;i--) {
			System.out.println(arr[i]);
		}
		

	}

}
