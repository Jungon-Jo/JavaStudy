package testpm.test_03;

public class test03_03 {

	public static void main(String[] args) {
		System.out.println("문제4");
		/* int[] lotto = {6, 12, 33, 4, 5, 26}; (배열의 값은 바뀔 수 있다.)
		 * 4번째 번호가 홀수이면 홀수, 짝수이면 짝수라고 출력하시오.
		 */
		int[] lotto2 = {6, 12, 33, 4, 5, 26};
		if (lotto2[3] % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
	}

}
