package testpm.test_06;

import java.util.Arrays;

public class test06_07 {

	public static void main(String[] args) {
		System.out.println("문제7");
		int[] A = {34,2,35,8,45,31};
		// 7. 철수는 배열의 0번 인덱스부터 순회한다.
		// 0번 인덱스에서는 0번인덱스와 그 다음 인덱스를 비교하여 큰 수를 뒤로 배치한다.
		// 이러한 방식으로 배열의 뒤까지 반복하면 맨 뒤에 가장 큰 수가 배치 될 것이다.
		// 위와 같은 방식으로 가장큰 수를 구하시오.
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i+1] < A[i]) {
				A[i+1] = A[i];
			}
		}
		System.out.println(Arrays.toString(A));
		
		int[] Aa = {34,2,35,8,45,31};
		int B = 0;
		for (int i = 0; i < Aa.length - 1; i++) {
			if (Aa[i+1] < Aa[i]) {
				B = Aa[i+1];
				Aa[i+1] = Aa[i];
				Aa[i] = B;
				i = 0;
			}
		}
		System.out.println(Arrays.toString(Aa));
	}
}
