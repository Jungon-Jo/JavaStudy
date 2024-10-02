package __09Object;

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
		
//		Cat_Obj[] clist = new Cat_Obj[5];
		// Cat_Obj[] → Cat_Obj라는 자료형을 저장한다는 의미이며, 참조타입의 자료형이다.
		// 			   []를 사용하여 배열 형태로 저장하겠다는것을 의미한다.
		// clist → 변수명을 clist로 하며, Cat_Obj 자료형 즉 참조타입이므로 객체의 주소를 저장한다.
		// new 연산자는 heap영역의 객체를 만들고 주소를 가져오겠다는 의미이다.
		// Cat_Obj[5] → 생성자로 5개의 index를 가진 배열을 생성하겠다는 의미다. heap에 저장된 객체의 주소를 배열 형태로 저장한다.
		
		// 선언문 → 변수를 생성하겠다.
		// 자료형 → 값을 저장할 타입, 저장할 값의 형태를 지정(크게 원시변수와 참조변수로 나뉜다.)
	}

}				
/*
 *  클래스와 객체
 *  클래스는 객체를 정의한 정의서, 객체는 클래스로 만든 실제 사용하려는 대상객체는 메모리의 힙 영역에 생성된다.
 *  선언문에서 타입으로 원시변수와 참조변수를 구분하고, 참조변수는 객체의 주소값 변수에 저장된 주소로 객체를 참조한다.. 참조연산자는 .이다.
 */


