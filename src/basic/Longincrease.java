package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Longincrease {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = new Integer(br.readLine());
		int num[] = new int [n];
		int dp[] = new int [n];
		for(int i=0;i<n;i++) {
			num[i] = new Integer(st.nextToken());
		}
		dp[0] =1;
		for(int i=1;i<n;i++) {
			int min = 0;
			for(int j=0;j<i;j++) {
				if(num[i] > num[j]) {
					
					
				}
			}
		}
		
	}

}
