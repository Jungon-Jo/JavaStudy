package testpm.test_15;

import java.util.Scanner;

public class CustomerAndEvent_main {

	public static void main(String[] args) {
		Customer_management Cm = new Customer_management();
		Event_management Em = new Event_management();
		while(true) {
			Scanner in = new Scanner(System.in);
			System.out.println("안녕하세요. ED 프로그램에 오신것을 환영합니다.");
			System.out.println("원하시는 모드의 숫자를 입력하세요.");
			System.out.println("1. 고객 관리");
			System.out.println("2. 이벤트 관리");
			System.out.println("입력 숫자 >> ");
			for(;;) {
				int selNum = in.nextInt();
				in.nextLine();
				if(selNum == 1) {
					Cm.Customer_menu();
					break;
				} else if(selNum == 2) {
					Em.Event_menu();
					break;
				} else {
					System.out.println("유효하지 않은 입력값입니다. 다시 입력해주세요.");
				}
			}
		}
	}

}
