package testpm.test_16;

public class Dictionary_enroll {
	Dictionary_English english = null;
	Dictionary_Korean korean = null;
	String word = null;
	Dictionary_enroll() {
		enroll();
	}
	public String enroll() {
		english = new Dictionary_English();
		korean = new Dictionary_Korean();
		word = english.word +" / " + korean.word;
		return word;
	}
}
