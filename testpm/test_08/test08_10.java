package testpm.test_08;

public class test08_10 {

	public static void main(String[] args) {
		// 11.
		// 000*
		// 00***
		// 0*****
		// *******
		// 0*****
		// 00***
		// 000*
		for (int i = 0; i < 7; i++) {
			if (i < 4) {
				for (int j = 3; j > i; j--) {
					System.out.print("0");
				}
				for (int k = 1; k <= 2*i + 1; k++) {
					System.out.print("*");
				}
			}
			if (i >= 4) {
				for (int m = 0; m < i - 3; m++) {
					System.out.print("0");
				}
				for (int n = 0; n <= 7 - (2*(i - 3) + 1); n++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
 