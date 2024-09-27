package project_02;

import java.util.ArrayList;

public class userCarList_01 {
	
	Car_01 car = null;
	userCarList_01() {
		
	}
	public void userCarAdd(int classificationNum) {
		if(classificationNum == 1) {
			car = new Car_01();
			userCarList.add(car.carType(classificationNum));
		}
	}
}
