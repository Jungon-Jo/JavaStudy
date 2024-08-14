package __04Random;

import java.util.Random; //_00_test에 Random이라는 클래스를 인식시키기 위함(다른데서 가져오는것으로 import된다)

public class _00_test {

	public static void main(String[] args) {
		int[] lotto = new int[6]; // 변수명, 길이, index
		Random r = new Random(); // ctrl + shift + 'o';
		for (int i = 0; i < lotto.length; i++) {
			System.out.println((i+1) + "번째 뽑아");
			int k = r.nextInt(45) + 1; // r변수를 참조하여 nestInt라는 기능을 호출, 리턴받은 수에 +1을 한다.
			lotto[i] = k;
		}
		for (int i = 0; i < lotto.length; i++) {
			if (i == (lotto.length - 1)) {
				System.out.println("보너스 : " + lotto[i]);
			} else {
				System.out.println(lotto[i]);
			}
		}
	}

}
