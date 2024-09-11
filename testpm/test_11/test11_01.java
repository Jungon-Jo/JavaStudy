package testpm.test_11;

public class test11_01 {

	public static void main(String[] args) {
		int[][] a = {{1,2,3,4,5},
					 {6,7,8,9,10},
					 {11,12,13,14,15},
					 {16,17,18,19,20},
					 {21,22,23,24,25}};
		// 2. 2차원 배열 a의 3번째 행에서 짝수의 값만 출력하시오.
		for(int i=0; i<a[2].length; i++) {
			if(a[2][i]%2==0) {
				System.out.print(a[2][i]+"\t");
			}
		}
		// a라는 2차원 배열에서 3번째 행이라고 특정지어져 있으므로, a[2]의 값에 해당하는 값 중 짝수만 출력해준다.
		// a[2]의 값이 배열이므로 반복문 for를 이용하여 배열 전체값을 돌아볼 수 있도록 한다.
		// a[2] 배열의 값 중 짝수만 출력해야 하므로, 조건문 if를 사용하여 2로 나누었을 때 나머지가 0이 되는 값만 찾아서 출력해준다.

	}

}
