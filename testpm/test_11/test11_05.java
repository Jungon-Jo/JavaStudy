package testpm.test_11;

public class test11_05 {

	public static void main(String[] args) {
		int[][] a = {{1,2,3,4,5},
					 {6,7,8,9,10},
					 {11,12,13,14,15},
					 {16,17,18,19,20},
					 {21,22,23,24,25}};
		// 6. 2차원 배열의 모든 값을 출력하시오(행의 번호와 열의 번호를 내림차순으로 출력하시오)
		for(int i=a.length-1; i>=0; i--) {
			for(int j=a[i].length-1; j>=0; j--) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		// 2차원 배열의 모든 값을 출력하는데, 행의 번호와 열의 번호 모두 내림차순으로 출력해야하는 조건이 부여되었다.
		// 별도의 조건문을 활용하지 않고 2차원 배열의 값을 출력하기 위한 2중 for문의 조건을 변경하였다.
		// 각 반복문의 시작값을 배열 행과 열의 index값 중 가장 큰값으로 시작하고, 각각의 index값이 1씩 감소하도록 증감식을 작성하였다.
		// 각 index값은 0 미만의 값은 가질 수 없으므로, 각 값이 0이상일 때만 반복하도록 조건을 작성해주었다.
	}

}
