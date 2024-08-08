package __00Variable;

public class _02_Test {

	public static void main(String[] args) {
		int a = 10;
		char b = 'c';
		double c = 20;
		String d = "apple";
		// = 대입 연산자, 뒤에있는 값을 앞의 변수에 저장하겠다.
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(c);
		System.out.println(a+10);
		System.out.println(d+10);
		// 자료형에 따라 사용된 연산자의 의미가 달라진다.
		// d의 경우 문자열 연결자로 동작한다.
		c=a+10/2;
		System.out.println(c);
		System.out.println(a+10);
		int k = a+a/4;
		System.out.println(k);
		int cc = a;
		a = a/3 + 2;
		cc = cc + a;
		System.out.println(cc);
		a = 10;
		double  p = 4;
		System.out.println(a/p);
		// casting 이라고 한다. 자료형이 변경되는 형태(정수값과 실수값이 동시에 연산된 경우 실수값으로 변경된다.)
		System.out.println(a==10);
		// 비교연산자
		System.out.println(a!=10);
		System.out.println(a=a+1); // 변수 a의 값이 11이 된다. "a = 11"
		System.out.println(a==10);
		// 위 두 줄의 코드를 다음과 같이 하나로 줄일 수 있다.
		System.out.println((a=a+1)==10);
	}

}
