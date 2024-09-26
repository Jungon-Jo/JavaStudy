package project_02;

import java.util.ArrayList;

public class userCarList {
	ArrayList<ArrayList> userCarList = new ArrayList<>();
	Car car = null;
	userCarList() {
		
	}
	public void list(int classificationNum) {
		if(classificationNum == 1) {
			car = new Car();
			userCarList.add(car.carType(classificationNum));
		}
	}
}
