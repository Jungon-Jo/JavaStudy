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
		for(int i=0; i<a.length-2; i++) {
			for(int j=0; j<a[i].length-2; j++) {
				if(a[i][j]==a[i+1][j] && a[i+1][j]==a[i+2][j]) {
					System.out.print("("+i+","+j+")"+"("+(i+1)+","+j+")"+"("+(i+2)+","+j+")");
					System.out.println();
				}
				if(a[i][j]==a[i][j+1] && a[i][j+1]==a[i][j+2]) {
					System.out.print("("+i+","+j+")"+"("+i+","+(j+1)+")"+"("+i+","+(j+2)+")");
					System.out.println();
				}
			}
		}

	}

}
