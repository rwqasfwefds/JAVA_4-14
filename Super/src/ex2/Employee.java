package ex2;

public class Employee {
	public int no;
	public String name;
	
//	�⺻ ������
	public Employee() {
		System.out.println("Employee() ����");
	}
	
//	�Ű����� 2��¥�� ������
	public Employee(int no, String name){
		this.no = no;
		this.name = name;
		System.out.println("Employee(int, String) ����");
	}
}