package ex;

public class OverRidingTest {
	
	public static void main(String[] args) {
//		Weapon 클래스의 인스턴스(객체) 만들기
		Weapon weapon = new Weapon();
		
		System.out.println("기본 무기의 살상 능력은 " + weapon.fire() + "명 임");
		
//		Cannon 클래스의 인스턴스(객체) 만들기
		Cannon cannon = new Cannon();
		
		System.out.println("대포의 살상 능력은 " + cannon.fire() + "명 임");
	}
}
