package testpm.test_14.tr;

public class T_main {

	public static void main(String[] args) {
		// T_center를 의존하기 때문에 변수가 필요
//		T_center tcenter = null; // 의존관계는 확인할 수 있으나, 참조가 불가능한 상태이다. 주소값이 null 이므로
		T_center tcenter = new T_center(); // T_main 클래스가 T_center 객체를 직접 생성하여 주소를 저장하고 있다.
		T_center tcenter1 = tcenter; // 객체의 주소를 주입받았다.
	}

}
