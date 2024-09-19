package testpm.test_13;

public class Parking_carInfo {
	int carNum = 0;
	String ownerName = null;
	String ownerPhone = null;
	int parkingNum = 0;
	String paddedNumber = null;
	
	public void prt() {
		System.out.println("--- Car Information ---");
		System.out.print("Parking Number : " + parkingNum + " / ");
		System.out.print("Car Number : " + carNum + " / ");
		System.out.print("Owner Name : " + ownerName + " / ");
		System.out.print("Phone Number : " + ownerPhone);
		System.out.println();
	}
}
