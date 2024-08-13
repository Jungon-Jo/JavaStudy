package testpm.test_06;

public class test06_00 {

	public static void main(String[] args) {
		System.out.println("=====================================================================");
		System.out.println("문제0");
		// 0. 선택받은 너
		int[] letter = {8, 12, 4, 13, 2, 14, 4, 5};
		// 짝수만 출력하시오.
		// 1) 배열을 순회해야 함으로 for문 작성
		//    - 변수 i의 초기값을 0으로 선언(배열의 시작은 "0")
		//    - 조건은 배열의 길이보다 작아야함으로 "i < letter0.length"
		//    - 1씩 증가하면 순회함으로 증감식은 "i++"
		// 2) 짝수를 판별해야 함으로 %를 사용한 판별식 사용
		//    - "letter0[i] % 2 == 0"
		for (int i = 0; i < letter.length; i++) {
			if (letter[i]%2==0) {
				System.out.println(letter[i]);
			}
		}
	}
}
