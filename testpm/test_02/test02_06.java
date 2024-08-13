package testpm.test_02;

public class test02_06 {

	public static void main(String[] args) {
		System.out.println("문제 7");
		int money = 2750;
		int pay = 10000;
		int rest = pay - money;
		int[] restArr = new int[3];
		restArr[0] = (rest/1000);
		restArr[1] = (rest/100) - (rest/1000)*10;
		restArr[2] = (rest/10) - (rest/100)*10;
		System.out.println("천원 : " + restArr[0] + " 개, 백원 : " + restArr[1] + " 개, 십원 : " + restArr[2] + " 개");
	}

}
