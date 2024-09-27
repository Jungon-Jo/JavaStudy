package project_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Host {
	ArrayList<String> hostInfo = null;
	String[] ref = {"동 : ", "호 : ", "이름 : ", "차량 정보 : "};
	Host() {
		
	}
	public ArrayList hostAdd() {
		Scanner in = new Scanner(System.in);
		hostInfo = new ArrayList<>();
		System.out.println("동호수, 이름, 비밀번호를 입력 후, 차량 정보를 입력해 주세요");
		System.out.println("동 : ");
		hostInfo.add(in.nextLine());
		System.out.println("호 : ");
		hostInfo.add(in.nextLine());
		System.out.println("이름 : ");
		hostInfo.add(in.nextLine());
		System.out.println("비밀번호 : ");
		hostInfo.add(in.nextLine());
		return hostInfo;
	}
}
