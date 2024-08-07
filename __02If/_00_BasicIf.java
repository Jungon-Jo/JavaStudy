package __02If;

public class _00_BasicIf {

	public static void main(String[] args) {
		// 조건식으로 참과 거짓을 구분하여 코드를 분리하는 if
		// 조건 타입
		// 1. 조건이 하나 인 경우
		// 2. 1차 조건, 2차 조건, 3차 조건이 순서 판별하면서 하나의 조건에 해당하는 경우
		// 3. 1차 조건 판별 후 2차 조건을 만족, 즉 순차적으로 조건을 판별
// ======================================================================		
		// 시나리오 1
		// 키가 160 미만이면 "집에 가시오.."
		int cm = 163;
		if (cm < 160) {
			System.out.println("집에 가시오..");
		}
		// 키가 160 미만이면 "집에 가시오.." 160 이상이면 "환영"
		if (cm < 160) {
			System.out.println("집에 가시오..");
		} else {
			System.out.println("환영");
		}
		// 점수가 있다. 만약 점수가 홀수라면 +10을 하시오
		int point = 9;
		// 코드작성
		// step1. 조건식을 만든다.
		System.out.println(point % 2 == 1); // 조건 point % 2 == 1
		// step2. 조건에 따른 참과 거짓을 분리하는 코드 작성, 문제는 참일 경우만
		if (point % 2 == 1)
			point += 10;
		System.out.println(point); // 변경된 point값 출력
// ======================================================================
		// 시나리오 2
		// 키가 180 이상이면 A조, 170 이상 180 미만이면 B조, 170 미만이면 C조
		// step1. 조건식을 만든다.
		int cm1 = 185;
		System.out.println(cm1 >= 180); // A조 조건
		System.out.println(cm1 >= 170 && cm1 <180); // B조 조건
		System.out.println(cm1 < 170); // C조 조건\
		// step2. 조건에 따른 참과 거짓을 분리하는 코드 작성
		if (cm1 >= 180) {
			System.out.println("A조");
		} else if (cm1 >= 170) { // } else if (cm1 >= 170 && cm1 <180) { -> 180 미만에 대해서는 앞 조건에서 판별되었다.
			System.out.println("B조");
		} else if (cm1 < 170) {
			System.out.println("C조");
		}
		// 아래 if는 위 예제랑 비슷해 보이지만 다르다.
		// 단독 if가 세 개이다. 즉, 위의 if문 하고는 완전히 다르다.
		if (cm1 >= 180) {
			System.out.println("A조");
		}
		if (cm1 >= 170) {
			System.out.println("B조");
		}
		if (cm1 < 170) {
			System.out.println("C조");
		}
// ======================================================================
		// 시나리오 3
		// 출석이 100%이고 과제 제출 횟수가 90% 이상인 경우
		// step1. 조건식을 만든다.
		int cnt = 100;
		int cntAnswer = 80;
		System.out.println(cnt == 100);
		System.out.println(cntAnswer >= 95);
		// step2. 조건에 따른 참과 거짓을 분리하는 코드 작성
		if (cnt == 100) {
			if (cntAnswer >= 90) {
				System.out.println("MVP");
			} else {
				System.out.println("MVP가 아닙니다.");
			}
		} else {
			System.out.println("출석률 미달로 자격요건이 안됩니다.");
		}
	}

}
