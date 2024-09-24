package testpm.test_15.tr;

import java.util.Scanner;

public class EventAdmin {
	EventOne[] elist = new EventOne[5];
	
	EventAdmin() {
		
	}
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1. 이벤트 등록");
			System.out.println("2. 이벤트 보기");
			System.out.println("3. 이전 메뉴");
			int num = in.nextInt();
			in.nextLine();
			if(num == 1) {
				addEvent();
			} else if(num == 2) {
				allListEvent();
			} else if(num == 3) {
				break; // while문 종료
			}
		}
		
	}
	private void allListEvent() {
		for(int i = 0; i < elist.length; i++) {
			if(elist[i] != null) {
				elist[i].prt();
			}
		}
	}
	private void addEvent() {
		Scanner in = new Scanner(System.in);
		EventOne temp = new EventOne();
		System.out.println("아이디를 입력하세요");
		String title = in.nextLine();
		temp.title = title;
		System.out.println("이름을 입력하세요");
		String memo = in.nextLine();
		temp.memo = memo;
		
		for(int i = 0; i < elist.length; i++) {
			if(elist[i] == null) {
				elist[i]=temp;
				break;
			}
		}
	}
	
	public EventOne[] getEvent() {
		
		return elist;
	}
}
