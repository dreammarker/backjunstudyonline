package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LongIncrasesu {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int ans = 0;
		int n = new Integer(br.readLine());
		int num[] = new int [n];
		int dp[] = new int [n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++){
			num[i] = new Integer(st.nextToken());
		}
		for(int i=0;i<n;i++){
			dp[i] = 1;
			for(int j=0;j<=i;j++){
				if(num[i] >num[j]&&dp[i]<dp[j]+1){
				  dp[i] = dp[j]+1;	
				}
				ans =  Math.max(ans, dp[i]);
			}
		}
		System.out.println(ans);
	}

}
