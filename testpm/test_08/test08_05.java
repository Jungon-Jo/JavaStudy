package testpm.test_08;

public class test08_05 {

	public static void main(String[] args) {
		// 6.
		// int[] a ={34,55,23,56,34,45,34};
		// int[] b ={36,49};
		// b배열의 값보다 큰 값이 a 배열의 값에 모두 몇개가 있는가?
		// 각각 카운팅 하시오 
		// 출력은
		// a 배열의 값에는  36번호 보다 큰 숫자가 ?? 개 있습니다.
		// a 배열의 값에는  49번호 보다 큰 숫자가 ?? 개 있습니다.
		int[] a ={34,55,23,56,34,45,34};
		int[] b ={36,49};
		int cnt = 0; //큰 수 카운팅
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[j] > b[i]) {
					cnt++;
				}
			}
			System.out.println("a 배열의 값에는" + b[i] + "보다 큰 숫자가 " + cnt + " 개 있습니다.");
			cnt = 0; 
		}
	}

}
