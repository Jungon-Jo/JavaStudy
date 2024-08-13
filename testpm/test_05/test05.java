package testpm;

public class test05 {

	public static void main(String[] args) {
		System.out.println("=====================================================================");
		System.out.println("문제1");
		// 100부터 999까지의 숫자중에서 홀수만 출력하시오.
		/* 문제 풀이 흐름
		 * 1. (100부터 999까지의 숫자) -> for 문 작성(초기값 : 100, 조건 < 1000, 증감식 i++)
		 * 2. %를 활용하여 홀수 판별
		 */
		
		for (int i = 0; i < 900; i++) {
			if ((i+100)%2==1) {
				System.out.println(i+100);
			}
		}
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제2");
		// 1부터 100까지 숫자중에서 홀수의 총합을 구하시오.
		/* 문제 풀이 흐름
		 * 1. (1부터 100까지의 숫자) -> for 문 작성(초기값 : 1, 조건 < 100, 증감식 i++)
		 * 2. %를 활용하여 홀수 판별
		 * 3. 총합 = 총합을 저장할 수 있는 변수 선언!!
		 */
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
		int cnt7 = 0;
		int[] arr7 = {45, 23, 25, 64, 3, 24, 48};
		for (int i = 0; i < (arr7.length); i++) {
			if (arr7[i]%2==0) {
				cnt7++;
			}
		}
		System.out.println(cnt7);
		
		System.out.println("=====================================================================");
		System.out.println("문제8");
		String test = "abcdeabce";
		int cnt8 = 0;
		for (int i = 0; i < test.length(); i++) {
			char aaa = test.charAt(i);
//			System.out.println(aaa);
			if ('a'==aaa) {
				cnt8++;
			}
		}
		System.out.println(cnt8);
		// 자료형의 시작이 소문자(int, char, boolean, .../원시타입)로 시작하는 경우 "."을 사용할 수 없지만,
		// 대문자(String.../창조타입)로 시작하는 경우 사용 가능
		// 예외적으로 배열은 "."사용이 가능하다.
		// 객체는 만들어진 부품이며 사용 절차가 이미 정의된 것이다.(대상에 대한 정확한 정의가 있어야 한다.)
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제9");
		/* 10.  int[] arr = {45,23,25,64,3,24,48} 
		 * 배열에서 가장 큰 값과 가장 큰 값이 있는 인덱스를 출력하시오.
		 */
		int minValueIndex = 64;
		int maxValueIndex = 0;
		int[] arr9 = {45, 23, 25, 64, 3, 24, 48};
		for (int i = 0; i < arr9.length; i++) {
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
		/* int[] arr = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3}
		 * 0은 터널이다. 가장 긴 터널의 길이를 구하시오.
		 */
		int cntA = 0;
		int maxLengthA = 0;
		int[] arrA = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
		for (int i = 0; i < arrA.length; i++) {
			if (arrA[i]==0) {
				cntA++;
			} else {
				cntA = 0;
			}
			if (cntA > maxLengthA) {
				maxLengthA = cntA;
			}
		}
		System.out.println(maxLengthA);
		
		int cnt11 = 1;
//		int tunnelNum = 0;
		int maxTunnelLength11 = 0;
		int[] arr11 = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
		for (int i = 0; i < (arr11.length - 1); i++) {
			if (arr11[i] == arr11[i+1]) {
				cnt11++;
//				tunnelNum = arr10[i];
			} else if (arr11[i] == 0 && arr11[i] != arr11[i+1]) {
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
		/* int[] arr = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,2,0,0,0,0,0,3,3}
		 * 숫자는 터널 번호이다. 터널의 길이가 가장 긴 숫자와 길이를 출력하시오.  
		 */
		int cntB = 1;
		int maxLengthB = 0;
		int[] arrB = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,2,0,0,0,0,0,3,3};
		int bT = arrB[0];
		int maxIndex = 0;
		for (int i = 0; i < arrB.length; i++) {
			if (arrB[i]==bT) {
				cntB++;
			} else {
				cntB = 1;
				bT = arrB[i];
			}System.out.println(i + "/" + cntB);
			if (cntB > maxLengthB) {
				maxLengthB = cntB;
				maxIndex = bT; 
			}
		}
		System.out.println(maxIndex + " : " + maxLengthB);
		
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
		// String question = "abcdeabce";
		// question. ("."은 "참조"라는 의미/객체가 가진 기능(메서드), 전구 사용법 중 하나 -> 메서드)
		
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
		int cnt14 = 0;
		char tunnelChar14 = ' ';
		int maxTunnelLength14 = 0;
		String resultZip = "";
		for (int i = 1; i < ttt.length(); i++) {
			if (ttt.charAt(i-1) == ttt.charAt(i)) {
				cnt14++;
			} else {
				resultZip = resultZip + ttt.charAt(i-1) + cnt14;
				maxTunnelLength14 = cnt14;
				tunnelChar14 = ttt.charAt(i-1);
				cnt14 = 1;

				System.out.print(tunnelChar14);
				System.out.print(maxTunnelLength14);
			}
		}
//		if (ttt.charAt(ttt.length()-1) == ttt.charAt(ttt.length()-2)) {
		tunnelChar14 = ttt.charAt(ttt.length()-1);
		maxTunnelLength14 = cnt14;
		System.out.print(tunnelChar14);
		System.out.println(maxTunnelLength14);
//		}
		System.out.println(resultZip);
	}

}
