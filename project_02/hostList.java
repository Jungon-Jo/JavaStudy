package project_02;

import java.util.ArrayList;
import java.util.Scanner;

public class HostList { 
	Host host = null;
	ArrayList<ArrayList> myHost = new ArrayList<>();
	String[] ref = {"동 : ", "호 : ", "이름 : ", "차량 정보 : "};
	HostList() {
	}
	public ArrayList list() {
		host = new Host();
		myHost.add(host.hostAdd());
		return myHost;
	}
	public void prt() {
		for(int i = 0; i < myHost.size(); i++) {
			for(int j = 0; j < myHost.get(i).size(); j++) {
				System.out.print(ref[j]);
				System.out.printf("%-10S", myHost.get(i).get(j));
			}
			System.out.println();
		}
	}
}
