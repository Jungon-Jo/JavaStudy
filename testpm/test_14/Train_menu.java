package testpm.test_14;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Train_menu {
	Train_info[] trainList = new Train_info[4];
	int tL = trainList.length;
	Scanner in = new Scanner(System.in);
	Train_menu() {
		basicInfo();
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
	
	public void basicInfo() {
		int[] trainNumArray = {1111, 2222, 3333, 4444};
		for(int i = 0; i < trainNumArray.length; i++) {
			Train_info trainInfo = new Train_info();
			trainInfo.number(trainNumArray[i]);
			trainList[i] = trainInfo;
		}
	}
	
	public void enroll() {
		int[] trainNumArray = {1111, 2222, 3333, 4444};
		System.out.println("등록을 원하시는 기차번호를 입력하여 주세요.");
		int trainNum = in.nextInt();
		in.nextLine();
		for(int i = 0; i < tL; i++) {
			if(IntStream.of(trainNumArray).anyMatch(x -> x == trainNum)) {
				if(trainList[i].trainNum == trainNum) {
					trainList[i].time();
					break;
				}
			} else {
				System.out.println("존재하지 않는 기차 번호 입니다. 메뉴로 돌아갑니다.");
				break;
			}
		}
	}

	public void list() {
		for(int i = 0; i < tL; i++) {
			if(i%2==0) {
				trainList[i].prt();
			} else {
				trainList[i].trainType += "*";
				trainList[i].prt();
			}
		}
	}
	
	public void edit() {
		int[] trainNumArray = {1111, 2222, 3333, 4444};

		System.out.println("기차 시간 수정이 필요한 기차 번호를 입력하시오.");
		int editNumber = in.nextInt();
		in.nextLine();	
		if(IntStream.of(trainNumArray).anyMatch(x -> x == editNumber)) {
			System.out.println("기차 시간 수정이 필요한 도착 시간을 입력하시오.");
			String editTime = in.nextLine();
			for(int i = 0; i < tL; i++) {
				if(trainList[i].trainNum == editNumber) {
					System.out.println(i);
					if(trainList[i].trainTime.equals(editTime)) {
						System.out.println("수정된 시간을 입력하시오.");
						trainList[i].time();
						break;
					} else { 
						System.out.println("입력하신 정보가 일치하지 않습니다.");
					}
				}
			}
		} else {
			System.out.println("존재하지 않는 기차 번호 입니다. 메뉴로 돌아갑니다.");
		}
	}
}
