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
	}

}

//				if(a[i][j]==a[i+1][j] && a[i+1][j]==a[i+2][j]) {
//					System.out.print("("+i+","+j+")"+"("+(i+1)+","+j+")"+"("+(i+2)+","+j+")");
//					System.out.println();