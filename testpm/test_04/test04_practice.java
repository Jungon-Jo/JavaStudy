package testpm.test_04;

public class test04_practice {

	public static void main(String[] args) {
		System.out.println("=====================================================================");
		// 다음 실행 결과를 손코딩을 예측해 보세요.
		System.out.println("문제1");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제2");
//		for (int i = 0; 5 >= 0; i++) {
//			System.out.println(i);
//		};
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제3");
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제4");
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum = sum + 1;
		}
		System.out.println(sum);
	}
}
