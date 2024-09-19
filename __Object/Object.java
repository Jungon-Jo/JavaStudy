package __Object;

import java.util.Random;
// Random → class

public class Object {
// class 이름은 Object 이다.

	public static void main(String[] args) {
		// 현금과 카드 결제 → 현금은 원시변수, 카드는 참조변수(내 계좌의 주소를 저장)/참조하겠다는 의미의 코드는 "."이다.
		int a = 10; // int 는 4byte를 저장한다. int, char, float, double, float 등 소문자로 시작하는 자료형은 원시변수[내가 원하는 값을 저장]라 한다.
		Random r = new Random(); // String, Random, Scanner 등 대문자로 시작하는 자료형을 참조변수[객체가 있는곳의 주소를 저장]라 한다.
		Random r1 = r; // 객체를 공유하겠다는 의미를 가질 수 도 있다.
		Random r2 = null; // 변수는 있으나 객체가 없다.
		Random r3 = new Random();
		// 앞의 random은 값을 저장 할 값의 타입(클래스 명)을 의미(Random이라는 클래스의 값의 타입만 저장)하고,
		// 뒤의 random은 객체 random(클래스 명)과 ()생성자로 이루어진다.
		// new 연산자로 객체를 만들 때는 생성자로 만들고 생성자는 클래스명과 동일하다.
		// 객체는 2개가 만들어 졌다.(객체는 new 연산자로 만들어진다)
		// 객체를 만든다는 의미는 heap 영역에 class를 이용해 만들어진 객체를 저장하고 그 객체가 가진 주소를 저장해 사용하겠다는 의미이다.
		System.out.println(r.nextInt(4)); // r은 객체를 직접 만들어 사용하는 경우
		System.out.println(r1.nextInt(4)); // r1은 객체의 주소만 받아쓰는 경우
//		System.out.println(r2.nextInt(4)); // r2가 가지고 있는 주소가 없어서 에러(예외가 발생하게된다.)
		System.out.println(r3.nextInt(4));
		// nextInt 는 Random이라는 객체가 가지고 메서드 중 하나이다.
		// GC = Garbage Collector, heap에 저장된 객체 중 사용되지 않은 객체를 찾아서 삭제시켜주는 기능
	}

}
