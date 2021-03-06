package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjun2579 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a[] =  new int [n+1];
		int d[][] =  new int [n+1][3];
		int e[]= new int [n+1];
		for(int i=1;i<=n;i++) {
			a[i]= Integer.parseInt(br.readLine());
		}
		//1개연속계단
		//2개연속계단
		//2차원 배열..
		d[1][1]=a[1];
		for(int i=2;i<=n;i++) {
			d[i][1]=Math.max(d[i-2][1], d[i-2][2])+a[i];
			d[i][2]=d[i-1][1]+a[i];
		}
		//1차원 배열
		e[1] = a[1];
		e[2] = a[1]+a[2];
		for(int i=3;i<=n;i++) {
			e[i]=Math.max(e[i-2]+a[i], e[i-3]+a[i]+a[i-1]);
		}
		System.out.println(e[n]);
		System.out.println(Math.max(d[n][1], d[n][2]));
/*	static int dp[] = new int [301];
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		int stair[] =  new int [count];
		//첫번쨰계단 dp는 최대값을 넣는 배열 stair은 문제에서 주어지는 점수를 저장한배열
		//마지막계단은 무조건 밟는다
		//일단세팅을...
		for(int i=0;i<count;i++) {
			stair[i] = Integer.parseInt(br.readLine());
		}
		dp[0] = stair[0];
		dp[1] = Math.max(stair[0]+stair[1], stair[1]);
		dp[2] = Math.max(stair[0]+stair[2],stair[1]+stair[2]);
		//마지막계단이랑 그전칸을 밟았을떄 dp[i-3]+stair[i-1]+stair[i] 마지막계단이랑 그전전을 밝앗을떄dp[i-2]+stair[i]
		for(int i=3;i<count;i++) {
			dp[i] = Math.max(dp[i-2]+stair[i], dp[i-3]+stair[i-1]+stair[i]);
		}
		
		System.out.println(dp[count-1]);
	}*/

	}
}
