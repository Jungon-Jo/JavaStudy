package project_02;

import java.util.Scanner;

public class ParkingSystem {
	HostList hostList = null;
	CarList carList = null;
	ParkingSystem(){
		
	}
	public void menu() {
		// hostList.myHost.get(i).contains(pwd) 로 모두 수정 필요
		while(true) {
			System.out.println(hostList.myHost);
			Scanner in = new Scanner(System.in);
			System.out.println("---아파트 조회 시스템입니다.---");
			System.out.println("기능을 선택해주세요.");
			System.out.println("----------------------------");
			System.out.println("1. 세대별 차량 조회"); 
			System.out.println("2. 등록 차량 수정");
			System.out.println("3. 전체 정보 삭제"); // 몇동 몇호에 몇대(차량번호) 등록되어있는지
			System.out.println("4. 종료");
			System.out.println("선택 항목 >> ");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				show();
			} else if(selNum == 2) {
				edit();
			} else if(selNum == 3) {
				allDel();
			} else {
				break;
			}	
		}
	}
	
	public void allDel() {
		Scanner in = new Scanner(System.in);
		System.out.println("---입주민 전용 프로그램입니다.---");
		System.out.println("비밀번호를 입력해주세요.");
		String pwd = in.nextLine();
		if(hostList.myHost.contains(pwd)) {
			while(true) {
				System.out.println("로그인 되었습니다.");
				System.out.println("입주민의 정보를 조회합니다.");
				for(int i = 0; i < hostList.myHost.size(); i++) {
					for(int j = 0; j < hostList.myHost.get(i).size(); j++) {
						if(hostList.myHost.get(i).get(j).equals(pwd)) {
							System.out.print(hostList.myHost.get(i));
						}
					}
				}
				for(int i = 0; i < carList.userCarList.size(); i++) {
					for(int j = 0; j < hostList.myHost.get(i).size(); j++) {
						if(hostList.myHost.get(i).get(j).equals(pwd)) {
							System.out.print(carList.userCarList.get(i));
						}
					}
				}
				for(int i = 0; i < carList.guestCarList.size(); i++) {
					for(int j = 0; j < carList.guestCarList.get(i).size(); j++) {
						if(carList.guestCarList.get(i).get(j).equals(pwd)) {
							System.out.print(carList.guestCarList.get(i).get(i));
							System.out.println();
						}
					}
				}
				break;
			}
			System.out.println("해당 정보를 삭제하시겠습니까?");
			System.out.println("Y / N");
			String del = in.nextLine();
			if(del.equals("y")) {
				for(int i = 0; i < hostList.myHost.size(); i++) {
					if(hostList.myHost.get(i).contains(pwd)) {
						hostList.myHost.remove(i);
					}
				}
			}
		} else {
			System.out.println("해당 정보가 존재하지 않습니다. 이전 메뉴로 돌아갑니다");
		}
	}
	
	public void edit() {
		Scanner in = new Scanner(System.in);
		System.out.println("---입주민 전용 프로그램입니다.---");
		System.out.println("비밀번호를 입력해주세요.");
		String pwd = in.nextLine();
		if(hostList.myHost.contains(pwd)) {
			while(true) {
				System.out.println("로그인 되었습니다.");
				System.out.println("입주민의 정보를 조회합니다.");
				
				for(int i = 0; i < hostList.myHost.size(); i++) {
					if(hostList.myHost.get(i).contains(pwd)) {
						System.out.print(hostList.myHost.get(i));
					}
				}
				for(int i = 0; i < carList.userCarList.size(); i++) {
					if(hostList.myHost.get(i).contains(pwd)) {
						System.out.print(carList.userCarList.get(i));
					}
				}
				for(int i = 0; i < carList.guestCarList.size(); i++) {
					if(hostList.myHost.get(i).contains(pwd)) {
						System.out.print(carList.guestCarList.get(i));
						System.out.println();
					}
				}
				break;
			}
			System.out.println("해당 정보를 수정하시겠습니까?");
			System.out.println("Y / N");
			String del = in.nextLine();
			String[] ref = {"동 : ", "호 : ", "이름 : ", "비밀 번호 : "};
			if(del.equals("y")) {
				for(int i = 0; i < hostList.myHost.size(); i++) {
					if(hostList.myHost.get(i).contains(pwd)) {
						System.out.println("변경하고자 하는 항목을 선택하세요");
						System.out.println("1. 동");
						System.out.println("2. 호");
						System.out.println("3. 이름");
						System.out.println("4. 비밀 번호");
						System.out.println("5. 차량 정보");
						System.out.println("선택 항목 >> ");
						int selNum = in.nextInt();
						in.nextLine();
						if(selNum <= 4) {
							System.out.println(ref[selNum]);
							hostList.myHost.get(i).get(selNum);
							System.out.println("사용자 정보 수정을 완료했습니다");
						} else if(selNum == 5) {
							for(int j = 0; j < carList.userCarList.size(); j++) {
								System.out.println("차량 정보를 조회합니다.");
								System.out.print(carList.userCarList.get(j));
							}
							for(int j = 0; j < carList.guestCarList.size(); j++) {
								System.out.print(carList.guestCarList.get(j));
							}
							System.out.println("수정을 원하시는 차량의 번호를 입력해주세요");
							System.out.println("수정을 원하시지 않은 경우 N을 눌러주세요");
							System.out.println("차량 번호 >> ");
							String selCarIndex = in.nextLine();
							if(carList.userCarList.get(i).contains(selCarIndex)) {
								carList.carType(1, pwd);
								carList.userCarList.remove(i);
							}
							if(carList.guestCarList.get(i).contains(selCarIndex)) {
								carList.carType(2, pwd);
								carList.guestCarList.remove(i);
							}
						}
					}
				}
			}
		} else {
			System.out.println("해당 정보가 존재하지 않습니다. 이전 메뉴로 돌아갑니다");
		}
	}
	
	public void show() {
		Scanner in = new Scanner(System.in);
		System.out.println("---입주민 전용 프로그램입니다.---");
		System.out.println("비밀번호를 입력해주세요."); 
		String pwd = in.nextLine();
		for(int m = 0; m < hostList.myHost.size(); m++) {
			if(hostList.myHost.get(m).contains(pwd)) {
				while(true) {
					for(int i = 0; i < hostList.myHost.size(); i++) {
						System.out.println( hostList.myHost.size());
						if(hostList.myHost.get(i).contains(pwd)) {
							System.out.println("로그인 되었습니다.");
							System.out.print(hostList.myHost.get(i));
							System.out.print(carList.userCarList.get(i));
							System.out.print(carList.guestCarList.get(i));
							System.out.println();
						}
					}
					System.out.println("이전 메뉴로 돌아가시겠습니까?");
					System.out.println("Y / N");
					String selExit = in.nextLine();
					if("y".equals(selExit)) {
						break;
					} else {
						continue;
					}
				}
			} else {
				System.out.println("해당 정보가 존재하지 않습니다. 이전 메뉴로 돌아갑니다");
			} break;
		}
	}
}
