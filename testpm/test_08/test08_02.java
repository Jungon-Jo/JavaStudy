 package testpm.test_08;

public class test08_02 {

	public static void main(String[] args) {
		// 3.
		// 000*
		// 00***
		// 0*****
		// *******
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3 - i; j++) {
				System.out.print("0");
			}
			for (int k = 1; k <= i*2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4 + i; j++) {
				if (j >= 3 - i) {
				System.out.print("*");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}

}
