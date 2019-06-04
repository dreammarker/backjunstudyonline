package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 백준9507Generationsoftribbles {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = new Integer(br.readLine());
		for(int i=0;i<n;i++) {
			int num = new Integer(br.readLine());
			long dp[] = new long [num+1];
			if(num>=0)
			dp[0]  = 1;
			if(num>=1)
			dp[1]  = 1;
			if(num>=2)
			dp[2]  = 2;
			if(num>=3)
			dp[3]  = 4;
			if(num>=4)
			for(int j=4;j<=num;j++) {
				dp[j] = dp[j-4]+dp[j-3]+dp[j-2]+dp[j-1];
			}
			bw.write(dp[num]+"\n");
		}
		bw.close();
	}
}
