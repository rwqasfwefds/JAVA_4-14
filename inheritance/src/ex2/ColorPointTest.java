package ex2;

public class ColorPointTest {

	public static void main(String[] args) {
//		point 인스턴스(객체) 생성
		point p = new point();
		
//		좌표 설정
		p.set(1, 2);
		p.showPonint(); // 좌표 출력
		
//		ColorPoint 인스턴스(객체) 생성
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint(); // 좌표와 색상정보 출력
	}

}
