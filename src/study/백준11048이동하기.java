package study;

import java.util.Scanner;

public class 백준11048이동하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int num[][] = new int [m+1][n+1];
		//값 입력
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				num[i][j] = sc.nextInt();
			}
		}
		int dp[][] = new int [m+1][n+1];
//		dp[0][0] = num[0][0];
//		dp[1][0] = dp[0][0]+num[1][0];
//		dp[0][1] = dp[0][0]+num[0][1];
//		dp[1][1] = Math.max(dp[1][0]+num[1][1],dp[0][1]+num[1][1]);
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				int result = 0;
				result = Math.max(dp[i-1][j-1],Math.max(dp[i-1][j], dp[i][j-1]));
				dp[i][j] = result + num[i][j];
			}
		}
		
		System.out.println(dp[m][n]);
		sc.close();
		
	}

}
