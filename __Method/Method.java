package __Method;

public class Method {

	public static void main(String[] args) {
		Method_test m = new Method_test();
		
		// Method Study
		String a = "880104";
		System.out.println(a.substring(0,2));
		String year = a.substring(0,2);
		System.out.println(year);
		System.out.println("19" + year);
		
		// 다음 에러의 원인을 서술하시오.
//		int month = a.substring(2,4);
		// 변수의 자료형과 초기값에서 사용된 메서드의 리턴값의 자료형이 서로 상이하다.
		System.out.println(a.contains("8"));
		String w = "개나리";
		String title = "오늘 컨디션 참 개나리야 짜증!";
		if(title.contains(w)) {
			System.out.println("욕하지 마세요");
		} else {
			System.out.println("제목은 올바른 표현입니다.");
		}
		System.out.println(title.indexOf(w));
		
		// 과제 : 제목에서 개나리 부분을 ***으로 바꾸시오.
		System.out.println(title.replace("개나리","***"));
		// 과제 : 제목에서 개나리라는 단어가 포함된 부분을 가져오세요.(단어가 포함된 기준은 개나리 단어의 시작부터 스페이스까지)
		//		  위 샘플에서는 [개나리야]를 가져오는 겁니다.
		System.out.println(title.substring(title.indexOf(w),title.indexOf(" ",title.indexOf(w))));
	}

}
