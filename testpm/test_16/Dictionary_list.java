package testpm.test_16;

import java.util.ArrayList;

public class Dictionary_list {
	Dictionary_enroll enroll = null;
	ArrayList<Dictionary_enroll> list = new ArrayList<>();
	Dictionary_list() {
		
	}
	public ArrayList<Dictionary_enroll> list() {
		enroll = new Dictionary_enroll();
		list.add(enroll); 
		
		prt(0);
		return list;
	}
	public void prt(int i) {
		System.out.println("--------------");
		System.out.println(list.get(i).word);
		System.out.println("--------------");
	}
}
