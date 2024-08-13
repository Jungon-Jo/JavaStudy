package testpm.test_06;

public class test06_06 {

	public static void main(String[] args) {
		System.out.println("문제6");
		String a ="23-56+45*2-56";
		String text = "";
		int result = 0;
		int cnt = 1;
		int presentValue = 0;
		for (int i=0; i<a.length(); i++) {
			if ((int)a.charAt(i) > 47) {
				text += a.charAt(i);
				cnt++;
				if (i == (a.length() - 1)) {
					presentValue = Integer.parseInt(text);
					if (a.charAt(i - (cnt - 1)) == '+') {
						result += presentValue;
						cnt = 1;
					} else if (a.charAt(i - (cnt - 1)) == '-') { 
						result -= presentValue;
						cnt = 1;
					} else if (a.charAt(i - (cnt - 1)) == '*') {
						result *= presentValue;
						cnt = 1;
					} else if (a.charAt(i - (cnt - 1)) == '/') {
						result /= presentValue;
						cnt = 1;
					}
				}
			} else if ((int)a.charAt(i) <= 47) {
				presentValue = Integer.parseInt(text);
				text = "";
				if (i > cnt) {
					if (a.charAt(i - cnt) == '+') {
						result += presentValue;
						cnt = 1;
					} else if (a.charAt(i - cnt) == '-') { 
						result -= presentValue;
						cnt = 1;
					} else if (a.charAt(i - cnt) == '*') {
						result *= presentValue;
						cnt = 1;
					} else if (a.charAt(i - cnt) == '/') {
						result /= presentValue;
						cnt = 1;
					}
				} else {
					result = presentValue;
					cnt = 1;
				} 
			}
		}
		System.out.println(result);
	}
}
