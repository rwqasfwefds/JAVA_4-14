package ex;

public class Point {
	public int x, y; // 좌표 저장
	
//	기본 생성자 : 맴버 변수 초기화
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
//	매개변수가 2개인 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
//	좌표 출력 메소드
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}
