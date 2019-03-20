package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjun14501 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int T[] = new int [n+10];
		int P[] = new int [n+10];
		int dp[] = new int [n+10];
		int max =0;
		for(int i=1;i<=n;i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			T[i] = Integer.parseInt(st.nextToken()); //걸리는 일수
			P[i] = Integer.parseInt(st.nextToken()); //수당
		}
		
		for(int i=1;i<=n+1;i++){
			dp[i] = Math.max(max, dp[i]);
			//걸리는 일수에따른 금액 기존에있는 금액이랑 수당플러스 기존에있던금액
			dp[T[i]+i] = Math.max(dp[T[i]+i], P[i]+dp[i]); //이전에 저장된 최대수익 + 이번 움직임으로 생긴 최대 수익
			//출력될 최대 수입
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}
}
