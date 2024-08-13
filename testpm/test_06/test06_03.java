package testpm.test_06;

public class test06_03 {

	public static void main(String[] args) {
		System.out.println("문제3");
		// 3. 비밀편지
		// int[] letter0={8,12,3,13,1,14,3,4};
		// letter 배열은 word문자열 알파벳의 위치이다. letter배열의 암호를 풀어서 편지의 내용을 출력하시오.
		// 1) 배열을 순회해야 함으로 for문 작성
		//    - 변수 i의 초기값을 0으로 선언(배열의 시작은 "0")
		//    - 조건은 배열의 길이보다 작아야함으로 "i < letter0.length"
		//    - 1씩 증가하면 순회함으로 증감식은 "i++"
		// 2) letter0 배열에 해당하는 값의 위치에 있는 word 문자열의 문자를 뽑아내면 되므로 조건은 필요없다.
		//    - "word.charAt(letter0[i])"를 사용
		int[] letter = {8,12,3,13,1,14,3,4};
		String word ="gehoudfkimjnlvy";
		for (int i = 0; i < letter.length; i++) {
			System.out.print(word.charAt(letter[i]));
		}
	}
}
