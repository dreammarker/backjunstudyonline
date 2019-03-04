package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjun2225 {
	public static long mod = 1000000000L;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n1[] = br.readLine().split(" ");
		int n = Integer.parseInt(n1[0]);
		int k = Integer.parseInt(n1[1]);
		long[][] d = new long[k+1][n+1];
		d[0][0] =1;
		for(int i=1;i<=k;i++) {
			for(int j=0;j<=n;j++) {
				for(int l=0;l<=j;l++) {
					d[i][j]+=d[i-1][j-l];
					d[i][j]%=mod;
				}
			}
		}
		System.out.println(d[k][n]);

	}

}
