package practiceprograms;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of concentric circles");
		int num=sc.nextInt();
		if(num<2 || num>10) 
		{
			System.out.println(num +"is an invalid number of circles");
		}
		else 
		{
			
			 System.out.println("Enter the radius of "+num+" concentric circles");
			 double[] radi = new double[num];
			 double[] area = new double[num];
			 boolean validinput= true;
			 boolean ascending = true;
			 for(int i=0;i<num;i++) 
			 {
				  radi[i]=sc.nextDouble();
				  if(radi[i]<=0)
				  {
					  System.out.println((int)radi[i]+" is an invalid radius");
					  validinput=false;
				  }
			 }
			 if (validinput) 
			 {
	              for (int i = 0; i < num - 1; i++)
	                {
	                    if (radi[i] >= radi[i + 1]) 
	                    {
	                        ascending = false;
	                        break;
	                    }
	                }
			 }
			 if (!ascending)
			 {
                 
                 for (int i = 0; i < num; i++)
                 {
                     System.out.print((int)radi[i] + " ");
                 }
                 
                 System.out.print("are not in ascending order ");
             } 
			 else 
             {
				 System.out.println("The area for " + num + " concentric circles:");
                 for (int i = 0; i < num; i++) 
                 {
                      area[i] = 3.14 * radi[i];
                     System.out.printf("%.2f\n", area[i]);
                 }
                 double distance = radi[num - 1] - radi[0];
                double areaDifference = area[num-1]-area[0];
                
                System.out.println("Distance between first and last circle is " + distance);
                System.out.printf("Area between first and last circle is %.2f\n", areaDifference);
             
             }
             
		}

    }
}