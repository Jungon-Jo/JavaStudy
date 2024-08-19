package __05DoubleFor;

public class _01_test {

	public static void main(String[] args) {
		// 시나리오1. 1단을 모두 출력하시오
		for (int i = 1; i < 10; i++) {
			System.out.println("1 x " + i + " = " + 1*i);
		}
		
		// 시나리오2. 1단부터 4단까지 모두 출력
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + j*i);
			}
		}
		// 2중 for 문의 순서를 고려할 줄 알아야 한다.
		
		// 시나리오3. 별을 3개씩 4줄을 출력
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 시나리오4. 별을 첫번째줄 1개, 두번째줄 2개, ... 네번째줄 까지 출력하시오
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 어디서 반복되는지 확인하는것이 중요하다.
		
		// 시나리오5. id에 특수문자가 있는가?(특수문자 정의 *, ^, $는 특수문자이다.)
		String id = "ab*^";
		String sign = "*^$";
		int cnt = 0;
		for (int i = 0; i < id.length(); i++) {
			for (int j = 0; j < sign.length(); j++) {
				if (id.charAt(i) == sign.charAt(j)) {
					cnt++;  // 특수문자 갯수
				}
			}
		}
		if (cnt > 0) {
			System.out.println("특수문자 있음");
			System.out.println(cnt + " 개");
		} else {
			System.out.println("특수문자 없음");
			System.out.println(cnt + " 개");
		}
	}

}
