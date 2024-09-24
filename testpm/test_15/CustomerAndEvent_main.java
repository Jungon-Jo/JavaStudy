package testpm.test_15;

import java.util.Scanner;

public class CustomerAndEvent_main {

	public static void main(String[] args) {
		// 문제 풀이
		// 요구사항에 따라, 고객과 이벤트를 관리해야하고, 각각의 고객에 대한 정보, 이벤트에 대한 정보를 입력받아 관리된다.
		// 따라서, 클래스는 메인 클래스, 고객과 이벤트 관리, 각각에 대한 정보 입력을 위한 클래스로 총 5개의 클래스로 구성되도록 한다.
		// 관리 클래스들은 각각에 대한 정보를 입력받을 클래스에 의존하는 구성이다.		
		
		// 메인 클래스
		// 고객관리, 이벤트 관리는 각각 하나의 객체만 만들어지고, 각 객체에 입력된 내용을 지속 사용해야한다.
		// 따라서, 반복문 밖에서 객체가 생성되며 클래스의 생성자를 비워둠으로써 객체 생성만 하고 반복문 안에서 참조하여 사용한다.
		// 객체는 하나만 생성되며, 하나의 객체만 참조되어 사용된다.
		Customer_management Cm = new Customer_management();
		Event_management Em = new Event_management();
		Scanner in = new Scanner(System.in);
		while(true) {
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
