package testpm.test_18;

import java.util.ArrayList;
import java.util.Scanner;

public class manageSubject {
	public static ArrayList<Subject> subjectList = new ArrayList<>();
	private static manageSubject manageSub = null;
	private manageSubject() {
		
	}
	public static manageSubject getInstance() {
		if(manageSub == null) {
			manageSub = new manageSubject();
		}
		return manageSub;
	}
	public void manageSub() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("--- 교과목 관리 프로그램 ---");
			System.out.println("1. 교과목 등록");
			System.out.println("2. 교과목 삭제");
			System.out.println("3. 교과목 조회");
			System.out.println("4. 이전 메뉴로 돌아가기");
			System.out.println("필요한 메뉴의 번호를 입력하시오.");
			System.out.println("선택 번호 >> ");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				addSub();
			} else if(selNum == 2) {
				deleteSub();
			} else if(selNum == 3) {
				totalInfoInquiry();
			} else if(selNum == 4) {
				break;
			} else {
				System.out.println("유효하지 않은 입력값입니다. 다시 입력해주세요.");
				continue;
			}
		}
	}
	private void addSub() {
		Scanner in = new Scanner(System.in);
		Subject subjectInfo = new Subject();
		while(true) {
			System.out.println("등록할 과목명을 입력해주세요.");
			subjectInfo.subName = in.nextLine();
			int count = 0;
			for(int i = 0; i < subjectList.size(); i++) {
				if(subjectInfo.subName.equals(subjectList.get(i).subName)) {
					count++;
					break;
				}
			}
			if(count == 0) {
				while(true) {
					System.out.println("강의실 호수(3자리 숫자)를 입력해주세요.");
					subjectInfo.classRoom = in.nextLine();
					if(subjectInfo.classRoom.length() != 3) {
						System.out.println("유효하지 않은 입력값입니다. 다시 입력해주세요.");
					} else {
						break;
					}
				}
				System.out.println("담당 교수님 성함을 입력해주세요.");
				subjectInfo.subPro = in.nextLine();
				break;
			} else {
				System.out.println("과목명이 중복되었습니다. 다시 입력해주세요.");
				subjectInfo.subName = null;
			}
		}
		subjectList.add(subjectInfo);
		System.out.println("등록이 완료되었습니다. ============================");
	}
	private void deleteSub() {
		Scanner in = new Scanner(System.in);
		System.out.println("삭제를 원하시는 교과의 과목명을 입력해주세요.");
		System.out.println("과목명 입력 >> ");
		String subName = in.nextLine();
		for(int i = 0; i < subjectList.size(); i++) {
			if(subjectList.get(i).subName.equals(subName)) {
				subjectList.remove(i);
			}
		}
	}
	private void totalInfoInquiry() {
		for(int i = 0; i <subjectList.size(); i++) {
			subjectList.get(i).prt();
			System.out.println();
		}
	}
}
