package testpm.test_08;

public class test08_03 {

	public static void main(String[] args) {
		// 4. 
		// *******
		// 0*****
		// 00***
		// 000*
		for (int i = 0; i < 4; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print("0");
			}
			for (int j = 0; j < 7 - 2*i; j++) {
				System.out.print("*");
			} System.out.println();
		}
	}

}
