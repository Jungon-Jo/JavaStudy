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

	}

}
