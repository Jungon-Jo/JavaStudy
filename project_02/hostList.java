package project_02;

import java.util.ArrayList;
import java.util.Scanner;

public class hostList {
	Host host = null;
	ArrayList<ArrayList> hostList = new ArrayList<>();
	ArrayList<String> user = null;
	String[] ref = {"동 : ", "호 : ", "이름 : ", "차량 정보 : "};
	hostList() {
	}
	public void list() {
		hostList.add(hostAdd());
	}
	public ArrayList hostAdd() {
		Scanner in = new Scanner(System.in);
		user = new ArrayList<>();
		System.out.println("동호수, 이름, 비밀번호를 입력 후, 차량 정보를 입력해 주세요");
		System.out.println("동 : ");
		user.add(in.nextLine());
		System.out.println("호 : ");
		user.add(in.nextLine());
		System.out.println("이름 : ");
		user.add(in.nextLine());
		System.out.println("비밀번호 : ");
		user.add(in.nextLine());
		return user;
	}
	public void prt() {
		for(int i = 0; i < hostList.size(); i++) {
			for(int j = 0; j < hostList.get(i).size(); j++) {
				System.out.print(ref[j]);
				System.out.printf("%-10S", hostList.get(i).get(j));
			}
			System.out.println();
		}
	}
}
