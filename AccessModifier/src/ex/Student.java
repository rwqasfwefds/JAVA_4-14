package ex;

public class Student extends Person {
	public void set() {
		age = 30; // 부모쪽에서 default로 돼있으니 접근 쌉가능
		name = "홍길동"; // 부모쪽에서 public로 돼있으니 접근 쌉가능
		height = 175; // 부모쪽에서 protected로 돼있으니 상속받는 자식만 접근 쌉 가능
//		weight = 99;  // 부모쪽에서 private로 돼있으니 접근 쌉 불가능
		setWeight(99); // 메소드 자체는 public니깐 이 새끼를 접근해서 부모쪽 wight접근
	}
}
