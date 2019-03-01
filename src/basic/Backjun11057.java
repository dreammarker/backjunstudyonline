package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjun11057 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int d[][] = new int [n+1][10];
		long mod = 10007;
		for(int i=0;i<=9;i++) {
			d[1][i] = 1; //자리수가 하나일때 뒷자리가i 일때 
		}
		//2~n자리수 만큼
		for(int i=2;i<=n;i++) {
			for(int j=0;j<=9;j++) {
				for(int k=0;k<=j;k++) {
					d[i][j]+=d[i-1][k];
					d[i][j]%=mod;
				}
			}
		}
		long ans = 0;
		for(int i=0;i<10;i++) ans += d[n][i];
		ans%=mod;
		System.out.println(ans);
	}
}
