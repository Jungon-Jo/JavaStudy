package testpm.test_08;

public class test08_11 {

	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < i + 4; j++) {
				if (i <= 3) {
					if (j < 3 - i) {
						System.out.print("0");
					} else {
						System.out.print("*");
					}
				} else {
					if (j < i - 3) {
						System.out.print("0");
					} else if (j < 10 - i) {
						System.out.print("*");
					}
				}
			} System.out.println();
		}
	}

}
