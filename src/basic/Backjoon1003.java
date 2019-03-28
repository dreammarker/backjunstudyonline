package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjoon1003 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = new Integer(br.readLine());
		int dp[][] = new int [2][41];
		dp[0][0]=1;
		dp[0][1]=0;
		dp[1][0]=0;
		dp[1][1]=1;
		dp[0][2]=1;
		dp[1][2]=1;
		for(int i=3;i<41;i++){
			dp[0][i]=dp[0][i-1]+dp[0][i-2];
			dp[1][i]=dp[1][i-1]+dp[1][i-2];
		}
		while(n-->0){
			int n1 = new Integer(br.readLine());
			bw.write(dp[0][n1]+" "+dp[1][n1]+"\n");
		}
		bw.close();
		
	}

}
