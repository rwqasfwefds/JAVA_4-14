package OverRiding_Ex2;

public class ShapeTest {
	
	public static void main(String[] args) {
		Shape shape = new Shape(); // ���
		Line line = new Line(); // ��, Shape ���
		Rect rect = new Rect(); // �簢��, Shape ���
		Circle circle = new Circle(); // ��, Shape ���
		
		shape.draw(); // ��� : Shape
		line.draw(); // ��� : Line
		rect.draw(); // ��� : Rect
		circle.draw(); // ��� : Circle
	}
}