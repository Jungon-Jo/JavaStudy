package testpm.test_14.tr;

import java.util.Scanner;

public class T_center {
	// 기차 여러대를 등록하고 보고 수정하는 역할
	// 기차 여려대를 관리하기 위해서 배열이라는 자료형을 선정
	// 의존하는 쪽에서 변수를 선언하여 객체를 참조해야 한다.(T_center라는 객체가 T-one이라는 객체를 의존하고 있다.)
	T_company infoT = new T_company();
	T_one[] tlist = new T_one[5];
	// 생성자가 없는것이 아니라 기본이 생략된 상태
	public T_center() { // 생략이 된 상태
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
		Scanner in = new Scanner(System.in);
		// 기차 시간을 추가
		// T_one 객체를 생성하고 기차번호와 시간을 입력
		T_one tempT = new T_one();
		System.out.println("기차번호를 입력하세요");
		tempT.tNum = in.nextLine();
		System.out.println("기차시간을 1203형식으로 입력");
		tempT.tTime = in.nextLine();
		// 배열의 빈칸에 저장, 빈칸은 배열의 값이 null
		for(int i = 0; i < tlist.length; i++) {
			if(tlist[i] == null) {
				tlist[i] = tempT;
				break;
			}
		}
	}
	private void mod() {
		System.out.println("수정할 기차 번호 입력");
		Scanner in = new Scanner(System.in);
		String modNum = in.nextLine();
		
		// 조건을 걸어본다. 기차 번호는 유니크 하다.
		for(int i = 0; i < tlist.length; i++) {
			String mnum = tlist[i].getTnum();
			// T_center가 T_one의 변수 값을 직접 가져오는 것이 아닌, T_one에게 부턱해서 받아오는것을 의미한다.
			if(mnum.equals(modNum)) {
				// 기차번호가 유니크 하다는 것은 뒤에 있는 기차 번호랑 중복될 수 없다는 것을 의미
				// 따라서, 바로 수정이 가능하다는 것을 의미한다.
				System.out.println("수정 시간입력");
				tlist[i].tTime=in.nextLine();
				break;
			}
		}
	}
	private void listAll() {
		for(int i = 0; i< tlist.length; i++) {
			if(tlist[i] != null) {
				tlist[i].prt();
			}
		}
	}
		
}
