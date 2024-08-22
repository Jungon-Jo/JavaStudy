package testpm.test_10;

import java.util.Scanner;

public class Level_j {

	public static void level(Scanner in, int[] cnt, int select) {
		if (select == 1) {
			for (int i = 0; i < cnt.length; i++) {
				cnt[i]=5-i;
			}
		} else if (select == 2) {
			for (int i = 0; i  < cnt.length; i++) {
				cnt[i]=3;
			}
		} else {
			for (int i = 0; i < cnt.length; i++) {
				cnt[i]=i+1;
			}
		}
	}
}
