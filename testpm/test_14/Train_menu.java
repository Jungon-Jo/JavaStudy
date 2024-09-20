package testpm.test_14;

import java.util.Scanner;

public class Train_menu {
	Train_info[] trainList = new Train_info[5];
	int tL = trainList.length;
	Scanner in = new Scanner(System.in);
	Train_menu() {
		while(true) {
			menu();
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				enroll();
			} else if(selNum == 2) {
				list();
			} else if(selNum == 3) {
				edit();
			} else if(selNum == 4) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}
		}
	}
	
	public void menu() {
		System.out.println("기차 관리 메뉴");
		System.out.println("1. 등록");
		System.out.println("2. 조회");
		System.out.println("3. 수정");
		System.out.println("4. 종료");
	}
	
	public void enroll() {
		Train_info trainInfo = new Train_info();
		System.out.println("기차 번호를 입력하시오.");
		trainInfo.trainNum = in.nextLine();
		for(int i = 0; i < tL; i++) {
			if(trainList[i]==null) {
				trainInfo.time();
				trainList[i]=trainInfo;
				break;
			}
		}
	}

	public void list() {
		
	}
	
	public void edit() {
		
	}
}
