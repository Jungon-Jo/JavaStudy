package testpm.test_10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class project02 {

	public static void main(String[] args) {
		
		Arr a = new Arr();
		
		
		// 초보용
		int[] cnt = new int[5];  // 단어갯수 카운트
		int sum = 0;  // 총 단어갯수를 카운트(cnt1+cnt2+cnt3+cnt4+cnt5)
		int point = 100;
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		for(int i=r.nextInt(a.arr.length);;) {
			for (int j = a.arr[i].length();;) {
				if (cnt[j-1] == a.arr[i].length()) {
					continue;
				} else {
					System.out.println("주어진 단어를 입력하세요.");
					System.out.println(a.arr[i]);
					String word = in.next();
					in.nextLine();
					if(a.arr[i].equals(word)) {
						System.out.println("정답입니다^-^");
						for (int k = 1; k <= cnt.length; k++) {
							if(a.arr[i].length()==k) {
								cnt[k-1]++;
							}
						}
						System.out.println(Arrays.toString(cnt));
						i = r.nextInt(a.arr.length);
					} else {
						System.out.println("오답입니다.");
						for (int k = 1; k <= cnt.length; k++) {
							if(a.arr[i].length()==k) {
								point-=(2*k);
							}
						}
						i = r.nextInt(a.arr.length);
					}
				}
				for (int k = 0; k < cnt.length; k++) {
					sum += cnt[k];
					if(sum==15) {
						break;
					}
				}
			}
		}
	}

}
