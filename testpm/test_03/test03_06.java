package testpm.test_03;

public class test03_06 {

	public static void main(String[] args) {
		System.out.println("levelUp1");
		System.out.println("문제7");

		/* [숫자놀이] 철수는 숫자를 0번째부터 2번째까지 차례대로 수집했다.
		 * 철수는 숫자의 자릿수를 분해하여 합한 결과 값이 가장 큰 숫자를 선택할 예정이다.
		 * 숫자를 분해하는 것은 45인 경우 "4 + 5"를 의미한다.
		 * 철수가 선택할 숫자는 몇 번째 수집한 숫자인가?
		 */
		int[] a2 = {45, 34, 64};
		if ((a2[0]/10+a2[0]%10) > (a2[1]/10+a2[1]%10) && (a2[0]/10+a2[0]%10) > (a2[2]/10+a2[2]%10)) {
			System.out.println("첫번째 수집한 숫자");
		} else if ((a2[1]/10+a2[1]%10) > (a2[2]/10+a2[2]%10)) {
			System.out.println("두번째 수집한 숫자");
		} else {
			System.out.println("세번째 수집한 숫자");
		}
		
		int maxValue = 0;
		int maxIndex = 0;
		int temp0 = a2[0]/10+a2[0]%10;
		if (temp0 > maxValue) {
			maxValue = temp0;
			maxIndex = 1;
		}
		int temp1 = a2[1]/10+a2[1]%10;
		if (temp1 > maxValue) {
			maxValue = temp1;
			maxIndex = 2;
		}
		int temp2 = a2[2]/10+a2[2]%10;
		if (temp2 > maxValue) {
			maxValue = temp2;
			maxIndex =3;
		}
		System.out.println(maxValue);
		System.out.println(maxIndex + "번째 수집 number");
		
	}

}
