package project_02;

import java.util.Scanner;

public class Menu {
	
		ParkingSystem parkingSystem = null;
		addAndList addAndList = null;
		
//		(1) 호스트 등록 (동, 호수, 이름, 비밀번호)
//		(2) 차량 등록 (차량번호(1.입주민 / 2.방문객))
//		(3) ParkingSystem 조회 (조회(검색), 수정, 삭제)
//		if(num == 1)
	
	// 의존관계
	// 1. 호스트 클래스
	// 2. 차량 등록 클래스
	// 3. 주차 시스템 클래스
	Menu() {
		if(addAndList == null) {
			addAndList = new addAndList();
		}
		if(parkingSystem == null) {
			parkingSystem = new ParkingSystem();
		}
		menu();
	}
	
	public void menu() {
		while(true) {
			Scanner in = new Scanner(System.in);
			System.out.println("-----환영합니다-----");
			System.out.println("아파트 주차 시스템입니다.");
			System.out.println("1. 주차 차량 관리 시스템 ");
			System.out.println("2. 등록 및 조회 ");
			System.out.println("3. 프로그램 종료");
			int num = in.nextInt();
			in.nextLine();
			if(num == 1) {
				parkingSystem.hostList = addAndList.hostList;
				parkingSystem.carList = addAndList.carList;
				parkingSystem.menu();
			}else if(num == 2) {
				addAndList.menu();
			}else if(num == 3) {
				break;
			}
			in.close();
		}
	}
}