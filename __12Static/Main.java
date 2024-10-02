package __12Static;

public class Main {
// public(접근제어자) static(공용변수) void(리턴타입) main(메서드명) String[] args(매개변수)
	public static void main(String[] args) {

		String name = Thread.currentThread().getName();
		// 스레드가 코드를 실행한다.
		// 현재 코드를 실행하는 스레드의 여러 정보 중, 스레드의 이름을 가져와라
		System.out.println(name+"스레드가 1초 뒤에 시작합니다");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		MemberAdmin m = new MemberAdmin();
		
		/*	새로운 스레드를 하나 만들어서 멀테스레드로 운용이 가능
		Thread t1 = new Thread();
		t1.setName("task1_thread");
		String tname = t1.getName();
		System.out.println("새로만든 스레드 이름은 " + tname);
		*/
		
		// static 변수는 공용변수, 위치는 Method Area
		// 모든 스레드가 공용해서 사용가능 → 즉, 변수값 접근 가능
		// 객체를 만들지 않고 클래스명과 변수 또는 메서드 명으로 접근
		String a = MemberAdmin.companyName;
		System.out.println(a);
		System.out.println(MemberAdmin.companyName);
		MemberAdmin.prt();
		MemberAdmin.companyName = "HOman";
		System.out.println(MemberAdmin.companyName);
		
		// 접근제어자와 공용변수의 관계
		// static 은 해당 변수를 공용으로 사용하겠다.
		// 하지만, 접근하는데 권하는 걸겠다.
		// 변수를 static 으로 설정하고 private 접근권한을 걸면 에러가 발생한다.
		// final 처음 값이 결정되면, 다음에 변경이 불가능함을 의미한다. → 상수값을 의미한다.
		// 변수의 값을 변경하지 못하도록 한다 → 상수값과 의미가 동일하므로 상수값이라 한다.
		
//		MemberAdmin mm = new MemberAdmin();
//		mm.companyName = "abc";
//		mm.name = "a";
//		// mm.teamName = "JoTeam";
//		// teamName 을 상수값으로 설정 하였기 때문에 변경이 불가능 하다.
//		MemberAdmin mmm = new MemberAdmin();
//		mmm.companyName = "kkk";
//		mmm.name = "b";
//		System.out.println(mm.companyName);
//		System.out.println(mm.name);
//		System.out.println(MemberAdmin.teamName);
		// 공용변수는 해당 접근권한을 가진 자들이 공유하는 것
		// 메모리를 같이 쓴다. 객체를 여러개 생성해도 변수를 하나만 선언하는것과 같다.
		// 공용 변수는 객체를 생성하지 않더라도 클래스를 참조하여 사용할 수 있는 변수를 의미한다.
//		final MemberAdmin m = new MemberAdmin();
//		m = new MemberAdmin();
	}
	public void jin() {
		System.out.println("이것봐라");
		
	}

}
