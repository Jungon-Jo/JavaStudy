package testpm.test_16;

import java.util.Scanner;

public class Dictionary_English {
	Scanner in = new Scanner(System.in);
	String word = null;
	Dictionary_English() {
		System.out.println("등록하려는 영어 단어를 입력하세요.");
		word = in.nextLine();
	}
}
