package __05DoubleFor;

import java.util.Arrays;
import java.util.Random;

public class _00_test {

	public static void main(String[] args) {
		int [] a = new int [5];
		Random r = new Random();
		// 1. a배열에 0번 인덱스부터 랜덤수를 입력하고 출력
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(100);
		}
		System.out.println(Arrays.toString(a));
		// 2. a배열에 0번 인덱스부터 랜덤수를 입력하고 입력할때마다 현재까지 입력된
		//    배열의 값 출력
		int [] b = new int [5];
		for (int i = 0; i < b.length; i++) {
			b[i] = r.nextInt(100);
			System.out.println(Arrays.toString(b));
		}
		// 3. 일주일은 일요일부터 시작, 하루는 0시부터 24시까지다.
		//    일요일부터 일주일의 시간을 1시간 단위로 출력해라
	}

}
