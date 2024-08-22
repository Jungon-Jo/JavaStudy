package testpm.test_10;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

public class project05 {
	public static volatile boolean stop = false;
	public static final String black    = "\u001B[30m" ;
    public static final String red      = "\u001B[31m" ;
    public static final String green    = "\u001B[32m" ;
    public static final String yellow   = "\u001B[33m" ;
    public static final String blue     = "\u001B[34m" ;
    public static final String purple   = "\u001B[35m" ;
    public static final String cyan     = "\u001B[36m" ;
    public static final String white    = "\u001B[37m" ;
    public static final String exit     = "\u001B[0m" ;
    
    public static int[] cnt = new int[5];
    public static int point = 100;
    
	public static void main(String[] args) {
		Arr_m a = new Arr_m();
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		Timer timer = new Timer();
		String[] noticeBoardStr = new String[10];
		String renewalStr = "";
		
		int[] noticeBoardInt = new int[10];
		int renewalInt = 0;
		
		int bomb = 0;
		
		for (;;) {
			System.out.println("id를 입력해주세요");
			String id = in.next();
			in.nextLine();
			
			System.out.println("<1> 초급  <2> 중급  <3> 고급");
			
			// 난이도 선택 코드
			int select = in.nextInt();
			in.nextLine();
			Level_j.level(in, cnt, select);
			
			// 타이머 실행 코드
//			Timer_j.timer(timer, cnt);
			
			// 게임 실행 코드
			int score = Game_j.game(a, r, in, point, cnt, bomb, select);
			int presentScore = score;
			for (int i = 0; i < noticeBoardInt.length; i++) {
				for (int j = i; j < noticeBoardInt.length; j++) {
					if (presentScore > noticeBoardInt[j] && j != noticeBoardInt.length - 1) {
							renewalInt = noticeBoardInt[j];
							noticeBoardInt[j] = presentScore;
							noticeBoardInt[j+1] = renewalInt;
							renewalStr = noticeBoardStr[j];
							noticeBoardStr[j] = id;
							noticeBoardStr[j+1] = renewalStr;
							presentScore = 0;
					} else if (presentScore > noticeBoardInt[j] && j == noticeBoardInt.length - 1) {
						noticeBoardInt[j] = presentScore;
						noticeBoardStr[j] = id;
						presentScore = 0;
					}
					
				}
				System.out.println((i+1) + "위 : " + noticeBoardStr[i] + " / " + noticeBoardInt[i]);
			}
		}
		
	}
}
