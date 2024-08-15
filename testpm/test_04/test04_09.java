package testpm.test_04;

public class test04_09 {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("문제10");
		for (int i = 1; i <= 100000000; i *= 10) {
			sum += ((int) (987654321 / i) % 10);
		}
		System.out.println(sum);
		sum = 0; // sum value reset to 0
		// 선생님 풀이
		int a = 987654321;
		for ( ;a >= 1; ) { // 앞뒤가 없어도 조건문이 된다. (while 과 동일한 형태)
			sum += (sum % 10);
			a /= 10;
		}
		System.out.println(sum);
	}
}
