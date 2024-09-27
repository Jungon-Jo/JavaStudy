package project_02;

import java.util.Scanner;

public class ParkingSystem {
	HostList hostList = null;
	CarList carList = null;
	ParkingSystem(){
	}
	public void menu() {
		// 검색 등록 삭제 조회
		while(true) {
			Scanner in = new Scanner(System.in);
			System.out.println("---아파트 주차 등록 시스템입니다.---");
			System.out.println("기능을 선택해주세요.");
			System.out.println("----------------------------");
			System.out.println("1. 세대별 차량 조회"); 
			System.out.println("2. 등록 차량 수정");
			System.out.println("3. 전체 정보 삭제 (이사 전용)"); // 몇동 몇호에 몇대(차량번호) 등록되어있는지
			int selNum = in.nextInt();
			if(selNum == 1) {
				allDel();
			}else if(selNum == 2) {
				edit();
			}else if(selNum == 3) {
				show();
			}
			in.nextLine();
		}
	}


//	public void userPwd(String pwd) {
//		for(int i = 0; i < pwd.length(); i++) {
//			if(userPwd.get(i).pwd.equals(pwd)) {
//				return=1;
//			}
//		} return=0;
//	}

	public void allDel() {
		Scanner in = new Scanner(System.in);
		System.out.println("---입주민 전용 프로그램입니다.---");
		System.out.println("비밀번호를 입력해주세요.");
		String pwd = in.nextLine();
		for(int i = 0; i < hostList.myHost.size(); i++) {
			if(hostList.myHost.get(i).contains(pwd)) {
				carList.carType(classificationNum, pwd);
			}
		}
				System.out.println("로그인 되었습니다.");
				System.out.println("전체 정보 삭제를 원하신다면");
				System.out.println("이름과 비밀번호를 다시 입력해주세요.");
				System.out.println("이름");
				String uName = in.nextLine();
				System.out.println("비밀번호");
				String pwd = in.nextLine();
				for(int i = 0; i < hostList.myHost.size(); i++) {
					if(hostList.myHost.get(i).contains(pwd)) {
						carList.carType(classificationNum, pwd);
					}
				}
						System.out.println("정보가 삭제되었습니다.");
					} else {
						System.out.println("이름과 비밀번호가 틀렸습니다.");
					}
				}
			}
		}	
	}
	public void edit() {
		 Scanner in = new Scanner(System.in);
		 System.out.println("---입주민 전용 프로그램입니다.---");
		 System.out.println("비밀번호를 입력해주세요.");
		 String pwd = in.nextLine();
			for(int i = 0; i < hostList.myHost.size(); i++) {
				if(hostList.myHost.get(i).contains(pwd)) {
					carList.carType(classificationNum, pwd);
				}else {
					System.out.println("로그인 되었습니다.");
					System.out.println("수정할 등록 차량 번호를 입력해주세요.");
					String eNum = in.nextLine();
					for(int i = 0; i < hostList.myHost.size(); i++) {
						if(hostList.myHost.get(i).contains(pwd)) {
							carList.carType(classificationNum, pwd);
							System.out.println("등록할 차량 번호를 다시 입력해주세요.");
							String nNum = in.nextLine();
							carList.add(i) ;
							System.out.println("차량 번호가 수정되었습니다.");
						}else{
							System.out.println("차량이 조회되지 않습니다.");
						}
					}	
				}
			}
	}
	public void show() {
		Scanner in = new Scanner(System.in);
		System.out.println("---입주민 전용 프로그램입니다.---");
		System.out.println("비밀번호를 입력해주세요."); 
		String pwd = in.nextLine();
		for(int i = 0; i < hostList.myHost.size(); i++) {
			if(hostList.myHost.get(i).contains(pwd)) {
				System.out.println("로그인 되었습니다.");
				System.out.print(hostList.myHost.get(i));
				System.out.print(carList.userCarList.get(i));
				System.out.print(carList.guestCarList.get(i));
				System.out.println();
			}
		}
	}
}
