package testpm.test_13;

import java.util.Scanner;

public class Parking_system {
	Scanner in = new Scanner(System.in);
	Parking_carInfo[] carList = new Parking_carInfo[7];
	Parking_system() {
		while(true) {
			System.out.println("Parking Manager");
			System.out.println("1. Enroll");
			System.out.println("2. List");
			System.out.println("3. Delete");
			System.out.println("4. Exit");
			System.out.println("Enter number of desired function >> ");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				enroll();
				System.out.println();
			} else if (selNum == 2) {
				showList();
				System.out.println();
			} else if (selNum == 3) {
				delete();
				System.out.println();
			} else if (selNum == 4){
				System.out.println();
				System.out.println("Thank you for using Ed Parking Management System");
			} 
			else {
				System.out.println();
				System.out.println("Invalid value. Enter again.");
			}
		}
	}
	public void enroll() {
		Parking_carInfo carInfo = new Parking_carInfo();
		for(;;) {
			System.out.println("Enter 4 digits of Car Number : ");
			carInfo.carNum = in.nextInt();
			in.nextLine();
			if(carInfo.carNum<10000) {
				carInfo.paddedNumber = String.format("%04d", carInfo.carNum);
				break;
			} else {
				System.out.println("Invalid value. Enter again.");
				continue;
			}
		}
		System.out.println("Enter Name of Owner : ");
		carInfo.ownerName = in.nextLine();
		System.out.println("Enter Phone Number of Owner : ");
		carInfo.ownerPhone = in.nextLine();
		for(int i = 0; i < carList.length; i++) {
			if(carList[i] == null) {
				carInfo.parkingNum = i+1;
				carList[i] = carInfo;
				break;
			}
		}
		
	}
	public void showList() {
		System.out.println("Parking Car List");
		for(int i = 0; i < carList.length; i++) {
			if(carList[i] != null) {
				System.out.print(carList[i].parkingNum + " " + carList[i].paddedNumber);
				System.out.println();
			}
		}
		System.out.println("Inquiry I/Exit E");
		String select = in.next();
		if(select == "I") {
			inquiry();
		} else if (select == "E") {
		}
	}
	
	public void inquiry() {
		System.out.println("Select Number for Inquiry Car Information >> ");
		int number = in.nextInt();
		in.nextLine();
		for(int i = 0; i < carList.length; i++) {
			if((number-1) == i) {
				carList[i].prt();
			} else {
				System.out.println("There is no information");
				break;
			}
			
		}
		System.out.println();
	}
	
	public void delete() {
		System.out.println("Select Number for Delete Car Information >> ");
		int number = in.nextInt();
		for(int i = 0; i < carList.length; i++) {
			if((number-1) == i) {
				carList[i] = null;
				break;
			}
		}
	}
}
