package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGBroad {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int rgb [][] = new int [n][3];
		for(int i=0;i<n;i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<3;j++){
				rgb[i][j] = new Integer(st.nextToken());
			}
		}
		int dp[][] = new int [n][3];
		dp[0][0] = rgb[0][0];
		dp[0][1] = rgb[0][1];
		dp[0][2] = rgb[0][2];
		
		for(int i=1;i<n;i++){
			for(int j=0;j<n;j++){
				if(j==0)
					dp[i][0]=rgb[i][0]+Math.min(dp[i-1][1], dp[i-1][2]);
				else if(j==1)
					dp[i][1]=rgb[i][1]+Math.min(dp[i-1][0], dp[i-1][2]);
				else if(j==2)
					dp[i][2]=rgb[i][2]+Math.min(dp[i-1][1], dp[i-1][0]);
			}
		}
		System.out.println(Math.min(dp[n-1][0], Math.min(dp[n-1][1],dp[n-1][2])));
	}

}
