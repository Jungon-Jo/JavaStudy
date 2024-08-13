package testpm_06;

public class test06_special02 {

	public static void main(String[] args) {
		String a ="67/414/1/23/32/45/54/12/11/232";
		String text = "";
		int num = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != '/') {
				text += a.charAt(i);
				if (i == a.length() - 1) {
					num += Integer.parseInt(text);
				}
			} else {
				num += Integer.parseInt(text);
				text = "";
			}
		}
		System.out.println(num);
	}

}
