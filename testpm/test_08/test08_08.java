package testpm.test_08;

public class test08_08 {

	public static void main(String[] args) {
		// 9. 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요 <이중For사용>
		String ttt = "aabbbcccaaaaddbbbaaaaa";
		String tunnelName = "abcd";
		int cnt = 1; // 터널의 길이 측정
		for (int i = 0; i < tunnelName.length(); i++) {
			cnt = 1;		
			int maxTunnelLength = 0;
			char maxTunnelName = ' ';
			for (int j = 0; j < ttt.length() - 1; j++) {
				if (tunnelName.charAt(i) == ttt.charAt(j)) {
					if (ttt.charAt(j) == ttt.charAt(j+1)) {
						cnt++;
						if (j == (ttt.length() - 2) && cnt > 1) {
							if (cnt > maxTunnelLength) {
								maxTunnelLength = cnt;
								maxTunnelName = tunnelName.charAt(i);
								cnt = 1;
							}
						}
					} else {
						if (cnt > maxTunnelLength) {
							maxTunnelLength = cnt;
							maxTunnelName = tunnelName.charAt(i);
							cnt = 1;
						}
					}
				}
			}
			System.out.println(maxTunnelName + "는 " + maxTunnelLength + "개");
		}

	}

}
