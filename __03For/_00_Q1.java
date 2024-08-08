package __03For;

public class _00_Q1 {

	public static void main(String[] args) {
		int[] a = {30, 40, 50, 55, 65};
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
		for (int i = 4; i >= 0; i--) {
			System.out.println(a[i]);
		}
		for (int i = 1; i <= 5; i++) {
			System.out.println(a[i%5]);
		}
		for (int i = 0; i <= 4; i++) {
			System.out.println(a[(i+1)%5]);
		} // 시작점은 0으로 두고하는 습관을 들이자
		
		// 배열의 순회를 반복하면서 값의 조건판단 후 출력
		// 50이상의 value를 출력
		for (int i = 0; i <  5; i++) {
			if (a[i] >= 50) {
				System.out.println(a[i]);
			}
		}
		// 50이상의 value 는 몇개인가
		int cnt1 = 0;
		for (int i = 0; i <  5; i++) {
			if (a[i] >= 50) {
				cnt1++;
			}
		}
		System.out.println(cnt1);
		// 50점 이상의 점수를 합하시오
		int sum1 = 0;
		for (int i = 0; i < 5; i++) {
			if (a[i] >= 50) {
				sum1 += a[i];
			}
		}
		System.out.println(sum1);
		// 평균을 구하시오. 단, 50점 이상
		double cnt2 = 0;
		double sum2 = 0;
		for (int i = 0; i < 5; i++) {
			if (a[i] >= 50) {
				sum2 += a[i];
				cnt2++;
			}
		}
		System.out.println(sum2);
		System.out.println(sum2 / cnt2);
		// 평균을 구하시오. 단, 최저점수는 포함하지 마시오.
		int minValue = 65;
		double cnt3 = 0;
		double sum3 = 0;
		for (int i = 0; i < 5; i++) {
			if (a[i] >= 50) {
				sum3 += a[i];
				cnt3++;
				if (a[i] < minValue) {
					minValue = a[i];
				}
			}
		}
		System.out.println((sum3 - minValue) / (cnt3 - 1));
	}

}
