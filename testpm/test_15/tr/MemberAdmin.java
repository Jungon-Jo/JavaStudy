package testpm.test_15.tr;

import java.util.Scanner;

public class MemberAdmin {
	// 의존관계 설정, 중요한 것은 MemberOne 객체를 만든 것이 아니다.
	// MemberOne 객체의 주소값을 저장할 배열(길이 5)를 생성한 것이다.
	// 배열도 객체입니다.. mlist는 참조변수이고 MemberOne객체의 주소를 
	// 저장한 배열의 주소를 저장하고 있다.
	MemberOne[] mlist = new MemberOne[5];
	EventAdmin eam = null;
	
	MemberAdmin() {
		
	} 
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1. 고객 등록");
			System.out.println("2. 전체 보기");
			System.out.println("3. 진행 중인 이벤트 보기");
			System.out.println("4. 이전 메뉴");
			int num = in.nextInt();
			in.nextLine();
			if(num == 1) {
				addUser();
			} else if(num == 2) {
				allListUser();
			} else if (num == 3) {
				allEventList();
			} else if(num == 4) {
				break; // while문 종료
			}
		}
		
	}
	private void allEventList() {
		for(int i = 0; i < eam.elist.length; i++) {
			if(eam.elist[i] != null) {
				eam.elist[i].prt();
			}
		}
	}
	public boolean duplexIDcheck(String id) {
		for(int i = 0; i < mlist.length; i++) {
			if(mlist[i]!=null) {
				if(mlist[i].id.equals(id)) {
					return true;
					// return을 만나면 함수가 종료되고
					// 호출부로 이동된다. break 필요 없음 
				}
			}
		}
		return false;
	}
	
	
	private void allListUser() {
		for(int i = 0; i < mlist.length; i++) {
			if(mlist[i] != null) {
				mlist[i].prt();
			}
		}
	}

	private void addUser() {
		Scanner in = new Scanner(System.in);
		MemberOne temp = new MemberOne();
		System.out.println("아이디를 입력하세요");
		String id = in.nextLine();
		if(duplexIDcheck(id)) {
			
		} else {
			temp.id = id;
			System.out.println("이름을 입력하세요");
			String name = in.nextLine();
			temp.name = name;
			
			for(int i = 0; i < mlist.length; i++) {
				if(mlist[i] == null) {
					mlist[i]=temp;
					break;
				}
			}
		}
	}
}
