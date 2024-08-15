package testpm.test_04;

public class test04_08 {

	public static void main(String[] args) {
		System.out.println("문제9");
		int pastFib = 0;
		for (int i = 1; i < 20; /*증감식 생략 가능*/) {
			System.out.println(i);
			int presentFib = i; // 현재 i 값 백업
			i += pastFib; // 다음 i 값
			pastFib = presentFib; // 이전 pastFib에 현재 i 값 저장
		}
	}
}
