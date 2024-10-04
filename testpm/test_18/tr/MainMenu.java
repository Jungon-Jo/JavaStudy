package testpm.test_18.tr;

import java.util.Scanner;

public class MainMenu {
	private StuMge stuManager = null;
	private PartMge partManager = null;
	
	// 로그인 정보 객체 주소
	private Stu nowUser = null;
	
	MainMenu() {
		init();
		Scanner in = new Scanner(System.in);
		while(true) {
			menu();
			System.out.println("메뉴 선택");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				goStuMge();
			} else if(selNum == 2) {
				goPartMge();
			} else if(selNum == 3) {
				loginProcess();
			} else {
				break;
			}
		}
	}
	private void goStuMge() {
		// 학생관리 하는 객체의 메뉴를 호출
		// 이때, 주의 할 점은 객체를 새로 만들지 말고
		// 기존 객체의 주소를 참조하여 메뉴를 호출
		// new StuMge(); → 이걸 하지 말자는 의미
		stuManager.menu();
	}
	private void goPartMge() {
		partManager.menu();
	}
	private void loginProcess() {
		Scanner in = new Scanner(System.in);
		System.out.println("로그인 하세요<id입력>");
		String id = in.nextLine();
		nowUser = stuManager.loginID(id);
		if(nowUser == null) {
			System.out.println("아이디 없음");
		} else {
			System.out.println("로그인 성공/메뉴로 이동");
			nowUser.menu(partManager);
		}
	}
	private void menu() {
		System.out.println("1. 학생관리");
		System.out.println("2. 교과목관리");
		System.out.println("3. 로그인");
	}
	private void init() {
		if(stuManager == null) {
			stuManager = new StuMge();
		}
		if(partManager == null) {
			partManager = new PartMge();
		}
	}
}
