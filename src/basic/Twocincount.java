package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Twocincount {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		long dp[] = new long [91];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<=90;i++){
			dp[i] = dp[i-1]+dp[i-2];
		}
		System.out.print(dp[n-1]);
	}

}
