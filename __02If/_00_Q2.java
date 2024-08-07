package __02If;

public class _00_Q2 {

	public static void main(String[] args) {
		String[] name = {"John", "Amy", "Harry"};
		int[] idCode = {20140809, 20160328, 20111211};
		int[] age = {18, 15, 24};
		int[] score = {90, 70, 60};
		String[] grade = new String[3];
		
		for (int i = 0; i <= name.length - 1; i++) {
			if (age[i] >= 18) {
				if (score[i] >= 90) {
					grade[i] = "A";
				} else if (score[i] >= 80) {
					grade[i] = "B";
				} else if (score[i] >= 70) {
					grade[i] = "C";
				} else if (score[i] >= 60) {
					grade[i] = "D";
					name[i] += "*";
				} else {
					grade[i] = "F";
				}
			} else {
				grade[i] = "Null";
			} System.out.println(name[i]+"/"+idCode[i]+"/"+age[i]+"/"+score[i]+"/"+grade[i]);
		}
	}

}
