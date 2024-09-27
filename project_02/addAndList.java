package project_02;

import java.util.Scanner;

public class addAndList {
	HostList hostList = null;
	CarList carList = null;
	addAndList() {
		if(hostList == null) {
			hostList = new HostList();
		}
		if(carList == null) { 
			carList = new CarList();
		}
	}
	public void menu() {
		while(true) {
			Scanner in = new Scanner(System.in);
			System.out.println("---아파트 차량 조회 시스템입니다.---");
			System.out.println("기능을 선택해주세요.");
			System.out.println("----------------------------");
			System.out.println("1. 사용자 등록");
			System.out.println("2. 차량 등록");
			System.out.println("3. 종료");
			System.out.println("선택 항목 >> ");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				System.out.println("원하는 기능을 선택하세요");
				System.out.println("1. 등록 / 2. 조회");
				int selNum1 = in.nextInt();
				in.nextLine();
				if(selNum1 == 1) {
					hostList.list();
				} else {
					hostList.prt();
				}
			} else if(selNum == 2) {
				carList.hostList = hostList;
				System.out.println("원하는 기능을 선택하세요");
				System.out.println("1. 등록 / 2. 조회");
				int selNum1 = in.nextInt();
				in.nextLine();
				if(selNum1 == 1) {
					System.out.println("해당 사항을 선택해주세요");
					System.out.println("1. 입주민 / 2. 방문객");
					int classificationNum = in.nextInt();
					in.nextLine();
					if(classificationNum == 1) {
						System.out.println("비밀번호를 입력하시오");
						System.out.println("틀린 경우 이전 메뉴로 돌아갑니다");
						String pwd = in.nextLine();
						for(int i = 0; i < hostList.myHost.size(); i++) {
							if(hostList.myHost.get(i).contains(pwd)) {
								carList.carType(classificationNum, pwd);
							}
						}
					} else {
						System.out.println("비밀번호를 입력하시오");
						System.out.println("틀린 경우 이전 메뉴로 돌아갑니다");
						String pwd = in.nextLine();
						carList.hostList = hostList;
						for(int i = 0; i < hostList.myHost.size(); i++) {
							if(hostList.myHost.get(i).contains(pwd)) {
								carList.carType(classificationNum, pwd);
							}
						}
						
					}
				} else {
					System.out.println("조회 항목을 선택하세요");
					System.out.println("1. 입주민 차량 / 2. 방문객 차량 / 3. 전체 차량");
					int showNum = in.nextInt();
					in.nextLine();
					carList.prt(showNum);
				}
			} else {
				System.out.println("차량 조회 시스템을 종료합니다");
				break;
			}
		}
	}
}
