package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 백준1309동물원 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = new Integer(br.readLine());
		int dp[][] = new int [num+1][3];
		dp[0][0] = 1;
		dp[0][1] = 1;
		dp[0][2] = 1;
		for(int i=1;i<num;i++) {
			dp[i][0] = (dp[i-1][0]+dp[i-1][1]+dp[i-1][2])%9901;
			dp[i][1] = (dp[i-1][0]+dp[i-1][2])%9901;
			dp[i][2] = (dp[i-1][0]+dp[i-1][1])%9901;
		}
		System.out.println((dp[num-1][0]+dp[num-1][1]+dp[num-1][2])%9901);
		
		
	}

}
