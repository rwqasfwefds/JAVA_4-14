package ex;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		
//		클래스의 인스턴스 변수는 private로 막고
//		접근을 할려면 메소드로서 접근하는걸 권장
		
		s.set(); // 맴버 변수 저장
		System.out.println(s.getWeight());
	}

}
