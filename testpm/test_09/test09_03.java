package testpm.test_09;

import java.util.Arrays;

public class test09_03 {

	public static void main(String[] args) {
		// 4
		// int[] b = {93,45,83,58,75,56}
		// 다음조건에 따라 오름차순으로 정렬하시오.
		// 1. 가장큰 값을 찾아서 맨뒤 값과 교환한다.. 결과  {56,45,83,58,75,93}
		// 2. 두번째로 큰 값을 찾아서 맨뒤에서 두번째 자리의 값과 교환한다.  결과  {56,45,75,58,83,93}
		// 3. 세번째로 큰 값을 찾아서 맨뒤에서 세번째 자리의 값과 교환한다.  결과  {56,45,58,75,83,93}
		//    오름차순으로 정렬이 될때 까지 반복한다.
		int[] b = {93,45,83,58,75,56};
		int change = 0; // 배열 순서를 바꾸기위해 배열의 값을 임시로 저장할 변수 필요
		for (int i = 0; i < b.length - 1; i++) {
			for (int j = 0; j < b.length - 1 - i; j++) {
				if (b[j] > b[j+1]) {
					change = b[j+1];
					b[j+1] = b[j];
					b[j] = change;
				}
			}
		}
		System.out.println(Arrays.toString(b));
	}

}
