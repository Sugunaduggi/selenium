package collections.java;

public abstract class Employee {
	
	String employeeId;
	String employeeName;
	String employeeType;
	double creditScore;
	
	//setters
	
	public void setEmployeeId(String employeeId) {
		this.employeeId=employeeId;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName=employeeName;
	}
	
	public void setEmployeeType(String employeeType) {
		this.employeeType=employeeType;
	}
	
	public void setCreditScore(double creditScore) {
		this.creditScore=creditScore;
	}
	
	
	//getters
	
	public String getEmployeeId() {
		return employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public String getEmployeeType() {
		return employeeType;
	}
	
	public double getCreditScore() {
		return creditScore;
	}
	
	
	public Employee(String employeeId,String employeeName,String employeeType,double creditScore) {
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeType=employeeType;
		this.creditScore=creditScore;
	}
	
	abstract public double findEmployeeSalary();

}
