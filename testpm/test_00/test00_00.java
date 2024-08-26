package testpm.test_00;

public class test00_00 {

	public static void main(String[] args) {
		// 네트워크 통신 문자열 분석 알고리즘의 기능을 구현하시오.
		// String a ="aabbccddeeeaaaa";
		// a문자는 통신 문자이다. a 문자 중 가장 길이를 출력하시오.
		// 위 예제에서는 결과값이 4가된다.

		// <기능 구현과 결과를 같이 첨부 합니다.>
		String a = "aabbccddeeeaaaa";
		int cnt = 1; // a 문자열 길이 데이터 측정을 위한 변수 선언
		int longestA = 0; // a 문자열 중 가장 긴 데이터 저장을 위한 변수 선언
		for (int i = 0; i < a.length() - 1; i++) {
			if (a.charAt(i) == 'a') {
				if (a.charAt(i) == a.charAt(i+1)) {
					cnt++;
				}
			} else if (a.charAt(i) != 'a') {
				if (cnt > longestA) {
					longestA = cnt;
					cnt = 1;
				}
			}
		}
		if (a.charAt(a.length() - 1) == 'a') {
			if (cnt > longestA) {
				longestA = cnt;
				cnt = 1;
			}
		}
		System.out.println(longestA);
	}

}
