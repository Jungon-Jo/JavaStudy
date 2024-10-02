package testpm.test_18;

public class Menu {
	private static Menu menu = null;
	private Menu() {
		
	}
	public static Menu getInstance() {
		if(menu == null) {
			menu = new Menu();
		}
		return menu;
	}
	public void menu() {
		System.out.println("--- 수강신청 프로그램 ---");
		System.out.println("///관리자 모드///");
		System.out.println("1. 학생 관리 프로그램");
		System.out.println("2. 교과목 관리 프로그램");
		System.out.println("///학생 ");
		manageStudent Stu = manageStudent.getInstance();
		Stu.manageStu();
		
	}
}
