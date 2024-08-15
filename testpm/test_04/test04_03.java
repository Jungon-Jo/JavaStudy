package testpm.test_04;

public class test04_03 {

	public static void main(String[] args) {
		System.out.println("문제4");
		int sum = 0;
		for (int i = 0; i < 900; i++) {
			int num = i + 100;
			sum += (num / 100 + (num / 10) % 10 + num % 10);
		}
		System.out.println(sum);
	}
}
