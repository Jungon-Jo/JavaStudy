package testpm.test_04;

public class test04_02 {

	public static void main(String[] args) {
		System.out.println("문제3");
		int cnt = 0;
		for (int i = 0; i <= 99; i++) {
			if ((i + 1) % 2 == 1) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
