package testpm.test_12;

public class test12_02 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[a.length-1-i][a[i].length-1-j]=num;
				num++;
			}
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
