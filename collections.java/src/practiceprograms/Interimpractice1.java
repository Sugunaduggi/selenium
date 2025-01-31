package practiceprograms;
import java.util.Scanner;

public class Interimpractice1 {

	public static void main(String[] args) {
		
		// to find out the second largest element in an array 
		// TODO Auto-generated method stub
		
		int[] array = new  int[5];
		System.out.println("Enter the array elements:");
		Scanner sc= new Scanner(System.in);
		for(int i =0 ;i<5;i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("your elements are:");
		for(int i =0 ;i<5;i++) {
			System.out.println(array[i]);
		}
		
		int largest=Integer.MIN_VALUE;
		int second_largest= Integer.MIN_VALUE;
		System.out.println(largest);
		for(int i=0;i<5;i++){
		    if(array[i]>largest)
		    {
		        second_largest=largest;
		        largest=array[i];
		    }
		    else if(array[i]>second_largest && array[i]!=largest)
		    {
		        second_largest=array[i];
		        
		    }
		}
		System.out.println(second_largest);
		
		

	}

}
