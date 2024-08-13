package testpm.test_02;

public class test02_07 {

	public static void main(String[] args) {
		System.out.println("문제 8");
		int xA = 700;
		int yA = 500;
		int xB = 900;
		int yB = 300;
		int xC = 650;
		int yC = 150;
		int x = 0;
		int y = 0;
		boolean xValue = (xA <= xC + x && xC + x <= xB - 3);
		boolean yValue = (yB + 3 <= yC + y && yC + y <= yA);
		System.out.println(xValue == true && yValue == true);
	}

}
