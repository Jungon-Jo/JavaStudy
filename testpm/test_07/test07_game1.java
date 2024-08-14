package testpm.test_07;

import java.util.Random;
import java.util.Scanner;

public class test07_game1 {

	public static void main(String[] args) {
		int[] road = {0,1,0,0,0,1,0,0,2,0,0,0,0,2,0,0,0,4,0,0,0,4,0,0,0,1,7,0,0,3,0,0,7,0,0,8,0,0,1,3,0,0,1,0};
		int me = -1;
		int moveSum = 0;
		Random r = new Random();
		Scanner in = new Scanner(System.in);
//		System.out.println(a);
		for (;;) {
			System.out.println("[엔터키] 주사위를 던지세요");
			in.nextLine();
			System.out.println("위 코드에서는 엔터키가 입력되어 이 코드가 실행됨");
			int a = r.nextInt(6) + 1;
			System.out.println(a);
			me += a;
			moveSum += a;
			if (me <= road.length - 1 ) {
				if (road[me] == 1) {
					me -= 1;
				} else if (road[me] == 2) {
					me += 1;
					moveSum += 1;
				} else if (road[me] == 7) {
					me = -1;
				}
			} else if (me > road.length - 1) {
				System.out.println(moveSum);
				break;
			}
		}
	}

}
