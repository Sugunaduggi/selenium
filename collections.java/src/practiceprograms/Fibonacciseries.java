package practiceprograms;
import java.util.Scanner;

public class Fibonacciseries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int i = 1; // Start from 1 to include the first term
        int c;
        System.out.print("Fibonacci Series: " + a + " " + b); // Print the first two terms

        while (i < num - 1) 
        { // Loop until num-1 because we already printed the first two terms
             c = a + b;
            //System.out.print(" " + c);
            a = b;
            b = c;
            i++;
            //System.out.println(c);
        }
        
		//System.out.println(b);
    }
}