package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준11066파일합치기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n  =  new Integer(br.readLine());
		for(int i=0;i<n;i++) {
			int dp[][] = new int [502][502];
			int num = new Integer(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int fic [] = new int [num];
			int sum [] = new int [num];
 			for(int j=0;j<num;j++) {
				fic[j]=new Integer(st.nextToken());
				sum[j] = sum[j-1]+fic[j];	
 			}
 			
 			for(int a=1;a<num;a++) {
 				for(int b=a-1;b>0;b--) {
 					dp[b][a] = 999999999;
 					for(int s=b;s<=a;s++) {
 						dp[b][a] = Math.min(dp[b][a], dp[b][s]+dp[s+1][a]);
 						dp[b][a] += sum[a] - sum[b-1];
 					}
 				}
 				System.out.println(dp[1][num-1]);
 			}
		}
	}

}
