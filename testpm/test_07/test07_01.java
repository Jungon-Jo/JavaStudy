package testpm.test_07;

import java.util.Scanner;

public class test07_01 {

	public static void main(String[] args) {
		// 1. 키보드로 두 개의 숫자를 입력받아서 합하는 프로그램을 작성하세요.
		Scanner in = new Scanner(System.in);
		int a = 0;
		int sum = 0;
		for (int i = 0; i < 2; i++) {
			a = in.nextInt();
			in.nextLine();
//			System.out.println(a);
			sum += a;
		}
		System.out.println(sum);
	}

}
