package __08Method;

import java.util.Scanner;

public class Method_main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Method_test t = new Method_test();
		System.out.println(t.name);
		t.setName("hong");
		System.out.println(t.name);
		System.out.println(t.getName());
		String resultName = t.getName2(in.nextLine());
		if(resultName!=null) {
			System.out.println(resultName);
		} else {
			System.out.println("비번틀림");
		}
		System.out.println(t.maskName("***"));
	}

}
