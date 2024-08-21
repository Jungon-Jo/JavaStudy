package testpm.test_10;

import java.util.Random;

public class project {

	public static void main(String[] args) {
		Arr a = new Arr();
		Random r = new Random();
		int num = 0;
		String Q = "";
		for (int i = r.nextInt(a.arr.length); i < a.arr.length;) {
			num = r.nextInt(10);
			Q = num + a.arr[i];
			break;
		}
		System.out.println(Q);
	}

}
