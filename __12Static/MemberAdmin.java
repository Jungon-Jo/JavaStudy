package __12Static;

public class MemberAdmin {

	public String name = null;
	public static String companyName = "Human";
	public static final String teamName = "KimTeam";
	
	static void prt() {
		System.out.println(companyName);
	}
	MemberAdmin() {
		String name = Thread.currentThread().getName();
		System.out.println(name + "스레드가 MemberAdmin" + "생성자 실행");
//		public MemberAdmin a = new MemberAdmin();
	}

	public static void prt1() {
		Main main = new Main();
		main.jin();
		
	}
	
}
