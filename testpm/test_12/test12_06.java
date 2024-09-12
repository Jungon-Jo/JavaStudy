package testpm.test_12;

public class test12_06 {

	public static void main(String[] args) {
//		int[][] a = {{1,2,3,4,5},
//					 {6,7,8,9,10},
//					 {11,12,13,14,15},
//					 {16,17,18,19,20},
//					 {21,22,23,24,25},
//					 {26,27,28,29,30}};
		int [][] a = new int[6 ][5];
		int [][] b = new int[6][5];
		int num = 1;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				a[i][j]=num;
				num++;
			}
		}
		
		int row=a.length;
		int col=a[0].length;
		if(row>col) {
			for(int m=0; m<col/2; m++) {

				for(int j=m; j<a[0].length-(m+1); j++) {
					b[m][j+1]=a[m][j];
				}
				
				for(int i=m; i<a.length-(m+1); i++) {
					b[i+1][b[i].length-(m+1)]=a[i][a[i].length-(m+1)];
				}
				
				for(int j=a[0].length-(m+1); j>=m+1; j--) {
					b[b.length-(m+1)][j-1]=a[a.length-(m+1)][j];
				}
				
				for(int i=a.length-(m+1); i>=m+1; i--) {	
						b[i-1][m]=a[i][m];
				}

			}
//			if(col%2==1) {
//				int m = (col+1)/2;
//				for(int j=m-1; j<a[0].length-(m-1); j++) {
//					b[m][j+1]=a[m][j];
//				}
//			}
		} else {
			for(int m=0; m<row/2; m++) {
				
				for(int j=m; j<a[0].length-(m+1); j++) {
					b[m][j+1]=a[m][j];
				}
				
				for(int i=m; i<a.length-(m+1); i++) {
					b[i+1][b[i].length-(m+1)]=a[i][a[i].length-(m+1)];
				}
				
				for(int j=a[0].length-(m+1); j>=m+1; j--) {
					b[b.length-(m+1)][j-1]=a[a.length-(m+1)][j];
				}
				
				for(int i=a.length-(m+1); i>=m+1; i--) {	
						b[i-1][m]=a[i][m];
				}
			}
//			if(row%2==1) {
//				int m = (row+1)/2;
//				for(int j=m-1; j<a[0].length-(m-1); j++) {
//					b[m][j+1]=a[m][j];
//				}
//			}
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
