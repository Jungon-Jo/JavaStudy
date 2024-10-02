package __08Method;

public class Method_test {
//	Method_test() {
//		
//	}
//	생성자 생략 가능
	
	// 이름뒤에 마스킹을 해주는 메서드 만들기
	// 호출할 때 문자열로 마스킹 문자를 지정하면, 
	// 이름뒤에 마스킹 문자를 연결하여 리턴한다. 
	// 메서드 명은 maskName
	public String maskName(String masking) {
		String maskingName = name+masking;
		return maskingName;
	}
	
	
	String name = null;
	public void setName(String n) {
		name=n;
	}
	public String getName() {
		return name;
	}
	public String getName2(String pwd) {
		if(pwd.equals("1111")) {
			return name;
		} else {
			return null;
		}
	}
}
