package ch7_1;

//부모클래스
public class People {
	// 다른 패키지에 있는 클래스가 다른 패키지의 클래스를 상속받을때 public을 명시하지 않은 필드는 사용할 수 없다.
	
	public String name;
	public String ssn;
	private String phone;
	
	
	//생성자
	public People(String name, String ssn) {
		super();
		this.name = name;
		this.ssn = ssn;
	}
	
	public void printName() {
		System.out.println("사람이름:"+this.name);
	}

	
}
