package testpm.test_04;

public class test04_00 {

	public static void main(String[] args) {
		System.out.println("levelUp");
		System.out.println("문제1");
		int sum = 0;
		for (int i = 0; i <= 99; i++) {
			if ((i + 1) % 2 == 1) {
				sum += (i + 1);
			} else {
				sum -= (i + 1);
			}
		}
		System.out.println(sum);
	}
}
