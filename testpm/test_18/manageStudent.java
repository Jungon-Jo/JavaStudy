package testpm.test_18;

import java.util.ArrayList;
import java.util.Scanner;

public class manageStudent {
	public static ArrayList<Student> studentList = new ArrayList<>();
	private static manageStudent manageStu = null;
	private manageStudent() {
		
	}
	public static manageStudent getInstance() {
		if(manageStu == null) {
			manageStu = new manageStudent();
		}
		return manageStu;
 	}
	public void manageStu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("--- 학생 관리 프로그램 ---");
			System.out.println("1. 학생 정보 등록");
			System.out.println("2. 학생 정보 검색");
			System.out.println("3. 학생 정보 삭제");
			System.out.println("4. 전체 정보 조회");
			System.out.println("5. 이전 메뉴로 돌아가기");
			System.out.println("필요한 메뉴의 번호를 입력하시오.");
			System.out.println("선택 번호 >> ");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				addStu();
			} else if(selNum == 2) {
				searchStu();
			} else if(selNum == 3) {
				deleteStu();
			} else if(selNum == 4) {
				totalInfoInquiry();
			} else if(selNum == 5) {
				break;
			} else {
				System.out.println("유효하지 않은 입력값입니다. 다시 입력해주세요.");
				continue;
			}
		}
	}
	public void addStu() {
		Scanner in = new Scanner(System.in);
		if(studentList.size() < 10) {
			Student studentInfo = new Student();
			while(true) {
				System.out.println("사용하실 id를 입력해주세요.");
				studentInfo.id = in.nextLine();
				int count = 0;
				for(int i = 0; i < studentList.size(); i++) {
					if(studentInfo.id.equals(studentList.get(i).id)) {
						count++;
						break;
					}
				}
				if(count == 0) {
					while(true) {
						System.out.println("주민등록 앞 6자리를 입력해주세요.");
						studentInfo.registerNum = in.nextLine();
						if(studentInfo.registerNum.length() != 6) {
							System.out.println("유효하지 않은 입력값입니다. 다시 입력해주세요.");
						} else {
							break;
						}
					}
					System.out.println("이름을 입력해주세요.");
					studentInfo.name = in.nextLine();
					System.out.println("전화번호를 입력해주세요.");
					studentInfo.tel = in.nextLine();
					System.out.println("학년을 입력해주세요.");
					studentInfo.grade = in.nextLine();
					break;
				} else {
					System.out.println("id가 중복되었습니다. 다시 입력해주세요.");
					studentInfo.id = null;
				}
			}
			studentList.add(studentInfo);
			System.out.println("등록이 완료되었습니다. ============================");
		} else {
			System.out.println("학생 정보 입력란이 가득 찼습니다. 정보 추가를 원하실 경우 기존 정보를 삭제해주세요.");
		}
	}
	public void searchStu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("조회를 원하시는 학생의 이름을 입력하시오.");
			String stuName = in.nextLine();
			for(int i = 0; i < studentList.size(); i++) {
				if(studentList.get(i).name.equals(stuName)) {
					studentList.get(i).prt();
					System.out.println();
				}
			}
			System.out.println("다른 학생을 조회하고 싶으시다면 1번, 검색을 종료하고싶으시다면 1번을 제외한 번호를 입력해주세요.");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				continue;
			} else {
				System.out.println("검색을 종료합니다. ================================");
				break;
			}
			
		}
	}
	public void deleteStu() {
		Scanner in = new Scanner(System.in);
		System.out.println("삭제를 원하시는 아이디를 입력해주세요.");
		System.out.println("아이디 입력 >> ");
		String id = in.nextLine();
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).id.equals(id)) {
				studentList.remove(i);
			}
		}
	}
	public void totalInfoInquiry() {
		for(int i = 0; i < studentList.size(); i++) {
			studentList.get(i).prt();
			System.out.println();
		}
	}
}
