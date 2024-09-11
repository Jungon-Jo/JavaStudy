package testpm.test_12;

import java.util.Arrays;

public class test12_00 {

	public static void main(String[] args) {
		int[][] a = {{1,1,1,0,0},
				     {0,1,1,0,0},
				     {0,0,1,0,0},
				     {0,0,1,1,0},
				     {1,0,1,1,1}};
		// 2차배열에서 1의 값을 가지는 부분으로 테트리스 도형을 만들었다.
		// 테트리스 도형이 오른쪽 왼쪽으로 회전시켜 값을 출력하여라.
		
		// 테트리스 도형이 정방형인것을 이용한다.
		// 90도 회전 시, 각각의 행과 열의 좌표값이 서로 바뀌고, 열의 좌표값에서 행 또는 열의 길이를 빼준 좌표값에 위치하게 된다.
		// 이러한 성질을 이용해 좌우 회전에 적용한다.
		int[][] b = new int[a.length][a.length];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				b[j][(a.length-1)-i]=a[i][j];
			}
		}
		for(int i=0; i<b.length; i++) {
			System.out.print(Arrays.toString(b[i]));
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				a[j][(b.length-1)-i]=b[i][j];
			}
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(Arrays.toString(a[i]));
			System.out.println();
		}
		System.out.println();
		
		
		int[][] c = new int[a.length][a.length];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				c[j][i]=a[(a.length-1)-i][j];
			}
		}
		for(int i=0; i<c.length; i++) {
			System.out.print(Arrays.toString(c[i]));
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				a[(c.length-1)-j][i]=c[i][j];
			}
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(Arrays.toString(a[i]));
			System.out.println();
		}
	}

}
