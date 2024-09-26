package testpm.test_16;

import java.util.Scanner;

public class Dictionary_search {
	Scanner in = new Scanner(System.in);
	Dictionary_list list = null;
	String search = null;
	Dictionary_search() {
	}
	public void search() {
		System.out.println("검색 단어를 입력하시오.");
		search = in.nextLine();
		result(search);
	}
	public void result(String search) {
		for(int i = 0; i < list.list.size(); i++) {
			System.out.println("--------------");
			System.out.println(list.list.get(i).word);
			System.out.println("--------------");
		}
		for(int i = 0; i < list.list.size(); i++) {
			if(search.equals(list.list.get(i).english.word)) {
				list.prt(i);
				break;
//				System.out.println(list.list.get(i));
			}
		}
//		for(int i = 0; i < list.list.size(); i++) {
//			if(search != list.list.get(i).english.word) {
//				System.out.println("입력한 단어에 대한 정보가 없습니다. 다시 검색해주세요.");
//				search();
//			}
//		}
		while(true) {
			System.out.println("1.검색 / 2.수정 / 3.삭제 / 4.메뉴");
			System.out.println("선택 기능 >> ");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				search();
				break;
			} else if(selNum == 2) {
				edit(search);
				break;
			} else if(selNum == 3) {
				delete(search);
				break;
			} else if(selNum == 4) {
				break;
			} else {
				System.out.println("유효하지 않은 값입니다. 다시 입력하세요.");
			}
		}
	}
	public void edit(String search) {
		
		for(int i = 0; i < list.list.size(); i++) {
			if(search.equals(list.list.get(i).english.word)) {
				list.list.set(i, list.enroll());
				break;
			}
		}
	}
	public void delete(String search) {
		for(int i = 0; i < list.list.size(); i++) {
			if(search.equals(list.list.get(i).english.word)) {
				list.list.remove(i);
				break;
			}
		}
	}
}
