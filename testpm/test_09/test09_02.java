package testpm.test_09;

public class test09_02 {

	public static void main(String[] args) {
		// 3
		// 1부터 10까지 숫자의 각 팩토리얼의 합을 구하시오.
		// 4의 팩토리얼은 1*2*3*4
		// 5의 팩토리얼은 1*2*3*4*5
		// (2중 for로 해결)
		int sum = 0; // 팩토리얼값들의 합을 저장하기위한 변수
		int factorial = 1; // 팩토리얼 값을 저장하기위한 변수(곱의 값을 저장함으로 1을 초기값으로 지정)
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				factorial *= j;
			}
			sum += factorial;
		}
		System.out.println(sum);
	}

}
