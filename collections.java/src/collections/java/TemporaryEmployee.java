package collections.java;

public class TemporaryEmployee extends Employee{
	
	int dailyHrsOfWork;
	
	
	public void setDailyHrsOfWork(int dailyHrsOfWork) {
		this.dailyHrsOfWork=dailyHrsOfWork;
	}
 
	
	public int getDailyHrsOfWork() {
		return dailyHrsOfWork;
	}
	
	public TemporaryEmployee(String employeeId,String employeeName,String employeeType,double creditScore,int dailyHrsOfWork) {
		super(employeeId,employeeName,employeeType,creditScore);
		this.dailyHrsOfWork=dailyHrsOfWork;
	}
	
	public double findEmployeeSalary() {
		double salary;
		if(dailyHrsOfWork>=4 && dailyHrsOfWork<=6) {
			salary=25000;
		}
		else if(dailyHrsOfWork>=7 && dailyHrsOfWork<=9) {
			salary=35000;
		}
		else if(dailyHrsOfWork>=10 && dailyHrsOfWork<=12) {
			salary=45000;
		}
		else if(dailyHrsOfWork>=13 && dailyHrsOfWork<=15) {
			salary=55000;
		}
		else if(dailyHrsOfWork<15) {
			salary =70000;
		}
		else {
			return -1;
		}
		
		return salary;
	}
}
