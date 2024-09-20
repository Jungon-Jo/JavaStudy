package testpm.test_14;

import java.util.Scanner;

public class Train_info {
	Scanner in = new Scanner(System.in);
	String trainNum = null;
	String trainTime = null;
	Train_info() {
		time();
	}
	
	public void time() {
		System.out.println("기차 출발 時를 입력하시오.");
		String trainHour = in.nextLine();
		System.out.println("기차 출발 分을 입력하시오.");
		String trainMin = in.nextLine();
		trainTime = trainHour + trainMin;
	}
}
