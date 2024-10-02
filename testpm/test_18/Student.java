package testpm.test_18;

public class Student {
	public String id = null;
	public String registerNum = null;
	public String name = null;
	public String tel = null;
	public String grade = null;
	Student() {
		
	}
	public void prt() {
		System.out.print("아이디 : " + id);
		System.out.print(" / 비밀번호 : " + registerNum);
		System.out.print(" / 이름 : " + name);
		System.out.print(" / 전화번호 : " +tel);
		System.out.print(" / 학년 : " + grade);
		
	}
}
