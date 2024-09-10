package testpm.test_11;

import java.util.Arrays;

public class test11_06 {

	public static void main(String[] args) {
		int[][] a = {{1,1,0,2},
					 {3,2,1,2},
					 {0,0,3,2},
					 {4,4,4,2},
					 {2,4,3,1},
					 {2,4,1,3}};
		// 7. 위와 같은 게임 배열에서 같은 번호가 세로로 연속 3개 이상이면 제거가 가능하다. 제거가 가능한 블록의 좌표를 출력하시오.

		int[] row = new int[4];
//		System.out.println(Arrays.toString(row));
		for(int i=0; i<a.length-1; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(a[i][j]==a[i+1][j]) {
					row[j]++;
					if((i+1)==a.length-1 && row[j]>=2) {
						for(int k=0; k<=row[j]; k++) {
							System.out.print("("+(i-k)+","+j+")");
						}
						System.out.println();
						row[j]=0;
					}
				} else {
					if(row[j]>=2) {
						for(int k=0; k<=row[j]; k++) {
							System.out.print("("+(i-k)+","+j+")");
						}
						System.out.println();
						row[j]=0;
					} else {
						row[j]=0;
					}
				}
			}
		}
	}

}

//				if(a[i][j]==a[i+1][j] && a[i+1][j]==a[i+2][j]) {
//					System.out.print("("+i+","+j+")"+"("+(i+1)+","+j+")"+"("+(i+2)+","+j+")");
//					System.out.println();