package testpm.test_12;

public class test12_06 {

	public static void main(String[] args) {
//		int[][] a = {{1,2,3,4,5},
//					 {6,7,8,9,10},
//					 {11,12,13,14,15},
//					 {16,17,18,19,20},
//					 {21,22,23,24,25},
//					 {26,27,28,29,30}};
		int [][] a = new int[5][6]; // → 2차원 배열의 임의의 값을 대입해 모든 경우에 적용 되는지 확인하기 위해 빈 배열을 생성
		int [][] b = new int[5][6]; // → 2차원 배열 a를 회전 시켰을 때의 값을 저장하기위해 빈 배열 생성(a 2차원 배열과 동일한 행과 열로 생성)
		int num = 1;
		
		for(int i=0; i<a.length; i++) { 
			for(int j=0; j<a[0].length; j++) {
				a[i][j]=num;
				num++;
			}
		}
		// → 문제 풀이를 위한 2차원 배열 내부를 문제와 동일하게 입력
		
		int row=a.length; // → 참조값을 쓰는 경우 프로그램에 부하를 증가 시키므로, 변수를 생성하여 저장 후 사용(전체 행의 길이)
		int col=a[0].length; // → 참조값을 쓰는 경우 프로그램에 부하를 증가 시키므로, 변수를 생성하여 저장 후 사용(전체 열의 길이)
		
		// → 문제의 규칙에 따른 회전은 행 또는 열의 길이 중 짧은 길이의 절반(홀수 일 경우 내림한 값) 만큼 회전하게된다.
		// → 따라서, 행과 열의 길이에 따라 반복횟수를 정할 수 있도록 조건문을 사용한다.
		if(row>col) { // → 행의 길이가 더 긴 경우
			for(int m=0; m<(col+1)/2; m++) { // → 회전 횟수만큼 반복하기위한 반복문
											 //   ex) m=0의 2차원 배열의 가장 바깥쪽을 의미하며, m=1은 하나 안쪽의 값들을 의미한다.

				// → 상단 행 회전
				// → b 2차원 배열에 값 입력을 위한 반복문으로 오른쪽으로 한칸 씩 이동(행의 좌표값 고정, 열의 좌표값 1씩 증가)
				// → a 2차원 배열의 상단 제일 오른쪽 열에 있던 값은 아래로 내려가게 되므로,
				//   상단 행 회전에 포함되지 않는다.
				// → a 2차원 배열의 제일 오른쪽 값은 오른쪽 열 회전 시, 입력된다.
				for(int j=m; j<col-(m+1); j++) { 
					b[m][j+1]=a[m][j];
				}
				
				// → 오른쪽 열 회전
				// → 상단 행 회전 시, 입력되지 않았던 a 2차원 배열의 제일 오른쪽 값을 시작으로
				//   아래로 한칸 씩 이동시키는 반복문 작성(행의 좌표값 1씩 증가, 열의 좌표값 고정)
				// → a 2차원 배열의 오른쪽 제일 하단 값은 하단 행 회전 시 입력되므로, 오른쪽 열 회전에서는 제외시킨다.
				for(int i=m; i<a.length-(m+1); i++) {
					b[i+1][b[i].length-(m+1)]=a[i][a[i].length-(m+1)];
				}
				
				// → 하단 행 회전
				// → 하단 행 회전 시, 입력되지 않았던 a 2차원 배열의 제일 하단 값을 시작으로
				//   왼쪽으로 한칸 씩 이동시키는 반복문 작성(행의 좌표값 고정, 열의 좌표값 1씩 증가)
				// → a 2차원 배열의 하단 제일 왼쪽 값은 왼쪽 열 회전 시 입력되므로, 하단 행 회전에서는 제외시킨다.
				for(int j=a[0].length-(m+1); j>=m+1; j--) {
					b[b.length-(m+1)][j-1]=a[a.length-(m+1)][j];
				}
				
				// → 왼쪽 행 회전
				// → 왼쪽 행 회전 시, 입력되지 않았던 a 2차원 배열의 제일 왼쪽 값을 시작으로
				//   위쪽으로 한칸 씩 이동시키는 반복문 작성(행의 좌표값 1씩 증가, 열의 좌표값 고정)
				// → a 2차원 배열의 왼쪽 제일 상단 값은 상단 행 회전 시 입력되므로, 왼쪽 행 회전에서는 제외시킨다.
				// → 제일 처음 상단 행 회전 시 오른쪽으로 회전 하므로, b 2 2차원 배열의 제일 왼쪽 값은 입력되지 않은채로
				//   남겨져 있기 때문에 값 입력이 중복되는 경우를 고려하지 않아도 된다.
				for(int i=a.length-(m+1); i>=m+1; i--) {	
						b[i-1][m]=a[i][m];
				}

			}
			
		} else { // → 열의 길이가 더 긴 경우
			// → 행의 길이가 더 긴 경우와 동일하게 수행한다.
			for(int m=0; m<(row+1)/2; m++) {
				
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
		}
		
		// → a 2차원 배열이 길이가 홀수 인 정방형일 경우, 가장 가운데 있는 값은 입력되지 않기때문에 별도의 조건문을 이용해 입력시켜준다.
		// → 행 또는 열이 홀수인지, 정방형인지 판별 후, a 2차원 배열의 가운데 값을 b 2차원 배열 가운데 입력시켜준다.
		if(row%2==1 && row==col) {
			b[row/2][col/2]=a[row/2][col/2];
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
