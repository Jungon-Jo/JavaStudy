package testpm.test_10;

import java.util.Timer;
import java.util.TimerTask;


public class Timer_j {
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
	
	public static void timer(Timer timer, int cnt[]) {
		TimerTask timertask = new TimerTask() {
			int leftTime = 0;
			public void run() {
				leftTime++;
				if (leftTime % 10 == 0) {		 //10초단위로 출력
					System.out.println();
					System.out.println(red+leftTime+"초 남았습니다."+exit);
				} else if(leftTime >= 100) {
					System.out.println(red+"타임오버입니다."+exit);
				} else if(cnt[0]+cnt[1]+cnt[2]+cnt[3]+cnt[4]==0) {
					timer.cancel();
				}
				
			}
		};
		timer.schedule(timertask, 0, 1000);
	}
}
