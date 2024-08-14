package testpm.test_07;

import java.util.Scanner;

public class test07_00 {

	public static void main(String[] args) {
		// 0. 키보드로 숫자 한 개를 입력 받아서 홀짝을 출력하는 프로그램을 작성하세요.
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		in.nextLine();
		if (a % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}

}
