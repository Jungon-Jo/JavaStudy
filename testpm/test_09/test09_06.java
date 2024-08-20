package testpm.test_09;

import java.util.Scanner;

public class test09_06 {

	public static void main(String[] args) {
		// <이번 저희회사에서는 회원관리 프로젝트를 담당하게 되었습니다.
		// 회원관리 프로젝트 중 회원의 아이디 유효성 체크를 미션으로 드립니다>
		
		// 7
		// 키보드로 아이디를 입력 받는다.
		// 입력 받은 아이디에 특수문자가 포함되었는지 확인한다. (유효성)
		// 특수문자는 String sign="!@#$%^&*"로 정의한다.
		// 특수문자가 몇 개 포함되었는지 출력합니다. 
		Scanner in = new Scanner(System.in);
		String specialCode = "!@#$%^&*";
		int cnt = 0; // 특수문자의 갯수를 저장하기위한 변수
		for (;;) { 
			String id = in.next();
			in.nextLine();
			for (int i = 0; i < id.length(); i++) {
				for (int j = 0; j < specialCode.length(); j++) {
					if (id.charAt(i) == specialCode.charAt(j)) {
						cnt++;
					}
				}
			}
			if (cnt > 0) {
				System.out.println("사용불가능한 id 입니다.(특수문자 '" + specialCode + "'가 " + cnt + " 개 포함되어 있습니다.)");
			} else {
				System.out.println("사용가능한 id 입니다.");
			}
			cnt = 0;
		}
	}

}
