package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 백준190401타일 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int dp[] = new int [n];
		dp[0] = 1;
		dp[1] =2;
		for(int i=2;i<n;i++) {
			dp[i] = (dp[i-1]+dp[i-2])%15746;
		}
		System.out.println(dp[n-1]);
	}
	
}
