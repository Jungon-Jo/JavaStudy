package project_02;

import java.util.ArrayList;

public class guestCarList {
	ArrayList<ArrayList> guestCarList = new ArrayList<>();
	Car car = null;
	guestCarList() {
		
	}
	public void list(int classificationNum) {
		if(classificationNum == 2) {
			car = new Car();
			guestCarList.add(car.carType(classificationNum));
		}
	}
}
