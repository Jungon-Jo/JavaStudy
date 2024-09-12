package testpm.test_12;

public class test12_01 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
		
		
		for(int i=0; i<a[0].length; i++) {
			for(int j=0; j<a.length; j++) {
				a[j][(a[0].length-1)-i]=num;
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
