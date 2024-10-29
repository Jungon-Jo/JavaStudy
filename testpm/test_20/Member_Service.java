package testpm.test_20;

import java.util.Scanner;

public class Member_Service {
	Member_DAO mDAO = Member_DAO.getInstance();
	public void menu() {
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("1.등록 / 2.종료");
			int selNum = in.nextInt();
			in.nextLine();
			switch(selNum) {
			case 1: memberAdd(); break;
			case 2: flag = false; break;
			}
		}
	}
	private void memberAdd() {
		Scanner in = new Scanner(System.in);
		Member_DTO mDTO = new Member_DTO();
		System.out.println("등록 아이디 입력");
		String id = in.nextLine();
		mDTO.setId(id);
		System.out.println("등록 이름 입력");
		String name = in.nextLine();
		mDTO.setName(name);
		System.out.println("등록 주소 입력");
		String addr = in.nextLine();
		mDTO.setAddr(addr);
		System.out.println("등록 나이 입력");
		int age = in.nextInt();
		in.nextLine();
		mDTO.setAge(age);
		System.out.println("등록 포인트 입력");
		int point = in.nextInt();
		in.nextLine();
		mDTO.setPoint(point);
		mDAO.insert(mDTO);
		
	}
}
