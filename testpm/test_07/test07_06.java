package testpm.test_07;

import java.util.Arrays;
//import java.util.Arrays;
import java.util.Random;

public class test07_06 {

	public static void main(String[] args) {
		// 6. 컴퓨터는 랜덤으로 로또 번호를 10000번 뽑는다.
		// 가장 많이 뽑힌 로또 번호가 오늘의 추천 로또 번호이다.
		// 오늘의 추천 로또 번호 하나를 출력하시오.  만약 로또 번호가 같은 횟수로 나왔을 경우에는 큰 숫자가 우선한다. 
		Random r = new Random();
		int[] a = new int[45];
		for (int i = 0; i < 10000; i++) {
			a[r.nextInt(45)]++;
		}
		System.out.println(Arrays.toString(a));
		int maxCount = 0; // 가장 많이 뽑힌 휫수가 얼마인지 저장해주는 변수
		int maxNum = 0; // 가장 많이 뽑힌 인덱스 번호에 +1을 해주여야 추천번호가 된다.
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= maxCount) {
				maxCount = a[i];
				maxNum = i + 1; // 번호는 index값에 1을 더해주어야 한다.
			}
		}
		System.out.println(maxNum + " 이/가 가장 많이 뽑혔다" + "(" + maxCount + " 회)");
	}

}
