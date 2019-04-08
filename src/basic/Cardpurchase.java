package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cardpurchase {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num[] = new int [n+1];
		int dp[] = new int [n+1];
		for(int i=1;i<=n;i++){
			num[i] = new Integer(st.nextToken());
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				dp[i] = Math.max(dp[i],dp[i-j]+num[j]);
			}
		}
		System.out.println(dp[n]);
		
	}

}
