package testpm.test_10;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class project03 {

	public static void main(String[] args) {
		Arr a = new Arr();
//		Random r = new Random();
//		int num = 0;
//		String Q = "";
//		for (int i = r.nextInt(a.arr.length); i < a.arr.length;) {
//			num = r.nextInt(10);
//			Q = num + a.arr[i];
//			break;
//		}
//		System.out.println(Q);

//		<초보용>  - 100초  (easy)
//		한글자->5개   	(cnt1)
//		두글자->4개	(cnt2)
//		세글자->3개	(cnt3)
//		네글자->2개	(cnt4)
//		다섯글자->1개	(cnt5)
		int[] cnt = new int[5];
		for (int i = 0; i < cnt.length; i++) {
			cnt[i]=5-i;
		}
		int point = 100;
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		boolean answer=true;
		//System.out.println(r.nextInt(arr.length));
		for(int i=r.nextInt(a.arr.length);;) {
			if(cnt[a.arr[i].length()-1]!=0) {
				System.out.println("주어진 단어를 입력하세요.");
				System.out.println(a.arr[i]);
				String word=in.next();
				in.nextLine();
				answer=(a.arr[i].equals(word));   // String비교시 사용하는 method
				if(answer==true) {
					System.out.println("정답입니다^-^");
					for (int j = 0; j < cnt.length; j++) {
						if(a.arr[i].length()-1==j) {
							cnt[j]--;		// 글자 길이수에 해당하는 갯수를 1개 감소시킴
						}
					}
					i = r.nextInt(a.arr.length);	// 새로운 i값 뽑기(새로운단어)
				}
				if(answer==false) {
					System.out.println("오답입니다.");
					for (int j = 0; j < a.arr[i].length(); j++) {
						point-=2;
					}
					i = r.nextInt(a.arr.length);
				}
			}else if(cnt[a.arr[i].length()-1]==0){		
				// 이미 주어진 글자수의 갯수만큼 다 나온 경우는 다시 단어뽑기
				i = r.nextInt(a.arr.length);
			}
			if(cnt[0]+cnt[1]+cnt[2]+cnt[3]+cnt[4]==0) {
				break;
			}
			System.out.println("글자수의 남은 갯수");
			for (int j = 0; j < cnt.length; j++) {
				System.out.print(cnt[j]+" ");
			}
			System.out.println();
	}
		System.out.println("초보단계를 통과하였습니다!!!(점수는"+point+"입니다.)");
}
}
