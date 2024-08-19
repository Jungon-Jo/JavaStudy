package testpm.test_08;

public class test08_07 {

	public static void main(String[] args) {
		// 8.
		// int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,5}   -이중 for  사용
		// 애니팡 게임의 일부분인다. 게임의 캐릭터는 숫자로 구분한다.
		// 가로에 같은 캐릭터가 3개 이상이면 제거 대상이다.
		// 제거 대상 캐릭터 번호와 갯수, 시작위치 인덱스를 모두 출력하시오.
		int[] pang = {1,0,0,0,2,3,4,4,6,2,2,2,2,5};
		int cnt = 1;
		int totalCnt = 0;
		int startIndex = pang.length;
		for (int i = 0; i < pang.length - 1; i++) {
			if (pang[i] == pang[i+1]) {
				cnt++;
				if (cnt == 3) {
					for (int j = 0; j < pang.length; j++) {
						if (pang[j] == pang[i+1]) {
							totalCnt++;
							if (j < startIndex) {
								startIndex = j;
							}
						}
					}
				}
				System.out.println("(제거대상) 번호 : " + pang[i] + ", 갯수 : " + totalCnt + ", 시작위치 인덱스 : " + startIndex);
			} else {
				cnt = 1;
				totalCnt = 0;
				startIndex = pang.length;
			}
		}
	}

}
