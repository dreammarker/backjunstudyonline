package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 백준90951_2_3더하기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int [] d = new int[11];
		d[0]=1;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=3;j++) {
				//i-j>0보다 크거나같은 경우에 더한다 d[n]=d[n-1]+d[n-2]+d[n-3] 
				if(i-j>=0) {
					d[i]+=d[i-j];
				}
			}
		}
		
		for(int i=0;i<count;i++) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(d[n]);
		}
	}

}
