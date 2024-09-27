package project_02;

import java.util.Scanner;

public class Menu {
	ParkingSystem parkingSystem = null;
	addAndList addAndList = null;
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
			parkingSystem.hostList = addAndList.hostList;
			parkingSystem.carList = addAndList.carList;
			Scanner in = new Scanner(System.in);
			System.out.println("-----환영합니다-----");
			System.out.println("아파트 주차 시스템입니다.");
			System.out.println("1. 주차 차량 관리 시스템 ");
			System.out.println("2. 등록 및 조회 ");
			System.out.println("3. 프로그램 종료");
			int num = in.nextInt();
			in.nextLine();
			if(num == 1) {
				parkingSystem.menu();
			}else if(num == 2) {
				addAndList.menu();
			}else if(num == 3) {
				break;
			}
		}
	}
}