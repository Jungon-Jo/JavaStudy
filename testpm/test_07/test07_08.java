package testpm.test_07;

import java.util.Scanner;

public class test07_08 {

	public static void main(String[] args) {
		// 배열 저장 변수
		//		int[] lotto = new int[6];
				// 키보드로 부터 입력받기 위한 객체 만들기.
		//		Scanner in = new Scanner(System.in); // ctrl shift o
				// 0번째 번호부터 로또 번호 입력받기
		//		for (int i = 0; i < lotto.length; i++) {
		//			System.out.println((i + 1) + "번 입력하세요");
		//			int k = in.nextInt();  // nextInt는 키보드로 숫자만 가져온다.
		//			in.nextLine();  // 버퍼 지우기
		//			lotto[i] = k;
		//		}
				// 로또 번호를 출력하는 반복문
		//		for (int i = 0; i < lotto.length; i++) {
		//			if (i == lotto.length - 1) { // 마지막 번호
		//				System.out.println("보너스 : " + lotto[i]);
		//			} else {
		//				System.out.println(lotto[i]);
		//			}
		//		}

		// 위 코드에 1-45숫자를 벗어난 숫자를 입력하면
		// 범위 오류라고 출력하고 다시 번호를 입력할 수 있도록 수정하세요.
		int[] lotto = new int[6];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < lotto.length; i++) {
			System.out.println((i + 1) + "번 입력하세요");
			int k = in.nextInt();
			in.nextLine();
			if (k < 1 || k >45) {
				System.out.println("범위 오류");
				i--;
			} else {
				lotto[i] = k;
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			if (i == (lotto.length - 1)) {
				System.out.println("보너스 : " + lotto[i]);
			}
			else {
				System.out.println(lotto[i]);
			}
		}
	}

}
