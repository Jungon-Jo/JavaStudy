package testpm.test_11;

public class test11_04 {

	public static void main(String[] args) {
		int[][] a = {{1,2,3,4,5},
					 {6,7,8,9,10},
					 {11,12,13,14,15},
					 {16,17,18,19,20},
					 {21,22,23,24,25}};
		// 5. 전체 배열의 값 중 홀수를 0으로 마스킹 하고, 마스킹 된 결과 2차원 배열을 출력하시오.
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(a[i][j]%2==1) {
					a[i][j] = 0;
				}
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
			
		} 

	}

}
