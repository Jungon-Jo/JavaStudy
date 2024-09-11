package testpm.test_11;

public class test11_06_00 {

	public static void main(String[] args) {
		int[][] a = {{1,1,0,2},
					 {3,2,1,2},
					 {0,0,3,2},
					 {4,4,4,4},
					 {2,4,3,1},
					 {2,4,1,3}};
		// 7. 위와 같은 게임 배열에서 같은 번호가 세로로 연속 3개 이상이면 제거가 가능하다. 제거가 가능한 블록의 좌표를 출력하시오.

		int[] row = new int[4];
//		System.out.println(Arrays.toString(row));
		int[] beforeA = a[0];
		for(int i=1; i<a.length; i++) {
 			for(int j=0; j<a[i].length; j++) {
				if(beforeA[j]==a[i][j]) {
					row[j]++;
					if(i==a.length-1 && row[j]>=2) {
						for(int k=0; k<=row[j]; k++) {
							System.out.print("("+(i-row[j]+k)+","+j+")");
						}
						System.out.println();
						row[j]=0;
					}
				} else {
					if(row[j]>=2) {
						for(int k=0; k<=row[j]; k++) {
							System.out.print("("+(i-(row[j]+1)+k)+","+j+")");
						}
						System.out.println();
						row[j]=0;
					} else {
						row[j]=0;
					}
				}
			}
 			beforeA=a[i];
		}
		// 2차원 배열에서 연속한 3개 이상의 동일 세로값을 찾아주어야 하므로 행 index가 연속성을 가지며 동일한 열의 index값을 비교해야 한다.
		// 연속성을 가진 2개의 값을 비교하기 위해서 행의 반복문의 index 시작을 i=1 로 설정하고, beforeA 배열 변수를 선언하여 a[0]을 저장하였다.
		// 또한, 각 열의 값이 연속 될 경우 연속된 횟수를 카운팅 해주기 위해 동일한 열의 index 값을 가진 1차원 배열의 변수 row를 선언하였다.
		// 열의 순회를 위해 j 변수가 선언된 반복문을 2중 for문으로 넣어주고, beforeA(a[0])와 a[i][j]를 비교를 시작으로, 하나의 행에 해당하는
		// 열의 순회를 마쳤을 때 beforeA=a[i][j]를 저장시켜 줌으로써, 다음 행을 반복할때 이전행과 열의 값을 비교할 수 있도록 하였다.
		// 비교할 때는 동일 열(index값)의 값이 동일할 경우 해당 열의 index값과 동일한 row[j]의 값을 1증가시켜주었다.
		// 만약 값이 다를 경우 해당 열과 동일한 index를 가진 row의 값이 2이상(즉, 3개 이상 연속)인지 아닌지 판별 후 2 미만일 경우 연속되지 않음을
		// 의미함으로 해당 row값을 0으로 만들어 주고, 2 이상일 경우 연속된 값들이 해당된 좌표값을 출력해주었다.(출력 후 row값은 0으로 변경)
		// 제일 마지막 행까지 열의 값이 동일한 세번 이상 연속된 숫자가 있는 경우, row값을 증가만 시켜주고 출력은 되지 않으므로
		// 조건문을 사용하여 마지막 행일때는 별도의 출력문을 작성해주었다.
		// 마지막 행 역시 row값이 2이상인지 판별해주고, 2 이상일 경우만 연속된 숫자를 가진 좌표값들을 출력하도록 하였다.
	}

}

// 아래 코드는 중복이 제외되지 않는다.
//				if(a[i][j]==a[i+1][j] && a[i+1][j]==a[i+2][j]) {
//					System.out.print("("+i+","+j+")"+"("+(i+1)+","+j+")"+"("+(i+2)+","+j+")");
//					System.out.println();