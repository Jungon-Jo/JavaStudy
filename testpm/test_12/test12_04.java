package testpm.test_12;

public class test12_04 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
		
//		첫번째 방법	
//		for(int i=0; i<a.length; i++) {
//			if(i==0) {
//				for(int j=0; j<a[i].length; j++) {
//					for(int m=0; m<=j; m++) {
//						if(i+m<a.length) {
//							a[i+m][j-m]=num;
//							num++;
//						} else {
//							break;
//						}
//					}
//				} 
//			} else {
//				for(int m=0; m<a.length-i; m++) {
//					a[i+m][(a[i].length-1)-m]=num;
//					num++;
//				}		
//			}
//		}
		
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
		
		// → 총 행의 길이와 열의 길이를 합한 값 보다 1만큼 적은 열을 가진 2차원 배열(행의 값은 동일)이라 가정 했을 때,
		//   해당 행의 길이만큼 좌표값이 증감하게 된다.
		// → 행의 경우 1씩 증가하며, 열의 값은 1씩 감소하게 된다.
		// → 0번째 index부터 좌표값에서 행에 해당하는 값은 1씩 증가, 열에 해당하는 값은 1씩 감소시키는 반복문을 작성한다.
		//   (이는 배열의 index 범위에서 벗어나는 값들이 입력되는 에러가 발생 하지만, 조건문을 사용하여 이를 방지하고 원하는 값을 입력한다.)
		// → 조건문의 판별식을 열의 값이 0이상이고, 기존 2차원 배열의 열의 길이 미만으로 작성하게 되면, 열의 좌표값이 음수가 되는 경우,
		//   기존 2차원 배열의 열의 index 최댓값을 초과하지 않게되며, 순차적으로 입력이 되도록 할 수 있다.
		// 세번째 방법
		for(int j=0; j<a.length+a[1].length-1; j++) {
			for(int m=0; m<a.length; m++) {
				if(j-m>=0 && j-m<a[0].length) {
					a[m][j-m]=num++;
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
