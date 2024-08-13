package testpm.test_01;

public class test01_01 {

	public static void main(String[] args) {
		// 시나리오
		System.out.println("메모장 프로그램");
		String title = "나의 점심";
		String body = "오늘은 자장면";
		System.out.println(title);
		System.out.println(body);
		title = "점심메뉴";
		System.out.println(title);
		int view = 0;
		body = "짬뽕도 먹음";
		view = 10;
		System.out.println(title);
		System.out.println(body);
		System.out.println(view);
		
		// level up1
		body = body + " 탕수육도 먹음";
		// body += "탕수육도 먹음"
		// System.out.println(body);
		
	}

}
