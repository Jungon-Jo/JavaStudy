package __13Exception;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MemberAdmin {
	MemberOne[] m = new MemberOne[5];
	
	MemberAdmin() throws Exception {
//		System.out.println(m[0]);
//		System.out.println(m[1].getId());
//		System.out.println(m[2]);
//		System.out.println("close");
//		test(); // 예외처리 해 줘야 하는 경우와 직접 처리
		test1(); // 예외처리를 안해줘도 되는데 해본 코드
		test2();
	}
	private void test() { // 예제는 예외처리를 반드시 해 줘야 한다.
						  // 예외처리 방법은 직접처리 > try catch finally
		try {
			// jvm 에 있는 클래스를 이용하여, 하드디스크에 txt파일을 생성
			File file = new File("Output.txt");
			// 코드 상 빨간줄은 에러가 있다라는 의미
			// 위의 코드같은 경우 에러를 해결하기위해 예외처리를 반드시 해줘야 한다
			FileWriter writer;
			// try/catch 구문은 "직접 예외처리"하는 구문
			// try block 은 예외가 발생할 코드를 작성한다.(예외를 감지하는 구문)
			// 예외가 발생하면 "더 이상 코드를 실행하지 않고" catch block 으로 이동
			writer = new FileWriter(file);
		} catch (IOException e) {
			// catch 소괄호 안의 예외가 발생 했을 때 처리해주는 block
			e.printStackTrace();
		} finally {
			// try 구문을 빠져 나갈 때, 실행 되는 block/ 예외 발생 여부 상관없이 실행
			// finally 구문은 없어도 try/catch 구문은 실행되는데 지장이 없다
		}
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
	}
	private void test1() {
		MemberOne[] mm = new MemberOne[5];
		try {
			System.out.println("1");
			System.out.println(mm[0]);
			System.out.println("2");
			// 참조할 대상이 없어서 예외가 발생하게 된다.
			System.out.println(mm[1].getId());
			System.out.println("정상종료");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생 1");
		} catch(Exception e) {
			System.out.println("예외발생 2");
		} finally {
			System.out.println("finally block");
		}
		// 1
		// null
		// 2
		// 예외발생 2
		// finally block
	}
	private void test2() throws Exception {
		File file = new File("Output.txt");
		FileWriter writer = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
			
	}
}
