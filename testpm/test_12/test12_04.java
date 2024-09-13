package testpm.test_12;

public class test12_04 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
		
//		첫번째 방법	
		for(int i=0; i<a.length; i++) {
			if(i==0) {
				for(int j=0; j<a[i].length; j++) {
					for(int m=0; m<=j; m++) {
						if(i+m<a.length) {
							a[i+m][j-m]=num;
							num++;
						} else {
							break;
						}
					}
				} 
			} 
//			else {
//				for(int m=0; m<a.length-i; m++) {
//					a[i+m][(a[i].length-1)-m]=num;
//					num++;
//				}		
//			}
		}
		
//		두번째 방법
//		for(int j=0; j<a.length+a[0].length-1; j++) {
//			for(int m=0; m<=j; m++) {
//				if(m<a.length && j-m<a[m].length) {
//					a[m][j-m]=num++;
//				} else {
//					continue;
//				}
//			}
//		} 
			
//		세번째 방법
//		for(int j=0; j<a.length+a[1].length-1; j++) {
//			for(int m=0; m<a.length; m++) {
//				if(j-m>=0 && j-m<a[0].length) {
//					a[m][j-m]=num++;
//				}
//			}
//		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
