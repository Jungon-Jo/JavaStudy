package testpm.test_12;

public class test12_01 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
		
		// 오른쪽 열 행의 순서대로 숫자값이 채워지기 시작한다.
		// 열을 기준으로 순회하는 반복문을 먼저 작성하되, 오른쪽 부터 시작하므로
		// 초기값을 a[0].length-1(index(0부터 시작)와 lendgth(1부터 시작)의 값은 1이 차이가 남)로 지정하고 1씩 감소하는 증감식,
		// 마지막 열의 index 값인 0에서 반복문이 종료되도록 조건문을 작성해준다.
		// 행의 반복은 index 0부터 3까지 순차적으로 배회되므로, 초기값을 0으로 1씩 증가하는 증감식 및  최대값 a.length 미만까지 순회하도록 
		// 반복문을 작성해준다.
		// 반복문에 따라 순차적으로 num값을 입력하고, 입력할 때마다 num값을 1씩 증가시켜 다음 좌표에 증가된 값이 입력되도록 한다.
		for(int i=a[0].length-1; i>=0; i--) {
			for(int j=0; j<a.length; j++) {
				a[j][i]=num;
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
// 자바 이론 정리
// 변수 선언 시, 자료형, 변수명 그리고 초기값 3개를 사용해야한다.
// int[][] a = [4][5]; -> int(정수 자료형), a(변수명/값을 기억하는 공간),
//                        [][](배열로 이루어진 초기값으로, [4][5]는 4행 5열로 이루어진 2차원 배열을 초기값을 가진다라는 것을 의미한다. 
//                        행은 0~3의 index, 열은 0~4의 index를 가진다.
// 디버깅 할 때는 행의 반복문 부터 수정하는것을 추천한다.
// 개행 문자 -> t의 의미는 tab만큼 띄워라