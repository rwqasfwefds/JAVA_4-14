package ex2;

public class Parent {
	private int x = 100;
	private int y = 200;
//	private이 걸려있어서 그냥 인스턴스 변수에 접근은 못하지만
//	getter과 setter로는 접근 쌉 가능
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
