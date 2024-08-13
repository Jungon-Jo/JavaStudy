package testpm.test_01;

public class test01_05 {

	public static void main(String[] args) {
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
	}

}
