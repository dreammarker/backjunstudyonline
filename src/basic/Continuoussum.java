package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Continuoussum {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num[] = new int [n];
		int dp[] = new int [n];
		for(int i=0;i<n;i++){
			num[i] = new Integer(st.nextToken());
		}
		dp[0] = num[0];
		int max = num[0];
		for(int i=1;i<n;i++){
		
			if(dp[i-1]+num[i]>num[i])
				dp[i] = dp[i-1]+num[i];
			else
				dp[i] = num[i];
		
			max=Math.max(max, dp[i]);
		}
		System.out.println(max);
	}

}
