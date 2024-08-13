package testpm_06;

import java.util.Arrays;

public class test06_submit {

	public static void main(String[] args) {
		System.out.println("문제0");
		int[] letter0 = {8, 12, 4, 13, 2, 14, 4, 5};
		for (int i = 0; i < letter0.length; i++) {
			if (letter0[i]%2==0) {
				System.out.println(letter0[i]);
			}
		}
		
		System.out.println("문제1");
		int maxLetter = 0;
		for (int i = 0; i < letter0.length; i++) {
			if (letter0[i] > maxLetter) {
				maxLetter = letter0[i];
			}
		}
		System.out.println(maxLetter);
		
		System.out.println("문제2");
		int[] letter2 = {8, 12, 4, 13, 25, 14, 4, 5};
		int maxLetterEven = 0;
		for (int i = 0; i < letter2.length; i++) {
			if (letter2[i]%2==0 && letter2[i] > maxLetterEven) {
				maxLetterEven = letter2[i];
			}
		}
		System.out.println("범인은 " + maxLetterEven + "입니다.");
		
		System.out.println("문제3");
		int[] letter3 = {8,12,3,13,1,14,3,4};
		String word ="gehoudfkimjnlvy";
		for (int i = 0; i < letter3.length; i++) {
			System.out.print(word.charAt(letter3[i]));
		}
		System.out.println(" ");
		
		System.out.println("문제4");
		int[] arr = {1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1};
		int size = 2;
		int building = 0;
		int cnt4 = 0;
		for (int i = 0; i < (arr.length - 1); i++) {
			if (arr[i]==0) {
				cnt4++;
				if (cnt4 == size) {
					building++;
					cnt4 = size - 1;
				}
			} else {
				cnt4 = 0;
			}
		}
		System.out.println(building);
		
		System.out.println("문제7");
		int[] A = {34,2,35,8,45,31};
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i+1] < A[i]) {
				A[i+1] = A[i];
			}
		}
		System.out.println(A[A.length - 1]);
		
		System.out.println("문제8");
		for (int i = 0; i < A.length; i++) {
			if (A[0] < A[i]) {
				A[0] = A[i];
			}
		}
		System.out.println(A[0]);
		
		System.out.println("특별1");
		String b = "6/4/3/2/5/1/4/5/6/7/8/9/1/2/3/4/5/6";
		int[] B = new int[10]; 
		for (int i = 0; i < b.length(); i += 2) {
			if (b.charAt(i) == '0') {
				B[0]++;
			} else if (b.charAt(i) == '1') {
				B[1]++;
			} else if (b.charAt(i) == '2') {
				B[2]++;
			} else if (b.charAt(i) == '3') {
				B[3]++;
			} else if (b.charAt(i) == '4') {
				B[4]++;
			} else if (b.charAt(i) == '5') {
				B[5]++;
			} else if (b.charAt(i) == '6') {
				B[6]++;
			} else if (b.charAt(i) == '7') {
				B[7]++;
			} else if (b.charAt(i) == '8') {
				B[8]++;
			} else if (b.charAt(i) == '9') {
				B[9]++;
			}
		}
		System.out.print(Arrays.toString(B));
	}

}
