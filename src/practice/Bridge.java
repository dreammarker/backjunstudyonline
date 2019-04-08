package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bridge {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = new Integer(br.readLine());
		for(int i=0;i<n;i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = new Integer(st.nextToken());
			int M = new Integer(st.nextToken());
			long dp[][] = new long [N+1][M+1];
			for(int a=0;a<=M;a++){
				dp[1][a] = a;
			}
			for(int a=1;a<=N;a++){
				//N
				for(int b=a;b<=M;b++){
				//B에다가
					for(int k=b;k>=a;k--){
						//반복해서 넣기
						dp[a][b]+=dp[a-1][k-1];
					}
				}
				
			}
			bw.write(dp[N][M]+"\n");
			
		}
		bw.close();
	}

}
