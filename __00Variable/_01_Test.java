package __00Variable;

public class _01_Test {

	public static void main(String[] args) {
		// 프로그램 시작점을 알리는 코드
		// sysout + ctrl + space
		// 정수 변수 선언
		int a = 10;
		byte aa = 10;
		System.out.println(a);
		System.out.println(aa);
		// system.out.println()
		// 괄호 안의 내용을 콘솔에 출력하고 줄 바꿈하시오.
		// 소스 실행하는 단축키 : ctrl + F11(jre가 실행할 수 있도록 함/compile + 실행)
		
		// 문자열 변수 선언
		String s = "Jungon Jo";
		System.out.println(s);
		int num = 30;
		a = 50; // (선언문이 아니다.)
		String str = "apple"; //(문자열 / "", 문자열이라는 의미)
		char alp = 'a'; // (문자 / '', 문자라는 의미)
		System.out.println(num);
		System.out.println(str);
		System.out.println(alp);
//		b = "a" // (오류 발생)
		// Senario) 철수는 30세이다. 키는 180이다.(시나리오)
		// Q1) 철수의 나이와 이름을 저장하고 철수의 나이를 +2증가한다.
		// an)
		String name = null;
		name = "철수";
		int age = 0; // (int는 초기값으로 0을 사용한다.)
		age = 30;
		age = age + 2;
		System.out.println(name);
	}

}
