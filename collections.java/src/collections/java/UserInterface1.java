package collections.java;

import java.util.Scanner;

public class UserInterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee ID");
		String eid=sc.nextLine();
		
		System.out.println("Enter Employee name");
		String ename=sc.nextLine();
		
		System.out.println("Enter Employee type");
		String etype=sc.nextLine();
		
		if(etype.equalsIgnoreCase("Permanent")) {
			System.out.println("Enter Employee credit score");
			double cs=sc.nextDouble();
			
			System.out.println("Enter Employee experience");
			int exp=sc.nextInt();
			
			PermanentEmployee obj=new PermanentEmployee(eid,ename,etype,cs,exp);
			double result=obj.findEmployeeSalary();
			
			System.out.println("Permanent Employee");
			System.out.println("Name:"+obj.getEmployeeName());
			System.out.println("Salary:"+result);
			
		}
		else if(etype.equalsIgnoreCase("Temporary")) {
			
			System.out.println("Enter Employee credit score");
			double cs=sc.nextDouble();
			
			System.out.println("Enter the daily hours of experience");
			int dhe=sc.nextInt();
			
			TemporaryEmployee obj=new TemporaryEmployee(eid,ename,etype,cs,dhe);
			double result=obj.findEmployeeSalary();
			
			System.out.println("Temporary Employee");
			
			System.out.println("Name:"+obj.getEmployeeName());
			System.out.println("Salary:"+result);
			
		}
		else
		{
			System.out.println(etype +" is an invalid employee type");
		}
		

	}

}
