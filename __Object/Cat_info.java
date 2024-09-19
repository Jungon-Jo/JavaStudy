package __Object;
// 각각의 고양이에 대한 단일 책임의 클래스 정의
public class Cat_info {

	String name = null;
	int age = 0;
	
	public void prt() {
		System.out.println("--- cat info ---");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}
