package testpm.test_14;

import java.util.Scanner;

public class Train_info {
	Scanner in = new Scanner(System.in);
	int[] trainNumArray = {1111, 2222, 3333, 4444};
	String[] trainTypeArray = {"무궁화", "새마을"};
	int trainNum = 0;
	String trainType = null;
	String trainTime = null;
	Train_info() {
		
	}
	
	public void number(int enterNum) {
		for(int i = 0; i < trainNumArray.length; i++) {
			if(trainNumArray[i] == enterNum) {
				if(i%2==0) {
					trainNum = enterNum;
					trainType = "무궁화";
					break;
				} else {
					trainNum = enterNum;
					trainType = "새마을";
					break;
				}
			}
		}		
	}
	
	public void time() {
		System.out.println("기차 도착 時를 입력하시오.");
		String trainHour = in.nextLine();
		System.out.println("기차 도착 分을 입력하시오.");
		String trainMin = in.nextLine();
		trainTime = trainHour + trainMin;
	}

	
	public void prt() {
		System.out.println(trainNum + " : " + trainType + " : " + trainTime);
	}
}
