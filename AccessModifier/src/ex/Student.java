package ex;

public class Student extends Person {
	public void set() {
		age = 30; // �θ��ʿ��� default�� �������� ���� �԰���
		name = "ȫ�浿"; // �θ��ʿ��� public�� �������� ���� �԰���
		height = 175; // �θ��ʿ��� protected�� �������� ��ӹ޴� �ڽĸ� ���� �� ����
//		weight = 99;  // �θ��ʿ��� private�� �������� ���� �� �Ұ���
		setWeight(99); // �޼ҵ� ��ü�� public�ϱ� �� ������ �����ؼ� �θ��� wight����
	}
}