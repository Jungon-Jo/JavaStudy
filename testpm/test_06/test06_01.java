package testpm_06;

public class test06_01 {

	public static void main(String[] args) {
		System.out.println("문제1");
		int[] letter = {8, 12, 4, 13, 2, 14, 4, 5};

		// 1. 큰놈
		// int[] letter0 = {8, 12, 4, 13, 2, 14, 4, 5};
		// 배열의 가장 큰 수가 있는 인덱스를 출력하시오.
		// 1) 배열을 순회해야 함으로 for문 작성
		//    - 변수 i의 초기값을 0으로 선언(배열의 시작은 "0")
		//    - 조건은 배열의 길이보다 작아야함으로 "i < letter0.length"
		//    - 1씩 증가하면 순회함으로 증감식은 "i++"
		// 2) 가장 큰 수를 판별해야 함으로 조건문 if를 사용
		//    - 배열의 최댓값을 저장할 변수 "int maxLetter = 0" 선언(배열의 값이 정수임으로 int를 사용하며, 최댓값을 찾아야 함으로 초기값 "0"으로 설정)
		//    - maxLetter에 저장된 정수보다 큰 값의 존재 여부를 판별해야 함으로 "letter0[i] > maxLetter"
		int maxLetter = 0;
		for (int i = 0; i < letter.length; i++) {
			if (letter[i] > maxLetter) {
				maxLetter = letter[i];
			}
		}
		System.out.println(maxLetter);
	}
}
