package ex;

public class ColorPoint extends Point {
	public String color; // ���� ���� �ɹ� ����
	
//	�Ϲ� ������
	ColorPoint() {}
	
//	ColorPoint ������ : �Ű������� 3���� ������
//	������ ���� : �ɹ� ���� �ʱ�ȭ
	public ColorPoint(int x, int y, String color) {
//		�ڽĻ��� �ʱ�ȭ�� �� �� ���̻����� �ʱ�ȭ ���� �ϴ� ����
//		�θ��� �����ڸ� ȣ���ؼ� �θ��ʿ��� �ʱ�ȭ
		super(x, y);
//		�ڽ��� �ɹ� ���� �ʱ�ȭ
		this.color = color;
	}
	
//	���������� ��ǥ������ ����ϴ� �޼ҵ�
	public void showColorPoint() {
//		�ڽ� �ɹ� ���� ���
		System.out.print(color);
//		�θ� �޼ҵ�
		showPoint();
	}
}