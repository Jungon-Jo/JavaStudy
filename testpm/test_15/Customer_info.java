package testpm.test_15;

public class Customer_info {
	String Cid = null;
	String Cname = null;
	Customer_info() {
		
	}
	public void setCid(String id) {
		Cid = id;
	}
	public void setCname(String name) {
		Cname = name;
	}
	public void prt() {
		System.out.print("ID : " + Cid + " / 이름 : " + Cname);
		System.out.println();
	}
}
