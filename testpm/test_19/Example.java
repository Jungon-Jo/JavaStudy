package testpm.test_19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Example {

	public static void main(String[] args) {
		try {
			// 사용할 파일 파일 생성
			File file = new File("Output.txt");
			FileWriter writer = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write(" i love you \n i like you");
			bufferedWriter.write(" my test");
			// flush : bufferedWriter 에 write(method) 로 작성한 데이터를 생성한 파일로 전송
			bufferedWriter.flush();
			// close : bufferedWriter 종료
			bufferedWriter.close();
		} catch(Exception e) {
			e.getStackTrace();
		}
		
		try {
			File file = new File("Output.txt");
			FileWriter writer = new FileWriter(file, true);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write(" human");
			bufferedWriter.flush();
			bufferedWriter.close();
		} catch(Exception e) {
			e.getStackTrace();
		}
		
		try {
			File file = new File("Output.txt");
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

}
