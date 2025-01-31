package collections.java;

public class PermanentEmployee extends Employee {
	
	int experience;
	
	public void setExperience(int experience) {
		this.experience=experience;
	}
	
	public int getExperience() {
		return experience;
	}
	
	public PermanentEmployee (String employeeId,String employeeName,String employeeType,double creditScore,int experience) {
		super(employeeId,employeeName,employeeType,creditScore);
		this.experience=experience;
	}
	
	public double findEmployeeSalary() {
		double salary=0;
		
		if(experience>=1 && experience <=5) {
			salary = 30000;
		}
		else if(experience>=6 && experience<=10){
			salary=60000;
		}
		else if(experience >=11 && experience <=15) {
			salary=120000;
		}
		else if(experience >=16 && experience <=20) {
			salary=240000;
		}
		else if (experience >20) {
			salary=500000;
		}
		else {
			return -1;
		}
		
		return salary;
		
	}

}
