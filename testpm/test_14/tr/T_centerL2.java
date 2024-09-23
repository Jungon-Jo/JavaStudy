package testpm.test_14.tr;

import java.util.Scanner;

public class T_centerL2 {
	T_company infoT = null;
	T_oneL2[] tlist = new T_oneL2[5];
	public T_centerL2() { // 생략이 된 상태
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1. 등록");
			System.out.println("2. 수정");
			System.out.println("3. 전체 보기");
			System.out.println("4. 종료");
			System.out.println("메뉴 선택 >> ");
			int selNum = in.nextInt();
			in.nextLine();
			
			if(selNum == 1) {
				add();
			} else if(selNum == 2) {
				mod();
			} else if(selNum == 3) {
				listAll();
			} else if(selNum == 4) {
				break;
			}
		}
	}
	private void add() {
		
	}
	private void mod() {
		// TODO Auto-generated method stub
	}
	private void listAll() {
		// TODO Auto-generated method stub
	}
}
