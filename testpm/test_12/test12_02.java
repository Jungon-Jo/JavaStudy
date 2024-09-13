package testpm.test_12;

public class test12_02 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
		
		// 4행 5열의 2차원 배열에서 제일 오른쪽 아래 좌표(3,4)부터 값을 채워나가야 한다.
		// (3,4)부터 (3,3)->(3,2) 순으로 채워져 나감으로, 행을 기준으로 열을 채워나가는 반복문을 작성해준다.
		// index가 가장 큰값부터 0까지 채워지므로, 초기값을 행과 열 모두 최대값으로 지정해주고, 감소 증감식과 index가 0미만이 되지
		// 않도록 하는 조건을 사용해 반복문을 작성해준다.
		// 좌표에 값이 입력될때마다 값을 1씩 증가시켜 주어야 하므로, num++; 를 사용해준다.
		
		for(int i=a.length-1; i>=0; i--) {
			for(int j=a[i].length-1; j>=0; j--) {
				a[i][j]=num;
				num++;
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
