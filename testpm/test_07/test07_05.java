package testpm.test_07;

import java.util.Arrays;
import java.util.Random;

public class test07_05 {

	public static void main(String[] args) {
		// 5. 로또번호를 자동으로 생성하는 게임을 작성하시오.
		// 중복허용 가능, 로또 번호 6개를 배열에 저장하고, 출력하시오.
		Random r = new Random();
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;
		}
		System.out.println(Arrays.toString(lotto));
	}

}
