package testpm.test_06;

public class test06_02 {

	public static void main(String[] args) {
		System.out.println("문제2");
		// 2. 현상수배
		// 범인을 찾으시오. 범인은 짝수이면서 가장큰 값이다. 결과값 : 범인은 14입니다.
		// 1) 배열을 순회해야 함으로 for문 작성
		//    - 변수 i의 초기값을 0으로 선언(배열의 시작은 "0")
		//    - 조건은 배열의 길이보다 작아야함으로 "i < letter2.length"
		//    - 1씩 증가하면 순회함으로 증감식은 "i++"
		// 2) 짝수인 가장 큰 수를 판별해야 함으로 조건문 if를 사용
		//    - 배열의 최댓값을 저장할 변수 "int maxLetterEven = 0" 선언(배열의 값이 정수임으로 int를 사용하며, 최댓값을 찾아야 함으로 초기값 "0"으로 설정)
		//    - 배열의 값이 짝수이면서 최대인 수를 판별해야함으로 조건이 두개 필요(짝수 판별, 최댓값 판별)
		//    - 두 조건 모두 만족해야 함으로 &&를 사용
		//    - 짝수를 판별해야 함으로 %를 사용한 판별식 사용 "letter2[i] % 2 == 0"
		//    - maxLetterEven에 저장된 정수보다 큰 값의 존재 여부를 판별해야 함으로 "letter2[i] > maxLetterEven"
		int[] letter = {8, 12, 4, 13, 25, 14, 4, 5};
		int maxLetterEven = 0;
		for (int i = 0; i < letter.length; i++) {
			if (letter[i]%2==0 && letter[i] > maxLetterEven) {
				maxLetterEven = letter[i];
			}
		}
		System.out.println("범인은 " + maxLetterEven + "입니다.");
	}
}
