//package ex2;
//
//public class Salesman extends Employee{
//	public int record;
//	
////	�⺻ ������
//	public Salesman() {
////		1) �θ��� �����ڸ� ȣ�� : Employee() ���� ���
////		2) Salesman() ���� : ���	
//	}
//	
//	public Salesman(int no, String name, int record) {
////		3) �θ��� �����ڸ� ȣ�� : Employee(int, String) ���� ���
////		4) Salesman(int, String, int) ���� : ���
//	}
//	
//}

// ��
package ex2;

public class Salesman extends Employee{
	public int record;
	
//	�⺻ ������
	public Salesman() {
//		1) �θ��� �����ڸ� ȣ�� : "Employee() ����" ���
		super();
//		2) "Salesman() ����" : ���	
		System.out.println("Salesman() ����");
	}
	
	public Salesman(int no, String name, int record) {
//		3) �θ��� �����ڸ� ȣ�� : "Employee(int, String) ����" ���
		super(no, name);
		this.record = record;
//		4) "Salesman(int, String, int) ����" : ���
		System.out.println("Salesman(int, String, int) ����");
	}
	
}