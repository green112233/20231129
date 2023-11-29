package ch7_1;

public class Student extends People{
	//부모생성자 호출
	
	String grade;
	String studentNum;
	//부모생성자 호출
	public Student(String name, String ssn) {
		super(name, ssn);
		// TODO Auto-generated constructor stub
	}
	
	public void printName() {
		System.out.println("학생이름:"+this.name);
		
	}
	
}
