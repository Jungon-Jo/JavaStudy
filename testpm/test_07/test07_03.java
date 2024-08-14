package testpm.test_07;

import java.util.Random;

public class test07_03 {

	public static void main(String[] args) {
		// 3. 2번 업그레이드, 랜덤 수를 하나 뽑아서 출력한다
		// 7의 배수이면 행운의 숫자, 7의 배수가 아니면 행운의 숫자가 나올 때 까지 계속 뽑는다.
		Random r = new Random();
		for (; ;) {
			int a = r.nextInt(100) + 1;
			System.out.println(a);
			if (a % 7 == 0) {
				System.out.println("행운의 숫자");
				break;
			} else {
				System.out.println("조심해야하는 숫자");
			}
		}
	}

}
