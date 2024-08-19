package testpm.test_08;

public class test08_01 {

	public static void main(String[] args) {
		// 2.
		// *****
		// ****
		// ***
		// **
		// *
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
