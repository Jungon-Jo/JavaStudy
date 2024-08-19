package testpm.test_08;

public class test08_09 {

	public static void main(String[] args) {

		// 10 난건물주  <이중For사용>
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		int cnt = 0; // 연속된 0의 갯수
		int building = 0; // 지을 수 있는 건물의 갯수
		// arr 배열에서 0이 의미하는 것은 공터이다. 
		// size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다. 
		// size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
		// size가 2일경우에 7개이다. 
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == 0) {
					cnt++;
					if (i == cnt) {
						building++;
						cnt--;
					}
				} else {
					cnt = 0;
				}
			}
			System.out.println("size : " + i + "/" + "건물수" + building);
			building = 0;
		}
	}
}
