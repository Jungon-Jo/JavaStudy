package project_02;

import java.util.ArrayList;
import java.util.Scanner;

public class CarList {
	ArrayList<ArrayList> userCarList = new ArrayList<>();
	ArrayList<ArrayList> guestCarList = new ArrayList<>();
	Car car = null;
	HostList hostList = null;
	public void carType(int classificationNum, String pwd) {
		Scanner in = new Scanner(System.in);
		if(classificationNum == 1) {
			for(int i = 0; i < hostList.myHost.size(); i++) {
				if(hostList.myHost.get(i).contains(pwd)) {
					car = new Car();
					userCarList.add(car.carAdd(classificationNum, pwd));
				}
			}
		}
		if(classificationNum == 2) {
			for(int i = 0; i < hostList.myHost.size(); i++) {
				if(hostList.myHost.get(i).contains(pwd)) {
					car = new Car();
					guestCarList.add(car.carAdd(classificationNum, pwd));
				}
			}
		}
	}
	public void prt(int classificationNum) {
		if(classificationNum == 1) {
			for(int i = 0; i < userCarList.size(); i++) {
				System.out.println(userCarList.get(i));
			}
		}
		if(classificationNum == 2) {
			for(int i = 0; i < guestCarList.size(); i++) {
				System.out.println(guestCarList.get(i));
			}
		}
		if(classificationNum == 3) {
			for(int i = 0; i < userCarList.size(); i++) {
				System.out.println(userCarList.get(i));
			}
			for(int i = 0; i < guestCarList.size(); i++) {
				System.out.println(guestCarList.get(i));
			}
		}
	}

}
