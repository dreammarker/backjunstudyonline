package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjun10844 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int d[][] = new int [count+1][10];
		long mod = 1000000000;
		for(int i=1;i<=9;i++) d[1][i] =1;
		for(int i=2;i<=count;i++) {
			for(int j=0;j<=9;j++) {
				d[i][j] =0;
				if(j-1>=0) d[i][j] += d[i-1][j-1];
				if(j+1<=9) d[i][j] += d[i-1][j+1];
				d[i][j]%=mod;
			}
		}
		 long ans = 0;
		 for(int i=0;i<=9;i++) ans+=d[count][i];
		 ans%=mod;
		 System.out.println(ans);
	}

}
