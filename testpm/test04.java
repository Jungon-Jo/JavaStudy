package testpm;

public class test04 {

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
		sum = 0; // sum value reset to 0
		System.out.println("=====================================================================");
		System.out.println("levelUp");
		System.out.println("문제1");
		for (int i = 0; i <= 99; i++) {
			if ((i + 1) % 2 == 1) {
				sum += (i + 1);
			} else {
				sum -= (i + 1);
			}
		}
		System.out.println(sum);
		sum = 0; // sum value reset to 0
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제2");
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i <= 99; i++) {
			if ((i + 1) % 2 == 1) {
				oddSum += (i + 1);
			} else {
				evenSum += (i + 1);
			}
		}
		System.out.println("홀수의 합 : " + oddSum + ", " + "짝수의 합 : " + evenSum);
		oddSum = 0; // evenSum value reset to 0
		evenSum = 0; // oddSum value reset to 0
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제3");
		int cnt = 0;
		for (int i = 0; i <= 99; i++) {
			if ((i + 1) % 2 == 1) {
				cnt++;
			}
		}
		System.out.println(cnt);
		cnt = 0; // cnt value reset to 0
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제4");
		for (int i = 0; i < 900; i++) {
			int num = i + 100;
			sum += (num / 100 + (num / 10) % 10 + num % 10);
		}
		System.out.println(sum);
		sum = 0; // sum value reset to 0
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제5");
		for (int i = 0; i < 900; i++) {
			int crimeNum = ((i + 100) / 10) % 10;
			if (crimeNum % 3 == 0) {
				System.out.println(i + 100);
			}
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제6");
		int minValue = 100;
		for (int i = 0; i <= 100; i++) {
			sum += i;
			if (sum >= 44) {
				if (i < minValue) {
					minValue = i;
					System.out.println(minValue);
				}
			}
		}
		sum = 0;
		minValue = 0; // minValue value reset to 0
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제7");
		for (int i = 0; i <= 9; i++) {
			System.out.print(i+1);
			if ((i + 1) != 10) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
			sum += (i + 1);
		}
		System.out.println(sum);
		sum = 0;
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제8");
		int fib = 1;
		int pastFib = 0;
		for (int i = 1; i < 8; i++) {
			sum += fib;
			int futureFib = fib + pastFib;
			pastFib = fib;
			fib = futureFib;
		}
		System.out.println(sum);
		// minValue value reset to 0
		sum = 0; 
		fib = 1;
		pastFib = 0;
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제9");
//		for (int i = 1; i < 20; i = pastFib) {
//			System.out.println(fib + " ");
//			int futureFib = fib + pastFib;
//			pastFib = fib;
//			fib = futureFib;
//		}
		System.out.println("---------------------------------------------------------------------");
		System.out.println("문제10");
		for (int i = 1; i <= 100000000; i *= 10) {
			sum += ((int) (987654321 / i) % 10);
		}
		System.out.println(sum);
	}
}
