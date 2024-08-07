package testpm;

public class test02 {

	public static void main(String[] args) {
		System.out.println("--------------------------------------------------");
		System.out.println("문제 1");
		int[] a = new int[5];
		a[0] = 30;
		a[1] = 40;
		a[2] = 50;
		a[3] = 60;
		a[4] = 55;
		System.out.println(a[0] + "/" + a[1] + "/" + a[2] + "/" + a[3] + "/" + a[4]);
		System.out.println("--------------------------------------------------");
		System.out.println("문제 2");
		String[] lastName = new String[3];
		lastName[0] = "kim";
		lastName[1] = "lee";
		lastName[2] = "park";
		System.out.println(lastName[0] + "/" + lastName[1] + "/" + lastName[2]);
		System.out.println("--------------------------------------------------");
		System.out.println("문제 3");
		int[] lotto = {6, 12, 33, 4, 5, 26};
		System.out.println(lotto[2] + 2);
//		System.out.println(lotto[0]+"/"+lotto[1]+"/"+lotto[2]+"/"+lotto[3]+"/"+lotto[4]+"/"+lotto[5]);
		System.out.println("--------------------------------------------------");
		System.out.println("문제 4");
		int sum = 0;
		sum = lotto[0] + lotto[2] + lotto[4];
		System.out.println(sum);
		System.out.println("--------------------------------------------------");
		System.out.println("문제 5");
		lotto[1] += lotto[0];
		lotto[2] += lotto[1];
		lotto[3] += lotto[2];
		lotto[4] += lotto[3];
		lotto[5] += lotto[4];
		System.out.println(lotto[0]+"/"+lotto[1]+"/"+lotto[2]+"/"+lotto[3]+"/"+lotto[4]+"/"+lotto[5]);
		System.out.println("--------------------------------------------------");
		System.out.println("문제 6");
		System.out.println(lotto[3]%2 == 1);
		System.out.println("--------------------------------------------------");
		System.out.println("문제 7");
		int money = 2750;
		int pay = 10000;
		int rest = pay - money;
		int[] restArr = new int[3];
		restArr[0] = (rest/1000);
		restArr[1] = (rest/100) - (rest/1000)*10;
		restArr[2] = (rest/10) - (rest/100)*10;
		System.out.println("천원 : " + restArr[0] + " 개, 백원 : " + restArr[1] + " 개, 십원 : " + restArr[2] + " 개");
		System.out.println("--------------------------------------------------");
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
