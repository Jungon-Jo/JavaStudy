package testpm;

public class test05 {

	public static void main(String[] args) {
		System.out.println("=====================================================================");
		System.out.println("문제1");
		// 100부터 999까지의 숫자중에서 홀수만 출력하시오.
		for (int i = 0; i < 900; i++) {
			if ((i+100)%2==1) {
				System.out.println(i+100);
			}
		}
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제2");
		// 1부터 100까지 숫자중에서 홀수의 총합을 구하시오.
		int sum2 = 0;
		for (int i = 0; i < 100; i++) {
			if ((i+1)%2==1) {
				sum2 += (i+1);
			}
		}
		System.out.println(sum2);
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제3");
		for (int i = 10; i > 0; i--) {
			System.out.print(i+" ");
			if (i == 1) {
				System.out.println(" ");
			}
		}
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제4");
		int[] arr4 = {45, 23, 25, 64, 3, 24, 48};
		for (int i = 0; i < (arr4.length); i++) {
			if (arr4[i]%2==0) {
				System.out.print(arr4[i]+" ");
			}
		}
		System.out.println(" ");
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제5");
		int[] arr5 = {45, 23, 25, 64, 3, 24, 48};
		for (int i = 0; i < (arr5.length); i++) {
			if (arr5[i]%2==1) {
				System.out.print(i+" ");
			}
		}
		System.out.println(" ");
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제6");
		int sum6 = 0;
		int[] arr6 = {45, 23, 25, 64, 3, 24, 48};
		for (int i = 0; i < (arr6.length); i++) {
			sum6 += arr6[i];
		}
		System.out.println(sum6);
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제7");
		int cnt = 0;
		int[] arr7 = {45, 23, 25, 64, 3, 24, 48};
		for (int i = 0; i < (arr7.length); i++) {
			if (arr7[i]%2==0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		System.out.println("=====================================================================");
		System.out.println("문제8");
		String test = "abcdeabce";
		for (int i = 0; i < 9; i++) {
			char aaa = test.charAt(i);
			System.out.println(aaa);
		}
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제9");
		int minValueIndex = 64;
		int maxValueIndex = 0;
		int[] arr9 = {45, 23, 25, 64, 3, 24, 48};
		for (int i = 0; i < (arr9.length); i++) {
			if (arr9[i] <= minValueIndex) {
				minValueIndex = arr9[i];
			}
			if (arr9[i] > maxValueIndex) {
				maxValueIndex = arr9[i];
			}
		}
		System.out.println(minValueIndex + " " + maxValueIndex);
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제10");
		int sum10 = 0;
		for (int i = 100; i < 1000; i++) {
			sum10 = i/100 + (i/10)%10 + i%10;
			if (sum10%2==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(" ");

		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제11");
		int cnt11 = 1;
//		int tunnelNum = 0;
		int maxTunnelLength11 = 0;
		int[] arr11 = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
		for (int i = 1; i < (arr11.length); i++) {
			if (arr11[i-1] == arr11[i]) {
				cnt11++;
//				tunnelNum = arr10[i];
			} else if (arr11[i-1] == 0 && arr11[i-1] != arr11[i]) {
				if (maxTunnelLength11 <= cnt11) {
					maxTunnelLength11 = cnt11;
				}
			} else {
				cnt11 = 1;
			}
		}
		System.out.println(maxTunnelLength11);
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제12");		
		int cnt12 = 1;
		int tunnelNum = 0;
		int maxTunnelLength12 = 0;
		int[] arr12 = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,2,0,0,0,0,0,3,3};
		for (int i = 1; i < (arr12.length); i++) {
			if (arr12[i-1] == arr12[i]) {
				cnt12++;
			} else {
				if (maxTunnelLength12 <= cnt12) {
					maxTunnelLength12 = cnt12;
					tunnelNum = arr12[i-1];
					cnt12 = 1;
				} else {
				cnt12 = 1;
				}
			}
		}
		System.out.println((tunnelNum) + " : " + maxTunnelLength12);
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제13");
		int cnt13 = 1;
		char tunnelChar13 = ' ';
		int maxTunnelLength13 = 0;
		String ttt ="aabbbcccaaaaddbbbaaaaa";
		for (int i = 1; i < ttt.length(); i++) {
			if (ttt.charAt(i-1) == ttt.charAt(i)) {
				cnt13++;
				if (ttt.charAt(ttt.length()-1) == ttt.charAt(ttt.length()-2) && maxTunnelLength13 <= cnt13) {
					tunnelChar13 = ttt.charAt(i-1);
					maxTunnelLength13 = cnt13;
				}
			} else {
				if (maxTunnelLength13 <= cnt13) {
					maxTunnelLength13 = cnt13;
					tunnelChar13 = ttt.charAt(i-1);
					cnt13 = 1;
				} else {
				cnt13 = 1;
				}
			}
		}
		System.out.println((tunnelChar13) + " : " + maxTunnelLength13);
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제14");
		int cnt14 = 1;
		char tunnelChar14 = ' ';
		int maxTunnelLength14 = 0;
		for (int i = 1; i < ttt.length(); i++) {
			if (ttt.charAt(i-1) == ttt.charAt(i)) {
				cnt14++;
			} else {
				maxTunnelLength14 = cnt14;
				tunnelChar14 = ttt.charAt(i-1);
				cnt14 = 1;
				System.out.print(tunnelChar14);
				System.out.print(maxTunnelLength14);
			}
		}
		if (ttt.charAt(ttt.length()-1) == ttt.charAt(ttt.length()-2)) {
			tunnelChar14 = ttt.charAt(ttt.length()-1);
			maxTunnelLength14 = cnt14;
			System.out.print(tunnelChar14);
			System.out.println(maxTunnelLength14);
		}
	}

}
