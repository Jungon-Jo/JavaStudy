package testpm.test_03;

public class test03_02 {

	public static void main(String[] args) {
		System.out.println("문제3");
		/* int[] lotto = {6, 12, 33, 4, 5, 26}; (배열의 값은 바뀔 수 있다.)
		 * 로또번호이다.
		 * 3번째 값에 80을 더하시오.
		 */
		int[] lotto1 = {6, 12, 33, 4, 5, 26};
		lotto1[2] += 80;
		System.out.println(lotto1[2]);
		// System.out.println(lotto1[0]+", "+lotto1[1]+", "+lotto1[2]+", "+lotto1[3]+", "+lotto1[4]+", "+lotto1[5]);
		
	}

}
