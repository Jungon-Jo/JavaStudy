package testpm.test_16;

import java.util.Scanner;

public class Dictionary_menu {
	Scanner in = new Scanner(System.in);
	Dictionary_search DicS = null;
	Dictionary_list DicL = null;
	int selNum = 0;
	Dictionary_menu() {
		if(DicS == null) {
			DicS = new Dictionary_search();
		}
		if(DicL == null) {
			DicL = new Dictionary_list();
		}
		menu();
	}
	public void menu() {
		while(true) {
			System.out.println("영단어장");
			System.out.println("1. 검색");
			System.out.println("2. 등록");
			System.out.println("3. 단어장");
			System.out.println("원하는 기능의 번호를 입력하시오.");
			while(true) {
				System.out.println("선택 기능 >> ");
				selNum = in.nextInt();
				in.nextLine();
				if(selNum == 1) {
					if(DicL.list.isEmpty()) {
						System.out.println("등록된 단어가 없습니다. 단어를 먼저 등록해주세요.");
						break;
					} else {
						DicS.list = DicL;
						DicS.search();
						break;
					}
				} else if(selNum == 2) {
					DicL.list(DicL.enroll());
					break;
				} else if(selNum == 3) {
					if(DicL.list.isEmpty()) {
						System.out.println("등록된 단어가 없습니다. 단어를 먼저 등록해주세요.");
						break;
					} else {
						for(int i = 0; i < DicL.list.size(); i++) {
							DicL.prt(i);
						}
						break;
					}
				} else {
					System.out.println("유효하지 않은 값입니다. 다시 입력해주세요.");
				}
			}
		}
	}
}
