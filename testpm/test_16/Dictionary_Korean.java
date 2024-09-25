package testpm.test_16;

import java.util.Scanner;

public class Dictionary_Korean {
	Scanner in = new Scanner(System.in);
	String word = null;
	Dictionary_Korean() {
		System.out.println("영단어의 한글 뜻을 입력하시오.");
		word = in.nextLine();
	}
}
