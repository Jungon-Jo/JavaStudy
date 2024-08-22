package testpm.test_10;

import java.util.Random;
import java.util.Scanner;

public class project01 {

	public static void main(String[] args) {
		
		Arr_m a = new Arr_m();
//		Random r = new Random();
//		int num = 0;
//		String Q = "";
//		for (int i = r.nextInt(a.arr.length); i < a.arr.length;) {
//			num = r.nextInt(10);
//			Q = num + a.arr[i];
//			break;
//		}
//		System.out.println(Q);
		
		
		
		// 초보용
		int cnt1=0; int cnt2=0; int cnt3=0; int cnt4=0; int cnt5=0; 
		int cnt=cnt1+cnt2+cnt3+cnt4+cnt5;  // 총 단어갯수를 카운트(cnt1+cnt2+cnt3+cnt4+cnt5)
		int point = 100;
		Random r = new Random();
		Scanner in = new Scanner(System.in);
//		System.out.println(r.nextInt(arr.length));
		for(int i=r.nextInt(a.arr.length);;) {
			System.out.println("주어진 단어를 입력하세요.");
			System.out.println(a.arr[i]);
			String word=in.next();
//			in.nextLine();
			if(word==a.arr[i]) {
				System.out.println("정답입니다^-^");
				if(a.arr[i].length()==1) {
					cnt1++;
				}
				if(a.arr[i].length()==2) {
					cnt2++;
				}
				if(a.arr[i].length()==3) {
					cnt3++;
				}
				if(a.arr[i].length()==4) {
					cnt4++;
				}
				if(a.arr[i].length()==5) {
					cnt5++;
				}
				i = r.nextInt(a.arr.length);
			}
			if(word!=a.arr[i]) {
				System.out.println("오답입니다.");
				if(a.arr[i].length()==1) {
					point-=2;
				}
				if(a.arr[i].length()==2) {
					point-=4;
				}
				if(a.arr[i].length()==3) {
					point-=6;
				}
				if(a.arr[i].length()==4) {
					point-=8;
				}
				if(a.arr[i].length()==5) {
					point-=10;
				}
				i = r.nextInt(a.arr.length);
			}
			if(cnt==15) {
				break;
			}

		}
	}

}
