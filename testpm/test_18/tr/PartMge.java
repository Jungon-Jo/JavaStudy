package testpm.test_18.tr;

import java.util.ArrayList;
import java.util.Scanner;

// 교과목 관리 추상화 클래스
public class PartMge {
	private ArrayList<Part> plist = new ArrayList<>();
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1. 등록");
			System.out.println("3. 전체 보기");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				add();
			} else if(selNum == 2) {
				list();
			} else {
				break;
			}
		}
	}
	public void add() {
		Scanner in = new Scanner(System.in);
		Part newTemp = new Part();
		System.out.println("과목명 입력");
		String partName = in.nextLine();
		newTemp.setPartName(partName);
		plist.add(newTemp);
	}
	public ArrayList<Part> getPlist() {
		return plist;
	}
	public void list() {
		
	}
}
