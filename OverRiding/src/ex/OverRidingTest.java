package ex;

public class OverRidingTest {
	
	public static void main(String[] args) {
//		Weapon Ŭ������ �ν��Ͻ�(��ü) �����
		Weapon weapon = new Weapon();
		
		System.out.println("�⺻ ������ ��� �ɷ��� " + weapon.fire() + "�� ��");
		
//		Cannon Ŭ������ �ν��Ͻ�(��ü) �����
		Cannon cannon = new Cannon();
		
		System.out.println("������ ��� �ɷ��� " + cannon.fire() + "�� ��");
	}
}