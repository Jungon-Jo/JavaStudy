package testpm.test_03;

public class test03_08 {

	public static void main(String[] args) {
		System.out.println("Special 문제");
		/* 적은 움직이지 않고 미사일을 y축과 평행하게 직진한다. 이때 미사일이 적을 타격하는지 판별코드를 작성해라.
		 * (상하좌우 닿는 순간 타격으로 판정한다.)
		 * 적의 위치(10, 20), 크기 : 가로 5, 세로 6(적은 사각형 모양으로 위치의 기준은 왼쪽 하단이다.)
		 * 미사일 위치(11, 5), 크기 : 가로 2, 세로 2(위치 기준은 왼쪽 하단이다.)
		 */
		int enemy = 10;
		int missile = 11;
		if (enemy <= missile && missile + 2 <= enemy +5) {
			System.out.println("hit");
		} else {
			System.out.println("none hit");
		}
		
	}

}
