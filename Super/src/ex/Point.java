package ex;

public class Point {
	public int x, y; // ��ǥ ����
	
//	�⺻ ������ : �ɹ� ���� �ʱ�ȭ
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
//	�Ű������� 2���� ������
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
//	��ǥ ��� �޼ҵ�
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}