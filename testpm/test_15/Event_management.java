package testpm.test_15;

import java.util.Arrays;
import java.util.Scanner;

public class Event_management {
	Scanner in = new Scanner(System.in);
	Event_info[] EiA = new Event_info[5];
	Event_management() {
		
	}
	public void Event_menu() {
		while(true) {
			System.out.println("이벤트 관리 메뉴");
			System.out.println("1. 이벤트 정보 입력");
			System.out.println("2. 이벤트 정보 조회");
			System.out.println("3. 이벤트 정보 수정");
			System.out.println("4. 이벤트 정보 삭제");
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
			}else {
				System.out.println("유효하지 않은 입력값입니다. 다시 입력해주세요.");
			}
		}
	}
	
	private void input() {
		Event_info Ei = new Event_info();
		for(int i = 0; i < EiA.length; i++) {
			if(Arrays.asList(EiA).contains(null)) {
				if(EiA[i] == null) {
					System.out.println(i);
					System.out.println("1. 제목을 입력하시오.");
					String title = in.nextLine();
					Ei.setEtitle(title);
					System.out.println("2. 내용을 입력하시오.");
					String content = in.nextLine();
					Ei.setEcontent(content);
					EiA[i] = Ei;
					System.out.println("고객 정보 입력을 완료하였습니다.");
					break;
				}
			} else {
				System.out.println("입력란이 가득 찼습니다. 입력란 추가 혹은 기존 고객의 정보를 삭제 후 다시 시도하세요.");
				break;
			}
		}
//		Event_menu();
	}
	
	private void inquiry() {
		if(EiA == null) {
			System.out.println("입력된 정보가 없습니다. 입력 후 다시 시도하세요.");
		} else {
			for(int i = 0; i < EiA.length; i++) {
				if(EiA[i] != null) {
					EiA[i].prt();
				}
			}
		}
//		Event_menu();
	}
	
	private void edit() {
		Scanner in = new Scanner(System.in);
		Event_info Ei = new Event_info();
		if(EiA == null) {
			System.out.println("입력된 정보가 없습니다. 입력 후 다시 시도하세요.");
		} else {
			for(int i = 0; i < EiA.length; i++) {
				System.out.println("수정이 필요한 아이디를 입력하시오.");
				String Etitle = in.nextLine();
				if(EiA[i].Etitle.equals(Etitle)) {
					System.out.println("1. 아이디를 입력하시오.");
					String title = in.nextLine();
					Ei.setEtitle(title);
					System.out.println("2. 이름을 입력하시오.");
					String content = in.nextLine();
					Ei.setEcontent(content);
					EiA[i] = Ei;
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
//		Event_menu();
	}
	private void delete() {
		Scanner in = new Scanner(System.in);
		Event_info Ei = new Event_info();
		if(EiA == null) {
			System.out.println("입력된 정보가 없습니다. 입력 후 다시 시도하세요.");
		} else {
			for(int i = 0; i < EiA.length; i++) {
				System.out.println("삭제할 아이디를 입력하시오.");
				String Dtitle = in.nextLine();
				if(EiA[i].Etitle.equals(Dtitle)) {
					EiA[i] = null;
					System.out.println("해당 고객에 대한 정보를 삭제 하였습니다.");
					break;
				} else {
					System.out.println("유효하지 않은 입력값입니다. 다시 입력해주세요.");
					i = -1;
				}
			}
		}
//		Event_menu();
	}
}


