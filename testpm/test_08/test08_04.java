package testpm.test_08;

public class test08_04 {

	public static void main(String[] args) {
		// 5. int[] a ={34,55,23,56,34,45,34};
		// 40보다 큰 수는 모두 몇개인가?
		int[] a ={34,55,23,56,34,45,34};
		int cnt = 0; // 수 카운팅
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 40) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
