package testpm.test_04;

public class test04_06 {

	public static void main(String[] args) {
		System.out.println("문제7");
		int sum = 0;
		for (int i = 0; i <= 9; i++) {
			System.out.print(i+1);
			if ((i + 1) != 10) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
			sum += (i + 1);
		}
		System.out.println(sum);
	}
}
