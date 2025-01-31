package oops1.java;

public class encapsulation {
	
	private int empid;
	private int empsalary;
	private String empname;
	
	//setters
	public void setEmpID(int empid) {
		this.empid=empid;
	}
	
	public void setEmpSalary(int empsalary) {
		this.empsalary=empsalary;
	}
	public void setEmpName(String empname) {
		this.empname=empname;
	}

	//getters
	public int getEmpId() {
		return empid;
	}
	
    public int getEmpSalary() {
    	return empsalary;
    }
    public String getEmpName() {
    	return empname;
    }
	public static void main(String[] args) {
		// encapsulation is the process of wrapping up of variables and methods into a single unit and operating the variables through methods
		// encapsulation is used to provide the security to the variables 
		// three rules to remember : 
		// all the variables should be private 
		// for each variable there should be two methods (getter and setter ) 
		// variables can be accessed only through methods 
		
		
		// lets see one example 
		
		encapsulation obj= new encapsulation();
		obj.setEmpID(2432);
		obj.setEmpSalary(35345);
		obj.setEmpName("suguna");
		
		
		System.out.println("emp id is " +obj.getEmpId());
		System.out.println("emp salary is "+obj.getEmpSalary());
		System.out.println("emp name is "+obj.getEmpName());
		
		
		

	}

}
