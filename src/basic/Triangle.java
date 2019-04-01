package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Triangle {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int dp [][] = new int [n][n];
		int tri [][] = new int [n][n];
		for(int i=0;i<n;i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<=i;j++){
				tri[i][j] = new Integer(st.nextToken());
			}
		}
		
		dp[0][0] = tri[0][0];
		for(int i=1;i<n;i++){
			for(int j=0;j<=i;j++){
				//완전 왼쪽
				if(j==0){
					dp[i][j]+=dp[i-1][j]+tri[i][j];
				}
				//완전오른쪽
				else if(i==j){
					dp[i][j]+=dp[i-1][j-1]+tri[i][j];
				}
				else{
					dp[i][j]+=Math.max(dp[i-1][j-1], dp[i-1][j])+tri[i][j];
				}
			}
		}
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
			max=Math.max(max, dp[n-1][i]);
/*		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}*/
		System.out.println(max);
	}

}
