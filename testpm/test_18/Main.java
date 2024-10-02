package testpm.test_18;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Menu menu = Menu.getInstance();
		System.out.println("--- 모드 선택 ---");
		System.out.println("1. 관리자 로그인");
		System.out.println("2. 수강신청 로그인");
		int selNum = in.nextInt();
		in.nextLine();
		if(selNum == 1) {
			System.out.println("관리자 아이디/비밀번호를 입력하시오.");
			System.out.println("아이디 : ");
			String adminId = in.nextLine();
			System.out.println("비밀번호 : ");
			String adminPwd = in.nextLine();
		}
		menu.menu();
	}
	public void adminInfo() {
		
	}

}
