package __Object;

import java.util.Scanner;

// 고양이 관리를 위한 단일 책임을 부여함
public class Cat_manage {

	Cat_info[] catList = new Cat_info[5];
	Scanner in = new Scanner(System.in);
	Cat_manage(){
		while(true) {
			System.out.println("Cat List");
			System.out.println("1. Enroll");
			System.out.println("2. Delete");
			System.out.println("3. Edit");
			System.out.println("4. Show List");
			System.out.println("5. Exit");
			System.out.println("Enter >>");
			int selNum = in.nextInt();
			in.nextLine();
			System.out.println("Your select number is " + selNum);
			if(selNum == 1) {
				enroll();
			} else if (selNum == 2) {
				
			} else if (selNum == 3) {
				
			} else if (selNum == 4) {
				showList();
			} else if (selNum == 5) {
				break;
			}
		}
	}
	
	public void enroll() { // 메서드 정의
		System.out.println("Enroll Cat");
		// 새로운 고양이 만들기
		Cat_info cat = new Cat_info();
		System.out.println("Enter Cat Name : ");
		cat.name = in.nextLine();
		System.out.println("Enter Cat Age : ");
		cat.age = in.nextInt();
		
		for(int i = 0; i < catList.length; i++) {
			if(catList[i]==null) {
				catList[i]=cat;
				break;
			}
		}
	}
	public void showList() { // 메서드 정의
		System.out.println("Show List");
		for(int i = 0; i < catList.length; i++) {
			if(catList[i]!=null) {
				catList[i].prt();
			}
		}
	}
	
}
