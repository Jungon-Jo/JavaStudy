package testpm.test_15;

public class Event_info {
	String Etitle = null;
	String Econtent = null;
	Event_info() {
		
	}
	public void setEtitle(String title) {
		Etitle = title;
	}
	public void setEcontent(String content) {
		Econtent = content;
	}
	public void prt() {
		System.out.print("이벤트 제목 : " + Etitle + " / 이벤트 내용 : " + Econtent);
		System.out.println();
	}
}
