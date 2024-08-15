package testpm.test_03;

public class test03_07 {

	public static void main(String[] args) {
		System.out.println("levelUp2");
		System.out.println("문제8");

		/* 새와 총알의 좌표(총알은 직진으로 움직인다.)
		 * 0번 새 (6, 4)
		 * 1번 새 (5, 10)
		 * 2번 새 (9, 6)
		 * 총알 (3, 2)
		 */
		int[] x = {6, 5, 9};
		int[] y = {4, 10, 6};
		if ((double) y[0] / (double) x[0] == 2.0 / 3.0) {
			System.out.println(0);
		};
		if ((double) y[1] / (double) x[1] == 2.0 / 3.0) {
			System.out.println(1);
		};
		if ((double) y[2] / (double) x[2] == 2.0 / 3.0) {
			System.out.println(2);
		};
		
	}

}
