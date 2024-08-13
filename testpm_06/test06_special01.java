package testpm_06;

import java.util.Arrays;

public class test06_special01 {

	public static void main(String[] args) {
		System.out.println("특별1");
		String b = "6/4/3/2/5/1/4/5/6/7/8/9/1/2/3/4/5/6";
		// 문자열 b는 한자릿수의 숫자를 수집한 문자열이다.
		// 숫자별로 수집된 수만큼 카운팅하세요.
		// 카운팅 배열은
		int[] B = new int[10]; 
		// 위 선언문은 길이 10의 배열을 생성한 선언문이다. 초기값은 0이다.
		// 인덱스 0 - 9까지를 숫자로 정의한다.
		// 조건 : 형변환은 사용하지 않는다. 메서드는  charAt()만 사용한다.
		for (int i = 0; i < b.length(); i += 2) {
			if (b.charAt(i) == '0') {
				B[0]++;
			} else if (b.charAt(i) == '1') {
				B[1]++;
			} else if (b.charAt(i) == '2') {
				B[2]++;
			} else if (b.charAt(i) == '3') {
				B[3]++;
			} else if (b.charAt(i) == '4') {
				B[4]++;
			} else if (b.charAt(i) == '5') {
				B[5]++;
			} else if (b.charAt(i) == '6') {
				B[6]++;
			} else if (b.charAt(i) == '7') {
				B[7]++;
			} else if (b.charAt(i) == '8') {
				B[8]++;
			} else if (b.charAt(i) == '9') {
				B[9]++;
			}
		}
		System.out.print(Arrays.toString(B));
	}
}
