package testpm.test_11;

public class test11_02 {

	public static void main(String[] args) {
		int[][] a = {{1,2,3,4,5},
					 {6,7,8,9,10},
					 {11,12,13,14,15},
					 {16,17,18,19,20},
					 {21,22,23,24,25}};
		// 3. 2차원 배열의 2열의 모든 값을 행의 순서대로 출력하시오.
//		for(int i=0; i<a.length; i++) {
//			for(int j=0; j<a[i].length; j++) {
//				if(j==1) {
//					System.out.println(a[i][j]+"\t");
//				}
//			}
//		}
		for(int i=0; i<a.length; i++) {
				System.out.println(a[i][1]+"\t");
		}

		// 2차원 배열의 특정 값을 지정할 때, 행의 index를 먼저 지정해주고 열의 index값을 지정해 하나의 좌표값을 만들어 그에 해당하는 값을 찾아야 한다. 
		// 열의 index 값이 1로 정해져 있고 행에 해당하는 index 값만 순차적으로 확인하면 되므로, 행의 index에 해당하는 값만 반복문을 사용해준다.
		// 행의 순서대로 출력해야 하므로 반복문은 i=0 부터 시작해준다.

	}

}
