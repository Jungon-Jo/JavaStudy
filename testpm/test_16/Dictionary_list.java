package testpm.test_16;

import java.util.ArrayList;

public class Dictionary_list {
	Dictionary_enroll enroll = null;
	ArrayList<Dictionary_enroll> list = new ArrayList<>();
	Dictionary_list() {
		
	}
	public void list(Dictionary_enroll enroll) {
		list.add(enroll); 
		
//		for(int i = 0; i < list.size(); i++) {
//			prt(i);
//		}
//		return list;
	}
	public Dictionary_enroll enroll() {
		enroll = new Dictionary_enroll();
		return enroll;
	}
	public void prt(int i) {
		System.out.println("--------------");
		System.out.println(list.get(i).word);
		System.out.println("--------------");
	}
}
//for(int i = 0; i < list.size(); i++) {
//	System.out.println("--------------");
//	System.out.println(list.get(i).word);
//	System.out.println("--------------");
//}