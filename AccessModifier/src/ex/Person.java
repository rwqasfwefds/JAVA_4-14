package ex;

public class Person {
	private int weight; // �ٸ� Ŭ�������� ���� �Ұ�
	int age; // default, ���� ��Ű���� �ִ� Ŭ�������Ը� ����
	protected int height; // ��� �޴� Ŭ������ ����
	public String name; // �ٸ� ��Ű���� �����ؼ� ��� ����
	
//	setter
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
//	getter
	public int getWeight() {
		return weight;
	}
}