package ex;

public class ColorPoint extends Point {
	public String color; // 색상 정보 맴버 변수
	
//	일반 생성자
	ColorPoint() {}
	
//	ColorPoint 생성자 : 매개변수가 3개인 생성자
//	생성자 목적 : 맴버 변수 초기화
	public ColorPoint(int x, int y, String color) {
//		자식새끼 초기화를 할 때 에미새끼도 초기화 진행 하는 거임
//		부모의 생성자를 호출해서 부모쪽에서 초기화
		super(x, y);
//		자식의 맴버 변수 초기화
		this.color = color;
	}
	
//	색상정보와 좌표정보를 출력하는 메소드
	public void showColorPoint() {
//		자식 맴버 변수 출력
		System.out.print(color);
//		부모 메소드
		showPoint();
	}
}
