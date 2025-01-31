package oops1.java;

public class Student {
	
	private String name;
	private int age;
	private char grade;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setGrade(char grade) {
		this.grade=grade;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	public char getGrade() {
		return grade;
	}
	
	public void displayDetails() {
		System.out.println("student name is "+name);
		System.out.println("student age is "+age);
		System.out.println("student age is "+grade);
	}

	public static void main(String[] args) {
		
		Student stu= new Student();
		
		stu.setName("suguna");
		stu.setAge(35);
		stu.setGrade('A');
		
		stu.displayDetails();
		
		

	}

}
