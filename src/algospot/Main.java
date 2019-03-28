package algospot;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int dp[][] = new int [n+1][2];
		int dp1[] = new int [n+1];
		int stair[] = new int [n+1];
		for(int i=0;i<n;i++){
			stair[i] = new Integer(br.readLine());
		}
		
		dp1[0]=stair[0];
		dp1[1]=Math.max(stair[0]+stair[1],stair[1]);
		dp1[2]=Math.max(stair[1]+stair[2], stair[0]+stair[2]);
		for(int i=3;i<n;i++){
			dp1[i] = Math.max(dp1[i-2]+stair[i], dp1[i-3]+stair[i-1]+stair[i]);
		}
		System.out.println(dp1[n-1]);
		
		
		
/*		dp[0][0] = stair[0];
		dp[1][0] = dp[0][0]+stair[1];
		dp[1][1] = stair[1]; 
		for(int i=2;i<n;i++){
			//한칸올를떈 그전에 두칸올랐을때만 가능
			dp[i][0] = dp[i-1][1]+stair[i];
			//두칸을 올랐을때 그전엔 두칸을 올랏거나 한칸올랏을때 둘다가능
			dp[i][1] =  Math.max(dp[i-2][1]+stair[i], dp[i-2][0]+stair[i]);
		}
		System.out.print(Math.max(dp[n-1][0],dp[n-1][1]));*/
		
	}

}
