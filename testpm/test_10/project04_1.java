package testpm.test_10;

import java.util.Random;
import java.util.Scanner;

public class project04_1 {

	public static void main(String[] args) {
		Arr_m a = new Arr_m();
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		int point = 100;
		int[] cnt = new int[5];
		
		
		
		System.out.println("<1> 초급  <2> 중급  <3> 고급");
		
		// 난이도 선택 코드
		int select = in.nextInt();
		in.nextLine();
		if (select == 1) {
			for (int i = 0; i < cnt.length; i++) {
				cnt[i]=5-i;
			}
		} else if (select == 2) {
			for (int i = 0; i  < cnt.length; i++) {
				cnt[i]=3;
			}
		} else {
			for (int i = 0; i < cnt.length; i++) {
				cnt[i]=i+1;
			}
		}
		System.out.println("Game Start!!!");
		
		// 게임 실행 코드
		for(int i=r.nextInt(a.arr.length);;) {
			if(cnt[a.arr[i].length()-1]!=0) {
				System.out.println("주어진 단어를 입력하세요.");
				System.out.println(a.arr[i]);
				String word=in.next();
				in.nextLine();
				if(a.arr[i].equals(word)) {
					System.out.println("정답입니다^-^");
					for (int j = 0; j < cnt.length; j++) {
						if(a.arr[i].length()-1==j) {
							cnt[j]--;		// 글자 길이수에 해당하는 갯수를 1개 감소시킴
						}
					}
					i = r.nextInt(a.arr.length);	// 새로운 i값 뽑기(새로운단어)
				} else {
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
		}
		System.out.println("초보단계를 통과하였습니다!!!(점수는"+point+"입니다.)");

	}

}
