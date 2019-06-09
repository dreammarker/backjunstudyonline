package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 백준1965상자넣기 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int num[] = new int [count+1];
		for(int i=1;i<=count;i++) {
			num[i] = sc.nextInt();
		}
		int dp[] = new int [count+1];
		int max=0;
		for(int i=1;i<=count;i++) {
			dp[i] = 1;
			for(int j=1;j<i;j++) {
				if(num[j]<num[i]&&dp[i]<dp[j]+1) {
					dp[i] = dp[j] +1;
				}
			}
			if(max<dp[i]) {
				max = dp[i];
			}
		}
		System.out.println(max);
		sc.close();
	}

}
