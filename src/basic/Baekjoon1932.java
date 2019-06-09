package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1932 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int num[][] = new int [n+1][n+1];
		int max = Integer.MIN_VALUE;
		//입력
		for(int i=1;i<=n;i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=i;j>=1;j--){
				num[i][j] = Integer.parseInt(st.nextToken());
				
				if(i==0){
					num[i][j] = num[i-1][j]+num[i][j];
				}
				else if(i==j){
					num[i][j] = num[i-1][j-1]+num[i][j];
				}
				else{
					num[i][j] = Math.max(num[i-1][j-1], num[i-1][j])+num[i][j];
				}
				if(max<num[i][j])
					max = num[i][j];
			}
		}
		System.out.println(max);
		
	}

}
