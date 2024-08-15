package testpm.test_04;

public class test04_07 {

	public static void main(String[] args) {
		System.out.println("문제8");
		int sum = 0;
		int fib = 1;
		int pastFib = 0;
		for (int i = 1; i < 8; i++) {
			sum += fib;
			int futureFib = fib + pastFib;
			pastFib = fib;
			fib = futureFib;
		}
		System.out.println(sum);
	}
}
