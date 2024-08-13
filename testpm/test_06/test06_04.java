package testpm.test_06;

public class test06_04 {

	public static void main(String[] args) {
		System.out.println("문제4");
		// 4. 난건물주
		// arr 배열에서 0이 의미하는 것은 공터이다. 
		// size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다. 
		// size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
		// size가 2일경우에 7개이다. 
		int[] arr = {1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1};
		int size = 2;
		int building = 0;
		int cnt = 0;
		for (int i = 0; i < (arr.length - 1); i++) {
			if (arr[i]==0) {
				cnt++;
				if (cnt == size) {
					building++;
					cnt = size - 1;
				}
			} else {
				cnt = 0;
			}
		}
		System.out.println(building);
	}
}
