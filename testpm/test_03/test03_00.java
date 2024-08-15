package testpm.test_03;

public class test03_00 {

	public static void main(String[] args) {
		System.out.println("=====================================================================");
		System.out.println("문제1");
		// 평균을 저장하는 변수를 만들고 89.2라고 저장하시오.
		// 평균이 80점 이상이면 합격, 80점 미만이면 불합격이라고 출력하시오.
		double average = 89.2;
		if (average >= 80) {
			System.out.println("합격");			
		} else {
			System.out.println("불합격");
		}
		System.out.println("---------------------------------------------------------------------");
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
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제3");
		/* int[] lotto = {6, 12, 33, 4, 5, 26}; (배열의 값은 바뀔 수 있다.)
		 * 로또번호이다.
		 * 3번째 값에 80을 더하시오.
		 */
		int[] lotto1 = {6, 12, 33, 4, 5, 26};
		lotto1[2] += 80;
		System.out.println(lotto1[2]);
		// System.out.println(lotto1[0]+", "+lotto1[1]+", "+lotto1[2]+", "+lotto1[3]+", "+lotto1[4]+", "+lotto1[5]);
		System.out.println("---------------------------------------------------------------------");
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
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제5");
		/* int[] lotto = {6, 12, 33, 4, 5, 26}; (배열의 값은 바뀔 수 있다.)
		 * 홀수인 로또 번호의 합을 구하시오.. 결과 : 33 + 5 = 38
		 */
		int[] lotto3 = {6, 12, 33, 4, 5, 26};
		int oddSum = 0;
		if (lotto3[0]%2==1) {
			oddSum += lotto3[0];
		}
		if (lotto3[1]%2==1) {
			oddSum += lotto3[1];
		}
		if (lotto3[2]%2==1) {
			oddSum += lotto3[2];
		}
		if (lotto3[3]%2==1) {
			oddSum += lotto3[3];
		}
		if (lotto3[4]%2==1) {
			oddSum += lotto3[4];
		}
		if (lotto3[5]%2==1) {
			oddSum += lotto3[5];
		}
		System.out.println(oddSum);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제6");
		/* int[] a = {6, 12, 33, 4, 5, 26}; (배열의 값은 바뀔 수 있다.)
		 * 숫자의 모든 합을 구하시오.
		 */
		int[] a1 = {45, 34, 64, 45, 24};
		System.out.println(a1[0]+a1[1]+a1[2]+a1[3]+a1[4]);
		System.out.println("=====================================================================");
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
		System.out.println("=====================================================================");
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
		System.out.println("=====================================================================");
		System.out.println("Special 문제");
		/* 적은 움직이지 않고 미사일을 y축과 평행하게 직진한다. 이때 미사일이 적을 타격하는지 판별코드를 작성해라.
		 * (상하좌우 닿는 순간 타격으로 판정한다.)
		 * 적의 위치(10, 20), 크기 : 가로 5, 세로 6(적은 사각형 모양으로 위치의 기준은 왼쪽 하단이다.)
		 * 미사일 위치(11, 5), 크기 : 가로 2, 세로 2(위치 기준은 왼쪽 하단이다.)
		 */
		int enemy = 10;
		int missile = 11;
		if (enemy <= missile && missile + 2 <= enemy +5) {
			System.out.println("hit");
		} else {
			System.out.println("none hit");
		}
		
	}

}
