package testpm.test_19;

import java.util.Scanner;

public class VocabularyAdd {
	public String voca = null;
	public String mean = null;
	VocabularyAdd() {
		
	}
	public void add() {
		Scanner in = new Scanner(System.in);
		System.out.println("등록할 영어단어를 입력하시오.");
		voca = in.nextLine();
		System.out.println("영어단어의 뜻을 입력하시오.");
		mean = in.nextLine();
	}
}

