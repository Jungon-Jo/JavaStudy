package testpm.test_11;

public class test11_07 {

	public static void main(String[] args) {
		int[][] a = {{1,1,0,2},
				 	 {3,2,1,2},
				 	 {0,0,3,2},
				 	 {4,4,4,4},
				 	 {2,4,3,1},
				 	 {2,4,1,3}};
		// 8. 위와 같은 게임 배열에서 같은 번호가 가로나 세로로 각각 3개 이상이면 제거가 가능하다.
		int[] row = new int[4];
		int col = 0;
		for(int i=0; i<a.length-1; i++) {
			for(int j=0; j<=a[i].length-1; j++) {
				if(a[i][j]==a[i+1][j]) {
					row[j]++;
					if((i+1)==a.length-1 && row[j]>=2) {
						for(int k=0; k<=row[j]; k++) {
							System.out.print("("+((i+1)-row[j]+k)+","+j+")");
						}
						System.out.println();
						row[j]=0;
					}
				} else {
					if(row[j]>=2) {
						for(int k=0; k<=row[j]; k++) {
							System.out.print("("+(i-row[j]+k)+","+j+")");
						}
						System.out.println();
						row[j]=0;
					} else {
						row[j]=0;
					}
				}
				if(j<a[i].length-1) {
					if(a[i][j]==a[i][j+1]) {
						col++;
					} else {
						if(col>=2) {
							for(int k=0; k<=col; k++) {
							System.out.print("("+i+","+(j-(col-1)+k)+")");
							}
							System.out.println();
							col=0;
						} else {
							col=0;
						}
					}
				} else {
					if(a[i][j-1]==a[i][j]) {
						if(col>=2) {
							for(int k=0; k<=col; k++) {
							System.out.print("("+i+","+(j-col+k)+")");
							}
							System.out.println();
							col=0;
						} else {
							col=0;
						}
					} 
				}
			}
		}
		
	}

}
