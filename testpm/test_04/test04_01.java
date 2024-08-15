package testpm.test_04;

public class test04_01 {

	public static void main(String[] args) {
		System.out.println("문제2");
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i <= 99; i++) {
			if ((i + 1) % 2 == 1) {
				oddSum += (i + 1);
			} else {
				evenSum += (i + 1);
			}
		}
		System.out.println("홀수의 합 : " + oddSum + ", " + "짝수의 합 : " + evenSum);
	}
}
