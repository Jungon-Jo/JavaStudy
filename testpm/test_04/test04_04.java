package testpm.test_04;

public class test04_04 {

	public static void main(String[] args) {
		System.out.println("문제5");
		for (int i = 0; i < 900; i++) {
			int crimeNum = ((i + 100) / 10) % 10;
			if (crimeNum % 3 == 0) {
				System.out.println(i + 100);
			}
		}
	}
}
