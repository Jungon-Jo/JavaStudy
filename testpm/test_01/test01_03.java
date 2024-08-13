package testpm.test_01;

public class test01_03 {

	public static void main(String[] args) {
		// 문제2
		double m = 10;
		double n = 4;
		System.out.println(m/n);
		// int firstNumber = 10;
		// int secondNumber = 4;
		// System.out.println((double) m/n) -> 2.5
		// System.out.println((double) (m/n)) -> 2.0
		// 괄호안의 연산이 먼저 이루어져, "m/n = 2"가 되고 앞의 "double"로 실수형 결과값이 casting됨으로 2.0이 출력된다. 
	}

}
