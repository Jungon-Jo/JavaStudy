package testpm.test_12;

public class test12_05 {

	public static void main(String[] args) {
		int[][] a = new int[5][5];
		int num = 1;

		// → 문제의 규칙에 따라, 좌표값 (0,0)부터 값이 1부터 입력되기 시작하여 나선형 모양으로 입력된다.(오른쪽 방향)
		// → 참조값 사용이 많아질 수록 프로그램 수행에 부하가 걸리게 되므로, 변수를 생성하여 변수를 사용해준다.
		// → 행과 열의 길이를 변수에 저장
		int row=a.length;
		int col=a[0].length;
		
		// → 달팽이 모양으로 가장 바깥쪽에서부터 안쪽으로 값을 채워나가는 형태의 2차원 배열이 생성된다.
		// → 배열의 가장 바깥쪽에서 수행된 입력 방법이 내부에서도 동일하게 수행되어야 하고
		//   이는 1회 반복 될 때 마다, 행과 열의 길이는 2씩 감소(상하좌우 각각 1회씩 수행되므로)하게 된다.
		//   따라서, 행과 열의 길이 중 짧은 값(홀수인 경우 내림)의 절반만큼 수행되어져야 한다.
		// → 이를 수행하기 위해 조건문을 통해 길이를 판별후, 짧은 값을 기준으로 입력한다.
		
		// → 열의 길이가 더 짧게 판별 되었으므로, 반복 횟수를 열의 길이 절반 만큼 수행해준다.
		if(row>col) {
			
			// → 1회 수행 시, 상단 행의 전체 → 상하단 행을 제외한 우측 열 → 하단 행의 전체 → 상하단 행을 제외한 좌측 열
			for(int m=0; m<col/2; m++) {
				
				// → 상단 행의 경우 행값 고정, 열값 1씩 증가함에 따라 값 입력 수행
				for(int j=m; j<col-m; j++) {
					a[m][j]=num++;
				}
				
				// → 우측 열의 경우 열값 고정, 행값 1씩 증가함에 따라 값 입력 수행(상하단 행 값 제외)
				for(int i=m+1; i<row-(m+1); i++) {
					a[i][col-(m+1)]=num++;
				}
				
				// → 하단 행의 경우 행값 고정, 열값 1씩 감소함에 따라 값 입력 수행
				for(int j=col-1-m; j>=m; j--) {
					a[row-1-m][j]=num++;
				}
				
				// → 좌측 열의 경우 열값 고정, 행값 1씩 감소함에 따라 값 입력 수행(상하단 행 값 제외)
				for(int i=row-1-(m+1); i>=m+1; i--) {	
					a[i][m]=num++;
				}
				// → 열의 길이의 절반(홀수 일 경우 내림)만큼 수행
			}
			// → 열의 길이가 홀수 인 경우 제외되는 구간이 발생 하므로, 해당 빈 구간을 채워주기위한 조건문 작성
			// → 단, 행과 열의 길이가 홀수 인 정방형 2차원 배열인 경우는 별도의 값을 입력해주어야 하므로, 판별식을
			//   행과 열의 길이가 다르고 열의 길이가 홀수 일 때로 만들어준다.
			// → 열의 길이가 홀수 일 경우 가운데 위치한 열의 가운데 행 2개의 값이 비워짐으로, 이를 채워준다. 
			// → 행과 열의 길이가 홀수인 정방형 2차원 배열인 경우, 좌표값이 행과 열 가운데로 이루어진 곳의 값을 마지막으로 채워준다.
			if(row!=col && col%2==1) {
				int m = (col+1)/2;
				for(int j=m-1; j<=col-(m-1); j++) {
					a[j][m-1]=num++;
				}
			} else {
				a[row/2][col/2]=num++;
			}
			
		// → 행의 길이가 더 짧 경우로, 열의 길이가 짧을때와 동일하게 수행한다.
		} else {
			for(int m=0; m<row/2; m++) {
				
				for(int j=m; j<col-m; j++) {
					a[m][j]=num++;
				}
				
				for(int i=m+1; i<row-(m+1); i++) {
					a[i][col-(m+1)]=num++;
				}
				
				for(int j=col-1-m; j>=m; j--) {
					a[row-1-m][j]=num++;
				}
				
				for(int i=row-1-(m+1); i>=m+1; i--) {	
					a[i][m]=num++;
				}
			}
			if(row!=col && row%2==1) {
				int m = (row+1)/2;
				for(int j=m-1; j<=col-(m-1); j++) {
					a[m-1][j]=num++;
				}
			} else {
				a[row/2][col/2]=num++;
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
