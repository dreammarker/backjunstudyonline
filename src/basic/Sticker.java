package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Sticker {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = new Integer(br.readLine());
		while(n-->0){
			int m = new Integer(br.readLine());
			int arr[][] = new int [3][m+1];
			for(int i=1;i<3;i++){
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j=1;j<m+1;j++){
					arr[i][j] = new Integer(st.nextToken()); 
				}
			}
			int dp[][] = new int [3][m+1];
			dp[1][1] = arr[1][1];
			dp[2][1] = arr[2][1];
				for(int j=2;j<m+1;j++){
					dp[1][j] = Math.max(dp[2][j-1], dp[2][j-2])+arr[1][j];
					dp[2][j] = Math.max(dp[1][j-1], dp[1][j-2])+arr[2][j];
				}
			bw.write(Math.max(dp[1][m], dp[2][m])+"\n");
		}
		bw.close();
	}

}
