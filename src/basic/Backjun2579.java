package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjun2579 {
	static int dp[] = new int [301];
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
	}

}
