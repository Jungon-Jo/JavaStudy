package testpm.test_12;

public class test12_05 {

	public static void main(String[] args) {
		int[][] a = new int[5][5];
		int num = 1;

		//오른쪽, 아래로 이동할 경우, 왼쪽, 위로 이동할 경우 두가지 경우로 나누어 문제해결
		int row=a.length;
		int col=a[0].length;
		if(row>col) {
			for(int m=0; m<col/2; m++) {

				for(int j=m; j<col-m; j++) {
					a[m][j]=num;
					num++;
				}
				
				for(int i=m+1; i<row-(m+1); i++) {
						a[i][col-(m+1)]=num;
						num++;
				}
				
				for(int j=col-1-m; j>=m; j--) {
					a[row-1-m][j]=num;
					num++;
				}
				
				for(int i=row-1-(m+1); i>=m+1; i--) {	
						a[i][m]=num;
						num++;	
				}

			}
			if(col%2==1) {
				int m = (col+1)/2;
				for(int j=m-1; j<col-(m-1); j++) {
					a[m-1][j]=num;
					num++;
				}
			}
		} else {
			for(int m=0; m<row/2; m++) {
				
				for(int j=m; j<col-m; j++) {
					a[m][j]=num;
					num++;
				}
				
				for(int i=m+1; i<row-(m+1); i++) {
						a[i][col-(m+1)]=num;
						num++;
				}
				
				for(int j=col-1-m; j>=m; j--) {
					a[row-1-m][j]=num;
					num++;
				}
				
				for(int i=row-1-(m+1); i>=m+1; i--) {	
						a[i][m]=num;
						num++;	
				}
			}
			if(row%2==1) {
				int m = (row+1)/2;
				for(int j=m-1; j<col-(m-1); j++) {
					a[m-1][j]=num;
					num++;
				}
			}
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}

	}
	
}

//for(int i=0; i<1; i++) {
//	for(int j=0; j<a[i].length; j++) {
//		a[i][j]=num;
//		num++;
//		if(j==a[i].length-1) {
//			for(int n=1; n<a.length; n++) {
//				a[i+n][j]=num;
//				num++;
//			}
//		}
//	}
//}
//
//for(int i=a.length-1; i>a.length-2; i--) {
//	for(int j=a[i].length-1-1; j>=0; j--) {
//		a[i][j]=num;
//		num++;
//		if(j==0) {
//			for(int n=1; n<a.length-1; n++) {
//				a[i-n][j]=num;
//				num++;
//			}
//		}
//	}
//}

//for(int m=0; m<a.length/2; m++) {
//	for(int i=m; i<m+1; i++) {
//		for(int j=m; j<a[i].length-m; j++) {
//			a[i][j]=num;
//			num++;
//			if(j==a[i].length-1-m) {
//				for(int n=1+m; n<a.length-m; n++) {
//					a[i+n-m][j]=num;
//					num++;
//				}
//			}
//		}
//	}
//	
//	for(int i=a.length-1-m; i>=a.length-1-m; i--) {
//		for(int j=a[i].length-1-(m+1); j>=m; j--) {
//			a[i][j]=num;
//			num++;
//			if(j==0) {
//				for(int n=1+m; n<a.length-(m+1); n++) {
//					a[i-n-m][j]=num;
//					num++;
//				}
//			}
//		}
//	}
//}
