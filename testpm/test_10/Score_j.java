package testpm.test_10;

public class Score_j {
	public static void Score(int[] noticeBoardInt, int renewalInt, String[] noticeBoardStr, String renewalStr, int presentScore, String id) {
		for (int i = 0; i < noticeBoardInt.length; i++) {
			for (int j = i; j < noticeBoardInt.length; j++) {
				if (presentScore > noticeBoardInt[j] && j != noticeBoardInt.length - 1) {
						renewalInt = noticeBoardInt[j];
						noticeBoardInt[j] = presentScore;
						noticeBoardInt[j+1] = renewalInt;
						renewalStr = noticeBoardStr[j];
						noticeBoardStr[j] = id;
						noticeBoardStr[j+1] = renewalStr;
						presentScore = 0;
				} else if (presentScore > noticeBoardInt[j] && j == noticeBoardInt.length - 1) {
					noticeBoardInt[j] = presentScore;
					noticeBoardStr[j] = id;
					presentScore = 0;
				}
				
			}
			System.out.println((i+1) + "위 : " + noticeBoardStr[i] + " / " + noticeBoardInt[i]);
		}
	}
}
