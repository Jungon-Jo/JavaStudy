package __07List;

import java.util.ArrayList;

public class _00_test {
	ArrayList<String> a = new ArrayList<>();
	public _00_test() {
		System.out.println("리스트의 길이 " + a.size());
		a.add("apple");
		System.out.println("리스트의 길이 " + a.size());
		a.add("banana");
		a.add("abc초콜릿");
		a.add("샌드"); 
		System.out.println("리스트의 길이 " + a.size());
		System.out.println(a.get(1));
		System.out.println(a);
		// System.out.println(a); → 단지 확인용이므로, 사용하지 않는것이 좋다.
		System.out.println("-------------");
		for(int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("-------------");
		for(int i = 0; i < a.size(); i++) {
			if(a.get(i).charAt(0) != 'a') {
				System.out.println(a.get(i));
			}
		}
		System.out.println("-------------");
		a.add(3, "쭈꾸미"); // 특정 인덱스에 값 추가(기존 값은 index 가 뒤로 밀린다.)
		for(int i = 0; i < a.size(); i++) {
			System.out.println(i + " : " + a.get(i));
		}
		System.out.println("-------------");
		a.remove(3); // 특정 인덱스 값 삭제(null 로 남지 않고 아래 인덱스가 위로 올라와 채운다.)
		for(int i = 0; i < a.size(); i++) {
			System.out.println(i + " : " + a.get(i));
		}
		System.out.println("-------------");
		a.set(1, "갑오징어"); // 특정 인덱스 값 변경
		for(int i = 0; i < a.size(); i++) {
			System.out.println(i + " : " + a.get(i));
		}
		System.out.println("-------------");
		a.clear(); // 리스트 전체 삭제
		System.out.println(a.size());
	}
}
