package testpm.test_01;

public class test01_total {

	public static void main(String[] args) {
		// 시나리오
		System.out.println("메모장 프로그램");
		String title = "나의 점심";
		String body = "오늘은 자장면";
		System.out.println(title);
		System.out.println(body);
		title = "점심메뉴";
		System.out.println(title);
		int view = 0;
		body = "짬뽕도 먹음";
		view = 10;
		System.out.println(title);
		System.out.println(body);
		System.out.println(view);
		
		// level up1
		body = body + " 탕수육도 먹음";
		// body += "탕수육도 먹음"
		// System.out.println(body);
		
		// level up2
		// 문제1
		int point = 0;
		point = 80;
		System.out.println(point);
		
		// 문제2
		double m = 10;
		double n = 4;
		System.out.println(m/n);
		// int firstNumber = 10;
		// int secondNumber = 4;
		// System.out.println((double) m/n) -> 2.5
		// System.out.println((double) (m/n)) -> 2.0
		// 괄호안의 연산이 먼저 이루어져, "m/n = 2"가 되고 앞의 "double"로 실수형 결과값이 casting됨으로 2.0이 출력된다. 
		
		// 문제3
		String name = null;
		name = "홍길동";
		System.out.println(name + " 님");
		
		// 문제4
		int english = 90;
		int math = 87;
		int computer = 100;
		double subject = 3;
		double average = 0;
		average = (english + math + computer)/subject;
		// average = (english + math + computer)/3.0;
		// 나눠주는 값을 3.0(실수형)으로 바꿔줌으로써, 계산 결과값을 실수형으로 변환시켜준다.
		System.out.println(average);
		
		// level up3
		int a = 10;
		System.out.println((a%3) == 3);
	}

}
