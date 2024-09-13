package testpm.test_12;

public class test12_03 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
		
		// (0,0) 부터 값이 채워져 나가나, index가 홀수번째인 행에서는 역순으로 값이 채워진다.
		// 짝수 홀수 판별식을 이용하여, 열에 값이 짝수일 경우 정순으로 홀수일 경우 역순으로 채워지도록 조건문과 반복문을 작성해준다.
		// 열의 방향에 따라 작성되는 반복문을 달리하여 작성해준다.
		
		for(int i=0; i<a.length; i++) {
			if(i%2==0) {
				for(int j=0; j<a[i].length; j++) {
//					a[i][j]=num;
//					num++;
					a[i][j]=num++; // 대입연산자 적용 후 단일 연산자인 ++이 실행된다.(후위 단일 연산자)
					// a[i][j]=++num; -> 단일 연산자 ++이 실행 된 후 대입연산자가 실행된다.(전위 단일 연산자)
				} 
			} else {
				for(int j=a[i].length-1; j>=0; j--) {
					a[i][j]=num++;
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
