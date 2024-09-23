package testpm.test_15;

import java.util.Arrays;
import java.util.Scanner;

public class Customer_management {
	Scanner in = new Scanner(System.in);
	Customer_info[] CiA = new Customer_info[10];
	Customer_management() {
		
	}

	public void Customer_menu() {
		while(true) {
			System.out.println("고객 관리 메뉴");
			System.out.println("1. 고객 정보 입력");
			System.out.println("2. 고객 정보 조회");
			System.out.println("3. 고객 정보 수정");
			System.out.println("4. 고객 정보 삭제");
			System.out.println("5. 종료");
			System.out.println("원하는 탭의 번호를 입력해주세요.");
			int selNum = in.nextInt();
			in.nextLine();
			System.out.println("입력 숫자 >> ");
			if(selNum == 1) {
				input();
//				break;
			} else if(selNum == 2) {
				inquiry();
//				break;
			} else if(selNum == 3) {
				edit();
//				break;
			} else if(selNum == 4) {
				delete();
//				break;
			} else if(selNum == 5) {
				break;
			} else {
				System.out.println("유효하지 않은 입력값입니다. 다시 입력해주세요.");
			}
		}
	}

	private void input() {
		Customer_info Ci = new Customer_info();
		for(int i = 0; i < CiA.length; i++) {
			if(Arrays.asList(CiA).contains(null)) {
				if(CiA[i] == null) {
					System.out.println(i);
					System.out.println("1. 아이디를 입력하시오.");
					String id = in.nextLine();
					Ci.setCid(id);
					System.out.println("2. 이름을 입력하시오.");
					String name = in.nextLine();
					Ci.setCname(name);
					CiA[i] = Ci;
					System.out.println("고객 정보 입력을 완료하였습니다.");
					break;
				}
			} else {
				System.out.println("입력란이 가득 찼습니다. 입력란 추가 혹은 기존 고객의 정보를 삭제 후 다시 시도하세요.");
				break;
			}
		}
//		Customer_menu();
	}
	
	private void inquiry() {
		if(CiA == null) {
			System.out.println("입력된 정보가 없습니다. 입력 후 다시 시도하세요.");
		} else {
			for(int i = 0; i < CiA.length; i++) {
				if(CiA[i] != null) {
					CiA[i].prt();
				}
			}
		}
//		Customer_menu();
	}
	
	private void edit() {
		Scanner in = new Scanner(System.in);
		Customer_info Ci = new Customer_info();
		if(CiA == null) {
			System.out.println("입력된 정보가 없습니다. 입력 후 다시 시도하세요.");
		} else {
			for(int i = 0; i < CiA.length; i++) {
				System.out.println("수정이 필요한 아이디를 입력하시오.");
				String Eid = in.nextLine();
				if(CiA[i].Cid.equals(Eid)) {
					System.out.println("1. 아이디를 입력하시오.");
					String id = in.nextLine();
					Ci.setCid(id);
					System.out.println("2. 이름을 입력하시오.");
					String name = in.nextLine();
					Ci.setCname(name);
					CiA[i] = Ci;
					System.out.println("고객 정보 수정을 완료하였습니다.");
					break;
				} else {
					System.out.println("유효하지 않은 입력값입니다. 다시 입력해주세요.");
					i = -1;
				}
				System.out.println("수정을 종료하고싶으시다면 1번을, 계속 하고싶으시다면 2번을 눌러주세요;");
				int selNum = in.nextInt();
				in.nextLine();
				if(selNum == 1) {
					break;
				} else if(selNum == 2) {
					continue;
				} else {
					System.out.println("유효하지 않은 입력값입니다. 수정을 종료합니다.");
					break;
				}
				
			}
		}
//		Customer_menu();
	}
	private void delete() {
		Scanner in = new Scanner(System.in);
		Customer_info Ci = new Customer_info();
		if(CiA == null) {
			System.out.println("입력된 정보가 없습니다. 입력 후 다시 시도하세요.");
		} else {
			for(int i = 0; i < CiA.length; i++) {
				System.out.println("삭제할 아이디를 입력하시오.");
				String Did = in.nextLine();
				if(CiA[i].Cid.equals(Did)) {
					CiA[i] = null;
					System.out.println("해당 고객에 대한 정보를 삭제 하였습니다.");
					break;
				} else {
					System.out.println("유효하지 않은 입력값입니다. 다시 입력해주세요.");
					i = -1;
				}
			}
		}
//		Customer_menu();
	}
}

