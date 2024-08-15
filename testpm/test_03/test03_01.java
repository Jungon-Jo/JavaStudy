package testpm.test_03;

public class test03_01 {

	public static void main(String[] args) {
		System.out.println("문제2");
		/* int level = 2;
		 * int point = 30;
		 * level이 1이면 포인트에 30을 더하고,
		 * level이 1이 아니면 포인트에 10을 더하시오.
		 * System.out.println()을 한 번만 사용하여 최종 포인트를 출력하시오.
		 */
		int level = 2;
		int point = 30;
		if (level == 1) {
			point += 30;
		} else {
			point += 10;
		}
		System.out.println(point);
		
	}

}
