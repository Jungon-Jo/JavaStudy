package testpm.test_19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
	VocabularyAdd vocaAdd = null;
	MainMenu() {
		try {
			File file = new File("Vocabulary.txt");
			FileWriter writer = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write("Vocabulary");
			bufferedWriter.flush();
			bufferedWriter.close();
		} catch(Exception e) {
			e.getStackTrace();
		}
	}
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			menuList();
			System.out.println("번호 입력 >> ");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				vocaList();
				while(true) {
					System.out.println("추가기능을 선택하세요.");
					System.out.println("1. 삭제 / 2. 수정 / 3. 종료");
					int addNum = in.nextInt();
					in.nextLine();
					if(addNum == 1) {
						vocaDel();
					} else if(addNum == 2) {
						vocaEdit();
					} else if(addNum == 3) {
						break;
					} else {
						System.out.println("유효하지 않은값입니다. 다시 입력해주세요.");
					}
				}
			} else if(selNum == 2) {
				vocaAdd();
			} else if(selNum == 3) {
				vocaSearch();
			} else if(selNum == 4) {
				break;
			} else {
				System.out.println("유효하지 않은값입니다. 다시 입력해주세요.");
			}
		}
	}
	private void vocaEdit() {
		Scanner in = new Scanner(System.in);
		try {
			File file = new File("Vocabulary.txt");
			FileReader file_reader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(file_reader);
			System.out.println("수정할 단어 입력");
			String searchVoca = in.nextLine();
				while(true) {
					String line = bufferedReader.readLine();
					if(line == null) {
						break;
					} else if(line.contains(searchVoca)) {
						System.out.println(line);
						line.replace(searchVoca, null);
						vocaAdd();
					}
				}
			bufferedReader.close();
		} catch(Exception e) {
			e.getStackTrace();
		}

	}
	private void vocaDel() {
		
	}
	private void menuList() {
		System.out.println("///영단어장///");
		System.out.println("1. 단어 조회");
		System.out.println("2. 단어 등록");
		System.out.println("3. 단어 검색");
		System.out.println("4. 영단어장 종료");
	}
	private void vocaList() {
		try {
			File file = new File("Vocabulary.txt");
			FileReader file_reader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(file_reader);
				while(true) {
					String line = bufferedReader.readLine();
					if(line == null) {
						break;
					}
					System.out.println(line);
				}
			bufferedReader.close();
		} catch(Exception e) {
			e.getStackTrace();
		}
	}
	private void vocaAdd() {
		vocaAdd = new VocabularyAdd();
		vocaAdd.add();
		try {
			File file = new File("Vocabulary.txt");
			FileWriter writer = new FileWriter(file, true);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write("\n" + vocaAdd.voca + " : " + vocaAdd.mean);
			bufferedWriter.flush();
			bufferedWriter.close();
		} catch(Exception e) {
			e.getStackTrace();
		}
	}
	private void vocaSearch() {
		Scanner in = new Scanner(System.in);
		try {
			File file = new File("Vocabulary.txt");
			FileReader file_reader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(file_reader);
			System.out.println("검색할 단어 입력");
			String searchVoca = in.nextLine();
				while(true) {
					String line = bufferedReader.readLine();
					if(line == null) {
						break;
					} else if(line.contains(searchVoca)) {
						System.out.println(line);
					}
				}
			bufferedReader.close();
		} catch(Exception e) {
			e.getStackTrace();
		}
	}
}
