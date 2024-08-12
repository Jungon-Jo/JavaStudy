package testpm;

import java.util.Arrays;
import java.util.Random;

public class test06 {

	public static void main(String[] args) {
		System.out.println("=====================================================================");
		System.out.println("문제0");
		// 0. 선택받은 너
		int[] letter0 = {8, 12, 4, 13, 2, 14, 4, 5};
		// 짝수만 출력하시오.
		// 1) 배열을 순회해야 함으로 for문 작성
		//    - 변수 i의 초기값을 0으로 선언(배열의 시작은 "0")
		//    - 조건은 배열의 길이보다 작아야함으로 "i < letter0.length"
		//    - 1씩 증가하면 순회함으로 증감식은 "i++"
		// 2) 짝수를 판별해야 함으로 %를 사용한 판별식 사용
		//    - "letter0[i] % 2 == 0"
		for (int i = 0; i < letter0.length; i++) {
			if (letter0[i]%2==0) {
				System.out.println(letter0[i]);
			}
		}
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제1");
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
		for (int i = 0; i < letter0.length; i++) {
			if (letter0[i] > maxLetter) {
				maxLetter = letter0[i];
			}
		}
		System.out.println(maxLetter);
		
		System.out.println("---------------------------------------------------------------------");
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
		int[] letter2 = {8, 12, 4, 13, 25, 14, 4, 5};
		int maxLetterEven = 0;
		for (int i = 0; i < letter2.length; i++) {
			if (letter2[i]%2==0 && letter2[i] > maxLetterEven) {
				maxLetterEven = letter2[i];
			}
		}
		System.out.println("범인은 " + maxLetterEven + "입니다.");
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제3");
		// 3. 비밀편지
		// int[] letter0={8,12,3,13,1,14,3,4};
		// letter  배열은 word문자열 알파벳의 위치이다. letter배열의 암호를 풀어서 편지의 내용을 출력하시오.
		// 1) 배열을 순회해야 함으로 for문 작성
		//    - 변수 i의 초기값을 0으로 선언(배열의 시작은 "0")
		//    - 조건은 배열의 길이보다 작아야함으로 "i < letter0.length"
		//    - 1씩 증가하면 순회함으로 증감식은 "i++"
		// 2) letter0 배열에 해당하는 값의 위치에 있는 word 문자열의 문자를 뽑아내면 되므로 조건은 필요없다.
		//    - "word.charAt(letter0[i])"를 사용
		int[] letter3 = {8,12,3,13,1,14,3,4};
		String word ="gehoudfkimjnlvy";
		for (int i = 0; i < letter3.length; i++) {
			System.out.print(word.charAt(letter3[i]));
		}
		System.out.println(" ");
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제4");
		// 4. 난건물주
		// arr 배열에서 0이 의미하는 것은 공터이다. 
		// size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다. 
		// size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
		// size가 2일경우에 7개이다. 
		int[] arr = {1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1};
		int size = 2;
		int building = 0;
		int cnt4 = 0;
		for (int i = 0; i < (arr.length - 1); i++) {
			if (arr[i]==0) {
				cnt4++;
				if (cnt4 == size) {
					building++;
					cnt4 = size - 1;
				}
			} else {
				cnt4 = 0;
			}
		}
		System.out.println(building);
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제5");
		System.out.println("문제5 생략");
		// 5. 앞뒤가똑같은너
		// 키보드로 문자를 입력받는다. 
		// 문자로 입력 받는 방법은 
		// Scanner in = new Scanner(System.in);
		// String a  = in.nextLine();     숫자는  nextInt(), 문자열을 nextLine() 메서드를 사용한다. 
		// 이때 문자열의 길이는 0보다 크고 10보다 작으며 짝수만 가능하다.
		// 조건에 만족될때까지 문자 입력을 받는다.
		// 문자열을 앞으로 읽으나 뒤로 읽으나 같은 경우의 문자를 판별하는 코드를 작성하세요
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제6");
		// String a ="23-56+45*2-56";
		// 6. 수식을 계산하는 프로그램을 작성하세요.
		// 수식 계산 규칙은 연산자 우선순위 없이 앞에서 부터 차례대로 계산한다.
		// 지금까지 공부한 내용으로 해결하시고, 형변환만 검색이 가능합니다. 
		// 메서드는 최대한 적게 사용하세요
		char firstNum = 'M'; // -100
		char secondNum = '8';
		char thirdNum = '-';
		char fourthNum = 'b'; // -100
		char fifthNum = secondNum;
		int calculate = ((100 - (int)firstNum) - (int)secondNum + (int)thirdNum) * (100 - (int)fourthNum) - (int)fifthNum;
		System.out.println(calculate);
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제7");
		int[] A = {34,2,35,8,45,31};
		// 7. 철수는 배열의 0번 인덱스부터 순회한다.
		// 0번 인덱스에서는 0번인덱스와 그 다음 인덱스를 비교하여 큰 수를 뒤로 배치한다.
		// 이러한 방식으로 배열의 뒤까지 반복하면 맨 뒤에 가장 큰 수가 배치 될 것이다.
		// 위와 같은 방식으로 가장큰 수를 구하시오.
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i+1] < A[i]) {
				A[i+1] = A[i];
			}
		}
		System.out.println(A[A.length - 1]);
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제8");
		// 8. 철수는 배열의 0번 인덱스에 가장 큰 값을 저장하면 될 것이라고 생각한다.
		// 0번 인덱스가 가장 큰 값이라고 정의하고 1번부터 마지막까지 순회하면서
		// 가장 큰 값이 나오면 가장 큰 값을 갱신한다.
		// 위와 같은 방식으로 가장 큰 수를 구하시오.
		for (int i = 0; i < A.length; i++) {
			if (A[0] < A[i]) {
				A[0] = A[i];
			}
		}
		System.out.println(A[0]);
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제9");
		Random r = new Random();
		// 변수 r을 참조하여 nextInt 메서드를 호출함. 매개변수는 랜덤한 숫자의 범위를 지정함
        // 즉 0 - 44까지 중 랜덤한 숫자 하나를 선택하여 리턴함.
        // 로또 번호는 1-45까지 이므로 리턴값이 +1로 보정함
        // 리턴값을 보정하여  num변수의 값에 대입
		
		// 9. 로또번호를 자동으로 생성하는 게임을 작성하시오.
		// 중복허용 가능, 로또 번호 6개를 배열에 저장하고, 출력하시오.
		int[] lotto = new int[6];
		for (int i = 0; i < 6; i++) {
			int num = r.nextInt(45)+1;
			lotto[i] = num;
			System.out.println(lotto[i]);
		}
		
		System.out.println("=====================================================================");
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
