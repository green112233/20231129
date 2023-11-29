package ch7_1;
import test.Solider;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		dmbCellPhone.model = "갤럭시폰";
		dmbCellPhone.color = "검정";
		dmbCellPhone.receiveVoice("hello");
		
		
		CameraCellPhone cameraCellPhone = new CameraCellPhone();
		
		cameraCellPhone.model ="아이폰";
		
		People people = new People("홍길동", "123456-1234567");
//		People people2 = new People();
		
		Student student = new Student("이순신", "050101-1234567");
		//student.phone 부모클랫흐에서 private 접근 지정자로 지겆ㅇ된 필드는 자식클래스에서 불러올 수 없다
		Solider solider = new Solider("김유신","001111-1115264");
		solider.name = "강감찬";
		
		people.printName();
		
		student.printName();
		solider.printName();
	}

}
