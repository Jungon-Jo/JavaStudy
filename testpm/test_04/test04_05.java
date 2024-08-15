package testpm.test_04;

public class test04_05 {

	public static void main(String[] args) {
		System.out.println("문제6");
		int sum = 0;
		int minValue = 100;
		for (int i = 0; i <= 100; i++) {
			sum += i;
			if (sum >= 44) {
				if (i < minValue) {
					minValue = i;
					System.out.println(minValue);
				}
			}
		}
	}
}
