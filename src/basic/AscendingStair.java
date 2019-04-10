package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AscendingStair {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		long dp[][] = new long [n+1][10]; 
		for(int i=0;i<10;i++){
			dp[1][i] = 1;
		}
		for(int i=2;i<=n;i++){
			for(int j=0;j<10;j++){
				for(int k=0;k<=j;k++){
					dp[i][j]+=dp[i-1][k]; //dp[i][j] = dp[i-1][0] + dp[i-1][1] +... + dp[i-1][j]
				}
				dp[i][j] %=10007;
			}
		}
		
		int ans =0;
		for(int i=0;i<10;i++)
			ans+=dp[n][i];
		
		System.out.println(ans%10007);
	}

}
