package testpm_06;

public class test06_08 {

	public static void main(String[] args) {
		System.out.println("문제8");
		int[] A = {34,2,35,8,45,31};
		for (int i = 0; i < A.length; i++) {
			if (A[0] < A[i]) {
				A[0] = A[i];
				i = 0;
			}
		}
		System.out.println(A[0]);
		

	}
}
