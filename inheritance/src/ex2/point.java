package ex2;

public class point {
//	한 점을 구성하는 x, y 좌표
	public int x, y;
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPonint() {
		System.out.println("(" + x + "," + y + ")");
	}
}
