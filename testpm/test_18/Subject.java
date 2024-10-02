package testpm.test_18;

public class Subject {
	public String subName = null;
	public String classRoom = null;
	public String subPro = null;
	Subject() {
		
	}
	public void prt() {
		System.out.print("교과목 : " + subName);
		System.out.print(" / 강의실 : " + classRoom);
		System.out.print(" / 담당교수 : " + subPro);
	}
}
